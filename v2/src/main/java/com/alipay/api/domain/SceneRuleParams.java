package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 周期扣中场景化规则信息，例如影音会员续费、保险等行业特殊规则字段
 *
 * @author auto create
 * @since 1.0, 2024-11-18 15:48:33
 */
public class SceneRuleParams extends AlipayObject {

	private static final long serialVersionUID = 1138399355622714123L;

	/**
	 * 在周期扣场景化模板中配置优惠类型为优惠期玩法时需要该参数，表示后续有多少期扣款可享受优惠，值为自然数代表周期
	 */
	@ApiField("discount_period")
	private String discountPeriod;

	/**
	 * 在周期扣场景化模板中配置优惠类型为低价玩法时需要该参数，表示代扣低价期持续的时间。单位是天，该值为自然数
	 */
	@ApiField("low_price_period")
	private String lowPricePeriod;

	public String getDiscountPeriod() {
		return this.discountPeriod;
	}
	public void setDiscountPeriod(String discountPeriod) {
		this.discountPeriod = discountPeriod;
	}

	public String getLowPricePeriod() {
		return this.lowPricePeriod;
	}
	public void setLowPricePeriod(String lowPricePeriod) {
		this.lowPricePeriod = lowPricePeriod;
	}

}
