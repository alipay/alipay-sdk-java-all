package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会员积分兑换订单查询
 *
 * @author auto create
 * @since 1.0, 2026-10-22 10:21:41
 */
public class AlipayMarketingPointOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5443837948297767899L;

	/**
	 * 会员卡模板id
	 */
	@ApiField("card_template_id")
	private String cardTemplateId;

	/**
	 * 用户信息
	 */
	@ApiField("card_user_info")
	private CardUserInfo cardUserInfo;

	/**
	 * 支付宝域内兑换订单号
	 */
	@ApiField("exchange_order_id")
	private String exchangeOrderId;

	public String getCardTemplateId() {
		return this.cardTemplateId;
	}
	public void setCardTemplateId(String cardTemplateId) {
		this.cardTemplateId = cardTemplateId;
	}

	public CardUserInfo getCardUserInfo() {
		return this.cardUserInfo;
	}
	public void setCardUserInfo(CardUserInfo cardUserInfo) {
		this.cardUserInfo = cardUserInfo;
	}

	public String getExchangeOrderId() {
		return this.exchangeOrderId;
	}
	public void setExchangeOrderId(String exchangeOrderId) {
		this.exchangeOrderId = exchangeOrderId;
	}

}
