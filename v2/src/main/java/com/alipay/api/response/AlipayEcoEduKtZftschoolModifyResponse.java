package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.edu.kt.zftschool.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:29:05
 */
public class AlipayEcoEduKtZftschoolModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4672666384586231872L;

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
