package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 满赠营销
 *
 * @author auto create
 * @since 1.0, 2020-09-14 15:48:38
 */
public class FullGiftDTO extends AlipayObject {

	private static final long serialVersionUID = 8758198939447279442L;

	/**
	 * 赠送金额，如果有阶梯规则，多个值用英文逗号分割，例如：10,20
	 */
	@ApiField("gift_amount")
	private String giftAmount;

	/**
	 * 赠送最低消费，如果有阶梯规则，多个值用英文逗号分割，例如：10,20
	 */
	@ApiField("gift_min_consumption")
	private String giftMinConsumption;

	/**
	 * 赠送份数，如果有阶梯规则，多个值用英文逗号分割，例如：1,2
	 */
	@ApiField("gift_nums")
	private String giftNums;

	/**
	 * 满赠skuid
	 */
	@ApiListField("gift_sku_id")
	@ApiField("string")
	private List<String> giftSkuId;

	/**
	 * 最低消费，如果有阶梯规则，多个值用英文逗号分割，例如：1,2
	 */
	@ApiField("min_consumption")
	private String minConsumption;

	/**
	 * 最少份数，如果有阶梯规则，多个值用英文逗号分割，例如：1,2
	 */
	@ApiField("min_nums")
	private String minNums;

	/**
	 * 营销skuId
	 */
	@ApiListField("promotion_sku_id")
	@ApiField("string")
	private List<String> promotionSkuId;

	public String getGiftAmount() {
		return this.giftAmount;
	}
	public void setGiftAmount(String giftAmount) {
		this.giftAmount = giftAmount;
	}

	public String getGiftMinConsumption() {
		return this.giftMinConsumption;
	}
	public void setGiftMinConsumption(String giftMinConsumption) {
		this.giftMinConsumption = giftMinConsumption;
	}

	public String getGiftNums() {
		return this.giftNums;
	}
	public void setGiftNums(String giftNums) {
		this.giftNums = giftNums;
	}

	public List<String> getGiftSkuId() {
		return this.giftSkuId;
	}
	public void setGiftSkuId(List<String> giftSkuId) {
		this.giftSkuId = giftSkuId;
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
