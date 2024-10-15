package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RentEnterpriseCertification;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.rent.enterprise.certification.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-03 18:37:08
 */
public class AlipayCommerceRentEnterpriseCertificationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8698171343677589775L;

	/** 
	 * 企业认证信息
	 */
	@ApiField("rent_enterprise_certification")
	private RentEnterpriseCertification rentEnterpriseCertification;

	/** 
	 * 企业认证信息列表
	 */
	@ApiListField("rent_enterprise_certification_list")
	@ApiField("rent_enterprise_certification")
	private List<RentEnterpriseCertification> rentEnterpriseCertificationList;

	public void setRentEnterpriseCertification(RentEnterpriseCertification rentEnterpriseCertification) {
		this.rentEnterpriseCertification = rentEnterpriseCertification;
	}
	public RentEnterpriseCertification getRentEnterpriseCertification( ) {
		return this.rentEnterpriseCertification;
	}

	public void setRentEnterpriseCertificationList(List<RentEnterpriseCertification> rentEnterpriseCertificationList) {
		this.rentEnterpriseCertificationList = rentEnterpriseCertificationList;
	}
	public List<RentEnterpriseCertification> getRentEnterpriseCertificationList( ) {
		return this.rentEnterpriseCertificationList;
	}

}
