package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EcomCompanyFeatureInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.ecomcompany.feature.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-13 17:57:19
 */
public class ZhimaCreditEpEcomcompanyFeatureQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8638747613752421138L;

	/** 
	 * 电商企业特征信息
	 */
	@ApiField("data")
	private EcomCompanyFeatureInfo data;

	public void setData(EcomCompanyFeatureInfo data) {
		this.data = data;
	}
	public EcomCompanyFeatureInfo getData( ) {
		return this.data;
	}

}
