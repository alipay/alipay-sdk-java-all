package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益使用限制
 *
 * @author auto create
 * @since 1.0, 2022-11-14 17:26:48
 */
public class BenefitUseLimitDTO extends AlipayObject {

	private static final long serialVersionUID = 4332696453885264313L;

	/**
	 * REDUCE_BY  ： 满减; REDUCE_TO ： 减至 (一般用来标识特价商品);GIFT ： 满赠;DISCOUNT ： 折扣
	 */
	@ApiField("benefit_content_type")
	private String benefitContentType;

	/**
	 * 使用规则条款描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 折扣使用限制
	 */
	@ApiField("discount_info")
	private DiscountInfoDTO discountInfo;

	/**
	 * 满赠
	 */
	@ApiField("gift_info")
	private GiftInfoDTO giftInfo;

	/**
	 * 满减使用限制
	 */
	@ApiField("reduce_by_info")
	private ReduceByInfoDTO reduceByInfo;

	/**
	 * 减至使用限制
	 */
	@ApiField("reducy_to_info")
	private ReduceToInfoDTO reducyToInfo;

	public String getBenefitContentType() {
		return this.benefitContentType;
	}
	public void setBenefitContentType(String benefitContentType) {
		this.benefitContentType = benefitContentType;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public DiscountInfoDTO getDiscountInfo() {
		return this.discountInfo;
	}
	public void setDiscountInfo(DiscountInfoDTO discountInfo) {
		this.discountInfo = discountInfo;
	}

	public GiftInfoDTO getGiftInfo() {
		return this.giftInfo;
	}
	public void setGiftInfo(GiftInfoDTO giftInfo) {
		this.giftInfo = giftInfo;
	}

	public ReduceByInfoDTO getReduceByInfo() {
		return this.reduceByInfo;
	}
	public void setReduceByInfo(ReduceByInfoDTO reduceByInfo) {
		this.reduceByInfo = reduceByInfo;
	}

	public ReduceToInfoDTO getReducyToInfo() {
		return this.reducyToInfo;
	}
	public void setReducyToInfo(ReduceToInfoDTO reducyToInfo) {
		this.reducyToInfo = reducyToInfo;
	}

}
