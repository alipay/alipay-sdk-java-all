package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InterTradetContractOpenApiStartResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.contract.general.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 01:06:56
 */
public class AlipayBossContractGeneralCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5269528856921972855L;

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
