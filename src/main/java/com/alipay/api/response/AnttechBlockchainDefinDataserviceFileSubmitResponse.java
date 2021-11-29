package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.defin.dataservice.file.submit response.
 * 
 * @author auto create
 * @since 1.0, 2021-08-26 14:05:35
 */
public class AnttechBlockchainDefinDataserviceFileSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 5661674781376442567L;

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
