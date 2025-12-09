package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益发奖信息
 *
 * @author auto create
 * @since 1.0, 2025-11-28 09:38:13
 */
public class BenefitLuckDrawInfo extends AlipayObject {

	private static final long serialVersionUID = 2492564682341316355L;

	/**
	 * true: 可抽奖
false: 不可抽奖
	 */
	@ApiField("can_luck_draw")
	private Boolean canLuckDraw;

	/**
	 * true: 已抽奖
false: 未抽奖
	 */
	@ApiField("has_luck_draw")
	private Boolean hasLuckDraw;

	/**
	 * 订单信息
	 */
	@ApiField("order_info")
	private BenefitOrderInfo orderInfo;

	public Boolean getCanLuckDraw() {
		return this.canLuckDraw;
	}
	public void setCanLuckDraw(Boolean canLuckDraw) {
		this.canLuckDraw = canLuckDraw;
	}

	public Boolean getHasLuckDraw() {
		return this.hasLuckDraw;
	}
	public void setHasLuckDraw(Boolean hasLuckDraw) {
		this.hasLuckDraw = hasLuckDraw;
	}

	public BenefitOrderInfo getOrderInfo() {
		return this.orderInfo;
	}
	public void setOrderInfo(BenefitOrderInfo orderInfo) {
		this.orderInfo = orderInfo;
	}

}
