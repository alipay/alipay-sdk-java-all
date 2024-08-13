package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.trans.pay response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-01 20:32:05
 */
public class AlipayFundTransPayResponse extends AlipayResponse {

	private static final long serialVersionUID = 7833388829795689595L;

	/** 
	 * 该笔转账在支付宝系统内部的单据ID
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 商户端的唯一订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 支付宝支付资金流水号
	 */
	@ApiField("pay_fund_order_id")
	private String payFundOrderId;

	/** 
	 * SUCCESS：支付成功；
FAIL：支付失败；
UNKNOWN：未知；建议通过查询确认最新状态
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 订单支付时间，格式为yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("trans_pay_time")
	private String transPayTime;

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	public void setPayFundOrderId(String payFundOrderId) {
		this.payFundOrderId = payFundOrderId;
	}
	public String getPayFundOrderId( ) {
		return this.payFundOrderId;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setTransPayTime(String transPayTime) {
		this.transPayTime = transPayTime;
	}
	public String getTransPayTime( ) {
		return this.transPayTime;
	}

}
