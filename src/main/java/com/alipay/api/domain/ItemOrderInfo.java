package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 订单商品信息
 *
 * @author auto create
 * @since 1.0, 2021-10-11 04:36:40
 */
public class ItemOrderInfo extends AlipayObject {

	private static final long serialVersionUID = 2128284156268314987L;

	/**
	 * 扩展信息，请参见产品文档。小程序订单助手业务中，扩展参数必须传递素材id；其他业务场景参见对应的产品文档。
	 */
	@ApiListField("ext_info")
	@ApiField("order_ext_info")
	private List<OrderExtInfo> extInfo;

	/**
	 * 商品 id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商品名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 商品数量（单位：自拟）。
小程序订单助手业务中，为必传；其他业务场景参见对应的产品文档。
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * 商品 sku id
	 */
	@ApiField("sku_id")
	private String skuId;

	/**
	 * 商品规格
	 */
	@ApiField("unit")
	private String unit;

	/**
	 * 商品单价（单位：元）。
小程序订单助手业务中，为必传；其他业务场景参见对应的产品文档。
	 */
	@ApiField("unit_price")
	private String unitPrice;

	public List<OrderExtInfo> getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(List<OrderExtInfo> extInfo) {
		this.extInfo = extInfo;
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

	public Long getQuantity() {
		return this.quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public String getUnit() {
		return this.unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getUnitPrice() {
		return this.unitPrice;
	}
	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}

}
