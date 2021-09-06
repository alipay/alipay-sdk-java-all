package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.trade.order.enterprise.settle response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-13 10:42:03
 */
public class KoubeiTradeOrderEnterpriseSettleResponse extends AlipayResponse {

	private static final long serialVersionUID = 7476376597616344515L;

	/** 
	 * 描述本次返回中的业务属性，该字段用于描述本次返回中的业务属性，现有：BIZ_ALREADY_SUCCESS（幂等业务码）
	 */
	@ApiField("biz_code")
	private String bizCode;

	/** 
	 * 口碑订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 传入的商户订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}
	public String getBizCode( ) {
		return this.bizCode;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	public String getOutOrderNo( ) {
		return this.outOrderNo;
	}

}
