package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 身份信息
 *
 * @author auto create
 * @since 1.0, 2022-07-01 17:28:03
 */
public class IdentityDTO extends AlipayObject {

	private static final long serialVersionUID = 2336772792759251782L;

	/**
	 * 经办人姓名，企业认证必选
	 */
	@ApiField("agent")
	private String agent;

	/**
	 * 经办人身份证,企业认证必选
	 */
	@ApiField("agent_id")
	private String agentId;

	/**
	 * 用户姓名
	 */
	@ApiField("cert_name")
	private String certName;

	/**
	 * 证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型1|2|3，个人默认选1表示身份证IDENTITY_CARD，企业可以选2表示
UNIFIED_SOCIAL_CREDIT_CODE（统一社会信用代码）或3表示
ENTERPRISE_REGISTERED_NUMBER（企业工商注册号）
	 */
	@ApiField("cert_type")
	private Long certType;

	/**
	 * 法人姓名，企业认证必选
	 */
	@ApiField("legal_person")
	private String legalPerson;

	/**
	 * 法人身份证,企业认证必选
	 */
	@ApiField("legal_person_id")
	private String legalPersonId;

	/**
	 * 电话
	 */
	@ApiField("mobile_no")
	private String mobileNo;

	/**
	 * 用户类型，1表示个人，2表示企业
	 */
	@ApiField("user_type")
	private Long userType;

	public String getAgent() {
		return this.agent;
	}
	public void setAgent(String agent) {
		this.agent = agent;
	}

	public String getAgentId() {
		return this.agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public String getCertName() {
		return this.certName;
	}
	public void setCertName(String certName) {
		this.certName = certName;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public Long getCertType() {
		return this.certType;
	}
	public void setCertType(Long certType) {
		this.certType = certType;
	}

	public String getLegalPerson() {
		return this.legalPerson;
	}
	public void setLegalPerson(String legalPerson) {
		this.legalPerson = legalPerson;
	}

	public String getLegalPersonId() {
		return this.legalPersonId;
	}
	public void setLegalPersonId(String legalPersonId) {
		this.legalPersonId = legalPersonId;
	}

	public String getMobileNo() {
		return this.mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public Long getUserType() {
		return this.userType;
	}
	public void setUserType(Long userType) {
		this.userType = userType;
	}

}
