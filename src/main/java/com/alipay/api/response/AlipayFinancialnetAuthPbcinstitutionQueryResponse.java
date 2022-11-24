package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.financialnet.auth.pbcinstitution.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-14 10:16:36
 */
public class AlipayFinancialnetAuthPbcinstitutionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3813966361956558156L;

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
