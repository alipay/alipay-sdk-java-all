package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * xxxx
 *
 * @author auto create
 * @since 1.0, 2018-04-08 16:13:20
 */
public class Item extends AlipayObject {

	private static final long serialVersionUID = 1614414772944918527L;

	/**
	 * 1
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
