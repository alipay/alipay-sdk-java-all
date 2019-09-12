package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业支付宝与企业信息匹配校验服务
 *
 * @author auto create
 * @since 1.0, 2018-09-06 14:19:07
 */
public class MybankCreditUserSitememberEnterpriseMatchModel extends AlipayObject {

	private static final long serialVersionUID = 4163432321684756823L;

	/**
	 * 工商注册号，与social_credit_code字段不能同时为空
	 */
	@ApiField("business_reg_no")
	private String businessRegNo;

	/**
	 * 公司名称
	 */
	@ApiField("company_name")
	private String companyName;

	/**
	 * 站点类型，如支付宝、淘宝等
	 */
	@ApiField("site")
	private String site;

	/**
	 * 站点登录号，比如企业支付宝的手机号或邮箱
	 */
	@ApiField("site_login_id")
	private String siteLoginId;

	/**
	 * 统一社会信用代码，与business_reg_no字段不能同时为空
	 */
	@ApiField("social_credit_code")
	private String socialCreditCode;

	public String getBusinessRegNo() {
		return this.businessRegNo;
	}
	public void setBusinessRegNo(String businessRegNo) {
		this.businessRegNo = businessRegNo;
	}

	public String getCompanyName() {
		return this.companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getSite() {
		return this.site;
	}
	public void setSite(String site) {
		this.site = site;
	}

	public String getSiteLoginId() {
		return this.siteLoginId;
	}
	public void setSiteLoginId(String siteLoginId) {
		this.siteLoginId = siteLoginId;
	}

	public String getSocialCreditCode() {
		return this.socialCreditCode;
	}
	public void setSocialCreditCode(String socialCreditCode) {
		this.socialCreditCode = socialCreditCode;
	}

}
