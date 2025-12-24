package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据类目id获取类目属性列表
 *
 * @author auto create
 * @since 1.0, 2025-11-07 19:12:41
 */
public class AlipayOpenAppItemCateattrQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1164857193927315847L;

	/**
	 * 类目ID，查询类目信息获取类目ID

	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 商品类型
	 */
	@ApiField("item_type")
	private String itemType;

	public String getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getItemType() {
		return this.itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

}
