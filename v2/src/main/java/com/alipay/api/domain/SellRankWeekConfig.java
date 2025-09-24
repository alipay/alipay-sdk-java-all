package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 排行榜单配置周时间列表
 *
 * @author auto create
 * @since 1.0, 2024-05-21 16:29:20
 */
public class SellRankWeekConfig extends AlipayObject {

	private static final long serialVersionUID = 7713395526926129829L;

	/**
	 * 周显示文本
	 */
	@ApiField("text")
	private String text;

	/**
	 * 一周的起始日期
	 */
	@ApiField("week")
	private String week;

	public String getText() {
		return this.text;
	}
	public void setText(String text) {
		this.text = text;
	}

	public String getWeek() {
		return this.week;
	}
	public void setWeek(String week) {
		this.week = week;
	}

}
