package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.shop.mall.member.identify response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 20:01:28
 */
public class KoubeiShopMallMemberIdentifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8357185172649226931L;

	/** 
	 * 会员卡编号
	 */
	@ApiField("card_no")
	private String cardNo;

	/** 
	 * 用户是否开通会员卡
	 */
	@ApiField("has_card")
	private Boolean hasCard;

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getCardNo( ) {
		return this.cardNo;
	}

	public void setHasCard(Boolean hasCard) {
		this.hasCard = hasCard;
	}
	public Boolean getHasCard( ) {
		return this.hasCard;
	}

}
