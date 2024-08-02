package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RentEnterpriseCertification;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.rent.enterprise.certification.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-25 10:27:05
 */
public class AlipayCommerceRentEnterpriseCertificationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5254543628636137278L;

	/** 
	 * 企业认证信息
	 */
	@ApiField("rent_enterprise_certification")
	private RentEnterpriseCertification rentEnterpriseCertification;

	public void setRentEnterpriseCertification(RentEnterpriseCertification rentEnterpriseCertification) {
		this.rentEnterpriseCertification = rentEnterpriseCertification;
	}
	public RentEnterpriseCertification getRentEnterpriseCertification( ) {
		return this.rentEnterpriseCertification;
	}

}
