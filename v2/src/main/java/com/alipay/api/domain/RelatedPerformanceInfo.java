package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 作为法定代表人/主要管理人员/股东信息  的企业信息
 *
 * @author auto create
 * @since 1.0, 2023-11-29 20:07:37
 */
public class RelatedPerformanceInfo extends AlipayObject {

	private static final long serialVersionUID = 2288259393467833315L;

	/**
	 * 注册所在地
	 */
	@ApiField("address")
	private String address;

	/**
	 * 经营状态为注销时，此数据才有值
	 */
	@ApiField("cancel_date")
	private String cancelDate;

	/**
	 * 注册所在城市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 出资方式-股东信息有值
	 */
	@ApiField("con_form")
	private String conForm;

	/**
	 * 注册所在区县
	 */
	@ApiField("county")
	private String county;

	/**
	 * 统一社会信用代码
	 */
	@ApiField("credit_code")
	private String creditCode;

	/**
	 * 认缴出资币种-股东信息有值
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 企信唯一标识企业one_id
	 */
	@ApiField("ent_id")
	private String entId;

	/**
	 * 企业名称
	 */
	@ApiField("ent_name")
	private String entName;

	/**
	 * 企业经营状态：在营（开业）、迁出、注销、吊销、撤销登记、撤销、停业、其他
	 */
	@ApiField("ent_status")
	private String entStatus;

	/**
	 * 企业类型
	 */
	@ApiField("ent_type")
	private String entType;

	/**
	 * 成立日期
	 */
	@ApiField("es_date")
	private String esDate;

	/**
	 * 认缴出资比例-股东信息有值
	 */
	@ApiField("funde_ratio")
	private String fundeRatio;

	/**
	 * 认缴出资比例-股东信息有值
	 */
	@ApiField("funded_ratio")
	private String fundedRatio;

	/**
	 * 国民经济行业代码
	 */
	@ApiField("industry_code")
	private String industryCode;

	/**
	 * 国民经济行业名称
	 */
	@ApiField("industry_name")
	private String industryName;

	/**
	 * 国民经济行业门类代码
	 */
	@ApiField("industry_phy_code")
	private String industryPhyCode;

	/**
	 * 国民经济行业门类名称
	 */
	@ApiField("industry_phy_name")
	private String industryPhyName;

	/**
	 * 职务
	 */
	@ApiField("position")
	private String position;

	/**
	 * 注册所在省份
	 */
	@ApiField("province")
	private String province;

	/**
	 * 注册资本（万元）
	 */
	@ApiField("reg_cap")
	private String regCap;

	/**
	 * 注册币种
	 */
	@ApiField("reg_cap_cur")
	private String regCapCur;

	/**
	 * 注册地所在城市区域代码
	 */
	@ApiField("reg_city")
	private String regCity;

	/**
	 * 注册号
	 */
	@ApiField("reg_no")
	private String regNo;

	/**
	 * 企业经营状态为吊销时，此数据才有值
	 */
	@ApiField("revoke_date")
	private String revokeDate;

	/**
	 * 查询人姓名
	 */
	@ApiField("ry_name")
	private String ryName;

	/**
	 * 认缴出资额(万元)-股东信息有值
	 */
	@ApiField("sub_conam")
	private String subConam;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getCancelDate() {
		return this.cancelDate;
	}
	public void setCancelDate(String cancelDate) {
		this.cancelDate = cancelDate;
	}

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getConForm() {
		return this.conForm;
	}
	public void setConForm(String conForm) {
		this.conForm = conForm;
	}

	public String getCounty() {
		return this.county;
	}
	public void setCounty(String county) {
		this.county = county;
	}

	public String getCreditCode() {
		return this.creditCode;
	}
	public void setCreditCode(String creditCode) {
		this.creditCode = creditCode;
	}

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getEntId() {
		return this.entId;
	}
	public void setEntId(String entId) {
		this.entId = entId;
	}

	public String getEntName() {
		return this.entName;
	}
	public void setEntName(String entName) {
		this.entName = entName;
	}

	public String getEntStatus() {
		return this.entStatus;
	}
	public void setEntStatus(String entStatus) {
		this.entStatus = entStatus;
	}

	public String getEntType() {
		return this.entType;
	}
	public void setEntType(String entType) {
		this.entType = entType;
	}

	public String getEsDate() {
		return this.esDate;
	}
	public void setEsDate(String esDate) {
		this.esDate = esDate;
	}

	public String getFundeRatio() {
		return this.fundeRatio;
	}
	public void setFundeRatio(String fundeRatio) {
		this.fundeRatio = fundeRatio;
	}

	public String getFundedRatio() {
		return this.fundedRatio;
	}
	public void setFundedRatio(String fundedRatio) {
		this.fundedRatio = fundedRatio;
	}

	public String getIndustryCode() {
		return this.industryCode;
	}
	public void setIndustryCode(String industryCode) {
		this.industryCode = industryCode;
	}

	public String getIndustryName() {
		return this.industryName;
	}
	public void setIndustryName(String industryName) {
		this.industryName = industryName;
	}

	public String getIndustryPhyCode() {
		return this.industryPhyCode;
	}
	public void setIndustryPhyCode(String industryPhyCode) {
		this.industryPhyCode = industryPhyCode;
	}

	public String getIndustryPhyName() {
		return this.industryPhyName;
	}
	public void setIndustryPhyName(String industryPhyName) {
		this.industryPhyName = industryPhyName;
	}

	public String getPosition() {
		return this.position;
	}
	public void setPosition(String position) {
		this.position = position;
	}

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

	public String getRegCap() {
		return this.regCap;
	}
	public void setRegCap(String regCap) {
		this.regCap = regCap;
	}

	public String getRegCapCur() {
		return this.regCapCur;
	}
	public void setRegCapCur(String regCapCur) {
		this.regCapCur = regCapCur;
	}

	public String getRegCity() {
		return this.regCity;
	}
	public void setRegCity(String regCity) {
		this.regCity = regCity;
	}

	public String getRegNo() {
		return this.regNo;
	}
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	public String getRevokeDate() {
		return this.revokeDate;
	}
	public void setRevokeDate(String revokeDate) {
		this.revokeDate = revokeDate;
	}

	public String getRyName() {
		return this.ryName;
	}
	public void setRyName(String ryName) {
		this.ryName = ryName;
	}

	public String getSubConam() {
		return this.subConam;
	}
	public void setSubConam(String subConam) {
		this.subConam = subConam;
	}

}
