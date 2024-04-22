package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企信AE提前收款服务订单退款通知
 *
 * @author auto create
 * @since 1.0, 2023-08-16 19:14:56
 */
public class ZhimaCreditEpAeprepayOrderRefundModel extends AlipayObject {

	private static final long serialVersionUID = 7211125211658929974L;

	/**
	 * 退款垫付金额。币种最小单位，如人民币：分
	 */
	@ApiField("advance_amount")
	private String advanceAmount;

	/**
	 * 退款垫付币种
	 */
	@ApiField("advance_currency")
	private String advanceCurrency;

	/**
	 * 扩展预留
	 */
	@ApiField("ext_param")
	private ZmEpAePrepayExtParam extParam;

	/**
	 * 订单id
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 审核单创建时间戳
	 */
	@ApiField("order_time_millis")
	private String orderTimeMillis;

	/**
	 * 退款金额。币种最小单位，如人民币：分
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 卖家余额退款金额。币种最小单位，如人民币：分
	 */
	@ApiField("refund_balance_amount")
	private String refundBalanceAmount;

	/**
	 * 退款币种
	 */
	@ApiField("refund_currency")
	private String refundCurrency;

	/**
	 * 退款时间
	 */
	@ApiField("refund_time")
	private Date refundTime;

	/**
	 * 商家登陆id
	 */
	@ApiField("seller_login_id")
	private String sellerLoginId;

	/**
	 * 子订单id
	 */
	@ApiField("son_order_id")
	private String sonOrderId;

	/**
	 * 退款的结算单id
	 */
	@ApiField("sub_out_order_id")
	private String subOutOrderId;

	public String getAdvanceAmount() {
		return this.advanceAmount;
	}
	public void setAdvanceAmount(String advanceAmount) {
		this.advanceAmount = advanceAmount;
	}

	public String getAdvanceCurrency() {
		return this.advanceCurrency;
	}
	public void setAdvanceCurrency(String advanceCurrency) {
		this.advanceCurrency = advanceCurrency;
	}

	public ZmEpAePrepayExtParam getExtParam() {
		return this.extParam;
	}
	public void setExtParam(ZmEpAePrepayExtParam extParam) {
		this.extParam = extParam;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderTimeMillis() {
		return this.orderTimeMillis;
	}
	public void setOrderTimeMillis(String orderTimeMillis) {
		this.orderTimeMillis = orderTimeMillis;
	}

	public String getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getRefundBalanceAmount() {
		return this.refundBalanceAmount;
	}
	public void setRefundBalanceAmount(String refundBalanceAmount) {
		this.refundBalanceAmount = refundBalanceAmount;
	}

	public String getRefundCurrency() {
		return this.refundCurrency;
	}
	public void setRefundCurrency(String refundCurrency) {
		this.refundCurrency = refundCurrency;
	}

	public Date getRefundTime() {
		return this.refundTime;
	}
	public void setRefundTime(Date refundTime) {
		this.refundTime = refundTime;
	}

	public String getSellerLoginId() {
		return this.sellerLoginId;
	}
	public void setSellerLoginId(String sellerLoginId) {
		this.sellerLoginId = sellerLoginId;
	}

	public String getSonOrderId() {
		return this.sonOrderId;
	}
	public void setSonOrderId(String sonOrderId) {
		this.sonOrderId = sonOrderId;
	}

	public String getSubOutOrderId() {
		return this.subOutOrderId;
	}
	public void setSubOutOrderId(String subOutOrderId) {
		this.subOutOrderId = subOutOrderId;
	}

}
