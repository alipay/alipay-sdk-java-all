package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.maintain.order.create response.
 * 
 * @author auto create
 * @since 1.0, 2020-12-31 11:48:28
 */
public class AlipayEcoMycarMaintainOrderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2766436233249518527L;

	/** 
	 * 业务订单编号，规则28位；yyMMddHHmmss&#160;+&#160;&#160;行业标识3位+模块标识2位&#160;+uid（后六位）&#160;+序列值（5位）
	 */
	@ApiField("order_no")
	private String orderNo;

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

}
