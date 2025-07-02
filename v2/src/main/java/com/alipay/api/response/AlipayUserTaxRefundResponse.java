package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.tax.refund response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-01 20:32:28
 */
public class AlipayUserTaxRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 7571441937828876845L;

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

	public void setTransDate(Date transDate) {
		this.transDate = transDate;
	}
	public Date getTransDate( ) {
		return this.transDate;
	}

}
