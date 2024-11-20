package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 卡使用信息
 *
 * @author auto create
 * @since 1.0, 2024-11-13 14:18:56
 */
public class CardTemplateUse extends AlipayObject {

	private static final long serialVersionUID = 6162452358859587936L;

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
	 * 周期付场景下预约链接，填写小程序地址。当card_type= PERIOD_PAY时生效。
	 */
	@ApiField("reservation_url")
	private String reservationUrl;

	/**
	 * 周期卡是否全部门店
	 */
	@ApiField("show_shop")
	private String showShop;

	/**
	 * 可用次数或期数
	 */
	@ApiField("usable_count")
	private Long usableCount;

	/**
	 * 传入指定卡的可用门店ID
	 */
	@ApiListField("usable_shop_list")
	@ApiField("string")
	private List<String> usableShopList;

	/**
	 * 使用说明
	 */
	@ApiField("use_instruction")
	private String useInstruction;

	/**
	 * 用户可选的使用方式。当card_type= TIMES_CARD时生效。不传默认为到店亮码使用。
	 */
	@ApiListField("use_method")
	@ApiField("card_use_method_info")
	private List<CardUseMethodInfo> useMethod;

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

	public String getReservationUrl() {
		return this.reservationUrl;
	}
	public void setReservationUrl(String reservationUrl) {
		this.reservationUrl = reservationUrl;
	}

	public String getShowShop() {
		return this.showShop;
	}
	public void setShowShop(String showShop) {
		this.showShop = showShop;
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

	public List<CardUseMethodInfo> getUseMethod() {
		return this.useMethod;
	}
	public void setUseMethod(List<CardUseMethodInfo> useMethod) {
		this.useMethod = useMethod;
	}

}
