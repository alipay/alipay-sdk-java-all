package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.third.customer.service response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 20:56:48
 */
public class AlipayOpenPublicThirdCustomerServiceResponse extends AlipayResponse {

	private static final long serialVersionUID = 4628284149817843383L;

	/** 
	 * 授权给第三方渠道商的服务窗名称
	 */
	@ApiField("public_name")
	private String publicName;

	public void setPublicName(String publicName) {
		this.publicName = publicName;
	}
	public String getPublicName( ) {
		return this.publicName;
	}

}
