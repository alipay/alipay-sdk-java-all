package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取普通商品类目接口
 *
 * @author auto create
 * @since 1.0, 2025-06-13 10:19:02
 */
public class AlipayOpenAppItemAllcategoryQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2438569889937154577L;

	/**
	 * 返回筛选状态的类目
	 */
	@ApiField("cat_status")
	private String catStatus;

	/**
	 * 商品类型
	 */
	@ApiField("item_type")
	private String itemType;

	public String getCatStatus() {
		return this.catStatus;
	}
	public void setCatStatus(String catStatus) {
		this.catStatus = catStatus;
	}

	public String getItemType() {
		return this.itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

}
