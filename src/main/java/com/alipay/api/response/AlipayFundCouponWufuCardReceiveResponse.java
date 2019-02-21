package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.coupon.wufu.card.receive response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayFundCouponWufuCardReceiveResponse extends AlipayResponse {

	private static final long serialVersionUID = 4111658124553454668L;

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

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public String getCardType( ) {
		return this.cardType;
	}

}
