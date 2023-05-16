package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.financialnet.auth.pbcinstitution.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 10:01:57
 */
public class AlipayFinancialnetAuthPbcinstitutionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6361497839316959981L;

	/** 
	 * 联行号查询结果
	 */
	@ApiField("inst_query_result")
	private String instQueryResult;

	public void setInstQueryResult(String instQueryResult) {
		this.instQueryResult = instQueryResult;
	}
	public String getInstQueryResult( ) {
		return this.instQueryResult;
	}

}
