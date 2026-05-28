package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.lifeservice.redemption.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-27 13:47:47
 */
public class AlipayCommerceLifeserviceRedemptionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6444698331915684471L;

	/** 
	 * 售卖订单id
	 */
	@ApiField("card_id")
	private String cardId;

	/** 
	 * 商品id，也就是card_template_id
	 */
	@ApiField("item_id")
	private String itemId;

	/** 
	 * 支付宝openid
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
	public String getCardId( ) {
		return this.cardId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getItemId( ) {
		return this.itemId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
