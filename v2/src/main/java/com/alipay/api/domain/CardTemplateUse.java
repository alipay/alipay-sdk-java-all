package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品使用信息
 *
 * @author auto create
 * @since 1.0, 2024-04-18 18:01:18
 */
public class CardTemplateUse extends AlipayObject {

	private static final long serialVersionUID = 8197213452996653985L;

	/**
	 * 周期付需要配置周期信息
	 */
	@ApiField("cycle_info")
	private CardCycle cycleInfo;

	/**
	 * 周期付可以配置用户退订购单规则，次卡不需要传该参数
	 */
	@ApiField("discount_recover_rule_info")
	private CardDiscountRecoverRule discountRecoverRuleInfo;

	/**
	 * 有效期，天。周期付可不传
	 */
	@ApiField("expire_period")
	private Long expirePeriod;

	/**
	 * 每期价格
	 */
	@ApiListField("period_price_list")
	@ApiField("card_period_price")
	private List<CardPeriodPrice> periodPriceList;

	/**
	 * 可用次数或期数
	 */
	@ApiField("usable_count")
	private Long usableCount;

	/**
	 * 传入指定商品的可用门店ID，不传代表所有门店可用
	 */
	@ApiListField("usable_shop_list")
	@ApiField("string")
	private List<String> usableShopList;

	/**
	 * 使用说明
	 */
	@ApiField("use_instruction")
	private String useInstruction;

	public CardCycle getCycleInfo() {
		return this.cycleInfo;
	}
	public void setCycleInfo(CardCycle cycleInfo) {
		this.cycleInfo = cycleInfo;
	}

	public CardDiscountRecoverRule getDiscountRecoverRuleInfo() {
		return this.discountRecoverRuleInfo;
	}
	public void setDiscountRecoverRuleInfo(CardDiscountRecoverRule discountRecoverRuleInfo) {
		this.discountRecoverRuleInfo = discountRecoverRuleInfo;
	}

	public Long getExpirePeriod() {
		return this.expirePeriod;
	}
	public void setExpirePeriod(Long expirePeriod) {
		this.expirePeriod = expirePeriod;
	}

	public List<CardPeriodPrice> getPeriodPriceList() {
		return this.periodPriceList;
	}
	public void setPeriodPriceList(List<CardPeriodPrice> periodPriceList) {
		this.periodPriceList = periodPriceList;
	}

	public Long getUsableCount() {
		return this.usableCount;
	}
	public void setUsableCount(Long usableCount) {
		this.usableCount = usableCount;
	}

	public List<String> getUsableShopList() {
		return this.usableShopList;
	}
	public void setUsableShopList(List<String> usableShopList) {
		this.usableShopList = usableShopList;
	}

	public String getUseInstruction() {
		return this.useInstruction;
	}
	public void setUseInstruction(String useInstruction) {
		this.useInstruction = useInstruction;
	}

}
