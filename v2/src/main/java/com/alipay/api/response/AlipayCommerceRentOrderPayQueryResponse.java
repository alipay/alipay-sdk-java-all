package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RentTradeFundBillVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.rent.order.pay.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-24 14:07:42
 */
public class AlipayCommerceRentOrderPayQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3474665983624575866L;

	/** 
	 * 交易附加状态： SELLER_NOT_RECEIVED（买家已付款，卖家未收款）
	 */
	@ApiField("additional_status")
	private String additionalStatus;

	/** 
	 * 买家实付金额，单位为元，两位小数。该金额代表该笔交易买家实际支付的金额，不包含商户折扣等金额
	 */
	@ApiField("buyer_pay_amount")
	private String buyerPayAmount;

	/** 
	 * 买家在支付宝的用户id
	 */
	@ApiField("buyer_user_id")
	private String buyerUserId;

	/** 
	 * 平台优惠金额
	 */
	@ApiField("discount_amount")
	private String discountAmount;

	/** 
	 * null
	 */
	@ApiListField("fund_bill_list")
	@ApiField("rent_trade_fund_bill_v_o")
	private List<RentTradeFundBillVO> fundBillList;

	/** 
	 * 商家优惠金额。单位：元。
	 */
	@ApiField("mdiscount_amount")
	private String mdiscountAmount;

	/** 
	 * 商家订单号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 实收金额，单位为元，两位小数。该金额为本笔交易，商户账户能够实际收到的金额
	 */
	@ApiField("receipt_amount")
	private String receiptAmount;

	/** 
	 * 本次交易打款给卖家的时间
	 */
	@ApiField("send_pay_date")
	private Date sendPayDate;

	/** 
	 * 交易的订单金额，单位为元，两位小数。该参数的值为支付时传入的total_amount
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/** 
	 * 支付宝交易号，在未生成真实交易时，不返回，需要商户多次调用该接口或支付通知，获取最终的交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/** 
	 * 交易状态：WAIT_BUYER_PAY（交易创建，等待买家付款）、TRADE_CLOSED（未付款交易超时关闭，或支付完成后全额退款）、TRADE_SUCCESS（交易支付成功）、TRADE_FINISHED（交易结束，不可退款）
	 */
	@ApiField("trade_status")
	private String tradeStatus;

	public void setAdditionalStatus(String additionalStatus) {
		this.additionalStatus = additionalStatus;
	}
	public String getAdditionalStatus( ) {
		return this.additionalStatus;
	}

	public void setBuyerPayAmount(String buyerPayAmount) {
		this.buyerPayAmount = buyerPayAmount;
	}
	public String getBuyerPayAmount( ) {
		return this.buyerPayAmount;
	}

	public void setBuyerUserId(String buyerUserId) {
		this.buyerUserId = buyerUserId;
	}
	public String getBuyerUserId( ) {
		return this.buyerUserId;
	}

	public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}
	public String getDiscountAmount( ) {
		return this.discountAmount;
	}

	public void setFundBillList(List<RentTradeFundBillVO> fundBillList) {
		this.fundBillList = fundBillList;
	}
	public List<RentTradeFundBillVO> getFundBillList( ) {
		return this.fundBillList;
	}

	public void setMdiscountAmount(String mdiscountAmount) {
		this.mdiscountAmount = mdiscountAmount;
	}
	public String getMdiscountAmount( ) {
		return this.mdiscountAmount;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}
	public String getOutTradeNo( ) {
		return this.outTradeNo;
	}

	public void setReceiptAmount(String receiptAmount) {
		this.receiptAmount = receiptAmount;
	}
	public String getReceiptAmount( ) {
		return this.receiptAmount;
	}

	public void setSendPayDate(Date sendPayDate) {
		this.sendPayDate = sendPayDate;
	}
	public Date getSendPayDate( ) {
		return this.sendPayDate;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getTotalAmount( ) {
		return this.totalAmount;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

	public void setTradeStatus(String tradeStatus) {
		this.tradeStatus = tradeStatus;
	}
	public String getTradeStatus( ) {
		return this.tradeStatus;
	}

}
