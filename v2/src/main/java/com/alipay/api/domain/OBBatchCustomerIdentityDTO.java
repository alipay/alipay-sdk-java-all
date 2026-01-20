package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 客户身份信息列表
 *
 * @author auto create
 * @since 1.0, 2025-11-06 15:34:05
 */
public class OBBatchCustomerIdentityDTO extends AlipayObject {

	private static final long serialVersionUID = 3232986362493986169L;

	/**
	 * 企业信息
	 */
	@ApiField("company")
	private OBCompanyDTO company;

	/**
	 * 通行证ID
	 */
	@ApiField("passport_id")
	private String passportId;

	/**
	 * 个人信息
	 */
	@ApiField("personal")
	private OBPersonalDTO personal;

	public OBCompanyDTO getCompany() {
		return this.company;
	}
	public void setCompany(OBCompanyDTO company) {
		this.company = company;
	}

	public String getPassportId() {
		return this.passportId;
	}
	public void setPassportId(String passportId) {
		this.passportId = passportId;
	}

	public OBPersonalDTO getPersonal() {
		return this.personal;
	}
	public void setPersonal(OBPersonalDTO personal) {
		this.personal = personal;
	}

}
