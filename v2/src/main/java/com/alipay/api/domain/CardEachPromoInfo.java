package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卡单期优惠信息
 *
 * @author auto create
 * @since 1.0, 2025-04-28 22:35:23
 */
public class CardEachPromoInfo extends AlipayObject {

	private static final long serialVersionUID = 3619983468643468231L;

	/**
	 * 每期优惠价，单位分
	 */
	@ApiField("each_promo_price")
	private Long eachPromoPrice;

	/**
	 * 期数，根据cycle_type确定单位，如周，天，月
	 */
	@ApiField("period")
	private Long period;

	public Long getEachPromoPrice() {
		return this.eachPromoPrice;
	}
	public void setEachPromoPrice(Long eachPromoPrice) {
		this.eachPromoPrice = eachPromoPrice;
	}

	public Long getPeriod() {
		return this.period;
	}
	public void setPeriod(Long period) {
		this.period = period;
	}

}
