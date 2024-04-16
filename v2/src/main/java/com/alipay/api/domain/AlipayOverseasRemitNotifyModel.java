package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 中国汇出汇款结果通知接口
 *
 * @author auto create
 * @since 1.0, 2023-06-23 13:11:16
 */
public class AlipayOverseasRemitNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 4356891291277234765L;

	/**
	 * 额外收款详情
	 */
	@ApiField("additional_beneficiary_details")
	private String additionalBeneficiaryDetails;

	/**
	 * 收端机构ID
	 */
	@ApiField("beneficiary_agent_id")
	private String beneficiaryAgentId;

	/**
	 * 风控结果
	 */
	@ApiField("compliance_result")
	private String complianceResult;

	/**
	 * 固定金额类型
	 */
	@ApiField("instructed_amount_type")
	private String instructedAmountType;

	/**
	 * 拓展字段
	 */
	@ApiField("pass_through_info")
	private String passThroughInfo;

	/**
	 * 发端机构ID
	 */
	@ApiField("payer_agent_id")
	private String payerAgentId;

	/**
	 * 汇出金额，单位为最小币种单位，如人民币的分、港币的分、日元的元
	 */
	@ApiField("transfer_from_amount")
	private Money transferFromAmount;

	/**
	 * 星河汇款单号
	 */
	@ApiField("transfer_id")
	private String transferId;

	/**
	 * 汇款汇率,格式为json
	 */
	@ApiField("transfer_quote")
	private String transferQuote;

	/**
	 * 汇款请求单号，，和create中的请求单号一致
	 */
	@ApiField("transfer_request_id")
	private String transferRequestId;

	/**
	 * 汇款结果
	 */
	@ApiField("transfer_result")
	private String transferResult;

	/**
	 * 汇款完成时间
	 */
	@ApiField("transfer_time")
	private String transferTime;

	/**
	 * 汇入金额，单位为最小币种单位，如人民币的分、港币的分、日元的元
	 */
	@ApiField("transfer_to_amount")
	private Money transferToAmount;

	public String getAdditionalBeneficiaryDetails() {
		return this.additionalBeneficiaryDetails;
	}
	public void setAdditionalBeneficiaryDetails(String additionalBeneficiaryDetails) {
		this.additionalBeneficiaryDetails = additionalBeneficiaryDetails;
	}

	public String getBeneficiaryAgentId() {
		return this.beneficiaryAgentId;
	}
	public void setBeneficiaryAgentId(String beneficiaryAgentId) {
		this.beneficiaryAgentId = beneficiaryAgentId;
	}

	public String getComplianceResult() {
		return this.complianceResult;
	}
	public void setComplianceResult(String complianceResult) {
		this.complianceResult = complianceResult;
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

	public Money getTransferFromAmount() {
		return this.transferFromAmount;
	}
	public void setTransferFromAmount(Money transferFromAmount) {
		this.transferFromAmount = transferFromAmount;
	}

	public String getTransferId() {
		return this.transferId;
	}
	public void setTransferId(String transferId) {
		this.transferId = transferId;
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

	public String getTransferResult() {
		return this.transferResult;
	}
	public void setTransferResult(String transferResult) {
		this.transferResult = transferResult;
	}

	public String getTransferTime() {
		return this.transferTime;
	}
	public void setTransferTime(String transferTime) {
		this.transferTime = transferTime;
	}

	public Money getTransferToAmount() {
		return this.transferToAmount;
	}
	public void setTransferToAmount(Money transferToAmount) {
		this.transferToAmount = transferToAmount;
	}

}
