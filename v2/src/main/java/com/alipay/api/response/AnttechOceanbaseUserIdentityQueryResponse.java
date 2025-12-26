package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OBCompanyDTO;
import com.alipay.api.domain.OBPersonalDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.user.identity.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-14 17:48:49
 */
public class AnttechOceanbaseUserIdentityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5218398792225741876L;

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
