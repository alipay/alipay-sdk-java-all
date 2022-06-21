package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.schoolservice.modify response.
 * 
 * @author auto create
 * @since 1.0, 2022-05-13 14:38:51
 */
public class AlipayCommerceEducateSchoolserviceModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3651511752347954132L;

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
