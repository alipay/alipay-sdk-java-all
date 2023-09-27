package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 满减营销
 *
 * @author auto create
 * @since 1.0, 2020-09-14 15:48:38
 */
public class FullReductionDTO extends AlipayObject {

	private static final long serialVersionUID = 8284314951449962914L;

	/**
	 * 是否仅满减商品（Y/N）
	 */
	@ApiField("full_reduction_only")
	private String fullReductionOnly;

	/**
	 * 满减skuId
	 */
	@ApiListField("full_reduction_sku_id")
	@ApiField("string")
	private List<String> fullReductionSkuId;

	/**
	 * 最低消费，如果有阶梯规则，则用英文逗号拼接
	 */
	@ApiField("min_consumption")
	private String minConsumption;

	/**
	 * 最少份数，如果有阶梯规则，则用英文逗号拼接
	 */
	@ApiField("min_nums")
	private String minNums;

	/**
	 * 营销商品skuId
	 */
	@ApiListField("promotion_sku_id")
	@ApiField("string")
	private List<String> promotionSkuId;

	/**
	 * 满减金额，两位小数，如果有阶梯规则，用英文逗号分割
	 */
	@ApiField("reduction_amount")
	private String reductionAmount;

	public String getFullReductionOnly() {
		return this.fullReductionOnly;
	}
	public void setFullReductionOnly(String fullReductionOnly) {
		this.fullReductionOnly = fullReductionOnly;
	}

	public List<String> getFullReductionSkuId() {
		return this.fullReductionSkuId;
	}
	public void setFullReductionSkuId(List<String> fullReductionSkuId) {
		this.fullReductionSkuId = fullReductionSkuId;
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

	public String getReductionAmount() {
		return this.reductionAmount;
	}
	public void setReductionAmount(String reductionAmount) {
		this.reductionAmount = reductionAmount;
	}

}
