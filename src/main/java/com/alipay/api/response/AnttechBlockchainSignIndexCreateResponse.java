package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.sign.index.create response.
 * 
 * @author auto create
 * @since 1.0, 2021-09-08 17:30:26
 */
public class AnttechBlockchainSignIndexCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7388583556967142947L;

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
