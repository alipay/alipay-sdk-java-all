package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.order.info.verify response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:36:31
 */
public class KoubeiCateringOrderInfoVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4594427997228946226L;

	/** 
	 * 核销是否幂等，true-幂等，false-没幂等
	 */
	@ApiField("idempotent")
	private Boolean idempotent;

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

	public void setIdempotent(Boolean idempotent) {
		this.idempotent = idempotent;
	}
	public Boolean getIdempotent( ) {
		return this.idempotent;
	}

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
