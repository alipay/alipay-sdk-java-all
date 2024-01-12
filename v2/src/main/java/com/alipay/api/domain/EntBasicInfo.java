package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业基本信息
 *
 * @author auto create
 * @since 1.0, 2023-11-09 14:56:34
 */
public class EntBasicInfo extends AlipayObject {

	private static final long serialVersionUID = 8728656234611999296L;

	/**
	 * 企业注册地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 企业核准日期
	 */
	@ApiField("appr_date")
	private String apprDate;

	/**
	 * 经营状态为注销时，此数据才有值
	 */
	@ApiField("cancel_date")
	private String cancelDate;

	/**
	 * 企业统一社会信用代码
	 */
	@ApiField("credit_code")
	private String creditCode;

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
	 * 企业开业日期
	 */
	@ApiField("es_date")
	private String esDate;

	/**
	 * 法人姓名
	 */
	@ApiField("fr_name")
	private String frName;

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
	 * 企业营业期限开始日期
	 */
	@ApiField("open_from")
	private String openFrom;

	/**
	 * 企业营业期限结束日期，其中永久为999-09-09
	 */
	@ApiField("open_to")
	private String openTo;

	/**
	 * 企业经营范围
	 */
	@ApiField("operate_scope")
	private String operateScope;

	/**
	 * 注册资本，单位是万元
	 */
	@ApiField("reg_cap")
	private String regCap;

	/**
	 * 注册币种
	 */
	@ApiField("reg_cap_cur")
	private String regCapCur;

	/**
	 * 企业注册号
	 */
	@ApiField("reg_no")
	private String regNo;

	/**
	 * 企业登记机关
	 */
	@ApiField("reg_org")
	private String regOrg;

	/**
	 * 企业经营状态为吊销时，此数据才有值
	 */
	@ApiField("revoke_date")
	private String revokeDate;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getApprDate() {
		return this.apprDate;
	}
	public void setApprDate(String apprDate) {
		this.apprDate = apprDate;
	}

	public String getCancelDate() {
		return this.cancelDate;
	}
	public void setCancelDate(String cancelDate) {
		this.cancelDate = cancelDate;
	}

	public String getCreditCode() {
		return this.creditCode;
	}
	public void setCreditCode(String creditCode) {
		this.creditCode = creditCode;
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

	public String getFrName() {
		return this.frName;
	}
	public void setFrName(String frName) {
		this.frName = frName;
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

	public String getOpenFrom() {
		return this.openFrom;
	}
	public void setOpenFrom(String openFrom) {
		this.openFrom = openFrom;
	}

	public String getOpenTo() {
		return this.openTo;
	}
	public void setOpenTo(String openTo) {
		this.openTo = openTo;
	}

	public String getOperateScope() {
		return this.operateScope;
	}
	public void setOperateScope(String operateScope) {
		this.operateScope = operateScope;
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

	public String getRegNo() {
		return this.regNo;
	}
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	public String getRegOrg() {
		return this.regOrg;
	}
	public void setRegOrg(String regOrg) {
		this.regOrg = regOrg;
	}

	public String getRevokeDate() {
		return this.revokeDate;
	}
	public void setRevokeDate(String revokeDate) {
		this.revokeDate = revokeDate;
	}

}
