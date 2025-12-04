package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.jump.tab.apply response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-24 22:12:39
 */
public class AlipayCommerceMedicalJumpTabApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8383586373546319146L;

	/** 
	 * tab4建联的链接
	 */
	@ApiField("jump_url")
	private String jumpUrl;

	public void setJumpUrl(String jumpUrl) {
		this.jumpUrl = jumpUrl;
	}
	public String getJumpUrl( ) {
		return this.jumpUrl;
	}

}
