package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 国际留学汇款结果通知
 *
 * @author auto create
 * @since 1.0, 2026-10-19 19:42:55
 */
public class AlipayOverseasTuitionorderResultNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 8518395671186571131L;

	/**
	 * 收款方附属信息
	 */
	@ApiField("additional_beneficiary_details")
	private AdditionBeneficiary additionalBeneficiaryDetails;

	/**
	 * 收端支付相关附属信息
	 */
	@ApiField("additional_transfer_to_details")
	private AdditionalTransferDetail additionalTransferToDetails;

	/**
	 * 汇入机构Id
	 */
	@ApiField("beneficiary_agent_id")
	private String beneficiaryAgentId;

	/**
	 * 风控结果
	 */
	@ApiField("compliance_result")
	private Compliance complianceResult;

	/**
	 * 资金流出状态(ACCC/RJCT/PEND)
	 */
	@ApiField("fund_out_status")
	private String fundOutStatus;

	/**
	 * 汇款指令金额类型
	 */
	@ApiField("instructed_amount_type")
	private String instructedAmountType;

	/**
	 * Notify type
	 */
	@ApiField("notify_type")
	private String notifyType;

	/**
	 * 汇出机构Id
	 */
	@ApiField("payer_agent_id")
	private String payerAgentId;

	/**
	 * 营销详情
	 */
	@ApiField("promo_detail")
	private Promo promoDetail;

	/**
	 * 汇入金额
	 */
	@ApiField("transfer_from_amount")
	private TransferFromAmount transferFromAmount;

	/**
	 * 汇款单号
	 */
	@ApiField("transfer_id")
	private String transferId;

	/**
	 * 汇款报价
	 */
	@ApiField("transfer_quote")
	private RemitTransferQuotew transferQuote;

	/**
	 * 汇款请求单号
	 */
	@ApiField("transfer_request_id")
	private String transferRequestId;

	/**
	 * 汇款结果
	 */
	@ApiField("transfer_result")
	private TransferResultInfow transferResult;

	/**
	 * 汇款完成时间
	 */
	@ApiField("transfer_time")
	private String transferTime;

	/**
	 * 汇出金额
	 */
	@ApiField("transfer_to_amount")
	private TransferToAmount transferToAmount;

	/**
	 * GPI端到端追踪号UETR
	 */
	@ApiField("uetr")
	private String uetr;

	public AdditionBeneficiary getAdditionalBeneficiaryDetails() {
		return this.additionalBeneficiaryDetails;
	}
	public void setAdditionalBeneficiaryDetails(AdditionBeneficiary additionalBeneficiaryDetails) {
		this.additionalBeneficiaryDetails = additionalBeneficiaryDetails;
	}

	public AdditionalTransferDetail getAdditionalTransferToDetails() {
		return this.additionalTransferToDetails;
	}
	public void setAdditionalTransferToDetails(AdditionalTransferDetail additionalTransferToDetails) {
		this.additionalTransferToDetails = additionalTransferToDetails;
	}

	public String getBeneficiaryAgentId() {
		return this.beneficiaryAgentId;
	}
	public void setBeneficiaryAgentId(String beneficiaryAgentId) {
		this.beneficiaryAgentId = beneficiaryAgentId;
	}

	public Compliance getComplianceResult() {
		return this.complianceResult;
	}
	public void setComplianceResult(Compliance complianceResult) {
		this.complianceResult = complianceResult;
	}

	public String getFundOutStatus() {
		return this.fundOutStatus;
	}
	public void setFundOutStatus(String fundOutStatus) {
		this.fundOutStatus = fundOutStatus;
	}

	public String getInstructedAmountType() {
		return this.instructedAmountType;
	}
	public void setInstructedAmountType(String instructedAmountType) {
		this.instructedAmountType = instructedAmountType;
	}

	public String getNotifyType() {
		return this.notifyType;
	}
	public void setNotifyType(String notifyType) {
		this.notifyType = notifyType;
	}

	public String getPayerAgentId() {
		return this.payerAgentId;
	}
	public void setPayerAgentId(String payerAgentId) {
		this.payerAgentId = payerAgentId;
	}

	public Promo getPromoDetail() {
		return this.promoDetail;
	}
	public void setPromoDetail(Promo promoDetail) {
		this.promoDetail = promoDetail;
	}

	public TransferFromAmount getTransferFromAmount() {
		return this.transferFromAmount;
	}
	public void setTransferFromAmount(TransferFromAmount transferFromAmount) {
		this.transferFromAmount = transferFromAmount;
	}

	public String getTransferId() {
		return this.transferId;
	}
	public void setTransferId(String transferId) {
		this.transferId = transferId;
	}

	public RemitTransferQuotew getTransferQuote() {
		return this.transferQuote;
	}
	public void setTransferQuote(RemitTransferQuotew transferQuote) {
		this.transferQuote = transferQuote;
	}

	public String getTransferRequestId() {
		return this.transferRequestId;
	}
	public void setTransferRequestId(String transferRequestId) {
		this.transferRequestId = transferRequestId;
	}

	public TransferResultInfow getTransferResult() {
		return this.transferResult;
	}
	public void setTransferResult(TransferResultInfow transferResult) {
		this.transferResult = transferResult;
	}

	public String getTransferTime() {
		return this.transferTime;
	}
	public void setTransferTime(String transferTime) {
		this.transferTime = transferTime;
	}

	public TransferToAmount getTransferToAmount() {
		return this.transferToAmount;
	}
	public void setTransferToAmount(TransferToAmount transferToAmount) {
		this.transferToAmount = transferToAmount;
	}

	public String getUetr() {
		return this.uetr;
	}
	public void setUetr(String uetr) {
		this.uetr = uetr;
	}

}
