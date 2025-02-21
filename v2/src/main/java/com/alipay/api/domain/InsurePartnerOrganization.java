package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 投保合作商信息
 *
 * @author auto create
 * @since 1.0, 2024-11-05 10:39:07
 */
public class InsurePartnerOrganization extends AlipayObject {

	private static final long serialVersionUID = 7588859797733144611L;

	/**
	 * 账号主体类型，默认ALIPAY_USER_ID
	 */
	@ApiField("alipay_account_type")
	private String alipayAccountType;

	/**
	 * 参与方唯一标识，当alipay_account_type为ALIPAY_USER_ID是表示支付宝2088uid, 当alipay_account_type为ALIPAY_LOGON_ID时表示支付宝登录号
	 */
	@ApiField("alipay_id")
	private String alipayId;

	/**
	 * 账号主体id
	 */
	@ApiField("alipay_open_id")
	private String alipayOpenId;

	/**
	 * 证件名称，本次场景和投保企业信息保持一致
	 */
	@ApiField("cert_name")
	private String certName;

	/**
	 * 证件号，本次场景和投保企业信息保持一致
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型，本次场景和投保企业信息保持一致
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 如果存在第二合作商，则传入合作商id
	 */
	@ApiField("partner_org_id")
	private String partnerOrgId;

	public String getAlipayAccountType() {
		return this.alipayAccountType;
	}
	public void setAlipayAccountType(String alipayAccountType) {
		this.alipayAccountType = alipayAccountType;
	}

	public String getAlipayId() {
		return this.alipayId;
	}
	public void setAlipayId(String alipayId) {
		this.alipayId = alipayId;
	}

	public String getAlipayOpenId() {
		return this.alipayOpenId;
	}
	public void setAlipayOpenId(String alipayOpenId) {
		this.alipayOpenId = alipayOpenId;
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

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getPartnerOrgId() {
		return this.partnerOrgId;
	}
	public void setPartnerOrgId(String partnerOrgId) {
		this.partnerOrgId = partnerOrgId;
	}

}
