package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * Sku对象
 *
 * @author auto create
 * @since 1.0, 2025-04-08 16:22:18
 */
public class SkuBean extends AlipayObject {

	private static final long serialVersionUID = 6895483937737273459L;

	/**
	 * 活动对象,购物车相关接口的活动视图
	 */
	@ApiField("activity")
	private CartActivityBean activity;

	/**
	 * 添加时间，1970至今毫秒值
	 */
	@ApiField("add_time")
	private Long addTime;

	/**
	 * 价格，单位：元
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 属性描述
	 */
	@ApiField("attr_desc")
	private String attrDesc;

	/**
	 * 库存，单位：个/份
	 */
	@ApiField("inventory")
	private Long inventory;

	/**
	 * 商品属性列表
	 */
	@ApiListField("item_attribute_list")
	@ApiField("attribute_bean")
	private List<AttributeBean> itemAttributeList;

	/**
	 * 商品ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商品名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 原始价格，单位：元
	 */
	@ApiField("original_price")
	private String originalPrice;

	/**
	 * 支付价格，单位：元
	 */
	@ApiField("payment_price")
	private String paymentPrice;

	/**
	 * 价格，单位：元
	 */
	@ApiField("price")
	private String price;

	/**
	 * 数量，单位：个/份
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * 展示价格，单位：元
	 */
	@ApiField("show_amt")
	private String showAmt;

	/**
	 * 加料列表
	 */
	@ApiListField("side_item_list")
	@ApiField("side_item_bean")
	private List<SideItemBean> sideItemList;

	/**
	 * sku商品属性列表
	 */
	@ApiListField("sku_attribute_list")
	@ApiField("attribute_bean")
	private List<AttributeBean> skuAttributeList;

	/**
	 * 商品skuId
	 */
	@ApiField("sku_id")
	private String skuId;

	/**
	 * 规格名称
	 */
	@ApiField("spec_name")
	private String specName;

	/**
	 * 规格值，无法定义单位
	 */
	@ApiField("spec_value")
	private String specValue;

	/**
	 * 缩略图
	 */
	@ApiField("thumbnail_url")
	private String thumbnailUrl;

	/**
	 * 单位价格，单位：元
	 */
	@ApiField("unit_amount")
	private String unitAmount;

	public CartActivityBean getActivity() {
		return this.activity;
	}
	public void setActivity(CartActivityBean activity) {
		this.activity = activity;
	}

	public Long getAddTime() {
		return this.addTime;
	}
	public void setAddTime(Long addTime) {
		this.addTime = addTime;
	}

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getAttrDesc() {
		return this.attrDesc;
	}
	public void setAttrDesc(String attrDesc) {
		this.attrDesc = attrDesc;
	}

	public Long getInventory() {
		return this.inventory;
	}
	public void setInventory(Long inventory) {
		this.inventory = inventory;
	}

	public List<AttributeBean> getItemAttributeList() {
		return this.itemAttributeList;
	}
	public void setItemAttributeList(List<AttributeBean> itemAttributeList) {
		this.itemAttributeList = itemAttributeList;
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

	public String getOriginalPrice() {
		return this.originalPrice;
	}
	public void setOriginalPrice(String originalPrice) {
		this.originalPrice = originalPrice;
	}

	public String getPaymentPrice() {
		return this.paymentPrice;
	}
	public void setPaymentPrice(String paymentPrice) {
		this.paymentPrice = paymentPrice;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public Long getQuantity() {
		return this.quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public String getShowAmt() {
		return this.showAmt;
	}
	public void setShowAmt(String showAmt) {
		this.showAmt = showAmt;
	}

	public List<SideItemBean> getSideItemList() {
		return this.sideItemList;
	}
	public void setSideItemList(List<SideItemBean> sideItemList) {
		this.sideItemList = sideItemList;
	}

	public List<AttributeBean> getSkuAttributeList() {
		return this.skuAttributeList;
	}
	public void setSkuAttributeList(List<AttributeBean> skuAttributeList) {
		this.skuAttributeList = skuAttributeList;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public String getSpecName() {
		return this.specName;
	}
	public void setSpecName(String specName) {
		this.specName = specName;
	}

	public String getSpecValue() {
		return this.specValue;
	}
	public void setSpecValue(String specValue) {
		this.specValue = specValue;
	}

	public String getThumbnailUrl() {
		return this.thumbnailUrl;
	}
	public void setThumbnailUrl(String thumbnailUrl) {
		this.thumbnailUrl = thumbnailUrl;
	}

	public String getUnitAmount() {
		return this.unitAmount;
	}
	public void setUnitAmount(String unitAmount) {
		this.unitAmount = unitAmount;
	}

}
