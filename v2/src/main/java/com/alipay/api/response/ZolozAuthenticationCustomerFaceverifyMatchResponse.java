package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zoloz.authentication.customer.faceverify.match response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 00:46:18
 */
public class ZolozAuthenticationCustomerFaceverifyMatchResponse extends AlipayResponse {

	private static final long serialVersionUID = 8372151885445354611L;

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
