package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.paysaas.order.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-02-25 19:57:26
 */
public class AlipayOfflinePaysaasOrderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5746868988613771258L;

	/** 
	 * 给外部订单生成的唯一单号
	 */
	@ApiField("isv_order_no")
	private String isvOrderNo;

	public void setIsvOrderNo(String isvOrderNo) {
		this.isvOrderNo = isvOrderNo;
	}
	public String getIsvOrderNo( ) {
		return this.isvOrderNo;
	}

}
