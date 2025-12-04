package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.FundOperationDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.industry.operation.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-29 10:29:16
 */
public class AlipayFundIndustryOperationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7768343246571679946L;

	/** 
	 * 查询的流水信息
	 */
	@ApiField("operation")
	private FundOperationDTO operation;

	public void setOperation(FundOperationDTO operation) {
		this.operation = operation;
	}
	public FundOperationDTO getOperation( ) {
		return this.operation;
	}

}
