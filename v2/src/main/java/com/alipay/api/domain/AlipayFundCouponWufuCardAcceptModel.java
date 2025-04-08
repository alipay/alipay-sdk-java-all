package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 五福朋友送出福卡领取
 *
 * @author auto create
 * @since 1.0, 2019-12-28 02:43:45
 */
public class AlipayFundCouponWufuCardAcceptModel extends AlipayObject {

	private static final long serialVersionUID = 7374975112216511142L;

	/**
	 * 福卡ID
	 */
	@ApiField("card_id")
	private String cardId;

	/**
	 * 送卡人uid
	 */
	@ApiField("sender_user_id")
	private String senderUserId;

	/**
	 * 请求来源
	 */
	@ApiField("source")
	private String source;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getCardId() {
		return this.cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public String getSenderUserId() {
		return this.senderUserId;
	}
	public void setSenderUserId(String senderUserId) {
		this.senderUserId = senderUserId;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
