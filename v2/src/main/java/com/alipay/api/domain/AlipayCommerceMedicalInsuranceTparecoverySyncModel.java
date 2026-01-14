package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * TPA渠道差额追缴信息同步
 *
 * @author auto create
 * @since 1.0, 2025-12-26 19:17:36
 */
public class AlipayCommerceMedicalInsuranceTparecoverySyncModel extends AlipayObject {

	private static final long serialVersionUID = 1252671466698561958L;

	/**
	 * 单位：元，保留2位小数。
	 */
	@ApiField("balance_recovery_amount")
	private String balanceRecoveryAmount;

	/**
	 * 是否需要进行差额追缴
	 */
	@ApiField("balance_recovery_required")
	private Boolean balanceRecoveryRequired;

	/**
	 * claim_no
	 */
	@ApiField("claim_no")
	private String claimNo;

	/**
	 * 保司类型
	 */
	@ApiField("company_type")
	private String companyType;

	/**
	 * 支付宝用户的唯一ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * WINDSTONE（风石）
	 */
	@ApiField("tpa_id")
	private String tpaId;

	/**
	 * 支付宝用户的唯一ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBalanceRecoveryAmount() {
		return this.balanceRecoveryAmount;
	}
	public void setBalanceRecoveryAmount(String balanceRecoveryAmount) {
		this.balanceRecoveryAmount = balanceRecoveryAmount;
	}

	public Boolean getBalanceRecoveryRequired() {
		return this.balanceRecoveryRequired;
	}
	public void setBalanceRecoveryRequired(Boolean balanceRecoveryRequired) {
		this.balanceRecoveryRequired = balanceRecoveryRequired;
	}

	public String getClaimNo() {
		return this.claimNo;
	}
	public void setClaimNo(String claimNo) {
		this.claimNo = claimNo;
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

}
