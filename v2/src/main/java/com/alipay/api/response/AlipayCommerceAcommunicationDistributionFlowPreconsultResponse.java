package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.acommunication.distribution.flow.preconsult response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-18 09:42:47
 */
public class AlipayCommerceAcommunicationDistributionFlowPreconsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 6581752918398541696L;

	/** 
	 * 手机号对应多用户标志
	 */
	@ApiField("mobile_mapping_multi_user")
	private Boolean mobileMappingMultiUser;

	public void setMobileMappingMultiUser(Boolean mobileMappingMultiUser) {
		this.mobileMappingMultiUser = mobileMappingMultiUser;
	}
	public Boolean getMobileMappingMultiUser( ) {
		return this.mobileMappingMultiUser;
	}

}
