package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业信息
 *
 * @author auto create
 * @since 1.0, 2026-10-12 17:58:00
 */
public class CorporationInfo extends AlipayObject {

	private static final long serialVersionUID = 7349347878179955211L;

	/**
	 * 企业税务局税号
	 */
	@ApiField("enterprise_registration_no")
	private String enterpriseRegistrationNo;

	public String getEnterpriseRegistrationNo() {
		return this.enterpriseRegistrationNo;
	}
	public void setEnterpriseRegistrationNo(String enterpriseRegistrationNo) {
		this.enterpriseRegistrationNo = enterpriseRegistrationNo;
	}

}
