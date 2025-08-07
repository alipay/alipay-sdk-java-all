package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.trans.account.withdraw response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-13 16:32:07
 */
public class AlipayCommerceEcTransAccountWithdrawResponse extends AlipayResponse {

	private static final long serialVersionUID = 6721597116442741342L;

	/** 
	 * 该笔提现在支付宝系统内部的单据ID
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 商户端的唯一订单号，对于同一笔充值请求，商户需保证该订单号唯一
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 提现状态
	 */
	@ApiField("status")
	private String status;

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
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
