package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.IndustryTradeFundBill;
import com.alipay.api.domain.IndustryVoucherDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.withholdrepayorder.trade.pay response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-11 15:42:12
 */
public class AlipayCommerceWithholdrepayorderTradePayResponse extends AlipayResponse {

	private static final long serialVersionUID = 4642632118187982649L;

	/** 
	 * 先享后付2.0垫资金额,不返回表示没有走垫资，非空表示垫资支付的金额
	 */
	@ApiField("advance_amount")
	private String advanceAmount;

	/** 
	 * 异步支付模式，目前有五种值： ASYNC_DELAY_PAY(异步延时付款); ASYNC_REALTIME_PAY(异步准实时付款); SYNC_DIRECT_PAY(同步直接扣款); NORMAL_ASYNC_PAY(纯异步付款); QUOTA_OCCUPYIED_ASYNC_PAY(异步支付并且预占了先享后付额度)
	 */
	@ApiField("async_payment_mode")
	private String asyncPaymentMode;

	/** 
	 * 买家支付宝账号
	 */
	@ApiField("buyer_logon_id")
	private String buyerLogonId;

	/** 
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("buyer_open_id")
	private String buyerOpenId;

	/** 
	 * 买家付款的金额
	 */
	@ApiField("buyer_pay_amount")
	private String buyerPayAmount;

	/** 
	 * 买家在支付宝的用户id
	 */
	@ApiField("buyer_user_id")
	private String buyerUserId;

	/** 
	 * 费率活动标识。 当交易享受特殊行业或活动费率时，返回该场景的标识。具体场景如下： trade_special_00：订单优惠费率； industry_special_on_00：线上行业特殊费率0； industry_special_on_01：线上行业特殊费率1； industry_special_00：线下行业特殊费率0； industry_special_01：线下行业特殊费率1； bluesea_1：蓝海活动优惠费率标签； 注：只在机构间联模式下返回，其它场景下不返回该字段
	 */
	@ApiField("charge_flags")
	private String chargeFlags;

	/** 
	 * 平台优惠金额
	 */
	@ApiField("discount_amount")
	private String discountAmount;

	/** 
	 * 本次交易支付所使用的单品券优惠的商品优惠信息。 只有在query_options中指定时才返回该字段信息。
	 */
	@ApiField("discount_goods_detail")
	private String discountGoodsDetail;

	/** 
	 * 交易支付使用的资金渠道。 只有在签约中指定需要返回资金明细，或者入参的query_options中指定时才返回该字段信息。
	 */
	@ApiListField("fund_bill_list")
	@ApiField("industry_trade_fund_bill")
	private List<IndustryTradeFundBill> fundBillList;

	/** 
	 * 交易支付时间
	 */
	@ApiField("gmt_payment")
	private Date gmtPayment;

	/** 
	 * 交易中可给用户开具发票的金额
	 */
	@ApiField("invoice_amount")
	private String invoiceAmount;

	/** 
	 * 商家优惠金额
	 */
	@ApiField("mdiscount_amount")
	private String mdiscountAmount;

	/** 
	 * 商户订单号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 使用集分宝付款的金额
	 */
	@ApiField("point_amount")
	private String pointAmount;

	/** 
	 * 实收金额
	 */
	@ApiField("receipt_amount")
	private String receiptAmount;

	/** 
	 * 发生支付交易的商户门店名称
	 */
	@ApiField("store_name")
	private String storeName;

	/** 
	 * 交易金额
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/** 
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/** 
	 * 本交易支付时使用的所有优惠券信息。 只有在query_options中指定时才返回该字段信息。
	 */
	@ApiListField("voucher_detail_list")
	@ApiField("industry_voucher_detail")
	private List<IndustryVoucherDetail> voucherDetailList;

	public void setAdvanceAmount(String advanceAmount) {
		this.advanceAmount = advanceAmount;
	}
	public String getAdvanceAmount( ) {
		return this.advanceAmount;
	}

	public void setAsyncPaymentMode(String asyncPaymentMode) {
		this.asyncPaymentMode = asyncPaymentMode;
	}
	public String getAsyncPaymentMode( ) {
		return this.asyncPaymentMode;
	}

	public void setBuyerLogonId(String buyerLogonId) {
		this.buyerLogonId = buyerLogonId;
	}
	public String getBuyerLogonId( ) {
		return this.buyerLogonId;
	}

	public void setBuyerOpenId(String buyerOpenId) {
		this.buyerOpenId = buyerOpenId;
	}
	public String getBuyerOpenId( ) {
		return this.buyerOpenId;
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

	public void setChargeFlags(String chargeFlags) {
		this.chargeFlags = chargeFlags;
	}
	public String getChargeFlags( ) {
		return this.chargeFlags;
	}

	public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}
	public String getDiscountAmount( ) {
		return this.discountAmount;
	}

	public void setDiscountGoodsDetail(String discountGoodsDetail) {
		this.discountGoodsDetail = discountGoodsDetail;
	}
	public String getDiscountGoodsDetail( ) {
		return this.discountGoodsDetail;
	}

	public void setFundBillList(List<IndustryTradeFundBill> fundBillList) {
		this.fundBillList = fundBillList;
	}
	public List<IndustryTradeFundBill> getFundBillList( ) {
		return this.fundBillList;
	}

	public void setGmtPayment(Date gmtPayment) {
		this.gmtPayment = gmtPayment;
	}
	public Date getGmtPayment( ) {
		return this.gmtPayment;
	}

	public void setInvoiceAmount(String invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}
	public String getInvoiceAmount( ) {
		return this.invoiceAmount;
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

	public void setPointAmount(String pointAmount) {
		this.pointAmount = pointAmount;
	}
	public String getPointAmount( ) {
		return this.pointAmount;
	}

	public void setReceiptAmount(String receiptAmount) {
		this.receiptAmount = receiptAmount;
	}
	public String getReceiptAmount( ) {
		return this.receiptAmount;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public String getStoreName( ) {
		return this.storeName;
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

	public void setVoucherDetailList(List<IndustryVoucherDetail> voucherDetailList) {
		this.voucherDetailList = voucherDetailList;
	}
	public List<IndustryVoucherDetail> getVoucherDetailList( ) {
		return this.voucherDetailList;
	}

}
