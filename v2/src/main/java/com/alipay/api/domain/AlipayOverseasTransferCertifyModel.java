package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 汇款信息验证
 *
 * @author auto create
 * @since 1.0, 2022-11-14 17:32:02
 */
public class AlipayOverseasTransferCertifyModel extends AlipayObject {

	private static final long serialVersionUID = 3158825179268228454L;

	/**
	 * 收端用户信息
	 */
	@ApiField("beneficiary")
	private String beneficiary;

	/**
	 * 收端机构的id
	 */
	@ApiField("beneficiary_agent_id")
	private String beneficiaryAgentId;

	/**
	 * 收款方式
	 */
	@ApiField("beneficiary_receipt_method")
	private String beneficiaryReceiptMethod;

	/**
	 * 业务类型
	 */
	@ApiField("biz_scene_type")
	private String bizSceneType;

	/**
	 * 金额类型
	 */
	@ApiField("instructed_amount_type")
	private String instructedAmountType;

	/**
	 * 透传信息
	 */
	@ApiField("pass_through_info")
	private String passThroughInfo;

	/**
	 * 发端用户信息
	 */
	@ApiField("payer")
	private String payer;

	/**
	 * 发端机构的id
	 */
	@ApiField("payer_agent_id")
	private String payerAgentId;

	/**
	 * 汇款二级目的
	 */
	@ApiField("sub_transfer_purpose")
	private String subTransferPurpose;

	/**
	 * 汇款的金额
	 */
	@ApiField("transfer_from_amount")
	private Money transferFromAmount;

	/**
	 * HK
	 */
	@ApiField("transfer_from_region")
	private String transferFromRegion;

	/**
	 * 汇款目的
	 */
	@ApiField("transfer_purpose")
	private String transferPurpose;

	/**
	 * 收款的金额
	 */
	@ApiField("transfer_to_amount")
	private Money transferToAmount;

	/**
	 * 收款地区
	 */
	@ApiField("transfer_to_region")
	private String transferToRegion;

	public String getBeneficiary() {
		return this.beneficiary;
	}
	public void setBeneficiary(String beneficiary) {
		this.beneficiary = beneficiary;
	}

	public String getBeneficiaryAgentId() {
		return this.beneficiaryAgentId;
	}
	public void setBeneficiaryAgentId(String beneficiaryAgentId) {
		this.beneficiaryAgentId = beneficiaryAgentId;
	}

	public String getBeneficiaryReceiptMethod() {
		return this.beneficiaryReceiptMethod;
	}
	public void setBeneficiaryReceiptMethod(String beneficiaryReceiptMethod) {
		this.beneficiaryReceiptMethod = beneficiaryReceiptMethod;
	}

	public String getBizSceneType() {
		return this.bizSceneType;
	}
	public void setBizSceneType(String bizSceneType) {
		this.bizSceneType = bizSceneType;
	}

	public String getInstructedAmountType() {
		return this.instructedAmountType;
	}
	public void setInstructedAmountType(String instructedAmountType) {
		this.instructedAmountType = instructedAmountType;
	}

	public String getPassThroughInfo() {
		return this.passThroughInfo;
	}
	public void setPassThroughInfo(String passThroughInfo) {
		this.passThroughInfo = passThroughInfo;
	}

	public String getPayer() {
		return this.payer;
	}
	public void setPayer(String payer) {
		this.payer = payer;
	}

	public String getPayerAgentId() {
		return this.payerAgentId;
	}
	public void setPayerAgentId(String payerAgentId) {
		this.payerAgentId = payerAgentId;
	}

	public String getSubTransferPurpose() {
		return this.subTransferPurpose;
	}
	public void setSubTransferPurpose(String subTransferPurpose) {
		this.subTransferPurpose = subTransferPurpose;
	}

	public Money getTransferFromAmount() {
		return this.transferFromAmount;
	}
	public void setTransferFromAmount(Money transferFromAmount) {
		this.transferFromAmount = transferFromAmount;
	}

	public String getTransferFromRegion() {
		return this.transferFromRegion;
	}
	public void setTransferFromRegion(String transferFromRegion) {
		this.transferFromRegion = transferFromRegion;
	}

	public String getTransferPurpose() {
		return this.transferPurpose;
	}
	public void setTransferPurpose(String transferPurpose) {
		this.transferPurpose = transferPurpose;
	}

	public Money getTransferToAmount() {
		return this.transferToAmount;
	}
	public void setTransferToAmount(Money transferToAmount) {
		this.transferToAmount = transferToAmount;
	}

	public String getTransferToRegion() {
		return this.transferToRegion;
	}
	public void setTransferToRegion(String transferToRegion) {
		this.transferToRegion = transferToRegion;
	}

}
