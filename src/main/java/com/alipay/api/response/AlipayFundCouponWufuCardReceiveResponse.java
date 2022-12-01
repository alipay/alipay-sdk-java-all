package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.coupon.wufu.card.receive response.
 * 
 * @author auto create
 * @since 1.0, 2019-12-20 16:18:21
 */
public class AlipayFundCouponWufuCardReceiveResponse extends AlipayResponse {

	private static final long serialVersionUID = 4633171294175361668L;

	/** 
	 * 福卡id，全局唯一
	 */
	@ApiField("card_id")
	private String cardId;

	/** 
	 * 福卡类型:
1001=敬业福
1002=爱国福
1003=富强福
1004=和谐福
1005=友善福
	 */
	@ApiField("card_type")
	private String cardType;

	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
	public String getCardId( ) {
		return this.cardId;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public String getCardType( ) {
		return this.cardType;
	}

}
