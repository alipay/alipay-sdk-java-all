package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 奖品对客信息
 *
 * @author auto create
 * @since 1.0, 2023-10-12 20:46:28
 */
public class PrizeCustomDisplayInfo extends AlipayObject {

	private static final long serialVersionUID = 8131522345938187542L;

	/**
	 * 面额单位
	 */
	@ApiField("amount_unit_text")
	private String amountUnitText;

	/**
	 * 上限面额，单位分
	 */
	@ApiField("ceil_money_amount")
	private Long ceilMoneyAmount;

	/**
	 * 折扣信息
	 */
	@ApiField("discount")
	private String discount;

	/**
	 * 常见属性：
"BUTTON_TEXT": 奖品按钮
"PRIZE_AMOUNT": 单个奖品数量或金额
"BUTTON_REDIRECT_URL": 奖品图片
"PRIZE_UNIT": 奖品单位
"PRIZE_LOGO": 奖品LOGO
"PRIZE_DISPLAY_NAME": 奖品展示名称
"PRIZE_HINT_TEXT": 奖品描述
	 */
	@ApiListField("ext_info")
	@ApiField("key_value_map")
	private List<KeyValueMap> extInfo;

	/**
	 * 奖品权益类型
"VOUCHER", "券"
"MEMBER_CARD", "会员卡"
"SALE_GIFT_PACKAGE", "券包"
"SKIN", "皮肤"
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
	 * "PLATFORM","平台",
"ISV", "ISV",
"MERCHANT", "商户",
"PLAN", "新方案",
"PROMOORDER", "权益平台",
"AUTO", "自动"
	 */
	@ApiField("platform_type")
	private String platformType;

	/**
	 * 优惠信息，单位分
	 */
	@ApiField("preferential_money_amount")
	private Long preferentialMoneyAmount;

	/**
	 * 奖品背景图url
	 */
	@ApiField("prize_background_pic_url")
	private String prizeBackgroundPicUrl;

	/**
	 * 奖品展示名称（短）
	 */
	@ApiField("prize_display_name")
	private String prizeDisplayName;

	/**
	 * 奖品图标地址
	 */
	@ApiField("prize_icon")
	private String prizeIcon;

	/**
	 * 奖品权益单品优惠类型
	 */
	@ApiField("prize_item_type")
	private String prizeItemType;

	/**
	 * 品牌Logo图片
	 */
	@ApiField("prize_logo")
	private String prizeLogo;

	/**
	 * 奖品展示名称（长）
	 */
	@ApiField("prize_long_name")
	private String prizeLongName;

	/**
	 * 奖品展示名称（中）
	 */
	@ApiField("prize_medium_name")
	private String prizeMediumName;

	/**
	 * 商家名称
	 */
	@ApiField("prize_merchant_name")
	private String prizeMerchantName;

	/**
	 * 奖品展示名称(短,无金额信息)
	 */
	@ApiField("prize_name_without_amount")
	private String prizeNameWithoutAmount;

	/**
	 * 对奖品的使用规则说明，如使用限制等
	 */
	@ApiField("prize_rule_desc")
	private String prizeRuleDesc;

	/**
	 * 描述奖品的使用说明，如消费满1000元可用
	 */
	@ApiField("prize_usage_desc")
	private String prizeUsageDesc;

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
	 * 无特殊需求用 showAmountText + amountUnitText
表达 减几元、打几折、特价金额 即可
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

	public List<KeyValueMap> getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(List<KeyValueMap> extInfo) {
		this.extInfo = extInfo;
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

	public String getPrizeBackgroundPicUrl() {
		return this.prizeBackgroundPicUrl;
	}
	public void setPrizeBackgroundPicUrl(String prizeBackgroundPicUrl) {
		this.prizeBackgroundPicUrl = prizeBackgroundPicUrl;
	}

	public String getPrizeDisplayName() {
		return this.prizeDisplayName;
	}
	public void setPrizeDisplayName(String prizeDisplayName) {
		this.prizeDisplayName = prizeDisplayName;
	}

	public String getPrizeIcon() {
		return this.prizeIcon;
	}
	public void setPrizeIcon(String prizeIcon) {
		this.prizeIcon = prizeIcon;
	}

	public String getPrizeItemType() {
		return this.prizeItemType;
	}
	public void setPrizeItemType(String prizeItemType) {
		this.prizeItemType = prizeItemType;
	}

	public String getPrizeLogo() {
		return this.prizeLogo;
	}
	public void setPrizeLogo(String prizeLogo) {
		this.prizeLogo = prizeLogo;
	}

	public String getPrizeLongName() {
		return this.prizeLongName;
	}
	public void setPrizeLongName(String prizeLongName) {
		this.prizeLongName = prizeLongName;
	}

	public String getPrizeMediumName() {
		return this.prizeMediumName;
	}
	public void setPrizeMediumName(String prizeMediumName) {
		this.prizeMediumName = prizeMediumName;
	}

	public String getPrizeMerchantName() {
		return this.prizeMerchantName;
	}
	public void setPrizeMerchantName(String prizeMerchantName) {
		this.prizeMerchantName = prizeMerchantName;
	}

	public String getPrizeNameWithoutAmount() {
		return this.prizeNameWithoutAmount;
	}
	public void setPrizeNameWithoutAmount(String prizeNameWithoutAmount) {
		this.prizeNameWithoutAmount = prizeNameWithoutAmount;
	}

	public String getPrizeRuleDesc() {
		return this.prizeRuleDesc;
	}
	public void setPrizeRuleDesc(String prizeRuleDesc) {
		this.prizeRuleDesc = prizeRuleDesc;
	}

	public String getPrizeUsageDesc() {
		return this.prizeUsageDesc;
	}
	public void setPrizeUsageDesc(String prizeUsageDesc) {
		this.prizeUsageDesc = prizeUsageDesc;
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
