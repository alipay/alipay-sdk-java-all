package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 理赔案件结果同步
 *
 * @author auto create
 * @since 1.0, 2024-12-02 16:34:32
 */
public class AlipayCommerceMedicalInsuranceClaimSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5643377557357612284L;

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
	 * 案件号
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
	 * 保司类型
	 */
	@ApiField("company_type")
	private String companyType;

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
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

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

	public String getCompanyType() {
		return this.companyType;
	}
	public void setCompanyType(String companyType) {
		this.companyType = companyType;
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

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
