package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卡订单关闭
 *
 * @author auto create
 * @since 1.0, 2023-11-21 09:40:18
 */
public class AlipayCommerceCardOrderCloseModel extends AlipayObject {

	private static final long serialVersionUID = 6229464268994499798L;

	/**
	 * 卡ID
	 */
	@ApiField("card_id")
	private String cardId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 用户openId
	 */
	@ApiField("user_id_open_id")
	private String userIdOpenId;

	public String getCardId() {
		return this.cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserIdOpenId() {
		return this.userIdOpenId;
	}
	public void setUserIdOpenId(String userIdOpenId) {
		this.userIdOpenId = userIdOpenId;
	}

}
