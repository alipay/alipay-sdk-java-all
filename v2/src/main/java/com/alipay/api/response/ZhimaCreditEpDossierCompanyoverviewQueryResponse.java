package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CompanyOverviewInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.dossier.companyoverview.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-24 22:21:43
 */
public class ZhimaCreditEpDossierCompanyoverviewQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6715584526557288926L;

	/** 
	 * 蚂蚁企业信用一分钟知企业数据
	 */
	@ApiField("company_overview_info")
	private CompanyOverviewInfo companyOverviewInfo;

	public void setCompanyOverviewInfo(CompanyOverviewInfo companyOverviewInfo) {
		this.companyOverviewInfo = companyOverviewInfo;
	}
	public CompanyOverviewInfo getCompanyOverviewInfo( ) {
		return this.companyOverviewInfo;
	}

}
