package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.material.process.apply response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-24 17:47:01
 */
public class AlipayCloudCloudpromoMaterialProcessApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7525173367452232399L;

	/** 
	 * 支付宝内部订单id，唯一
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 外部业务号，原样返回
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
