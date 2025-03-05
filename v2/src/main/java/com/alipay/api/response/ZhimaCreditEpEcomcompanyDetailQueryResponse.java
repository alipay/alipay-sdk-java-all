package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EcomCompanyInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.ecomcompany.detail.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-02-20 15:17:23
 */
public class ZhimaCreditEpEcomcompanyDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2319699131575491951L;

	/** 
	 * 电商企业明细数据
	 */
	@ApiField("data")
	private EcomCompanyInfo data;

	public void setData(EcomCompanyInfo data) {
		this.data = data;
	}
	public EcomCompanyInfo getData( ) {
		return this.data;
	}

}
