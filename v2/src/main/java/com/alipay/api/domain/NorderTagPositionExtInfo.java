package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 点位除基本信息外适配不同厂商的参数
 *
 * @author auto create
 * @since 1.0, 2025-05-06 10:44:58
 */
public class NorderTagPositionExtInfo extends AlipayObject {

	private static final long serialVersionUID = 3589265357292787726L;

	/**
	 * 厂商的品牌信息
	 */
	@ApiField("brand")
	private String brand;

	/**
	 * 点位场所
	 */
	@ApiField("place")
	private String place;

	/**
	 * 点位的场景描述
	 */
	@ApiField("scene")
	private String scene;

	public String getBrand() {
		return this.brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getPlace() {
		return this.place;
	}
	public void setPlace(String place) {
		this.place = place;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

}
