package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数据集
 *
 * @author auto create
 * @since 1.0, 2026-02-04 17:47:43
 */
public class EpCoOverviewInfo extends AlipayObject {

	private static final long serialVersionUID = 4183485993151246348L;

	/**
	 * 集团实际控制方统一社会信用代码
	 */
	@ApiField("crn")
	private String crn;

	/**
	 * 行业分布
	 */
	@ApiField("industry")
	private IndustryCountInfo industry;

	/**
	 * 集团参股认缴额总和（万元）
	 */
	@ApiField("inv_amount")
	private String invAmount;

	/**
	 * 集团参股数量
	 */
	@ApiField("inv_num")
	private Long invNum;

	/**
	 * 集团成员数量
	 */
	@ApiField("member_num")
	private Long memberNum;

	/**
	 * 集团成员注册资本总和（万元）
	 */
	@ApiField("member_registered_capital")
	private String memberRegisteredCapital;

	/**
	 * 集团名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 地区分布
	 */
	@ApiField("province")
	private CityCountInfo province;

	/**
	 * 集团实际控制方企业名称
	 */
	@ApiField("root")
	private String root;

	public String getCrn() {
		return this.crn;
	}
	public void setCrn(String crn) {
		this.crn = crn;
	}

	public IndustryCountInfo getIndustry() {
		return this.industry;
	}
	public void setIndustry(IndustryCountInfo industry) {
		this.industry = industry;
	}

	public String getInvAmount() {
		return this.invAmount;
	}
	public void setInvAmount(String invAmount) {
		this.invAmount = invAmount;
	}

	public Long getInvNum() {
		return this.invNum;
	}
	public void setInvNum(Long invNum) {
		this.invNum = invNum;
	}

	public Long getMemberNum() {
		return this.memberNum;
	}
	public void setMemberNum(Long memberNum) {
		this.memberNum = memberNum;
	}

	public String getMemberRegisteredCapital() {
		return this.memberRegisteredCapital;
	}
	public void setMemberRegisteredCapital(String memberRegisteredCapital) {
		this.memberRegisteredCapital = memberRegisteredCapital;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public CityCountInfo getProvince() {
		return this.province;
	}
	public void setProvince(CityCountInfo province) {
		this.province = province;
	}

	public String getRoot() {
		return this.root;
	}
	public void setRoot(String root) {
		this.root = root;
	}

}
