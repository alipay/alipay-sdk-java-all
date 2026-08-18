package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 普通日历价配置，至少包含一条星期固定价或日期固定价。
 *
 * @author auto create
 * @since 1.0, 2026-07-31 11:12:49
 */
public class MerchantCardTemplateCalendarPrice extends AlipayObject {

	private static final long serialVersionUID = 6585167533499169642L;

	/**
	 * null
	 */
	@ApiListField("date_price_list")
	@ApiField("merchant_card_template_price_date_rule")
	private List<MerchantCardTemplatePriceDateRule> datePriceList;

	/**
	 * null
	 */
	@ApiListField("week_price_list")
	@ApiField("merchant_card_template_price_week_rule")
	private List<MerchantCardTemplatePriceWeekRule> weekPriceList;

	public List<MerchantCardTemplatePriceDateRule> getDatePriceList() {
		return this.datePriceList;
	}
	public void setDatePriceList(List<MerchantCardTemplatePriceDateRule> datePriceList) {
		this.datePriceList = datePriceList;
	}

	public List<MerchantCardTemplatePriceWeekRule> getWeekPriceList() {
		return this.weekPriceList;
	}
	public void setWeekPriceList(List<MerchantCardTemplatePriceWeekRule> weekPriceList) {
		this.weekPriceList = weekPriceList;
	}

}
