package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.defin.dataservice.logistics.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 04:35:53
 */
public class AnttechBlockchainDefinDataserviceLogisticsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5143532528633653298L;

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
