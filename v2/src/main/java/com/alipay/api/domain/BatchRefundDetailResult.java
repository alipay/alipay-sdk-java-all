package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量退款明细结果
 *
 * @author auto create
 * @since 1.0, 2018-09-29 19:06:25
 */
public class BatchRefundDetailResult extends AlipayObject {

	private static final long serialVersionUID = 2321626349336559823L;

	/**
	 * 商户请求批量退款时传递的批次号。
	 */
	@ApiField("batch_no")
	private String batchNo;

	/**
	 * 充退状态：S成功，F失败，P处理中。
	 */
	@ApiField("dback_status")
	private String dbackStatus;

	/**
	 * 预估银行响应时间
	 */
	@ApiField("est_bank_ack_time")
	private String estBankAckTime;

	/**
	 * 预估银行入账时间
	 */
	@ApiField("est_bank_receipt_time")
	private String estBankReceiptTime;

	/**
	 * 是否有充退
	 */
	@ApiField("has_deposit_back")
	private Boolean hasDepositBack;

	/**
	 * 退款金额
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 退款银行名称
	 */
	@ApiField("refund_bank_name")
	private String refundBankName;

	/**
	 * 退分润信息列表
	 */
	@ApiListField("refund_royaltys")
	@ApiField("refund_royalty_result")
	private List<RefundRoyaltyResult> refundRoyaltys;

	/**
	 * 退补差金额
	 */
	@ApiField("refund_suppl_amount")
	private String refundSupplAmount;

	/**
	 * 退补差结果码
	 */
	@ApiField("refund_suppl_result_code")
	private String refundSupplResultCode;

	/**
	 * 剩余补差金额
	 */
	@ApiField("rest_suppl_amount")
	private String restSupplAmount;

	/**
	 * 交易退款结果码。如果成功为SUCCESS，如果处理中为PROCESSING，其它情况为错误码。
	 */
	@ApiField("result_code")
	private String resultCode;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 退款解冻信息
	 */
	@ApiField("unfreeze_details")
	private RefundUnfreezeResult unfreezeDetails;

	public String getBatchNo() {
		return this.batchNo;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	public String getDbackStatus() {
		return this.dbackStatus;
	}
	public void setDbackStatus(String dbackStatus) {
		this.dbackStatus = dbackStatus;
	}

	public String getEstBankAckTime() {
		return this.estBankAckTime;
	}
	public void setEstBankAckTime(String estBankAckTime) {
		this.estBankAckTime = estBankAckTime;
	}

	public String getEstBankReceiptTime() {
		return this.estBankReceiptTime;
	}
	public void setEstBankReceiptTime(String estBankReceiptTime) {
		this.estBankReceiptTime = estBankReceiptTime;
	}

	public Boolean getHasDepositBack() {
		return this.hasDepositBack;
	}
	public void setHasDepositBack(Boolean hasDepositBack) {
		this.hasDepositBack = hasDepositBack;
	}

	public String getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getRefundBankName() {
		return this.refundBankName;
	}
	public void setRefundBankName(String refundBankName) {
		this.refundBankName = refundBankName;
	}

	public List<RefundRoyaltyResult> getRefundRoyaltys() {
		return this.refundRoyaltys;
	}
	public void setRefundRoyaltys(List<RefundRoyaltyResult> refundRoyaltys) {
		this.refundRoyaltys = refundRoyaltys;
	}

	public String getRefundSupplAmount() {
		return this.refundSupplAmount;
	}
	public void setRefundSupplAmount(String refundSupplAmount) {
		this.refundSupplAmount = refundSupplAmount;
	}

	public String getRefundSupplResultCode() {
		return this.refundSupplResultCode;
	}
	public void setRefundSupplResultCode(String refundSupplResultCode) {
		this.refundSupplResultCode = refundSupplResultCode;
	}

	public String getRestSupplAmount() {
		return this.restSupplAmount;
	}
	public void setRestSupplAmount(String restSupplAmount) {
		this.restSupplAmount = restSupplAmount;
	}

	public String getResultCode() {
		return this.resultCode;
	}
	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public RefundUnfreezeResult getUnfreezeDetails() {
		return this.unfreezeDetails;
	}
	public void setUnfreezeDetails(RefundUnfreezeResult unfreezeDetails) {
		this.unfreezeDetails = unfreezeDetails;
	}

}
