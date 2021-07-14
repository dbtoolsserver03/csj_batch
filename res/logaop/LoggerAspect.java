
import java.lang.reflect.Method;
import java.util.Objects;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import jp.co.jscore.backsys.util.DpsUtils;

@Aspect
@Component(value = "loggerAspect")
public class LoggerAspect {

    private Logger logger = LoggerFactory.getLogger(LoggerAspect.class);

    @Pointcut("execution(public * jp.co.backsys.controller.*.*(..)) && @annotation(jp.co.backsys.util.logger.Loggable)")
    public void log(){
    }

    @AfterReturning(value = "log()", returning = "retVal")
    public void log(JoinPoint joinPoint, Object retVal) {
        // パラメーターを取得する
        Object[] params = joinPoint.getArgs();
        // メソッド名を取得する
        String methodName = joinPoint.getSignature().getName();
        Class<?> targetClass = joinPoint.getTarget().getClass();
        Method method = null;
        for (Method mt : targetClass.getMethods()) {
            if (methodName.equals(mt.getName())) {
                method = mt;
                break;
            }
        }
        if (method == null) {
        	return;
        }

        Loggable loggable = method.getAnnotation(Loggable.class);
        if(Objects.isNull(loggable)){
            return;
        }


        if(DpsUtils.isEmpty(loggable.describe())) {
        	logger.info("■class:{}, method:{}, params:{}, retVal:{}", targetClass.getName(), methodName, params,retVal);
        } else {
        	logger.info("■describe:{}, class:{}, method:{}, params:{}, retVal:{}", loggable.describe(), targetClass.getName(), methodName, params,retVal);

        }
    }

    @AfterThrowing(value = "log()", throwing = "ex")
    public void log(JoinPoint joinPoint, Throwable ex) {
        // パラメーターを取得する
        Object[] params = joinPoint.getArgs();
        // メソッド名を取得する
        String methodName = joinPoint.getSignature().getName();
        Class<?> targetClass = joinPoint.getTarget().getClass();
        Method method = null;
        for (Method mt : targetClass.getMethods()) {
            if (methodName.equals(mt.getName())) {
                method = mt;
                break;
            }
        }
        if (method == null) {
        	return;
        }
        Loggable loggable = method.getAnnotation(Loggable.class);
        if(Objects.isNull(loggable)){
            return;
        }
        if(DpsUtils.isEmpty(loggable.describe())) {
            logger.info("■class:{}, method:{}, params:{}, exception:{}", targetClass.getName(), methodName, params, ex.getMessage());
        } else {
            logger.info("■describe:{}, class:{}, method:{}, params:{}, exception:{}", loggable.describe(), targetClass.getName(), methodName, params, ex.getMessage());

        }
    }
}