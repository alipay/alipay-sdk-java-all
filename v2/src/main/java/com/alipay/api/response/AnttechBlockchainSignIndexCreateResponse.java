package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.sign.index.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-12 11:37:38
 */
public class AnttechBlockchainSignIndexCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2723332425291448436L;

	/** 
	 * 是否通知成功
	 */
	@ApiField("publish_success")
	private Boolean publishSuccess;

	public void setPublishSuccess(Boolean publishSuccess) {
		this.publishSuccess = publishSuccess;
	}
	public Boolean getPublishSuccess( ) {
		return this.publishSuccess;
	}

}
