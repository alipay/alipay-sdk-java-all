package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 设置卡自定义价格
 *
 * @author auto create
 * @since 1.0, 2024-08-12 11:29:19
 */
public class AlipayCommerceMerchantcardPricepropertyCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6373827144322123322L;

	/**
	 * 卡ID
	 */
	@ApiField("card_template_id")
	private String cardTemplateId;

	/**
	 * 每期价格
	 */
	@ApiListField("period_price_list")
	@ApiField("card_period_price")
	private List<CardPeriodPrice> periodPriceList;

	public String getCardTemplateId() {
		return this.cardTemplateId;
	}
	public void setCardTemplateId(String cardTemplateId) {
		this.cardTemplateId = cardTemplateId;
	}

	public List<CardPeriodPrice> getPeriodPriceList() {
		return this.periodPriceList;
	}
	public void setPeriodPriceList(List<CardPeriodPrice> periodPriceList) {
		this.periodPriceList = periodPriceList;
	}

}
