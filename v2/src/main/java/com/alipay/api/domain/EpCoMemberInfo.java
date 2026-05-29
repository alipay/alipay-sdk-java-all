package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业集团成员
 *
 * @author auto create
 * @since 1.0, 2026-02-04 17:15:14
 */
public class EpCoMemberInfo extends AlipayObject {

	private static final long serialVersionUID = 7741319263438433314L;

	/**
	 * 成立日期
	 */
	@ApiField("build_date")
	private String buildDate;

	/**
	 * 统一社会信用代码
	 */
	@ApiField("crn")
	private String crn;

	/**
	 * 所属行业
	 */
	@ApiField("industry")
	private String industry;

	/**
	 * 法定代表人
	 */
	@ApiField("legal_representative")
	private String legalRepresentative;

	/**
	 * 集团名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 地区
	 */
	@ApiField("province")
	private String province;

	/**
	 * 带币种的注册资本
	 */
	@ApiField("register_capital")
	private String registerCapital;

	/**
	 * 注册资本（单位万元）
	 */
	@ApiField("register_capital_text")
	private String registerCapitalText;

	public String getBuildDate() {
		return this.buildDate;
	}
	public void setBuildDate(String buildDate) {
		this.buildDate = buildDate;
	}

	public String getCrn() {
		return this.crn;
	}
	public void setCrn(String crn) {
		this.crn = crn;
	}

	public String getIndustry() {
		return this.industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getLegalRepresentative() {
		return this.legalRepresentative;
	}
	public void setLegalRepresentative(String legalRepresentative) {
		this.legalRepresentative = legalRepresentative;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

	public String getRegisterCapital() {
		return this.registerCapital;
	}
	public void setRegisterCapital(String registerCapital) {
		this.registerCapital = registerCapital;
	}

	public String getRegisterCapitalText() {
		return this.registerCapitalText;
	}
	public void setRegisterCapitalText(String registerCapitalText) {
		this.registerCapitalText = registerCapitalText;
	}

}
