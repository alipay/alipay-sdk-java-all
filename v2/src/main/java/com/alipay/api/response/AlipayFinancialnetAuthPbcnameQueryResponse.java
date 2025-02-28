package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.financialnet.auth.pbcname.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:32:00
 */
public class AlipayFinancialnetAuthPbcnameQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7392192747995741281L;

	/** 
	 * 联行号查询结果
	 */
	@ApiField("pbc_query_result")
	private String pbcQueryResult;

	public void setPbcQueryResult(String pbcQueryResult) {
		this.pbcQueryResult = pbcQueryResult;
	}
	public String getPbcQueryResult( ) {
		return this.pbcQueryResult;
	}

}
