package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取普通商品类目接口
 *
 * @author auto create
 * @since 1.0, 2023-11-09 20:50:53
 */
public class AlipayOpenAppItemAllcategoryQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5657228286225736743L;

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
