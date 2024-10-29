package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.schoolservice.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 16:38:09
 */
public class AlipayCommerceEducateSchoolserviceModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7247987191846782547L;

	/** 
	 * 支付宝返回的服务唯一Id
	 */
	@ApiField("service_id")
	private String serviceId;

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}
	public String getServiceId( ) {
		return this.serviceId;
	}

}
