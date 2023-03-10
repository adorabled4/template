/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 *
 * https://www.renren.io
 *
 * 版权所有，侵权必究！
 */

package com.dhx.template.utils;

import com.dhx.template.common.BaseResponse;
import com.dhx.template.common.ErrorCode;

/**
 * 返回数据
 *
 * @author Mark sunlightcs@gmail.com
 */
// extends HashMap<String, Object>
public class ResultUtil {
	private static final long serialVersionUID = 164567353L;
	/**
	 * 正常返回
	 * @param data
	 * @param <T>
	 * @return
	 */
	public static <T> BaseResponse<T> success(T data){
		return new BaseResponse<T>(200,data,"ok","");
	}


	/**
	 * 出现错误
	 * @param errorCode
	 * @param <T>
	 * @return
	 */
	public static <T> BaseResponse<T> error(ErrorCode errorCode){
		return new BaseResponse<T>(errorCode);
	}

	/**
	 * 失败
	 *
	 * @param code
	 * @param message
	 * @param description
	 * @return
	 */
	public static BaseResponse error(int code, String message, String description) {
		return new BaseResponse(code, null, message, description);
	}

	/**
	 *
	 * @param errorCode
	 * @param message 错误信息
	 * @param description 描述
	 * @return
	 */
	public static BaseResponse error(ErrorCode errorCode, String message, String description) {
		return new BaseResponse(errorCode.getCode(), null, message, description);
	}

	/**
	 *
	 * @param errorCode 错误码
	 * @param description 描述
	 * @param <T>
	 * @return
	 */
	public static <T> BaseResponse<T> error(ErrorCode errorCode,String description){
		return new BaseResponse<T>(errorCode,description);
	}
}
