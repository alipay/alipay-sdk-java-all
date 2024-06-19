package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * SellRankMonthConfig
 *
 * @author auto create
 * @since 1.0, 2024-05-21 16:29:31
 */
public class SellRankMonthConfig extends AlipayObject {

	private static final long serialVersionUID = 3655196588193523151L;

	/**
	 * 月份
	 */
	@ApiField("month")
	private String month;

	/**
	 * 文本
	 */
	@ApiField("text")
	private String text;

	public String getMonth() {
		return this.month;
	}
	public void setMonth(String month) {
		this.month = month;
	}

	public String getText() {
		return this.text;
	}
	public void setText(String text) {
		this.text = text;
	}

}
