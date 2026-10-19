package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-09-23 10:47:54
 */
public class BenefitDisplayVO extends AlipayObject {

	private static final long serialVersionUID = 6276234643444443782L;

	/**
	 * 券生效时间
	 */
	@ApiField("active_time")
	private String activeTime;

	/**
	 * 权益 ID
	 */
	@ApiField("benefit_id")
	private String benefitId;

	/**
	 * 优惠来源
	 */
	@ApiField("benefit_source")
	private String benefitSource;

	/**
	 * 权益类型
	 */
	@ApiField("benefit_type")
	private String benefitType;

	/**
	 * 优惠金额
	 */
	@ApiField("discount_amount")
	private MultiCurrencyMoneyDTO discountAmount;

	/**
	 * 权益描述
	 */
	@ApiField("discount_desc")
	private String discountDesc;

	/**
	 * 权益图标
	 */
	@ApiField("discount_icon_url")
	private String discountIconUrl;

	/**
	 * 权益名称
	 */
	@ApiField("discount_name")
	private String discountName;

	/**
	 * 优惠百分比
	 */
	@ApiField("discount_percentage")
	private Long discountPercentage;

	/**
	 * 券过期时间
	 */
	@ApiField("expired_time")
	private String expiredTime;

	/**
	 * 扩展信息
	 */
	@ApiField("extend_info")
	private String extendInfo;

	/**
	 * 该优惠对应的商品ID
	 */
	@ApiField("goods_id")
	private String goodsId;

	/**
	 * 使用门槛
	 */
	@ApiField("threshold_amount")
	private MultiCurrencyMoneyDTO thresholdAmount;

	/**
	 * 使用规则描述
	 */
	@ApiField("usage_condition")
	private String usageCondition;

	public String getActiveTime() {
		return this.activeTime;
	}
	public void setActiveTime(String activeTime) {
		this.activeTime = activeTime;
	}

	public String getBenefitId() {
		return this.benefitId;
	}
	public void setBenefitId(String benefitId) {
		this.benefitId = benefitId;
	}

	public String getBenefitSource() {
		return this.benefitSource;
	}
	public void setBenefitSource(String benefitSource) {
		this.benefitSource = benefitSource;
	}

	public String getBenefitType() {
		return this.benefitType;
	}
	public void setBenefitType(String benefitType) {
		this.benefitType = benefitType;
	}

	public MultiCurrencyMoneyDTO getDiscountAmount() {
		return this.discountAmount;
	}
	public void setDiscountAmount(MultiCurrencyMoneyDTO discountAmount) {
		this.discountAmount = discountAmount;
	}

	public String getDiscountDesc() {
		return this.discountDesc;
	}
	public void setDiscountDesc(String discountDesc) {
		this.discountDesc = discountDesc;
	}

	public String getDiscountIconUrl() {
		return this.discountIconUrl;
	}
	public void setDiscountIconUrl(String discountIconUrl) {
		this.discountIconUrl = discountIconUrl;
	}

	public String getDiscountName() {
		return this.discountName;
	}
	public void setDiscountName(String discountName) {
		this.discountName = discountName;
	}

	public Long getDiscountPercentage() {
		return this.discountPercentage;
	}
	public void setDiscountPercentage(Long discountPercentage) {
		this.discountPercentage = discountPercentage;
	}

	public String getExpiredTime() {
		return this.expiredTime;
	}
	public void setExpiredTime(String expiredTime) {
		this.expiredTime = expiredTime;
	}

	public String getExtendInfo() {
		return this.extendInfo;
	}
	public void setExtendInfo(String extendInfo) {
		this.extendInfo = extendInfo;
	}

	public String getGoodsId() {
		return this.goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public MultiCurrencyMoneyDTO getThresholdAmount() {
		return this.thresholdAmount;
	}
	public void setThresholdAmount(MultiCurrencyMoneyDTO thresholdAmount) {
		this.thresholdAmount = thresholdAmount;
	}

	public String getUsageCondition() {
		return this.usageCondition;
	}
	public void setUsageCondition(String usageCondition) {
		this.usageCondition = usageCondition;
	}

}
