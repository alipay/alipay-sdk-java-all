package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.ccm.service.buy response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-11 18:01:00
 */
public class AlipayIserviceCcmServiceBuyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8413849781547174843L;

	/** 
	 * 服务实例id
	 */
	@ApiField("service_instance_id")
	private Long serviceInstanceId;

	/** 
	 * 商户在CCM的租户id
	 */
	@ApiField("tenant_id")
	private String tenantId;

	public void setServiceInstanceId(Long serviceInstanceId) {
		this.serviceInstanceId = serviceInstanceId;
	}
	public Long getServiceInstanceId( ) {
		return this.serviceInstanceId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}
	public String getTenantId( ) {
		return this.tenantId;
	}

}
