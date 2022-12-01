package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.FundOperationDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.industry.operation.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-22 16:21:38
 */
public class AlipayFundIndustryOperationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3832298433983575149L;

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
