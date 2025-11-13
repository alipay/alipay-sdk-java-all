package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-11-06 17:47:41
 */
public class LiveGiftItem extends AlipayObject {

	private static final long serialVersionUID = 5394264919156862546L;

	/**
	 * 礼物图标
	 */
	@ApiField("icon")
	private String icon;

	/**
	 * 礼物ID
	 */
	@ApiField("id")
	private String id;

	/**
	 * 礼物名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 礼物价格，单位宝石
	 */
	@ApiField("price")
	private String price;

	/**
	 * 礼物类型，免费、付费
	 */
	@ApiField("type")
	private String type;

	public String getIcon() {
		return this.icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
