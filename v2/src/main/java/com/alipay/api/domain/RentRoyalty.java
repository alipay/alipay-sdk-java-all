package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁分账计划
 *
 * @author auto create
 * @since 1.0, 2025-07-17 16:44:56
 */
public class RentRoyalty extends AlipayObject {

	private static final long serialVersionUID = 1814316288625869668L;

	/**
	 * 订单id
	 */
	@ApiField("biz_order_id")
	private String bizOrderId;

	/**
	 * 买家支付宝用户唯一标识
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 买家支付宝用户唯一标识
	 */
	@ApiField("buyer_open_id")
	private String buyerOpenId;

	/**
	 * 当前期数改账中的买断分账金，单位：元
	 */
	@ApiField("current_buyout_after_price")
	private String currentBuyoutAfterPrice;

	/**
	 * 本期对应的买断分账金，单位：元
	 */
	@ApiField("current_buyout_price")
	private String currentBuyoutPrice;

	/**
	 * 预期分账时间
	 */
	@ApiField("expect_royalty_time")
	private Date expectRoyaltyTime;

	/**
	 * 当前请求分账期数,true表示是当前请求的分账期数，面向资金方的分账成功消息该字段才有值。
	 */
	@ApiField("is_current_request")
	private String isCurrentRequest;

	/**
	 * 商户订单号
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 代表某一个阶段的第几期的还款计划，要结合stage进行锁定某一期计划
	 */
	@ApiField("period")
	private String period;

	/**
	 * 应还日（资方
	 */
	@ApiField("repay_time")
	private Date repayTime;

	/**
	 * 还款利息,单位：元
	 */
	@ApiField("repayment_interest_price")
	private String repaymentInterestPrice;

	/**
	 * 还款本金，单位：元
	 */
	@ApiField("repayment_principal_price")
	private String repaymentPrincipalPrice;

	/**
	 * 实际还款日
	 */
	@ApiField("repayment_time")
	private Date repaymentTime;

	/**
	 * 还款总金额,单位：元
	 */
	@ApiField("repayment_total_price")
	private String repaymentTotalPrice;

	/**
	 * 改账中的分账金额，单位：元，精确到小数点后两位
	 */
	@ApiField("royalty_after_price")
	private String royaltyAfterPrice;

	/**
	 * 分账履约方式。历史代偿分账，统一输出COMPENSATORY_ALLOC
	 */
	@ApiField("royalty_deliver_type")
	private String royaltyDeliverType;

	/**
	 * 分账履约单号
	 */
	@ApiField("royalty_installment_no")
	private String royaltyInstallmentNo;

	/**
	 * 分账利息，币种：人民币，单位：元。
	 */
	@ApiField("royalty_interest_price")
	private String royaltyInterestPrice;

	/**
	 * 分账支付方式（for资方），到卡、到户或者部分到卡，部分到户
	 */
	@ApiField("royalty_payment_method")
	private String royaltyPaymentMethod;

	/**
	 * 和royalty_payment_method配合使用。履约单号+"-到卡"或者+"到户"，多笔履约单号之前用“;”隔开。
	 */
	@ApiField("royalty_payment_method_note")
	private String royaltyPaymentMethodNote;

	/**
	 * 分账金额，单位：元，精确到小数点后两位
	 */
	@ApiField("royalty_price")
	private String royaltyPrice;

	/**
	 * 分账本金，币种：人民币，单位:元。
	 */
	@ApiField("royalty_principal_price")
	private String royaltyPrincipalPrice;

	/**
	 * 分账计划的状态
	 */
	@ApiField("royalty_status")
	private String royaltyStatus;

	/**
	 * 分账完成时间点
	 */
	@ApiField("royalty_time")
	private String royaltyTime;

	/**
	 * 提前结清的分账触发方式
	 */
	@ApiField("royalty_trigger_type")
	private String royaltyTriggerType;

	/**
	 * 仅在代偿给资方时，资方的收款方式为到银行卡的场景下才有值，资方的入金流水号
	 */
	@ApiField("settle_serial_no")
	private String settleSerialNo;

	/**
	 * 代表第几阶段的还款计划，要配合period锁定第几期还款计划
	 */
	@ApiField("stage")
	private String stage;

	/**
	 * 分账成功之后对应的交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 租金类型
	 */
	@ApiField("type")
	private String type;

	public String getBizOrderId() {
		return this.bizOrderId;
	}
	public void setBizOrderId(String bizOrderId) {
		this.bizOrderId = bizOrderId;
	}

	public String getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getBuyerOpenId() {
		return this.buyerOpenId;
	}
	public void setBuyerOpenId(String buyerOpenId) {
		this.buyerOpenId = buyerOpenId;
	}

	public String getCurrentBuyoutAfterPrice() {
		return this.currentBuyoutAfterPrice;
	}
	public void setCurrentBuyoutAfterPrice(String currentBuyoutAfterPrice) {
		this.currentBuyoutAfterPrice = currentBuyoutAfterPrice;
	}

	public String getCurrentBuyoutPrice() {
		return this.currentBuyoutPrice;
	}
	public void setCurrentBuyoutPrice(String currentBuyoutPrice) {
		this.currentBuyoutPrice = currentBuyoutPrice;
	}

	public Date getExpectRoyaltyTime() {
		return this.expectRoyaltyTime;
	}
	public void setExpectRoyaltyTime(Date expectRoyaltyTime) {
		this.expectRoyaltyTime = expectRoyaltyTime;
	}

	public String getIsCurrentRequest() {
		return this.isCurrentRequest;
	}
	public void setIsCurrentRequest(String isCurrentRequest) {
		this.isCurrentRequest = isCurrentRequest;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public String getPeriod() {
		return this.period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}

	public Date getRepayTime() {
		return this.repayTime;
	}
	public void setRepayTime(Date repayTime) {
		this.repayTime = repayTime;
	}

	public String getRepaymentInterestPrice() {
		return this.repaymentInterestPrice;
	}
	public void setRepaymentInterestPrice(String repaymentInterestPrice) {
		this.repaymentInterestPrice = repaymentInterestPrice;
	}

	public String getRepaymentPrincipalPrice() {
		return this.repaymentPrincipalPrice;
	}
	public void setRepaymentPrincipalPrice(String repaymentPrincipalPrice) {
		this.repaymentPrincipalPrice = repaymentPrincipalPrice;
	}

	public Date getRepaymentTime() {
		return this.repaymentTime;
	}
	public void setRepaymentTime(Date repaymentTime) {
		this.repaymentTime = repaymentTime;
	}

	public String getRepaymentTotalPrice() {
		return this.repaymentTotalPrice;
	}
	public void setRepaymentTotalPrice(String repaymentTotalPrice) {
		this.repaymentTotalPrice = repaymentTotalPrice;
	}

	public String getRoyaltyAfterPrice() {
		return this.royaltyAfterPrice;
	}
	public void setRoyaltyAfterPrice(String royaltyAfterPrice) {
		this.royaltyAfterPrice = royaltyAfterPrice;
	}

	public String getRoyaltyDeliverType() {
		return this.royaltyDeliverType;
	}
	public void setRoyaltyDeliverType(String royaltyDeliverType) {
		this.royaltyDeliverType = royaltyDeliverType;
	}

	public String getRoyaltyInstallmentNo() {
		return this.royaltyInstallmentNo;
	}
	public void setRoyaltyInstallmentNo(String royaltyInstallmentNo) {
		this.royaltyInstallmentNo = royaltyInstallmentNo;
	}

	public String getRoyaltyInterestPrice() {
		return this.royaltyInterestPrice;
	}
	public void setRoyaltyInterestPrice(String royaltyInterestPrice) {
		this.royaltyInterestPrice = royaltyInterestPrice;
	}

	public String getRoyaltyPaymentMethod() {
		return this.royaltyPaymentMethod;
	}
	public void setRoyaltyPaymentMethod(String royaltyPaymentMethod) {
		this.royaltyPaymentMethod = royaltyPaymentMethod;
	}

	public String getRoyaltyPaymentMethodNote() {
		return this.royaltyPaymentMethodNote;
	}
	public void setRoyaltyPaymentMethodNote(String royaltyPaymentMethodNote) {
		this.royaltyPaymentMethodNote = royaltyPaymentMethodNote;
	}

	public String getRoyaltyPrice() {
		return this.royaltyPrice;
	}
	public void setRoyaltyPrice(String royaltyPrice) {
		this.royaltyPrice = royaltyPrice;
	}

	public String getRoyaltyPrincipalPrice() {
		return this.royaltyPrincipalPrice;
	}
	public void setRoyaltyPrincipalPrice(String royaltyPrincipalPrice) {
		this.royaltyPrincipalPrice = royaltyPrincipalPrice;
	}

	public String getRoyaltyStatus() {
		return this.royaltyStatus;
	}
	public void setRoyaltyStatus(String royaltyStatus) {
		this.royaltyStatus = royaltyStatus;
	}

	public String getRoyaltyTime() {
		return this.royaltyTime;
	}
	public void setRoyaltyTime(String royaltyTime) {
		this.royaltyTime = royaltyTime;
	}

	public String getRoyaltyTriggerType() {
		return this.royaltyTriggerType;
	}
	public void setRoyaltyTriggerType(String royaltyTriggerType) {
		this.royaltyTriggerType = royaltyTriggerType;
	}

	public String getSettleSerialNo() {
		return this.settleSerialNo;
	}
	public void setSettleSerialNo(String settleSerialNo) {
		this.settleSerialNo = settleSerialNo;
	}

	public String getStage() {
		return this.stage;
	}
	public void setStage(String stage) {
		this.stage = stage;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
