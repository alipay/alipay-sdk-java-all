package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 距离加价规则
 *
 * @author auto create
 * @since 1.0, 2025-03-19 16:22:33
 */
public class DistanceMarkupRuleDTO extends AlipayObject {

	private static final long serialVersionUID = 4221312859316766527L;

	/**
	 * 超限距离，单位：km
	 */
	@ApiField("distance")
	private String distance;

	/**
	 * 加价金额，单位：元
	 */
	@ApiField("price")
	private String price;

	public String getDistance() {
		return this.distance;
	}
	public void setDistance(String distance) {
		this.distance = distance;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

}
