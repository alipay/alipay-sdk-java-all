package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 奖品对客信息
 *
 * @author auto create
 * @since 1.0, 2026-05-18 19:51:15
 */
public class EduPrizeCustomDisplayInfo extends AlipayObject {

	private static final long serialVersionUID = 8796127388321527972L;

	/**
	 * 面额单位
	 */
	@ApiField("amount_unit_text")
	private String amountUnitText;

	/**
	 * 奖品背景图 url
	 */
	@ApiField("benefit_background_pic_url")
	private String benefitBackgroundPicUrl;

	/**
	 * 奖品图标地址
	 */
	@ApiField("benefit_icon")
	private String benefitIcon;

	/**
	 * 奖品权益单品优惠类型
	 */
	@ApiField("benefit_item_type")
	private String benefitItemType;

	/**
	 * 品牌Logo图片
	 */
	@ApiField("benefit_logo")
	private String benefitLogo;

	/**
	 * 奖品展示名称（长）
	 */
	@ApiField("benefit_long_name")
	private String benefitLongName;

	/**
	 * 奖品展示名称（中）
	 */
	@ApiField("benefit_medium_name")
	private String benefitMediumName;

	/**
	 * 商家名称
	 */
	@ApiField("benefit_merchant_name")
	private String benefitMerchantName;

	/**
	 * 奖品展示名称（短）
	 */
	@ApiField("benefit_name")
	private String benefitName;

	/**
	 * 奖品展示名称（短，无金额信息）
	 */
	@ApiField("benefit_name_without_amount")
	private String benefitNameWithoutAmount;

	/**
	 * 奖品使用规则说明，如使用限制等
	 */
	@ApiField("benefit_rule_desc")
	private String benefitRuleDesc;

	/**
	 * 奖品使用说明，如消费满 1000 元可用
	 */
	@ApiField("benefit_usage_desc")
	private String benefitUsageDesc;

	/**
	 * 上限面额，单位分
	 */
	@ApiField("ceil_money_amount")
	private Long ceilMoneyAmount;

	/**
	 * 折扣信息，数值表示折扣比例，单位为"折"，如8表示8折（即原价的80%），7.5表示7.5折
	 */
	@ApiField("discount")
	private String discount;

	/**
	 * 奖品权益类型
	 */
	@ApiField("form_type")
	private String formType;

	/**
	 * 单品名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 总使用次数
	 */
	@ApiField("max_use_count")
	private Long maxUseCount;

	/**
	 * 原面额，单位分
	 */
	@ApiField("original_money_amount")
	private Long originalMoneyAmount;

	/**
	 * 平台类型
	 */
	@ApiField("platform_type")
	private String platformType;

	/**
	 * 优惠信息，单位分
	 */
	@ApiField("preferential_money_amount")
	private Long preferentialMoneyAmount;

	/**
	 * 投放链接
	 */
	@ApiField("promo_link")
	private String promoLink;

	/**
	 * 使用范围
	 */
	@ApiField("scope")
	private String scope;

	/**
	 * 展示金额数值，单位由配套字段amountUnitText指定（如"元"表示人民币元、"折"表示折扣比例），取值随单位不同而异：当单位为"元"时取值为金额数字（如"0.1"表示0.1元），当单位为"折"时取值为折扣数值（如"8"表示8折）。本字段为纯数值，不含单位
	 */
	@ApiField("show_amount_text")
	private String showAmountText;

	/**
	 * 特价信息，单位分
	 */
	@ApiField("specified_money_amount")
	private Long specifiedMoneyAmount;

	/**
	 * 奖品权益子类型
	 */
	@ApiField("sub_form_type")
	private String subFormType;

	/**
	 * 使用门槛文案
	 */
	@ApiField("threshold_amount_text")
	private String thresholdAmountText;

	/**
	 * 门槛金额，单位分
	 */
	@ApiField("threshold_money_amount")
	private Long thresholdMoneyAmount;

	public String getAmountUnitText() {
		return this.amountUnitText;
	}
	public void setAmountUnitText(String amountUnitText) {
		this.amountUnitText = amountUnitText;
	}

	public String getBenefitBackgroundPicUrl() {
		return this.benefitBackgroundPicUrl;
	}
	public void setBenefitBackgroundPicUrl(String benefitBackgroundPicUrl) {
		this.benefitBackgroundPicUrl = benefitBackgroundPicUrl;
	}

	public String getBenefitIcon() {
		return this.benefitIcon;
	}
	public void setBenefitIcon(String benefitIcon) {
		this.benefitIcon = benefitIcon;
	}

	public String getBenefitItemType() {
		return this.benefitItemType;
	}
	public void setBenefitItemType(String benefitItemType) {
		this.benefitItemType = benefitItemType;
	}

	public String getBenefitLogo() {
		return this.benefitLogo;
	}
	public void setBenefitLogo(String benefitLogo) {
		this.benefitLogo = benefitLogo;
	}

	public String getBenefitLongName() {
		return this.benefitLongName;
	}
	public void setBenefitLongName(String benefitLongName) {
		this.benefitLongName = benefitLongName;
	}

	public String getBenefitMediumName() {
		return this.benefitMediumName;
	}
	public void setBenefitMediumName(String benefitMediumName) {
		this.benefitMediumName = benefitMediumName;
	}

	public String getBenefitMerchantName() {
		return this.benefitMerchantName;
	}
	public void setBenefitMerchantName(String benefitMerchantName) {
		this.benefitMerchantName = benefitMerchantName;
	}

	public String getBenefitName() {
		return this.benefitName;
	}
	public void setBenefitName(String benefitName) {
		this.benefitName = benefitName;
	}

	public String getBenefitNameWithoutAmount() {
		return this.benefitNameWithoutAmount;
	}
	public void setBenefitNameWithoutAmount(String benefitNameWithoutAmount) {
		this.benefitNameWithoutAmount = benefitNameWithoutAmount;
	}

	public String getBenefitRuleDesc() {
		return this.benefitRuleDesc;
	}
	public void setBenefitRuleDesc(String benefitRuleDesc) {
		this.benefitRuleDesc = benefitRuleDesc;
	}

	public String getBenefitUsageDesc() {
		return this.benefitUsageDesc;
	}
	public void setBenefitUsageDesc(String benefitUsageDesc) {
		this.benefitUsageDesc = benefitUsageDesc;
	}

	public Long getCeilMoneyAmount() {
		return this.ceilMoneyAmount;
	}
	public void setCeilMoneyAmount(Long ceilMoneyAmount) {
		this.ceilMoneyAmount = ceilMoneyAmount;
	}

	public String getDiscount() {
		return this.discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public String getFormType() {
		return this.formType;
	}
	public void setFormType(String formType) {
		this.formType = formType;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Long getMaxUseCount() {
		return this.maxUseCount;
	}
	public void setMaxUseCount(Long maxUseCount) {
		this.maxUseCount = maxUseCount;
	}

	public Long getOriginalMoneyAmount() {
		return this.originalMoneyAmount;
	}
	public void setOriginalMoneyAmount(Long originalMoneyAmount) {
		this.originalMoneyAmount = originalMoneyAmount;
	}

	public String getPlatformType() {
		return this.platformType;
	}
	public void setPlatformType(String platformType) {
		this.platformType = platformType;
	}

	public Long getPreferentialMoneyAmount() {
		return this.preferentialMoneyAmount;
	}
	public void setPreferentialMoneyAmount(Long preferentialMoneyAmount) {
		this.preferentialMoneyAmount = preferentialMoneyAmount;
	}

	public String getPromoLink() {
		return this.promoLink;
	}
	public void setPromoLink(String promoLink) {
		this.promoLink = promoLink;
	}

	public String getScope() {
		return this.scope;
	}
	public void setScope(String scope) {
		this.scope = scope;
	}

	public String getShowAmountText() {
		return this.showAmountText;
	}
	public void setShowAmountText(String showAmountText) {
		this.showAmountText = showAmountText;
	}

	public Long getSpecifiedMoneyAmount() {
		return this.specifiedMoneyAmount;
	}
	public void setSpecifiedMoneyAmount(Long specifiedMoneyAmount) {
		this.specifiedMoneyAmount = specifiedMoneyAmount;
	}

	public String getSubFormType() {
		return this.subFormType;
	}
	public void setSubFormType(String subFormType) {
		this.subFormType = subFormType;
	}

	public String getThresholdAmountText() {
		return this.thresholdAmountText;
	}
	public void setThresholdAmountText(String thresholdAmountText) {
		this.thresholdAmountText = thresholdAmountText;
	}

	public Long getThresholdMoneyAmount() {
		return this.thresholdMoneyAmount;
	}
	public void setThresholdMoneyAmount(Long thresholdMoneyAmount) {
		this.thresholdMoneyAmount = thresholdMoneyAmount;
	}

}
