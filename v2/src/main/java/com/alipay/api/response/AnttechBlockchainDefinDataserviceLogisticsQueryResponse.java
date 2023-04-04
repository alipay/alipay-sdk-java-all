package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.defin.dataservice.logistics.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 16:44:30
 */
public class AnttechBlockchainDefinDataserviceLogisticsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4538358835657749226L;

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
