package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 更新理赔单状态
 *
 * @author auto create
 * @since 1.0, 2025-10-29 17:38:45
 */
public class AlipayCommerceMedicalInsuranceClaimreportModifyModel extends AlipayObject {

	private static final long serialVersionUID = 6352555433613967652L;

	/**
	 * 保司理赔申请号
	 */
	@ApiField("apply_no")
	private String applyNo;

	/**
	 * 支付宝生成的业务流水号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 是否是赔案重开
	 */
	@ApiField("case_reopened")
	private Boolean caseReopened;

	/**
	 * 证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * ?户证件类型
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * claim_no 保司报案号
	 */
	@ApiField("claim_no")
	private String claimNo;

	/**
	 * 报案号
	 */
	@ApiField("claim_report_no")
	private String claimReportNo;

	/**
	 * 理赔状态
	 */
	@ApiField("claim_status")
	private String claimStatus;

	/**
	 * 保司类型
	 */
	@ApiField("company_type")
	private String companyType;

	/**
	 * 申请材料
	 */
	@ApiListField("identity_materials")
	@ApiField("identity_materials")
	private List<IdentityMaterials> identityMaterials;

	/**
	 * 补材场景
	 */
	@ApiField("lack_materials_sense")
	private String lackMaterialsSense;

	/**
	 * 姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 理赔通知书
	 */
	@ApiField("note_url")
	private String noteUrl;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 立案失败原因或拒赔原因
	 */
	@ApiField("reject_reason")
	private String rejectReason;

	/**
	 * 支付宝生成的流水号
	 */
	@ApiField("report_no")
	private String reportNo;

	/**
	 * 结算信息列表
	 */
	@ApiListField("selt_info_list")
	@ApiField("selt_info_list")
	private List<SeltInfoList> seltInfoList;

	/**
	 * 交易来源
	 */
	@ApiField("source")
	private String source;

	/**
	 * 理赔总金额
	 */
	@ApiField("total_claim_amount")
	private String totalClaimAmount;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getApplyNo() {
		return this.applyNo;
	}
	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public Boolean getCaseReopened() {
		return this.caseReopened;
	}
	public void setCaseReopened(Boolean caseReopened) {
		this.caseReopened = caseReopened;
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

	public String getClaimNo() {
		return this.claimNo;
	}
	public void setClaimNo(String claimNo) {
		this.claimNo = claimNo;
	}

	public String getClaimReportNo() {
		return this.claimReportNo;
	}
	public void setClaimReportNo(String claimReportNo) {
		this.claimReportNo = claimReportNo;
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

	public List<IdentityMaterials> getIdentityMaterials() {
		return this.identityMaterials;
	}
	public void setIdentityMaterials(List<IdentityMaterials> identityMaterials) {
		this.identityMaterials = identityMaterials;
	}

	public String getLackMaterialsSense() {
		return this.lackMaterialsSense;
	}
	public void setLackMaterialsSense(String lackMaterialsSense) {
		this.lackMaterialsSense = lackMaterialsSense;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getNoteUrl() {
		return this.noteUrl;
	}
	public void setNoteUrl(String noteUrl) {
		this.noteUrl = noteUrl;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getRejectReason() {
		return this.rejectReason;
	}
	public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}

	public String getReportNo() {
		return this.reportNo;
	}
	public void setReportNo(String reportNo) {
		this.reportNo = reportNo;
	}

	public List<SeltInfoList> getSeltInfoList() {
		return this.seltInfoList;
	}
	public void setSeltInfoList(List<SeltInfoList> seltInfoList) {
		this.seltInfoList = seltInfoList;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getTotalClaimAmount() {
		return this.totalClaimAmount;
	}
	public void setTotalClaimAmount(String totalClaimAmount) {
		this.totalClaimAmount = totalClaimAmount;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
