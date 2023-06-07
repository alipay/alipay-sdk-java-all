package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 特价营销
 *
 * @author auto create
 * @since 1.0, 2020-09-14 15:48:38
 */
public class SpecialPriceDTO extends AlipayObject {

	private static final long serialVersionUID = 1385413923515282885L;

	/**
	 * 最少份数，如果有阶梯规则，多个值用英文逗号分割，例如：3,5
	 */
	@ApiField("min_nums")
	private String minNums;

	/**
	 * 营销活动skuid
	 */
	@ApiListField("promotion_sku_id")
	@ApiField("string")
	private List<String> promotionSkuId;

	/**
	 * 活动价，必须是数字格式，且最多两位小数点。
如果有阶梯规则，多个值用英文逗号分割，例如：10,5
	 */
	@ApiField("special_price")
	private String specialPrice;

	/**
	 * 是否仅特价商品（Y/N）
	 */
	@ApiField("special_price_only")
	private String specialPriceOnly;

	/**
	 * 特价skuId
	 */
	@ApiListField("special_price_sku_id")
	@ApiField("string")
	private List<String> specialPriceSkuId;

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

	public String getSpecialPrice() {
		return this.specialPrice;
	}
	public void setSpecialPrice(String specialPrice) {
		this.specialPrice = specialPrice;
	}

	public String getSpecialPriceOnly() {
		return this.specialPriceOnly;
	}
	public void setSpecialPriceOnly(String specialPriceOnly) {
		this.specialPriceOnly = specialPriceOnly;
	}

	public List<String> getSpecialPriceSkuId() {
		return this.specialPriceSkuId;
	}
	public void setSpecialPriceSkuId(List<String> specialPriceSkuId) {
		this.specialPriceSkuId = specialPriceSkuId;
	}

}
