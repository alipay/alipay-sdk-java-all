package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InterTradeConsultOpenApiResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.contract.management.identify response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-23 21:39:00
 */
public class AlipayBossContractManagementIdentifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8277837175448769319L;

	/** 
	 * 识别结果
	 */
	@ApiField("result_set")
	private InterTradeConsultOpenApiResult resultSet;

	public void setResultSet(InterTradeConsultOpenApiResult resultSet) {
		this.resultSet = resultSet;
	}
	public InterTradeConsultOpenApiResult getResultSet( ) {
		return this.resultSet;
	}

}
