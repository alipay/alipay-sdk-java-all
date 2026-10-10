package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 价格信息（订单维度价格计算结果透传）
 *
 * @author auto create
 * @since 1.0, 2026-09-23 10:42:55
 */
public class VoyagerPriceInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 1762771736699639969L;

	/**
	 * 折扣百分比
	 */
	@ApiField("discount_percentage")
	private Long discountPercentage;

	/**
	 * 原价
	 */
	@ApiField("original_price")
	private MultiCurrencyMoneyDTO originalPrice;

	/**
	 * 原销售价
	 */
	@ApiField("original_sale_price")
	private MultiCurrencyMoneyDTO originalSalePrice;

	/**
	 * 平台营销优惠金额
	 */
	@ApiField("promo_discount_price")
	private MultiCurrencyMoneyDTO promoDiscountPrice;

	/**
	 * 售价（优惠后）
	 */
	@ApiField("sale_price")
	private MultiCurrencyMoneyDTO salePrice;

	/**
	 * 商家优惠金额
	 */
	@ApiField("supplier_discount_price")
	private MultiCurrencyMoneyDTO supplierDiscountPrice;

	/**
	 * 优惠总金额
	 */
	@ApiField("total_discount_price")
	private MultiCurrencyMoneyDTO totalDiscountPrice;

	public Long getDiscountPercentage() {
		return this.discountPercentage;
	}
	public void setDiscountPercentage(Long discountPercentage) {
		this.discountPercentage = discountPercentage;
	}

	public MultiCurrencyMoneyDTO getOriginalPrice() {
		return this.originalPrice;
	}
	public void setOriginalPrice(MultiCurrencyMoneyDTO originalPrice) {
		this.originalPrice = originalPrice;
	}

	public MultiCurrencyMoneyDTO getOriginalSalePrice() {
		return this.originalSalePrice;
	}
	public void setOriginalSalePrice(MultiCurrencyMoneyDTO originalSalePrice) {
		this.originalSalePrice = originalSalePrice;
	}

	public MultiCurrencyMoneyDTO getPromoDiscountPrice() {
		return this.promoDiscountPrice;
	}
	public void setPromoDiscountPrice(MultiCurrencyMoneyDTO promoDiscountPrice) {
		this.promoDiscountPrice = promoDiscountPrice;
	}

	public MultiCurrencyMoneyDTO getSalePrice() {
		return this.salePrice;
	}
	public void setSalePrice(MultiCurrencyMoneyDTO salePrice) {
		this.salePrice = salePrice;
	}

	public MultiCurrencyMoneyDTO getSupplierDiscountPrice() {
		return this.supplierDiscountPrice;
	}
	public void setSupplierDiscountPrice(MultiCurrencyMoneyDTO supplierDiscountPrice) {
		this.supplierDiscountPrice = supplierDiscountPrice;
	}

	public MultiCurrencyMoneyDTO getTotalDiscountPrice() {
		return this.totalDiscountPrice;
	}
	public void setTotalDiscountPrice(MultiCurrencyMoneyDTO totalDiscountPrice) {
		this.totalDiscountPrice = totalDiscountPrice;
	}

}
