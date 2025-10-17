package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.tax.refund.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-11 11:32:36
 */
public class AlipayUserTaxRefundQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4272722354328218172L;

	/** 
	 * 支付宝转账订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 支付宝支付资金流水号
	 */
	@ApiField("pay_fund_order_id")
	private String payFundOrderId;

	/** 
	 * 总金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]。
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/** 
	 * 退税状态
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 订单支付时间，格式为yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("trans_date")
	private Date transDate;

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setPayFundOrderId(String payFundOrderId) {
		this.payFundOrderId = payFundOrderId;
	}
	public String getPayFundOrderId( ) {
		return this.payFundOrderId;
	}

	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}
	public String getRefundAmount( ) {
		return this.refundAmount;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setTransDate(Date transDate) {
		this.transDate = transDate;
	}
	public Date getTransDate( ) {
		return this.transDate;
	}

}
