package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.acommunication.distribution.flow.preconsult response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-08 13:57:41
 */
public class AlipayCommerceAcommunicationDistributionFlowPreconsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 5853349321722955436L;

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
