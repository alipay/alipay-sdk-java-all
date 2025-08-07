package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zoloz.authentication.customer.faceverify.match response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:39:14
 */
public class ZolozAuthenticationCustomerFaceverifyMatchResponse extends AlipayResponse {

	private static final long serialVersionUID = 8171914493759281958L;

	/** 
	 * 是否为攻击
	 */
	@ApiField("attack")
	private Boolean attack;

	/** 
	 * 人脸比对结果：成功或者失败
	 */
	@ApiField("result")
	private String result;

	public void setAttack(Boolean attack) {
		this.attack = attack;
	}
	public Boolean getAttack( ) {
		return this.attack;
	}

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

}
