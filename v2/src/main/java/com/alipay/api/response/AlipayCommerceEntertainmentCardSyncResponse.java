package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.entertainment.card.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-14 10:47:04
 */
public class AlipayCommerceEntertainmentCardSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 4354971162476359659L;

	/** 
	 * 支付宝侧会员卡卡号
	 */
	@ApiField("card_id")
	private String cardId;

	/** 
	 * 请求是否幂等。serial_number+biz_date为请求幂等键，biz_date小于等于serial_number对应会员卡在数据库的最新变更时间则请求幂等。
	 */
	@ApiField("idempotent")
	private Boolean idempotent;

	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
	public String getCardId( ) {
		return this.cardId;
	}

	public void setIdempotent(Boolean idempotent) {
		this.idempotent = idempotent;
	}
	public Boolean getIdempotent( ) {
		return this.idempotent;
	}

}
