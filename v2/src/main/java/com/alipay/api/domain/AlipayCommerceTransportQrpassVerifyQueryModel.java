package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 出行同行码校验
 *
 * @author auto create
 * @since 1.0, 2024-05-21 14:00:26
 */
public class AlipayCommerceTransportQrpassVerifyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6567651552478194946L;

	/**
	 * 用户卡号
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 卡类型
	 */
	@ApiField("card_type")
	private String cardType;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getCardNo() {
		return this.cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getCardType() {
		return this.cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
