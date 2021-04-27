package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 满折营销
 *
 * @author auto create
 * @since 1.0, 2020-09-14 15:48:38
 */
public class FullDiscountDTO extends AlipayObject {

	private static final long serialVersionUID = 7778874274989679682L;

	/**
	 * 折扣，如果有阶梯规则，则用英文逗号分隔
	 */
	@ApiField("discount")
	private String discount;

	/**
	 * 是否仅满折商品（Y/N）
	 */
	@ApiField("full_discount_only")
	private String fullDiscountOnly;

	/**
	 * 满折skuId
	 */
	@ApiListField("full_discount_sku_id")
	@ApiField("string")
	private List<String> fullDiscountSkuId;

	/**
	 * 最低消费，如果有阶梯规则，则用英文逗号分隔
	 */
	@ApiField("min_consumption")
	private String minConsumption;

	/**
	 * 最少份数，如果有阶梯规则，则用英文逗号拼接
	 */
	@ApiField("min_nums")
	private String minNums;

	/**
	 * 营销skuId
	 */
	@ApiListField("promotion_sku_id")
	@ApiField("string")
	private List<String> promotionSkuId;

	public String getDiscount() {
		return this.discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public String getFullDiscountOnly() {
		return this.fullDiscountOnly;
	}
	public void setFullDiscountOnly(String fullDiscountOnly) {
		this.fullDiscountOnly = fullDiscountOnly;
	}

	public List<String> getFullDiscountSkuId() {
		return this.fullDiscountSkuId;
	}
	public void setFullDiscountSkuId(List<String> fullDiscountSkuId) {
		this.fullDiscountSkuId = fullDiscountSkuId;
	}

	public String getMinConsumption() {
		return this.minConsumption;
	}
	public void setMinConsumption(String minConsumption) {
		this.minConsumption = minConsumption;
	}

	public String getMinNums() {
		return this.minNums;
	}
	public void setMinNums(String minNums) {
		this.minNums = minNums;
	}

	public List<String> getPromotionSkuId() {
		return this.promotionSkuId;
	}
	public void setPromotionSkuId(List<String> promotionSkuId) {
		this.promotionSkuId = promotionSkuId;
	}

}
