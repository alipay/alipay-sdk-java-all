package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 企业集团对外投资信息
 *
 * @author auto create
 * @since 1.0, 2026-02-04 17:15:02
 */
public class EpCoInvestInfo extends AlipayObject {

	private static final long serialVersionUID = 6428299468357743224L;

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
	 * 直接持股占比
	 */
	@ApiField("direct_ratio")
	private String directRatio;

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
	 * 投资方式
	 */
	@ApiListField("means")
	@ApiField("string")
	private List<String> means;

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
	 * 间接持股详情
	 */
	@ApiListField("ratio")
	@ApiField("ep_ratio_info")
	private List<EpRatioInfo> ratio;

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

	public String getDirectRatio() {
		return this.directRatio;
	}
	public void setDirectRatio(String directRatio) {
		this.directRatio = directRatio;
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

	public List<String> getMeans() {
		return this.means;
	}
	public void setMeans(List<String> means) {
		this.means = means;
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

	public List<EpRatioInfo> getRatio() {
		return this.ratio;
	}
	public void setRatio(List<EpRatioInfo> ratio) {
		this.ratio = ratio;
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
