package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.virtualcard.sign.effect response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayUserVirtualcardSignEffectResponse extends AlipayResponse {

	private static final long serialVersionUID = 7743345295382642993L;

	/** 
	 * 商户定义的卡号，card_type+card_no要控制唯一性
	 */
	@ApiField("card_no")
	private String cardNo;

	/** 
	 * 卡类型，由支付宝指定。目前每个商户都有自己的卡类型，一家商户还可能有多个卡类型
	 */
	@ApiField("card_type")
	private String cardType;

	/** 
	 * 用户签约的支付宝账号对应的支付宝唯一用户号。
以2088开头的16位纯数字组成。
	 */
	@ApiField("user_id")
	private String userId;

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getCardNo( ) {
		return this.cardNo;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public String getCardType( ) {
		return this.cardType;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
