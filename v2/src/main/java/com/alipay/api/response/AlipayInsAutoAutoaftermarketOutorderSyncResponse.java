package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.auto.autoaftermarket.outorder.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-03 23:07:09
 */
public class AlipayInsAutoAutoaftermarketOutorderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 8331897479563178667L;

	/** 
	 * 蚂蚁生成的订单号，跟服务商的订单号做一一映射
	 */
	@ApiField("ant_order_no")
	private String antOrderNo;

	public void setAntOrderNo(String antOrderNo) {
		this.antOrderNo = antOrderNo;
	}
	public String getAntOrderNo( ) {
		return this.antOrderNo;
	}

}
