package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OpenApiTenantInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.isresource.tenantquerybyurid.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 04:16:42
 */
public class AlipayIserviceIsresourceTenantquerybyuridQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3667651424929927483L;

	/** 
	 * 相关的租户信息
	 */
	@ApiListField("biz_data")
	@ApiField("open_api_tenant_info")
	private List<OpenApiTenantInfo> bizData;

	public void setBizData(List<OpenApiTenantInfo> bizData) {
		this.bizData = bizData;
	}
	public List<OpenApiTenantInfo> getBizData( ) {
		return this.bizData;
	}

}
