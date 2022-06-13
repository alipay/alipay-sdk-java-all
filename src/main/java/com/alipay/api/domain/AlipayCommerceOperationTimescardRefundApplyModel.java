package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 次卡退卡申请
 *
 * @author auto create
 * @since 1.0, 2022-04-21 16:34:45
 */
public class AlipayCommerceOperationTimescardRefundApplyModel extends AlipayObject {

	private static final long serialVersionUID = 5522339986786786247L;

	/**
	 * 次卡id
	 */
	@ApiField("card_id")
	private String cardId;

	/**
	 * 场景码
	 */
	@ApiField("scene_code")
	private String sceneCode;

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

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
