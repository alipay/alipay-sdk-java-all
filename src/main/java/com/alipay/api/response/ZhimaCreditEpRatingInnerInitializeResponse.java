package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.rating.inner.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2021-10-27 17:15:18
 */
public class ZhimaCreditEpRatingInnerInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 5561183211617587846L;

	/** 
	 * 芝麻企业信用客户评估单号，商户应该妥善关联持久化保存该订单号用于后续的对账。
	 */
	@ApiField("order_no")
	private String orderNo;

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

}
