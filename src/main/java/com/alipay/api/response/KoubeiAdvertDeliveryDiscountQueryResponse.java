package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.DiscountInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.advert.delivery.discount.query response.
 * 
 * @author auto create
 * @since 1.0, 2018-07-31 20:47:52
 */
public class KoubeiAdvertDeliveryDiscountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1159633333114562666L;

	/** 
	 * 广告投放出去的优惠信息
	 */
	@ApiField("discount")
	private DiscountInfo discount;

	public void setDiscount(DiscountInfo discount) {
		this.discount = discount;
	}
	public DiscountInfo getDiscount( ) {
		return this.discount;
	}

}
