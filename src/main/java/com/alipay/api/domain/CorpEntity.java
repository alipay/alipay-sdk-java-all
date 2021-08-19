package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签约公司主体信息
 *
 * @author auto create
 * @since 1.0, 2020-11-04 15:25:51
 */
public class CorpEntity extends AlipayObject {

	private static final long serialVersionUID = 8158141285284313238L;

	/**
	 * 经办人真实姓名
	 */
	@ApiField("agent_cert_name")
	private String agentCertName;

	/**
	 * 经办人证件号(支持身份证号、护照号)
	 */
	@ApiField("agent_cert_no")
	private String agentCertNo;

	/**
	 * 企业支付宝登录账号(邮箱或手机号)
	 */
	@ApiField("alipay_account")
	private String alipayAccount;

	/**
	 * 企业统一社会信用编码
	 */
	@ApiField("corp_code")
	private String corpCode;

	/**
	 * xxx测试公司
	 */
	@ApiField("corp_name")
	private String corpName;

	/**
	 * 公司类型(MAIN:我方公司,作为签约方中我方的蚂蚁相关公司; RELA:对方公司)
	 */
	@ApiField("corp_type")
	private String corpType;

	/**
	 * 法人真实姓名
	 */
	@ApiField("legal_cert_name")
	private String legalCertName;

	/**
	 * 法人证件号(支持身份证号、护照号)
	 */
	@ApiField("legal_cert_no")
	private String legalCertNo;

	/**
	 * 签约通知邮箱
	 */
	@ApiField("notify_email")
	private String notifyEmail;

	/**
	 * 签约通知人姓名
	 */
	@ApiField("notify_name")
	private String notifyName;

	/**
	 * 2088支付宝账号
	 */
	@ApiField("user_id")
	private String userId;

	public String getAgentCertName() {
		return this.agentCertName;
	}
	public void setAgentCertName(String agentCertName) {
		this.agentCertName = agentCertName;
	}

	public String getAgentCertNo() {
		return this.agentCertNo;
	}
	public void setAgentCertNo(String agentCertNo) {
		this.agentCertNo = agentCertNo;
	}

	public String getAlipayAccount() {
		return this.alipayAccount;
	}
	public void setAlipayAccount(String alipayAccount) {
		this.alipayAccount = alipayAccount;
	}

	public String getCorpCode() {
		return this.corpCode;
	}
	public void setCorpCode(String corpCode) {
		this.corpCode = corpCode;
	}

	public String getCorpName() {
		return this.corpName;
	}
	public void setCorpName(String corpName) {
		this.corpName = corpName;
	}

	public String getCorpType() {
		return this.corpType;
	}
	public void setCorpType(String corpType) {
		this.corpType = corpType;
	}

	public String getLegalCertName() {
		return this.legalCertName;
	}
	public void setLegalCertName(String legalCertName) {
		this.legalCertName = legalCertName;
	}

	public String getLegalCertNo() {
		return this.legalCertNo;
	}
	public void setLegalCertNo(String legalCertNo) {
		this.legalCertNo = legalCertNo;
	}

	public String getNotifyEmail() {
		return this.notifyEmail;
	}
	public void setNotifyEmail(String notifyEmail) {
		this.notifyEmail = notifyEmail;
	}

	public String getNotifyName() {
		return this.notifyName;
	}
	public void setNotifyName(String notifyName) {
		this.notifyName = notifyName;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
