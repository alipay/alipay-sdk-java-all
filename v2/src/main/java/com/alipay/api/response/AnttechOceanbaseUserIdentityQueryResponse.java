package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OBCompanyDTO;
import com.alipay.api.domain.OBPersonalDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.user.identity.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-01 18:09:06
 */
public class AnttechOceanbaseUserIdentityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7382493532291241189L;

	/** 
	 * 企业信息
	 */
	@ApiField("company")
	private OBCompanyDTO company;

	/** 
	 * 个人信息
	 */
	@ApiField("personal")
	private OBPersonalDTO personal;

	public void setCompany(OBCompanyDTO company) {
		this.company = company;
	}
	public OBCompanyDTO getCompany( ) {
		return this.company;
	}

	public void setPersonal(OBPersonalDTO personal) {
		this.personal = personal;
	}
	public OBPersonalDTO getPersonal( ) {
		return this.personal;
	}

}
