package jp.co.jscore.backsys.util.logger;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * コントロールログ用.
 *
 * @author systena
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
