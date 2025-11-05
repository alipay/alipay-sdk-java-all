package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品model
 *
 * @author auto create
 * @since 1.0, 2025-05-27 14:56:23
 */
public class TravelItemInfo extends AlipayObject {

	private static final long serialVersionUID = 4323852354827292495L;

	/**
	 * 扩展字段
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 商品描述
	 */
	@ApiField("item_desc")
	private String itemDesc;

	/**
	 * 外部商户商品id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商品名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 商品类型
	 */
	@ApiField("item_type")
	private String itemType;

	/**
	 * 购买的商品数量
	 */
	@ApiField("quantity")
	private String quantity;

	/**
	 * 商品单位
	 */
	@ApiField("unit")
	private String unit;

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getItemDesc() {
		return this.itemDesc;
	}
	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemType() {
		return this.itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public String getQuantity() {
		return this.quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getUnit() {
		return this.unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}

}
