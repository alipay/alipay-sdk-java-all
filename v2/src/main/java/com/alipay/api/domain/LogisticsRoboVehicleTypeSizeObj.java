package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物流同城无人车车辆类型尺寸
 *
 * @author auto create
 * @since 1.0, 2026-03-26 18:00:46
 */
public class LogisticsRoboVehicleTypeSizeObj extends AlipayObject {

	private static final long serialVersionUID = 7888714547337997451L;

	/**
	 * 车高 单位:mm
	 */
	@ApiField("height")
	private String height;

	/**
	 * 车长，单位：mm
	 */
	@ApiField("length")
	private String length;

	/**
	 * 车宽 单位：mm
	 */
	@ApiField("width")
	private String width;

	public String getHeight() {
		return this.height;
	}
	public void setHeight(String height) {
		this.height = height;
	}

	public String getLength() {
		return this.length;
	}
	public void setLength(String length) {
		this.length = length;
	}

	public String getWidth() {
		return this.width;
	}
	public void setWidth(String width) {
		this.width = width;
	}

}
