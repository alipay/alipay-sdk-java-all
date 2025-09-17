package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.credit.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-18 17:07:35
 */
public class AlipayTradeCreditOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1659546648985569898L;

	/** 
	 * 信用服务订单中的垫资金额。单位：元
	 */
	@ApiField("advance_total_fee")
	private String advanceTotalFee;

	/** 
	 * 信用支付履约时间
	 */
	@ApiField("buyer_pay_time")
	private Date buyerPayTime;

	/** 
	 * 信用服务订单号
	 */
	@ApiField("credit_biz_order_id")
	private String creditBizOrderId;

	/** 
	 * 信用服务订单中信用支付金额，不包含支付宝营销金额
	 */
	@ApiField("credit_pay_fee")
	private String creditPayFee;

	/** 
	 * 信用支付额度确认时间
	 */
	@ApiField("credit_quota_confirm_time")
	private Date creditQuotaConfirmTime;

	/** 
	 * 信用支付时间
	 */
	@ApiField("credit_quota_pay_time")
	private Date creditQuotaPayTime;

	/** 
	 * 信用支付退款金额
	 */
	@ApiField("credit_refund_fee")
	private String creditRefundFee;

	/** 
	 * 信用服务订单中的订单金额，包含营销。
	 */
	@ApiField("credit_total_fee")
	private String creditTotalFee;

	/** 
	 * 信用支付垫资时间
	 */
	@ApiField("guarantee_pay_time")
	private Date guaranteePayTime;

	/** 
	 * 发起信用支付时的外部交易单号。
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 信用支付逾期时间。年-月-日 时-分-秒
	 */
	@ApiField("overdue_time")
	private Date overdueTime;

	/** 
	 * 信用订单的状态信息。
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 信用支付的交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setAdvanceTotalFee(String advanceTotalFee) {
		this.advanceTotalFee = advanceTotalFee;
	}
	public String getAdvanceTotalFee( ) {
		return this.advanceTotalFee;
	}

	public void setBuyerPayTime(Date buyerPayTime) {
		this.buyerPayTime = buyerPayTime;
	}
	public Date getBuyerPayTime( ) {
		return this.buyerPayTime;
	}

	public void setCreditBizOrderId(String creditBizOrderId) {
		this.creditBizOrderId = creditBizOrderId;
	}
	public String getCreditBizOrderId( ) {
		return this.creditBizOrderId;
	}

	public void setCreditPayFee(String creditPayFee) {
		this.creditPayFee = creditPayFee;
	}
	public String getCreditPayFee( ) {
		return this.creditPayFee;
	}

	public void setCreditQuotaConfirmTime(Date creditQuotaConfirmTime) {
		this.creditQuotaConfirmTime = creditQuotaConfirmTime;
	}
	public Date getCreditQuotaConfirmTime( ) {
		return this.creditQuotaConfirmTime;
	}

	public void setCreditQuotaPayTime(Date creditQuotaPayTime) {
		this.creditQuotaPayTime = creditQuotaPayTime;
	}
	public Date getCreditQuotaPayTime( ) {
		return this.creditQuotaPayTime;
	}

	public void setCreditRefundFee(String creditRefundFee) {
		this.creditRefundFee = creditRefundFee;
	}
	public String getCreditRefundFee( ) {
		return this.creditRefundFee;
	}

	public void setCreditTotalFee(String creditTotalFee) {
		this.creditTotalFee = creditTotalFee;
	}
	public String getCreditTotalFee( ) {
		return this.creditTotalFee;
	}

	public void setGuaranteePayTime(Date guaranteePayTime) {
		this.guaranteePayTime = guaranteePayTime;
	}
	public Date getGuaranteePayTime( ) {
		return this.guaranteePayTime;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}
	public String getOutTradeNo( ) {
		return this.outTradeNo;
	}

	public void setOverdueTime(Date overdueTime) {
		this.overdueTime = overdueTime;
	}
	public Date getOverdueTime( ) {
		return this.overdueTime;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
