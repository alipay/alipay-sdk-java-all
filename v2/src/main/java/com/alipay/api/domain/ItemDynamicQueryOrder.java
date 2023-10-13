package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品动态数据查询Order
 *
 * @author auto create
 * @since 1.0, 2023-04-28 13:56:08
 */
public class ItemDynamicQueryOrder extends AlipayObject {

	private static final long serialVersionUID = 6492487235481196955L;

	/**
	 * 商品类目ID
	 */
	@ApiField("catagory_id")
	private String catagoryId;

	/**
	 * 商品ID（支付宝侧）
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商品类型
	 */
	@ApiField("item_type")
	private String itemType;

	/**
	 * 商品ID（商家侧）
	 */
	@ApiField("outer_item_id")
	private String outerItemId;

	public String getCatagoryId() {
		return this.catagoryId;
	}
	public void setCatagoryId(String catagoryId) {
		this.catagoryId = catagoryId;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemType() {
		return this.itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public String getOuterItemId() {
		return this.outerItemId;
	}
	public void setOuterItemId(String outerItemId) {
		this.outerItemId = outerItemId;
	}

}
