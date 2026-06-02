package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 日期组件
 *
 * @author auto create
 * @since 1.0, 2026-03-09 15:00:38
 */
public class DateTabs extends AlipayObject {

	private static final long serialVersionUID = 8223969255168764184L;

	/**
	 * x坐标，单位点（point）
	 */
	@ApiField("axis_x")
	private Long axisX;

	/**
	 * y坐标，单位点（point）
	 */
	@ApiField("axis_y")
	private Long axisY;

	/**
	 * 字体颜色
	 */
	@ApiField("color")
	private String color;

	/**
	 * 字体大小，默认50，单位点（point）
	 */
	@ApiField("font_size")
	private Long fontSize;

	/**
	 * 是否使用日期组件
	 */
	@ApiField("use_date_tab")
	private Boolean useDateTab;

	public Long getAxisX() {
		return this.axisX;
	}
	public void setAxisX(Long axisX) {
		this.axisX = axisX;
	}

	public Long getAxisY() {
		return this.axisY;
	}
	public void setAxisY(Long axisY) {
		this.axisY = axisY;
	}

	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public Long getFontSize() {
		return this.fontSize;
	}
	public void setFontSize(Long fontSize) {
		this.fontSize = fontSize;
	}

	public Boolean getUseDateTab() {
		return this.useDateTab;
	}
	public void setUseDateTab(Boolean useDateTab) {
		this.useDateTab = useDateTab;
	}

}
