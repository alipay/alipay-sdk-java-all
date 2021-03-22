package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 不可见不可用信息
 *
 * @author auto create
 * @since 1.0, 2018-10-25 15:25:04
 */
public class Refuse extends AlipayObject {

	private static final long serialVersionUID = 7719358889517146371L;

	/**
	 * 拒绝码
	 */
	@ApiField("code")
	private String code;

	/**
	 * 拒绝信息
	 */
	@ApiField("msg")
	private String msg;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return this.msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}

}
