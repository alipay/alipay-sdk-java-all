package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-09-23 10:41:25
 */
public class VoyagerVoucherVO extends AlipayObject {

	private static final long serialVersionUID = 8686239569461429134L;

	/**
	 * 生效时间，时间戳
	 */
	@ApiField("active_time")
	private String activeTime;

	/**
	 * 领取时间，时间戳
	 */
	@ApiField("claim_time")
	private String claimTime;

	/**
	 * 券类型
	 */
	@ApiField("coupon_discount_type")
	private String couponDiscountType;

	/**
	 * 过期时间，时间戳
	 */
	@ApiField("expired_time")
	private String expiredTime;

	/**
	 * 如何使用
	 */
	@ApiField("how_to_use")
	private String howToUse;

	/**
	 * 行业
	 */
	@ApiField("industry")
	private String industry;

	/**
	 * 跳转链接
	 */
	@ApiField("jump_url")
	private String jumpUrl;

	/**
	 * 标签
	 */
	@ApiField("label")
	private String label;

	/**
	 * logo链接
	 */
	@ApiField("logo_url")
	private String logoUrl;

	/**
	 * 最大优惠金额（折扣券封顶场景，可选）
	 */
	@ApiField("max_discount")
	private String maxDiscount;

	/**
	 * 最大优惠金额单位（ISO 4217 币种）
	 */
	@ApiField("max_discount_unit")
	private String maxDiscountUnit;

	/**
	 * 券名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 营销码
	 */
	@ApiField("promo_code")
	private String promoCode;

	/**
	 * 核销时间，时间戳
	 */
	@ApiField("redeem_time")
	private String redeemTime;

	/**
	 * 券状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 模版ID
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 门槛值（如满 100 可用传 10000）
	 */
	@ApiField("threshold")
	private String threshold;

	/**
	 * 门槛单位（一般为 ISO 4217 币种），展示如"满20可用"
	 */
	@ApiField("threshold_unit")
	private String thresholdUnit;

	/**
	 * 券类型
	 */
	@ApiField("type")
	private String type;

	/**
	 * 使用规则
	 */
	@ApiField("use_rule")
	private String useRule;

	/**
	 * 优惠值（纯数值字符串）：金额券 500（分）、折扣券 8（8 折）、次数券 3
	 */
	@ApiField("value")
	private String value;

	/**
	 * 优惠单位：金额类为币种（ISO 4217），非金额权益为 折/次 等
	 */
	@ApiField("value_unit")
	private String valueUnit;

	/**
	 * 券ID
	 */
	@ApiField("voucher_id")
	private String voucherId;

	public String getActiveTime() {
		return this.activeTime;
	}
	public void setActiveTime(String activeTime) {
		this.activeTime = activeTime;
	}

	public String getClaimTime() {
		return this.claimTime;
	}
	public void setClaimTime(String claimTime) {
		this.claimTime = claimTime;
	}

	public String getCouponDiscountType() {
		return this.couponDiscountType;
	}
	public void setCouponDiscountType(String couponDiscountType) {
		this.couponDiscountType = couponDiscountType;
	}

	public String getExpiredTime() {
		return this.expiredTime;
	}
	public void setExpiredTime(String expiredTime) {
		this.expiredTime = expiredTime;
	}

	public String getHowToUse() {
		return this.howToUse;
	}
	public void setHowToUse(String howToUse) {
		this.howToUse = howToUse;
	}

	public String getIndustry() {
		return this.industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getJumpUrl() {
		return this.jumpUrl;
	}
	public void setJumpUrl(String jumpUrl) {
		this.jumpUrl = jumpUrl;
	}

	public String getLabel() {
		return this.label;
	}
	public void setLabel(String label) {
		this.label = label;
	}

	public String getLogoUrl() {
		return this.logoUrl;
	}
	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

	public String getMaxDiscount() {
		return this.maxDiscount;
	}
	public void setMaxDiscount(String maxDiscount) {
		this.maxDiscount = maxDiscount;
	}

	public String getMaxDiscountUnit() {
		return this.maxDiscountUnit;
	}
	public void setMaxDiscountUnit(String maxDiscountUnit) {
		this.maxDiscountUnit = maxDiscountUnit;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPromoCode() {
		return this.promoCode;
	}
	public void setPromoCode(String promoCode) {
		this.promoCode = promoCode;
	}

	public String getRedeemTime() {
		return this.redeemTime;
	}
	public void setRedeemTime(String redeemTime) {
		this.redeemTime = redeemTime;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getThreshold() {
		return this.threshold;
	}
	public void setThreshold(String threshold) {
		this.threshold = threshold;
	}

	public String getThresholdUnit() {
		return this.thresholdUnit;
	}
	public void setThresholdUnit(String thresholdUnit) {
		this.thresholdUnit = thresholdUnit;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getUseRule() {
		return this.useRule;
	}
	public void setUseRule(String useRule) {
		this.useRule = useRule;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

	public String getValueUnit() {
		return this.valueUnit;
	}
	public void setValueUnit(String valueUnit) {
		this.valueUnit = valueUnit;
	}

	public String getVoucherId() {
		return this.voucherId;
	}
	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

}
