package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信用支付咨询拒绝详情视图
 *
 * @author auto create
 * @since 1.0, 2022-01-13 16:21:44
 */
public class CreditPayRefuseVO extends AlipayObject {

	private static final long serialVersionUID = 2673748224715461631L;

	/**
	 * 拒绝码
	 */
	@ApiField("code")
	private String code;

	/**
	 * 拒绝详情
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
