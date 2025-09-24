package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * FilterConfig
 *
 * @author auto create
 * @since 1.0, 2024-05-21 15:00:34
 */
public class FilterConfig extends AlipayObject {

	private static final long serialVersionUID = 4355481139392741289L;

	/**
	 * 数据
	 */
	@ApiField("data")
	private FilterDataConfig data;

	/**
	 * 图标
	 */
	@ApiField("icon")
	private String icon;

	/**
	 * 榜单配置key
	 */
	@ApiField("key")
	private String key;

	/**
	 * 价格
	 */
	@ApiField("price")
	private String price;

	/**
	 * 榜单配置显示文本
	 */
	@ApiField("text")
	private String text;

	public FilterDataConfig getData() {
		return this.data;
	}
	public void setData(FilterDataConfig data) {
		this.data = data;
	}

	public String getIcon() {
		return this.icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getText() {
		return this.text;
	}
	public void setText(String text) {
		this.text = text;
	}

}
