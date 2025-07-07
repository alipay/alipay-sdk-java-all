package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 卡模版使用信息
 *
 * @author auto create
 * @since 1.0, 2024-02-27 17:15:50
 */
public class CardTemplateUseInfo extends AlipayObject {

	private static final long serialVersionUID = 4637436763869492226L;

	/**
	 * 周期信息
	 */
	@ApiField("cycle_info")
	private CardCycleInfo cycleInfo;

	/**
	 * 优惠追回规则
	 */
	@ApiField("discount_recover_rule_info")
	private CardDiscountRecoverRuleInfo discountRecoverRuleInfo;

	/**
	 * 有效期
	 */
	@ApiField("expire_period")
	private Long expirePeriod;

	/**
	 * 卡阶梯价格信息
	 */
	@ApiListField("period_price_list")
	@ApiField("card_period_price_info")
	private List<CardPeriodPriceInfo> periodPriceList;

	/**
	 * 卡可使用次数
	 */
	@ApiField("usable_count")
	private Long usableCount;

	/**
	 * 可使用门店列表
	 */
	@ApiListField("usable_shop_list")
	@ApiField("card_usable_shop_info")
	private List<CardUsableShopInfo> usableShopList;

	/**
	 * 使用规则说明
	 */
	@ApiField("use_instruction")
	private String useInstruction;

	public CardCycleInfo getCycleInfo() {
		return this.cycleInfo;
	}
	public void setCycleInfo(CardCycleInfo cycleInfo) {
		this.cycleInfo = cycleInfo;
	}

	public CardDiscountRecoverRuleInfo getDiscountRecoverRuleInfo() {
		return this.discountRecoverRuleInfo;
	}
	public void setDiscountRecoverRuleInfo(CardDiscountRecoverRuleInfo discountRecoverRuleInfo) {
		this.discountRecoverRuleInfo = discountRecoverRuleInfo;
	}

	public Long getExpirePeriod() {
		return this.expirePeriod;
	}
	public void setExpirePeriod(Long expirePeriod) {
		this.expirePeriod = expirePeriod;
	}

	public List<CardPeriodPriceInfo> getPeriodPriceList() {
		return this.periodPriceList;
	}
	public void setPeriodPriceList(List<CardPeriodPriceInfo> periodPriceList) {
		this.periodPriceList = periodPriceList;
	}

	public Long getUsableCount() {
		return this.usableCount;
	}
	public void setUsableCount(Long usableCount) {
		this.usableCount = usableCount;
	}

	public List<CardUsableShopInfo> getUsableShopList() {
		return this.usableShopList;
	}
	public void setUsableShopList(List<CardUsableShopInfo> usableShopList) {
		this.usableShopList = usableShopList;
	}

	public String getUseInstruction() {
		return this.useInstruction;
	}
	public void setUseInstruction(String useInstruction) {
		this.useInstruction = useInstruction;
	}

}
