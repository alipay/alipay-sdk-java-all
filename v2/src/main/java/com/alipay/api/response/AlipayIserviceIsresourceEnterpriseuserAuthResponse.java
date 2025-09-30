package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OpenApiEnterpriseUserAuthInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.isresource.enterpriseuser.auth response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-04 15:43:46
 */
public class AlipayIserviceIsresourceEnterpriseuserAuthResponse extends AlipayResponse {

	private static final long serialVersionUID = 8846759473553998126L;

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
