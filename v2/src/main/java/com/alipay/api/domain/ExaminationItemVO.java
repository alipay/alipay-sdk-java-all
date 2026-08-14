package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 检查检验类商品对象字段
 *
 * @author auto create
 * @since 1.0, 2026-08-12 17:49:16
 */
public class ExaminationItemVO extends AlipayObject {

	private static final long serialVersionUID = 4192977571626171589L;

	/**
	 * 折扣后的金额(实际支付金额)，单位：元。币种：人民币
	 */
	@ApiField("amount_discount_amount")
	private String amountDiscountAmount;

	/**
	 * 商品总价，单位：元。币种：人民币
	 */
	@ApiField("amount_item")
	private String amountItem;

	/**
	 * 组合商品标记，0：常规 1：组合
	 */
	@ApiField("combine_item")
	private Long combineItem;

	/**
	 * 耗材价格，单位：元。币种：人民币
	 */
	@ApiField("consumable_amount")
	private String consumableAmount;

	/**
	 * 优惠信息
	 */
	@ApiField("discount")
	private ExaminationDiscount discount;

	/**
	 * 药品价格，单位：元。币种：人民币
	 */
	@ApiField("drug_amount")
	private String drugAmount;

	/**
	 * 子订单ID
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 商家的商品店内码，对应商品接口中的sku_code
	 */
	@ApiField("item_code")
	private String itemCode;

	/**
	 * 父单ID
	 */
	@ApiField("parent_id")
	private Long parentId;

	/**
	 * 商品单价，单位：元。币种：人民币
	 */
	@ApiField("price_sale")
	private String priceSale;

	/**
	 * 数量，单位：个
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * sku编码
	 */
	@ApiField("sku_id")
	private String skuId;

	public String getAmountDiscountAmount() {
		return this.amountDiscountAmount;
	}
	public void setAmountDiscountAmount(String amountDiscountAmount) {
		this.amountDiscountAmount = amountDiscountAmount;
	}

	public String getAmountItem() {
		return this.amountItem;
	}
	public void setAmountItem(String amountItem) {
		this.amountItem = amountItem;
	}

	public Long getCombineItem() {
		return this.combineItem;
	}
	public void setCombineItem(Long combineItem) {
		this.combineItem = combineItem;
	}

	public String getConsumableAmount() {
		return this.consumableAmount;
	}
	public void setConsumableAmount(String consumableAmount) {
		this.consumableAmount = consumableAmount;
	}

	public ExaminationDiscount getDiscount() {
		return this.discount;
	}
	public void setDiscount(ExaminationDiscount discount) {
		this.discount = discount;
	}

	public String getDrugAmount() {
		return this.drugAmount;
	}
	public void setDrugAmount(String drugAmount) {
		this.drugAmount = drugAmount;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getItemCode() {
		return this.itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public Long getParentId() {
		return this.parentId;
	}
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public String getPriceSale() {
		return this.priceSale;
	}
	public void setPriceSale(String priceSale) {
		this.priceSale = priceSale;
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

}
