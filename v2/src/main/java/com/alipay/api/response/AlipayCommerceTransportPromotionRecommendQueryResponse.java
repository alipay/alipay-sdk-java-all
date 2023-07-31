package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.promotion.recommend.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 20:12:03
 */
public class AlipayCommerceTransportPromotionRecommendQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4356124465211198719L;

	/** 
	 * 使用优惠的门槛金额
	 */
	@ApiField("from_amount")
	private String fromAmount;

	/** 
	 * 优惠金额
	 */
	@ApiField("reduction_amount")
	private String reductionAmount;

	public void setFromAmount(String fromAmount) {
		this.fromAmount = fromAmount;
	}
	public String getFromAmount( ) {
		return this.fromAmount;
	}

	public void setReductionAmount(String reductionAmount) {
		this.reductionAmount = reductionAmount;
	}
	public String getReductionAmount( ) {
		return this.reductionAmount;
	}

}
