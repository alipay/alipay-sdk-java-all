package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.lifeservice.shop.copy response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-09 16:02:45
 */
public class AlipayCommerceLifeserviceShopCopyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4732968528294361837L;

	/** 
	 * 复制完成
	 */
	@ApiField("copy_result")
	private String copyResult;

	public void setCopyResult(String copyResult) {
		this.copyResult = copyResult;
	}
	public String getCopyResult( ) {
		return this.copyResult;
	}

}
