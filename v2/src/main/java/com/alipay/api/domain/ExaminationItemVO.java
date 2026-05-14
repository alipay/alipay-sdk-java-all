package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 检查检验类商品对象字段
 *
 * @author auto create
 * @since 1.0, 2026-04-10 16:25:12
 */
public class ExaminationItemVO extends AlipayObject {

	private static final long serialVersionUID = 5222816639677819158L;

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
	 * 商家的商品店内码，对应商品接口中的sku_code
	 */
	@ApiField("item_code")
	private String itemCode;

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

	public String getItemCode() {
		return this.itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
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
