package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗行业查询会员受益人列表
 *
 * @author auto create
 * @since 1.0, 2025-11-06 14:01:06
 */
public class AlipayCommerceMedicalCommercialArchiveQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3347867572497867244L;

	/**
	 * 会员卡id
	 */
	@ApiField("card_id")
	private String cardId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 支付宝用户的userId。
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
