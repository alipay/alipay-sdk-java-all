package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OpenApiEnterpriseUserAuthInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.isresource.enterpriseuser.auth response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-12 10:20:07
 */
public class AlipayIserviceIsresourceEnterpriseuserAuthResponse extends AlipayResponse {

	private static final long serialVersionUID = 8898267241222172356L;

	/** 
	 * 返回的信登token，用于跳转并写登录态
	 */
	@ApiField("biz_data")
	private OpenApiEnterpriseUserAuthInfo bizData;

	public void setBizData(OpenApiEnterpriseUserAuthInfo bizData) {
		this.bizData = bizData;
	}
	public OpenApiEnterpriseUserAuthInfo getBizData( ) {
		return this.bizData;
	}

}
