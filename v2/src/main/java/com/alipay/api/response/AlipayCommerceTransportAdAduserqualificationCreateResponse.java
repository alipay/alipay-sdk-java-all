package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.ad.aduserqualification.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:35
 */
public class AlipayCommerceTransportAdAduserqualificationCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5541274168759838769L;

	/** 
	 * 资质id+ 用户资质id，唯一标识用户的创建的一个资质
	 */
	@ApiField("qualification_id")
	private Long qualificationId;

	public void setQualificationId(Long qualificationId) {
		this.qualificationId = qualificationId;
	}
	public Long getQualificationId( ) {
		return this.qualificationId;
	}

}
