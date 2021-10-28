package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 流量充值信息
 *
 * @author auto create
 * @since 1.0, 2020-06-11 14:54:09
 */
public class NetFlowOfferInfo extends AlipayObject {

	private static final long serialVersionUID = 6178257664487994513L;

	/**
	 * 流量生效时间
	 */
	@ApiField("effective_time")
	private String effectiveTime;

	/**
	 * 流量过期时间
	 */
	@ApiField("expire_time")
	private String expireTime;

	/**
	 * 流量套餐名称
	 */
	@ApiField("offer_name")
	private String offerName;

	/**
	 * 下单时间
	 */
	@ApiField("order_time")
	private String orderTime;

	public String getEffectiveTime() {
		return this.effectiveTime;
	}
	public void setEffectiveTime(String effectiveTime) {
		this.effectiveTime = effectiveTime;
	}

	public String getExpireTime() {
		return this.expireTime;
	}
	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
	}

	public String getOfferName() {
		return this.offerName;
	}
	public void setOfferName(String offerName) {
		this.offerName = offerName;
	}

	public String getOrderTime() {
		return this.orderTime;
	}
	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}

}
