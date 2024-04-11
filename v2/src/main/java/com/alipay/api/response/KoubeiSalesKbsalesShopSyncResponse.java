package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.sales.kbsales.shop.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 05:19:20
 */
public class KoubeiSalesKbsalesShopSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 6747972586979194633L;

	/** 
	 * 流水结果描述
	 */
	@ApiField("desc")
	private String desc;

	/** 
	 * 口碑流水id
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 处理结果
	 */
	@ApiField("status")
	private String status;

	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getDesc( ) {
		return this.desc;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
