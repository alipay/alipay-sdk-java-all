package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.sign.shakecode.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-30 15:47:21
 */
public class AlipayCommerceSignShakecodeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3835237654488775799L;

	/** 
	 * 创建的吱口令，可复制拉起签约页面
	 */
	@ApiField("shake_code")
	private String shakeCode;

	public void setShakeCode(String shakeCode) {
		this.shakeCode = shakeCode;
	}
	public String getShakeCode( ) {
		return this.shakeCode;
	}

}
