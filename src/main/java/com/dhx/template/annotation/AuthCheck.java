package com.dhx.template.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author dhx_
 * @className AuthCheck
 * @date : 2023/01/07/ 14:57
 **/
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AuthCheck {
    /**
     * 有任何一个角色
     *
     * @return
     */
    String[] anyRole() default "";

    /**
     * 必须有某个角色
     *
     * @return
     */
    String mustRole() default "";

}
