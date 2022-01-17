package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 出行场景，获取综合体及店铺信息入参
 *
 * @author auto create
 * @since 1.0, 2018-08-17 10:19:02
 */
public class TravelMallRequest extends AlipayObject {

	private static final long serialVersionUID = 7245263783367887613L;

	/**
	 * 目的地距目标综合体的距离(单位:米)
	 */
	@ApiField("distance")
	private Long distance;

	/**
	 * 综合体ID
	 */
	@ApiField("mall_id")
	private String mallId;

	public Long getDistance() {
		return this.distance;
	}
	public void setDistance(Long distance) {
		this.distance = distance;
	}

	public String getMallId() {
		return this.mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}

}
