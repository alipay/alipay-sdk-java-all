package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 营销活动阶梯规则
 *
 * @author auto create
 * @since 1.0, 2024-06-12 16:03:03
 */
public class MedicalShopMarketingActivityRule extends AlipayObject {

	private static final long serialVersionUID = 2214865528333514553L;

	/**
	 * 活动满减金额，减多少。单位：分
	 */
	@ApiField("reduce_price")
	private Long reducePrice;

	/**
	 * 活动满减门槛，满多少，单位：分
	 */
	@ApiField("reduce_price_threshold")
	private Long reducePriceThreshold;

	public Long getReducePrice() {
		return this.reducePrice;
	}
	public void setReducePrice(Long reducePrice) {
		this.reducePrice = reducePrice;
	}

	public Long getReducePriceThreshold() {
		return this.reducePriceThreshold;
	}
	public void setReducePriceThreshold(Long reducePriceThreshold) {
		this.reducePriceThreshold = reducePriceThreshold;
	}

}
