package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RebusinessEntityRelation;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.rebusinessentity.company.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-08 11:42:05
 */
public class ZhimaCreditEpRebusinessentityCompanyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5318862635878826126L;

	/** 
	 * 企业查询key
	 */
	@ApiField("company_key")
	private String companyKey;

	/** 
	 * 关系数据集
	 */
	@ApiField("data")
	private RebusinessEntityRelation data;

	public void setCompanyKey(String companyKey) {
		this.companyKey = companyKey;
	}
	public String getCompanyKey( ) {
		return this.companyKey;
	}

	public void setData(RebusinessEntityRelation data) {
		this.data = data;
	}
	public RebusinessEntityRelation getData( ) {
		return this.data;
	}

}
