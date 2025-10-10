package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InterTradetContractOpenApiStartResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.contract.general.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-20 16:49:46
 */
public class AlipayBossContractGeneralCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5198894623716139378L;

	/** 
	 * 发起审批返回结果
	 */
	@ApiField("result_set")
	private InterTradetContractOpenApiStartResult resultSet;

	public void setResultSet(InterTradetContractOpenApiStartResult resultSet) {
		this.resultSet = resultSet;
	}
	public InterTradetContractOpenApiStartResult getResultSet( ) {
		return this.resultSet;
	}

}
