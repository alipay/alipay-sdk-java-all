package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品免审快速修改
 *
 * @author auto create
 * @since 1.0, 2025-04-30 12:13:18
 */
public class AlipayCommerceMerchantcardTemplatequickModifyModel extends AlipayObject {

	private static final long serialVersionUID = 7843831518239716791L;

	/**
	 * 卡id
	 */
	@ApiField("card_template_id")
	private String cardTemplateId;

	/**
	 * 线上售卖开关，可选。传入01表示将卡推广至线上售卖。传入02标识关闭线上售卖。
	 */
	@ApiField("online_sale_switch")
	private String onlineSaleSwitch;

	/**
	 * 售卖信息
	 */
	@ApiField("sale_info")
	private CardTemplateSale saleInfo;

	/**
	 * 新的库存数量，单位个
	 */
	@ApiField("saleable_count")
	private Long saleableCount;

	public String getCardTemplateId() {
		return this.cardTemplateId;
	}
	public void setCardTemplateId(String cardTemplateId) {
		this.cardTemplateId = cardTemplateId;
	}

	public String getOnlineSaleSwitch() {
		return this.onlineSaleSwitch;
	}
	public void setOnlineSaleSwitch(String onlineSaleSwitch) {
		this.onlineSaleSwitch = onlineSaleSwitch;
	}

	public CardTemplateSale getSaleInfo() {
		return this.saleInfo;
	}
	public void setSaleInfo(CardTemplateSale saleInfo) {
		this.saleInfo = saleInfo;
	}

	public Long getSaleableCount() {
		return this.saleableCount;
	}
	public void setSaleableCount(Long saleableCount) {
		this.saleableCount = saleableCount;
	}

}
