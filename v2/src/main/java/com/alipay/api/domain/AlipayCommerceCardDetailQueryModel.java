package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卡详情查询
 *
 * @author auto create
 * @since 1.0, 2023-10-30 13:36:44
 */
public class AlipayCommerceCardDetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2123372114751921294L;

	/**
	 * 卡id
	 */
	@ApiField("card_id")
	private String cardId;

	/**
	 * 用户id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getCardId() {
		return this.cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
