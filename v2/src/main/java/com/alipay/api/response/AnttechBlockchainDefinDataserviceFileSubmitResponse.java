package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.defin.dataservice.file.submit response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 06:30:43
 */
public class AnttechBlockchainDefinDataserviceFileSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 4511964514961916218L;

	/** 
	 * 业务结果
	 */
	@ApiField("biz_result")
	private String bizResult;

	public void setBizResult(String bizResult) {
		this.bizResult = bizResult;
	}
	public String getBizResult( ) {
		return this.bizResult;
	}

}
