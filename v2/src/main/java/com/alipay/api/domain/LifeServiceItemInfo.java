package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品信息
 *
 * @author auto create
 * @since 1.0, 2026-01-23 14:41:45
 */
public class LifeServiceItemInfo extends AlipayObject {

	private static final long serialVersionUID = 1341715587773725989L;

	/**
	 * 商品名称
	 */
	@ApiField("item_name")
	private String itemName;

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

}
