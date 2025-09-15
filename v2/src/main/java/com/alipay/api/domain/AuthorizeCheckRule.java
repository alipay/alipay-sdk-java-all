package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 授权校验规则
 *
 * @author auto create
 * @since 1.0, 2025-08-12 15:10:01
 */
public class AuthorizeCheckRule extends AlipayObject {

	private static final long serialVersionUID = 3893425699535297512L;

	/**
	 * 企业统一信用编号，传值则会校验授权方与被授权方信用编号是否一致
	 */
	@ApiField("enterprise_cert_no")
	private String enterpriseCertNo;

	/**
	 * 用于限制被授权方账号类型，  CORPORATE_ACCOUNT:企业账户，PRIVATE_ACCOUNT:个人账户，ALL:支持所有账户类型
	 */
	@ApiField("partner_user_type_limit")
	private String partnerUserTypeLimit;

	/**
	 * 用于限制授权方账号类型，CORPORATE_ACCOUNT-企业，PRIVATE_ACCOUNT-个人，ALL-支持企业和个人
	 */
	@ApiField("principal_user_type_limit")
	private String principalUserTypeLimit;

	public String getEnterpriseCertNo() {
		return this.enterpriseCertNo;
	}
	public void setEnterpriseCertNo(String enterpriseCertNo) {
		this.enterpriseCertNo = enterpriseCertNo;
	}

	public String getPartnerUserTypeLimit() {
		return this.partnerUserTypeLimit;
	}
	public void setPartnerUserTypeLimit(String partnerUserTypeLimit) {
		this.partnerUserTypeLimit = partnerUserTypeLimit;
	}

	public String getPrincipalUserTypeLimit() {
		return this.principalUserTypeLimit;
	}
	public void setPrincipalUserTypeLimit(String principalUserTypeLimit) {
		this.principalUserTypeLimit = principalUserTypeLimit;
	}

}
