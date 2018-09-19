package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.order.info.verify response.
 * 
 * @author auto create
 * @since 1.0, 2018-09-18 16:34:52
 */
public class KoubeiCateringOrderInfoVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4656727857637252842L;

	/** 
	 * 餐饮订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 是否需要重试，true-需要，false-不需要
	 */
	@ApiField("retry")
	private Boolean retry;

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setRetry(Boolean retry) {
		this.retry = retry;
	}
	public Boolean getRetry( ) {
		return this.retry;
	}

}
