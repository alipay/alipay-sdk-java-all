package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取普通商品类目接口
 *
 * @author auto create
 * @since 1.0, 2023-08-23 14:26:24
 */
public class AlipayOpenAppItemAllcategoryQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2529991579524971778L;

	/**
	 * 商品类型
	 */
	@ApiField("item_type")
	private String itemType;

	public String getItemType() {
		return this.itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

}
