package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OpenApiTenantInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.isresource.tenantquerybytntid.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-07-10 10:03:23
 */
public class AlipayIserviceIsresourceTenantquerybytntidQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8132748332815547811L;

	/** 
	 * 查询的租户信息
	 */
	@ApiField("biz_data")
	private OpenApiTenantInfo bizData;

	public void setBizData(OpenApiTenantInfo bizData) {
		this.bizData = bizData;
	}
	public OpenApiTenantInfo getBizData( ) {
		return this.bizData;
	}

}
