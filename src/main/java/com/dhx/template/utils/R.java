/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 *
 * https://www.renren.io
 *
 * 版权所有，侵权必究！
 */

package com.dhx.template.utils;

import com.dhx.template.common.ErrorCode;
import org.apache.http.HttpStatus;

import java.util.HashMap;
import java.util.Map;

/**
 * 返回数据
 *
 * @author Mark sunlightcs@gmail.com
 */
public class R extends HashMap<String, Object> {
	private static final long serialVersionUID = 1654564353L;
	
	public R() {
		put("code", 0);
		put("message", "ok");
		put("description","");
	}
	
	public static R error() {
		return error(HttpStatus.SC_INTERNAL_SERVER_ERROR, "未知异常，请联系管理员");
	}
	
	public static R error(String message) {
		return error(HttpStatus.SC_INTERNAL_SERVER_ERROR, message);
	}
	public static R error(ErrorCode errorCode){
		return error(errorCode.getCode(),errorCode.getMessage(), errorCode.getDescription());
	}
	
	public static R error(int code, String message) {
		R r = new R();
		r.put("code", code);
		r.put("message", message);
		return r;
	}


	public static R error(int code, String message,String description) {
		R r = new R();
		r.put("code", code);
		r.put("message", message);
		r.put("description", description);
		return r;
	}

	public static R ok(String message) {
		R r = new R();
		r.put("message", message);
		return r;
	}
	
	public static R ok(Map<String, Object> map) {
		R r = new R();
		r.putAll(map);
		return r;
	}
	
	public static R ok() {
		return new R();
	}

	public R put(String key, Object value) {
		super.put(key, value);
		return this;
	}
}
