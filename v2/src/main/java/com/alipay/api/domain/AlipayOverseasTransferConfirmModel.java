package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发起汇款
 *
 * @author auto create
 * @since 1.0, 2020-03-19 20:48:14
 */
public class AlipayOverseasTransferConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 6556891229751528469L;

	/**
	 * 汇款相关的信息
	 */
	@ApiField("additional_transfer_details")
	private String additionalTransferDetails;

	/**
	 * 收端机构id
	 */
	@ApiField("beneficiary_agent_id")
	private String beneficiaryAgentId;

	/**
	 * {}
	 */
	@ApiField("beneficiary_receipt_method")
	private String beneficiaryReceiptMethod;

	/**
	 * 业务类型
	 */
	@ApiField("biz_scene_type")
	private String bizSceneType;

	/**
	 * 汇款过程中的金额类型
	 */
	@ApiField("instructed_amount_type")
	private String instructedAmountType;

	/**
	 * 透传信息
	 */
	@ApiField("pass_through_info")
	private String passThroughInfo;

	/**
	 * 发端机构id
	 */
	@ApiField("payer_agent_id")
	private String payerAgentId;

	/**
	 * 汇款用户的支付方式
	 */
	@ApiField("payer_payment_method")
	private String payerPaymentMethod;

	/**
	 * 汇款用户汇款的金额
	 */
	@ApiField("transfer_from_amount")
	private Money transferFromAmount;

	/**
	 * 汇款通知地址
	 */
	@ApiField("transfer_notify_url")
	private String transferNotifyUrl;

	/**
	 * 报价信息
	 */
	@ApiField("transfer_quote")
	private String transferQuote;

	/**
	 * 汇款请求id
	 */
	@ApiField("transfer_request_id")
	private String transferRequestId;

	/**
	 * 收款用户收到的金额
	 */
	@ApiField("transfer_to_amount")
	private Money transferToAmount;

	public String getAdditionalTransferDetails() {
		return this.additionalTransferDetails;
	}
	public void setAdditionalTransferDetails(String additionalTransferDetails) {
		this.additionalTransferDetails = additionalTransferDetails;
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

	public String getTransferNotifyUrl() {
		return this.transferNotifyUrl;
	}
	public void setTransferNotifyUrl(String transferNotifyUrl) {
		this.transferNotifyUrl = transferNotifyUrl;
	}

	public String getTransferQuote() {
		return this.transferQuote;
	}
	public void setTransferQuote(String transferQuote) {
		this.transferQuote = transferQuote;
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
