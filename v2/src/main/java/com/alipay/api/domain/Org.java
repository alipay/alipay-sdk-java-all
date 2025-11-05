package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业信息
 *
 * @author auto create
 * @since 1.0, 2020-05-06 13:44:20
 */
public class Org extends AlipayObject {

	private static final long serialVersionUID = 5499687796852993152L;

	/**
	 * 企业证件号
	 */
	@ApiField("org_id_number")
	private String orgIdNumber;

	/**
	 * 企业证件类型，（证件号不为空时必填，详见企业证件类型）
	 */
	@ApiField("org_id_type")
	private String orgIdType;

	/**
	 * 法定代表人证件号
	 */
	@ApiField("org_legal_id_number")
	private String orgLegalIdNumber;

	/**
	 * 法定代表人证件类型
	 */
	@ApiField("org_legal_id_type")
	private String orgLegalIdType;

	/**
	 * 法定代表人名称
	 */
	@ApiField("org_legal_name")
	private String orgLegalName;

	/**
	 * 企业名称
	 */
	@ApiField("org_name")
	private String orgName;

	/**
	 * 企业唯一标识：可传入平台机构id、企业证件号、企业邮箱等（个人用户与企业的唯一标识不可重复）
	 */
	@ApiField("third_party_user_id")
	private String thirdPartyUserId;

	public String getOrgIdNumber() {
		return this.orgIdNumber;
	}
	public void setOrgIdNumber(String orgIdNumber) {
		this.orgIdNumber = orgIdNumber;
	}

	public String getOrgIdType() {
		return this.orgIdType;
	}
	public void setOrgIdType(String orgIdType) {
		this.orgIdType = orgIdType;
	}

	public String getOrgLegalIdNumber() {
		return this.orgLegalIdNumber;
	}
	public void setOrgLegalIdNumber(String orgLegalIdNumber) {
		this.orgLegalIdNumber = orgLegalIdNumber;
	}

	public String getOrgLegalIdType() {
		return this.orgLegalIdType;
	}
	public void setOrgLegalIdType(String orgLegalIdType) {
		this.orgLegalIdType = orgLegalIdType;
	}

	public String getOrgLegalName() {
		return this.orgLegalName;
	}
	public void setOrgLegalName(String orgLegalName) {
		this.orgLegalName = orgLegalName;
	}

	public String getOrgName() {
		return this.orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getThirdPartyUserId() {
		return this.thirdPartyUserId;
	}
	public void setThirdPartyUserId(String thirdPartyUserId) {
		this.thirdPartyUserId = thirdPartyUserId;
	}

}
