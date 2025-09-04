package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 理赔案件结果同步
 *
 * @author auto create
 * @since 1.0, 2025-07-16 16:02:30
 */
public class AlipayCommerceMedicalInsuranceClaimSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8871211479338881135L;

	/**
	 * TPA垫付金额，单位为元，精确到小数点后两位
	 */
	@ApiField("advance_amount")
	private String advanceAmount;

	/**
	 * 垫付申请编号
	 */
	@ApiField("advance_apply_no")
	private String advanceApplyNo;

	/**
	 * 支付宝垫付申请号
	 */
	@ApiField("ant_apply_no")
	private String antApplyNo;

	/**
	 * 支付宝理赔报案号
	 */
	@ApiField("ant_claim_no")
	private String antClaimNo;

	/**
	 * 业务流水号
	 */
	@ApiField("business_no")
	private String businessNo;

	/**
	 * 理赔金额，单位为元，精确到小数点后两位
	 */
	@ApiField("claim_amount")
	private String claimAmount;

	/**
	 * 理赔详情URL
	 */
	@ApiField("claim_detail")
	private String claimDetail;

	/**
	 * 案件号（保司理赔报案号）
	 */
	@ApiField("claim_no")
	private String claimNo;

	/**
	 * 理赔状态
	 */
	@ApiField("claim_status")
	private String claimStatus;

	/**
	 * 理赔状态描述，理赔失败时原因描述
	 */
	@ApiField("claim_status_desc")
	private String claimStatusDesc;

	/**
	 * 理赔发起类型
	 */
	@ApiField("claim_type")
	private String claimType;

	/**
	 * 保司类型
	 */
	@ApiField("company_type")
	private String companyType;

	/**
	 * 申请/补充材料
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
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 打款支付宝账户名，案件状态为打款成功时必传
	 */
	@ApiField("pay_account")
	private String payAccount;

	/**
	 * 理赔打款金额，打款给用户金额
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * 打款时间，案件状态为打款成功时必传
	 */
	@ApiField("pay_time")
	private String payTime;

	/**
	 * 请求来源
	 */
	@ApiField("source")
	private String source;

	/**
	 * 邮寄信息
	 */
	@ApiField("to_send_info")
	private PostInfo toSendInfo;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getAdvanceAmount() {
		return this.advanceAmount;
	}
	public void setAdvanceAmount(String advanceAmount) {
		this.advanceAmount = advanceAmount;
	}

	public String getAdvanceApplyNo() {
		return this.advanceApplyNo;
	}
	public void setAdvanceApplyNo(String advanceApplyNo) {
		this.advanceApplyNo = advanceApplyNo;
	}

	public String getAntApplyNo() {
		return this.antApplyNo;
	}
	public void setAntApplyNo(String antApplyNo) {
		this.antApplyNo = antApplyNo;
	}

	public String getAntClaimNo() {
		return this.antClaimNo;
	}
	public void setAntClaimNo(String antClaimNo) {
		this.antClaimNo = antClaimNo;
	}

	public String getBusinessNo() {
		return this.businessNo;
	}
	public void setBusinessNo(String businessNo) {
		this.businessNo = businessNo;
	}

	public String getClaimAmount() {
		return this.claimAmount;
	}
	public void setClaimAmount(String claimAmount) {
		this.claimAmount = claimAmount;
	}

	public String getClaimDetail() {
		return this.claimDetail;
	}
	public void setClaimDetail(String claimDetail) {
		this.claimDetail = claimDetail;
	}

	public String getClaimNo() {
		return this.claimNo;
	}
	public void setClaimNo(String claimNo) {
		this.claimNo = claimNo;
	}

	public String getClaimStatus() {
		return this.claimStatus;
	}
	public void setClaimStatus(String claimStatus) {
		this.claimStatus = claimStatus;
	}

	public String getClaimStatusDesc() {
		return this.claimStatusDesc;
	}
	public void setClaimStatusDesc(String claimStatusDesc) {
		this.claimStatusDesc = claimStatusDesc;
	}

	public String getClaimType() {
		return this.claimType;
	}
	public void setClaimType(String claimType) {
		this.claimType = claimType;
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

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPayAccount() {
		return this.payAccount;
	}
	public void setPayAccount(String payAccount) {
		this.payAccount = payAccount;
	}

	public String getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

	public String getPayTime() {
		return this.payTime;
	}
	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public PostInfo getToSendInfo() {
		return this.toSendInfo;
	}
	public void setToSendInfo(PostInfo toSendInfo) {
		this.toSendInfo = toSendInfo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
