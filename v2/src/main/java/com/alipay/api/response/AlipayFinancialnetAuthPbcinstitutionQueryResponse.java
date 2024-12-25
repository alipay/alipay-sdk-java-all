package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.financialnet.auth.pbcinstitution.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:59
 */
public class AlipayFinancialnetAuthPbcinstitutionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2882316176525176829L;

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
