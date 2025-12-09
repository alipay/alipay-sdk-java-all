package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CompanyListQueryResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.prod.companyauth.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-07 15:32:05
 */
public class AlipayBossProdCompanyauthQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6595673273955668858L;

	/** 
	 * 公司列表查询返回结果
	 */
	@ApiField("company_list_query_result")
	private CompanyListQueryResult companyListQueryResult;

	public void setCompanyListQueryResult(CompanyListQueryResult companyListQueryResult) {
		this.companyListQueryResult = companyListQueryResult;
	}
	public CompanyListQueryResult getCompanyListQueryResult( ) {
		return this.companyListQueryResult;
	}

}
