package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.DiscountInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.advert.delivery.discount.query response.
 * 
 * @author auto create
 * @since 1.0, 2018-03-27 14:40:35
 */
public class KoubeiAdvertDeliveryDiscountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7735255985474246676L;

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
