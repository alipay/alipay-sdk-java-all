package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品信息模型对象
 *
 * @author auto create
 * @since 1.0, 2018-11-27 19:51:48
 */
public class MItemInfo extends AlipayObject {

	private static final long serialVersionUID = 7365461796235686786L;

	/**
	 * 商品id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * item_id字段说明类型，目前支持枚举：菜品：DISH，注意：菜品必须为单品菜品信息
	 */
	@ApiField("type")
	private String type;

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
