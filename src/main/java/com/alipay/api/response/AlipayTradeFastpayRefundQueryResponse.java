package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DepositBackInfo;
import com.alipay.api.domain.TradeFundBill;
import com.alipay.api.domain.RefundRoyaltyResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.fastpay.refund.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-03-02 14:33:01
 */
public class AlipayTradeFastpayRefundQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3353729391454231251L;

	/** 
	 * 银行卡冲退信息
	 */
	@ApiField("deposit_back_info")
	private DepositBackInfo depositBackInfo;

	/** 
	 * 退款失败错误码。只在使用异步退款接口情况下才会返回该字段
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 退款时间。
	 */
	@ApiField("gmt_refund_pay")
	private Date gmtRefundPay;

	/** 
	 * 行业特殊信息（例如在医保卡支付退款中，医保局向商户返回医疗信息）。
	 */
	@ApiField("industry_sepc_detail")
	private String industrySepcDetail;

	/** 
	 * 本笔退款对应的退款请求号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/** 
	 * 创建交易传入的商户订单号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 本次退款金额中买家退款金额
	 */
	@ApiField("present_refund_buyer_amount")
	private String presentRefundBuyerAmount;

	/** 
	 * 本次退款金额中平台优惠退款金额
	 */
	@ApiField("present_refund_discount_amount")
	private String presentRefundDiscountAmount;

	/** 
	 * 本次退款金额中商家优惠退款金额
	 */
	@ApiField("present_refund_mdiscount_amount")
	private String presentRefundMdiscountAmount;

	/** 
	 * 本次退款请求，对应的退款金额
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/** 
	 * 本次退款针对收款方的退收费金额；
默认不返回该信息，需与支付宝约定后配置返回；
	 */
	@ApiField("refund_charge_amount")
	private String refundChargeAmount;

	/** 
	 * 本次退款使用的资金渠道；
默认不返回该信息，需与支付宝约定后配置，或者入参的query_options中指定时才返回该字段信息。
	 */
	@ApiListField("refund_detail_item_list")
	@ApiField("trade_fund_bill")
	private List<TradeFundBill> refundDetailItemList;

	/** 
	 * 发起退款时，传入的退款原因
	 */
	@ApiField("refund_reason")
	private String refundReason;

	/** 
	 * 退分账明细信息
	 */
	@ApiListField("refund_royaltys")
	@ApiField("refund_royalty_result")
	private List<RefundRoyaltyResult> refundRoyaltys;

	/** 
	 * 退款清算编号，用于清算对账使用；
只在银行间联交易场景下返回该信息；
	 */
	@ApiField("refund_settlement_id")
	private String refundSettlementId;

	/** 
	 * 只在使用异步退款接口情况下才返回该字段。REFUND_PROCESSING 退款处理中；REFUND_SUCCESS 退款处理成功；REFUND_FAIL 退款失败;
	 */
	@ApiField("refund_status")
	private String refundStatus;

	/** 
	 * 本次商户实际退回金额；
默认不返回该信息，需与支付宝约定后配置返回；
	 */
	@ApiField("send_back_fee")
	private String sendBackFee;

	/** 
	 * 该笔退款所对应的交易的订单金额
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/** 
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setDepositBackInfo(DepositBackInfo depositBackInfo) {
		this.depositBackInfo = depositBackInfo;
	}
	public DepositBackInfo getDepositBackInfo( ) {
		return this.depositBackInfo;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCode( ) {
		return this.errorCode;
	}

	public void setGmtRefundPay(Date gmtRefundPay) {
		this.gmtRefundPay = gmtRefundPay;
	}
	public Date getGmtRefundPay( ) {
		return this.gmtRefundPay;
	}

	public void setIndustrySepcDetail(String industrySepcDetail) {
		this.industrySepcDetail = industrySepcDetail;
	}
	public String getIndustrySepcDetail( ) {
		return this.industrySepcDetail;
	}

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}
	public String getOutRequestNo( ) {
		return this.outRequestNo;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}
	public String getOutTradeNo( ) {
		return this.outTradeNo;
	}

	public void setPresentRefundBuyerAmount(String presentRefundBuyerAmount) {
		this.presentRefundBuyerAmount = presentRefundBuyerAmount;
	}
	public String getPresentRefundBuyerAmount( ) {
		return this.presentRefundBuyerAmount;
	}

	public void setPresentRefundDiscountAmount(String presentRefundDiscountAmount) {
		this.presentRefundDiscountAmount = presentRefundDiscountAmount;
	}
	public String getPresentRefundDiscountAmount( ) {
		return this.presentRefundDiscountAmount;
	}

	public void setPresentRefundMdiscountAmount(String presentRefundMdiscountAmount) {
		this.presentRefundMdiscountAmount = presentRefundMdiscountAmount;
	}
	public String getPresentRefundMdiscountAmount( ) {
		return this.presentRefundMdiscountAmount;
	}

	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}
	public String getRefundAmount( ) {
		return this.refundAmount;
	}

	public void setRefundChargeAmount(String refundChargeAmount) {
		this.refundChargeAmount = refundChargeAmount;
	}
	public String getRefundChargeAmount( ) {
		return this.refundChargeAmount;
	}

	public void setRefundDetailItemList(List<TradeFundBill> refundDetailItemList) {
		this.refundDetailItemList = refundDetailItemList;
	}
	public List<TradeFundBill> getRefundDetailItemList( ) {
		return this.refundDetailItemList;
	}

	public void setRefundReason(String refundReason) {
		this.refundReason = refundReason;
	}
	public String getRefundReason( ) {
		return this.refundReason;
	}

	public void setRefundRoyaltys(List<RefundRoyaltyResult> refundRoyaltys) {
		this.refundRoyaltys = refundRoyaltys;
	}
	public List<RefundRoyaltyResult> getRefundRoyaltys( ) {
		return this.refundRoyaltys;
	}

	public void setRefundSettlementId(String refundSettlementId) {
		this.refundSettlementId = refundSettlementId;
	}
	public String getRefundSettlementId( ) {
		return this.refundSettlementId;
	}

	public void setRefundStatus(String refundStatus) {
		this.refundStatus = refundStatus;
	}
	public String getRefundStatus( ) {
		return this.refundStatus;
	}

	public void setSendBackFee(String sendBackFee) {
		this.sendBackFee = sendBackFee;
	}
	public String getSendBackFee( ) {
		return this.sendBackFee;
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

}
