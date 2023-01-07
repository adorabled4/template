package com.dhx.template.constant;

/**
 * @author dhx_
 * @className UserConstans
 * @date : 2023/01/07/ 14:53
 **/
public class UserConstant {
    public static final String PASSWORD_SALT = "dhxSalt";
    public static final int USER_PAGE_SIZE = 10;

    /**
     * 默认权限 => 普通用户
     */
    int DEFAULT_ROLE= 0;

    /**
     * 管理员权限
     */
    int ADMIN_ROLE= 1;
}