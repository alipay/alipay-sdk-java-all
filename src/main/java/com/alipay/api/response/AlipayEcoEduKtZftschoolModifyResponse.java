package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.edu.kt.zftschool.modify response.
 * 
 * @author auto create
 * @since 1.0, 2022-04-15 15:21:44
 */
public class AlipayEcoEduKtZftschoolModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8455576833466737598L;

	/** 
	 * 进件单号id，查询进件接口输入参数
	 */
	@ApiField("order_id")
	private String orderId;

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

}
