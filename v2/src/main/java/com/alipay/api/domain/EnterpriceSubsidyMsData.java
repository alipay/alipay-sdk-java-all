package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企补账号信息查询密算数据
 *
 * @author auto create
 * @since 1.0, 2025-08-04 10:17:36
 */
public class EnterpriceSubsidyMsData extends AlipayObject {

	private static final long serialVersionUID = 7428127123483691955L;

	/**
	 * 证件号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 报销理算业务流水号
	 */
	@ApiField("claim_no")
	private String claimNo;

	/**
	 * 企补报销理算时间
	 */
	@ApiField("claim_time")
	private String claimTime;

	/**
	 * 企业名称
	 */
	@ApiField("company_name")
	private String companyName;

	/**
	 * 企业编号
	 */
	@ApiField("cur_company_id")
	private String curCompanyId;

	/**
	 * 上级企业编号
	 */
	@ApiField("father_company_id")
	private String fatherCompanyId;

	/**
	 * 上级企业名称
	 */
	@ApiField("father_company_name")
	private String fatherCompanyName;

	/**
	 * 就诊编号
	 */
	@ApiField("mdtrt_id")
	private String mdtrtId;

	/**
	 * 定点医疗机构编码（H码）
	 */
	@ApiField("medical_org_id")
	private String medicalOrgId;

	/**
	 * 定点医疗机构名称
	 */
	@ApiField("medical_org_name")
	private String medicalOrgName;

	/**
	 * 姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 支付资金流水号（失败时不传）
	 */
	@ApiField("pay_fund_order_id")
	private String payFundOrderId;

	/**
	 * 医保就医支付时间
	 */
	@ApiField("pay_time")
	private String payTime;

	/**
	 * 企补账户剩余金额
	 */
	@ApiField("residue_amount")
	private String residueAmount;

	/**
	 * 医保结算单号
	 */
	@ApiField("setl_id")
	private String setlId;

	/**
	 * 本次企补报销总金额
	 */
	@ApiField("total_claim_amount")
	private String totalClaimAmount;

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

	public String getClaimNo() {
		return this.claimNo;
	}
	public void setClaimNo(String claimNo) {
		this.claimNo = claimNo;
	}

	public String getClaimTime() {
		return this.claimTime;
	}
	public void setClaimTime(String claimTime) {
		this.claimTime = claimTime;
	}

	public String getCompanyName() {
		return this.companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCurCompanyId() {
		return this.curCompanyId;
	}
	public void setCurCompanyId(String curCompanyId) {
		this.curCompanyId = curCompanyId;
	}

	public String getFatherCompanyId() {
		return this.fatherCompanyId;
	}
	public void setFatherCompanyId(String fatherCompanyId) {
		this.fatherCompanyId = fatherCompanyId;
	}

	public String getFatherCompanyName() {
		return this.fatherCompanyName;
	}
	public void setFatherCompanyName(String fatherCompanyName) {
		this.fatherCompanyName = fatherCompanyName;
	}

	public String getMdtrtId() {
		return this.mdtrtId;
	}
	public void setMdtrtId(String mdtrtId) {
		this.mdtrtId = mdtrtId;
	}

	public String getMedicalOrgId() {
		return this.medicalOrgId;
	}
	public void setMedicalOrgId(String medicalOrgId) {
		this.medicalOrgId = medicalOrgId;
	}

	public String getMedicalOrgName() {
		return this.medicalOrgName;
	}
	public void setMedicalOrgName(String medicalOrgName) {
		this.medicalOrgName = medicalOrgName;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPayFundOrderId() {
		return this.payFundOrderId;
	}
	public void setPayFundOrderId(String payFundOrderId) {
		this.payFundOrderId = payFundOrderId;
	}

	public String getPayTime() {
		return this.payTime;
	}
	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}

	public String getResidueAmount() {
		return this.residueAmount;
	}
	public void setResidueAmount(String residueAmount) {
		this.residueAmount = residueAmount;
	}

	public String getSetlId() {
		return this.setlId;
	}
	public void setSetlId(String setlId) {
		this.setlId = setlId;
	}

	public String getTotalClaimAmount() {
		return this.totalClaimAmount;
	}
	public void setTotalClaimAmount(String totalClaimAmount) {
		this.totalClaimAmount = totalClaimAmount;
	}

}
