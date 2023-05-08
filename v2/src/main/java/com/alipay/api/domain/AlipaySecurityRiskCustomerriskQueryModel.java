package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户风险服务输出
 *
 * @author auto create
 * @since 1.0, 2022-12-20 17:17:49
 */
public class AlipaySecurityRiskCustomerriskQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6156685984834663737L;

	/**
	 * 用于查询银行卡号是否有风险
	 */
	@ApiField("bank_card_no")
	private String bankCardNo;

	/**
	 * 用于查询营业执照是否来自风险商户
	 */
	@ApiField("business_license_no")
	private String businessLicenseNo;

	/**
	 * 用于境外银行卡号的查询（预留）
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 用于传递需查询风险的身份证号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 用于查询公司名称是否来自风险公司
	 */
	@ApiField("company_name")
	private String companyName;

	/**
	 * 间连交易场景下，银行类合作伙伴记录的风险商户ID
	 */
	@ApiField("external_id")
	private String externalId;

	/**
	 * 用于查询手机号是否来自风险用户
	 */
	@ApiField("mobile_no")
	private String mobileNo;

	/**
	 * 支付宝openId
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 查询商户风险类型时：支持以下三种：riskinfo_cert_no（身份证风险查询）,riskinfo_bank_card_no（银行卡风险查询），riskinfo_business_license_no（营业执照风险查询）
查询ISV风险类型时：支持以下二种：riskinfo_cert_no_isv（服务商法人身份证风险查询），riskinfo_business_license_no_isv（营业执照风险查询）。
营销作弊风险场景：riskinfo_marketing
先享后付保障风险场景：riskinfo_nsf
使用服务时指定查询风险类型，且一次调用可以传递多个风险类型，用英文逗号隔开。
	 */
	@ApiField("risk_type")
	private String riskType;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBankCardNo() {
		return this.bankCardNo;
	}
	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
	}

	public String getBusinessLicenseNo() {
		return this.businessLicenseNo;
	}
	public void setBusinessLicenseNo(String businessLicenseNo) {
		this.businessLicenseNo = businessLicenseNo;
	}

	public String getCardNo() {
		return this.cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCompanyName() {
		return this.companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getExternalId() {
		return this.externalId;
	}
	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public String getMobileNo() {
		return this.mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getRiskType() {
		return this.riskType;
	}
	public void setRiskType(String riskType) {
		this.riskType = riskType;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
