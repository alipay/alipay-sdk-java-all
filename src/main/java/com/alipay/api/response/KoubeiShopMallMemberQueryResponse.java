package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.shop.mall.member.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiShopMallMemberQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6322591178336744488L;

	/** 
	 * 会员等级
	 */
	@ApiField("card_level")
	private String cardLevel;

	/** 
	 * 会员卡名称
	 */
	@ApiField("card_name")
	private String cardName;

	/** 
	 * 会员积分
	 */
	@ApiField("card_point")
	private String cardPoint;

	/** 
	 * 用户是否开通会员卡
	 */
	@ApiField("has_card")
	private Boolean hasCard;

	/** 
	 * 用户是否授权过商圈交易
	 */
	@ApiField("trade_authed")
	private Boolean tradeAuthed;

	public void setCardLevel(String cardLevel) {
		this.cardLevel = cardLevel;
	}
	public String getCardLevel( ) {
		return this.cardLevel;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public String getCardName( ) {
		return this.cardName;
	}

	public void setCardPoint(String cardPoint) {
		this.cardPoint = cardPoint;
	}
	public String getCardPoint( ) {
		return this.cardPoint;
	}

	public void setHasCard(Boolean hasCard) {
		this.hasCard = hasCard;
	}
	public Boolean getHasCard( ) {
		return this.hasCard;
	}

	public void setTradeAuthed(Boolean tradeAuthed) {
		this.tradeAuthed = tradeAuthed;
	}
	public Boolean getTradeAuthed( ) {
		return this.tradeAuthed;
	}

}
