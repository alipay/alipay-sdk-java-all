package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 校验机构缴费项
 *
 * @author auto create
 * @since 1.0, 2021-08-09 15:04:04
 */
public class AlipayOverseasTransferPaymentPrecreateModel extends AlipayObject {

	private static final long serialVersionUID = 8114239165982469183L;

	/**
	 * 缴费详细信息
	 */
	@ApiField("additional_transfer_details")
	private String additionalTransferDetails;

	/**
	 * 收款方式
	 */
	@ApiField("beneficiary_receipt_method")
	private String beneficiaryReceiptMethod;

	/**
	 * 业务场景
	 */
	@ApiField("biz_scene_type")
	private String bizSceneType;

	/**
	 * 汇款指令金额类型
	 */
	@ApiField("instructed_amount_type")
	private String instructedAmountType;

	/**
	 * pass_through_info
	 */
	@ApiField("pass_through_info")
	private String passThroughInfo;

	/**
	 * 发端机构
	 */
	@ApiField("payer_agent_id")
	private String payerAgentId;

	/**
	 * 付款方式
	 */
	@ApiField("payer_payment_method")
	private String payerPaymentMethod;

	/**
	 * 汇出金额(from)
	 */
	@ApiField("transfer_from_amount")
	private Money transferFromAmount;

	/**
	 * 请求流水号
	 */
	@ApiField("transfer_request_id")
	private String transferRequestId;

	/**
	 * 汇出金额(to)
	 */
	@ApiField("transfer_to_amount")
	private Money transferToAmount;

	public String getAdditionalTransferDetails() {
		return this.additionalTransferDetails;
	}
	public void setAdditionalTransferDetails(String additionalTransferDetails) {
		this.additionalTransferDetails = additionalTransferDetails;
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

	public String getPayerAgentId() {
		return this.payerAgentId;
	}
	public void setPayerAgentId(String payerAgentId) {
		this.payerAgentId = payerAgentId;
	}

	public String getPayerPaymentMethod() {
		return this.payerPaymentMethod;
	}
	public void setPayerPaymentMethod(String payerPaymentMethod) {
		this.payerPaymentMethod = payerPaymentMethod;
	}

	public Money getTransferFromAmount() {
		return this.transferFromAmount;
	}
	public void setTransferFromAmount(Money transferFromAmount) {
		this.transferFromAmount = transferFromAmount;
	}

	public String getTransferRequestId() {
		return this.transferRequestId;
	}
	public void setTransferRequestId(String transferRequestId) {
		this.transferRequestId = transferRequestId;
	}

	public Money getTransferToAmount() {
		return this.transferToAmount;
	}
	public void setTransferToAmount(Money transferToAmount) {
		this.transferToAmount = transferToAmount;
	}

}
