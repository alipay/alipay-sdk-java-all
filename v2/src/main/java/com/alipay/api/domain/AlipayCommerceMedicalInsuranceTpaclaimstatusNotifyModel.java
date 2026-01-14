package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * TPA渠道理赔状态回传
 *
 * @author auto create
 * @since 1.0, 2025-12-26 17:37:42
 */
public class AlipayCommerceMedicalInsuranceTpaclaimstatusNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 2527782457761272356L;

	/**
	 * 申请时间
	 */
	@ApiField("apply_time")
	private String applyTime;

	/**
	 * 支付宝业务单号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 投保人证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 投保人姓名证件类型·
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 示例：100.00
单位：元
保留俩位小数
	 */
	@ApiField("claim_amount")
	private String claimAmount;

	/**
	 * 理赔申请书业务单号
	 */
	@ApiField("claim_application_biz_no")
	private String claimApplicationBizNo;

	/**
	 * 理赔申请书
	 */
	@ApiField("claim_application_form_url")
	private String claimApplicationFormUrl;

	/**
	 * 理赔单号（风石）
	 */
	@ApiField("claim_no")
	private String claimNo;

	/**
	 * 理赔通知书
	 */
	@ApiField("claim_note_url")
	private String claimNoteUrl;

	/**
	 * 理赔状态
	 */
	@ApiField("claim_status")
	private String claimStatus;

	/**
	 * 类型
	 */
	@ApiField("company_type")
	private String companyType;

	/**
	 * 示例：100.00
单位：元
保留俩位小数
	 */
	@ApiField("direct_pay_quota")
	private String directPayQuota;

	/**
	 * 产品码
	 */
	@ApiField("dplan_code")
	private String dplanCode;

	/**
	 * 产品名
	 */
	@ApiField("dplan_name")
	private String dplanName;

	/**
	 * 被保人证件号
	 */
	@ApiField("insured_cert_no")
	private String insuredCertNo;

	/**
	 * 被保人证件类型
	 */
	@ApiField("insured_cert_type")
	private String insuredCertType;

	/**
	 * 被保人姓名
	 */
	@ApiField("insured_name")
	private String insuredName;

	/**
	 * null
	 */
	@ApiListField("material_list")
	@ApiField("insurance_material_info")
	private List<InsuranceMaterialInfo> materialList;

	/**
	 * 投保人姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 申请人支付宝支付宝openid	
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 保单号
	 */
	@ApiField("policy_no")
	private String policyNo;

	/**
	 * null
	 */
	@ApiListField("pre_auth_info_list")
	@ApiField("insurance_pre_auth_info")
	private List<InsurancePreAuthInfo> preAuthInfoList;

	/**
	 * 立案失败原因
	 */
	@ApiField("reject_reason")
	private String rejectReason;

	/**
	 * tpa编号
	 */
	@ApiField("tpa_id")
	private String tpaId;

	/**
	 * 申请人支付宝user_id
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 就诊信息
	 */
	@ApiField("visit_info")
	private InsuranceVisitInfo visitInfo;

	public String getApplyTime() {
		return this.applyTime;
	}
	public void setApplyTime(String applyTime) {
		this.applyTime = applyTime;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
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

	public String getClaimAmount() {
		return this.claimAmount;
	}
	public void setClaimAmount(String claimAmount) {
		this.claimAmount = claimAmount;
	}

	public String getClaimApplicationBizNo() {
		return this.claimApplicationBizNo;
	}
	public void setClaimApplicationBizNo(String claimApplicationBizNo) {
		this.claimApplicationBizNo = claimApplicationBizNo;
	}

	public String getClaimApplicationFormUrl() {
		return this.claimApplicationFormUrl;
	}
	public void setClaimApplicationFormUrl(String claimApplicationFormUrl) {
		this.claimApplicationFormUrl = claimApplicationFormUrl;
	}

	public String getClaimNo() {
		return this.claimNo;
	}
	public void setClaimNo(String claimNo) {
		this.claimNo = claimNo;
	}

	public String getClaimNoteUrl() {
		return this.claimNoteUrl;
	}
	public void setClaimNoteUrl(String claimNoteUrl) {
		this.claimNoteUrl = claimNoteUrl;
	}

	public String getClaimStatus() {
		return this.claimStatus;
	}
	public void setClaimStatus(String claimStatus) {
		this.claimStatus = claimStatus;
	}

	public String getCompanyType() {
		return this.companyType;
	}
	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}

	public String getDirectPayQuota() {
		return this.directPayQuota;
	}
	public void setDirectPayQuota(String directPayQuota) {
		this.directPayQuota = directPayQuota;
	}

	public String getDplanCode() {
		return this.dplanCode;
	}
	public void setDplanCode(String dplanCode) {
		this.dplanCode = dplanCode;
	}

	public String getDplanName() {
		return this.dplanName;
	}
	public void setDplanName(String dplanName) {
		this.dplanName = dplanName;
	}

	public String getInsuredCertNo() {
		return this.insuredCertNo;
	}
	public void setInsuredCertNo(String insuredCertNo) {
		this.insuredCertNo = insuredCertNo;
	}

	public String getInsuredCertType() {
		return this.insuredCertType;
	}
	public void setInsuredCertType(String insuredCertType) {
		this.insuredCertType = insuredCertType;
	}

	public String getInsuredName() {
		return this.insuredName;
	}
	public void setInsuredName(String insuredName) {
		this.insuredName = insuredName;
	}

	public List<InsuranceMaterialInfo> getMaterialList() {
		return this.materialList;
	}
	public void setMaterialList(List<InsuranceMaterialInfo> materialList) {
		this.materialList = materialList;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPolicyNo() {
		return this.policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	public List<InsurancePreAuthInfo> getPreAuthInfoList() {
		return this.preAuthInfoList;
	}
	public void setPreAuthInfoList(List<InsurancePreAuthInfo> preAuthInfoList) {
		this.preAuthInfoList = preAuthInfoList;
	}

	public String getRejectReason() {
		return this.rejectReason;
	}
	public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}

	public String getTpaId() {
		return this.tpaId;
	}
	public void setTpaId(String tpaId) {
		this.tpaId = tpaId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public InsuranceVisitInfo getVisitInfo() {
		return this.visitInfo;
	}
	public void setVisitInfo(InsuranceVisitInfo visitInfo) {
		this.visitInfo = visitInfo;
	}

}
