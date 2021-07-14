
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import jp.co.jscore.backsys.util.logger.Loggable;

/**
 * コントロールログ用.
 *
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Loggable {

    /**
     * 説明
     * @return
     */
    public String describe();
}




//@Loggable(describe = "件数照会")
//@RequestMapping(value = "/confirmWork", method = RequestMethod.POST)
//@ResponseBody
//public String searchInfo(HttpSession session) throws Exception {