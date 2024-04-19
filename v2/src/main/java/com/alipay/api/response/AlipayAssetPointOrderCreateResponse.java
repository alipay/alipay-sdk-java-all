package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.asset.point.order.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-20 18:26:15
 */
public class AlipayAssetPointOrderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5192497829243422445L;

	/** 
	 * 支付宝集分宝发放流水号
	 */
	@ApiField("alipay_order_no")
	private String alipayOrderNo;

	public void setAlipayOrderNo(String alipayOrderNo) {
		this.alipayOrderNo = alipayOrderNo;
	}
	public String getAlipayOrderNo( ) {
		return this.alipayOrderNo;
	}

}
