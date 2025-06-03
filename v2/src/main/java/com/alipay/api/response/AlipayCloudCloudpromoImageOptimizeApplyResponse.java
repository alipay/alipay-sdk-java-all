package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.image.optimize.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-28 12:06:53
 */
public class AlipayCloudCloudpromoImageOptimizeApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1773162785891822269L;

	/** 
	 * 支付宝内部订单id，唯一
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 外部业务号，原样返回商户请求号
	 */
	@ApiField("out_biz_id")
	private String outBizId;

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setOutBizId(String outBizId) {
		this.outBizId = outBizId;
	}
	public String getOutBizId( ) {
		return this.outBizId;
	}

}
