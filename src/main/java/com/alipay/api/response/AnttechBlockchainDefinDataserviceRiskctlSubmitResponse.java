package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.defin.dataservice.riskctl.submit response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 01:47:05
 */
public class AnttechBlockchainDefinDataserviceRiskctlSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 4359793998571898986L;

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
