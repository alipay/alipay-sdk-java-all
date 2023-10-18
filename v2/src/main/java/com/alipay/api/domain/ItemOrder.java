package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品订单
 *
 * @author auto create
 * @since 1.0, 2019-11-28 14:57:36
 */
public class ItemOrder extends AlipayObject {

	private static final long serialVersionUID = 4127186627163247385L;

	/**
	 * 扩展信息（键值对列表，有重复的键后者覆盖前者，建议唯一，以免出现不可预期的结果）
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
	 * 商品数量（单位：自拟）
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * 实付金额（单位：分）
	 */
	@ApiField("real_amount")
	private Long realAmount;

	/**
	 * 商品 sku id
	 */
	@ApiField("sku_id")
	private String skuId;

	/**
	 * 商品补贴金额（单位：分）
	 */
	@ApiField("subsidy_amount")
	private Long subsidyAmount;

	/**
	 * 商品单价（单位：分）
	 */
	@ApiField("unit_price")
	private Long unitPrice;

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

	public Long getRealAmount() {
		return this.realAmount;
	}
	public void setRealAmount(Long realAmount) {
		this.realAmount = realAmount;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public Long getSubsidyAmount() {
		return this.subsidyAmount;
	}
	public void setSubsidyAmount(Long subsidyAmount) {
		this.subsidyAmount = subsidyAmount;
	}

	public Long getUnitPrice() {
		return this.unitPrice;
	}
	public void setUnitPrice(Long unitPrice) {
		this.unitPrice = unitPrice;
	}

}
