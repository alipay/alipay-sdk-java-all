package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签名所需要的信息
 *
 * @author auto create
 * @since 1.0, 2025-09-18 11:29:50
 */
public class CarfinSignInfo extends AlipayObject {

	private static final long serialVersionUID = 1273898781746359556L;

	/**
	 * 数字签名签名位置
	 */
	@ApiField("sign_keyword")
	private CarfinKeyWord signKeyword;

	/**
	 * 协议的签署方
	 */
	@ApiField("signer")
	private String signer;

	/**
	 * 签署时间的签名位置
	 */
	@ApiField("time_keyword")
	private CarfinKeyWord timeKeyword;

	public CarfinKeyWord getSignKeyword() {
		return this.signKeyword;
	}
	public void setSignKeyword(CarfinKeyWord signKeyword) {
		this.signKeyword = signKeyword;
	}

	public String getSigner() {
		return this.signer;
	}
	public void setSigner(String signer) {
		this.signer = signer;
	}

	public CarfinKeyWord getTimeKeyword() {
		return this.timeKeyword;
	}
	public void setTimeKeyword(CarfinKeyWord timeKeyword) {
		this.timeKeyword = timeKeyword;
	}

}
