package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.trans.pay response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-17 14:35:00
 */
public class AlipayFundTransPayResponse extends AlipayResponse {

	private static final long serialVersionUID = 3389687511724329854L;

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
	 * SUCCESS：支付成功；
FAIL：支付失败；
UNKNOWN：未知；建议通过查询确认最新状态
	 */
	@ApiField("status")
	private String status;

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

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
