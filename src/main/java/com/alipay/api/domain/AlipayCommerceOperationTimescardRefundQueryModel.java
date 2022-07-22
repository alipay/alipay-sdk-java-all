package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询可退余额
 *
 * @author auto create
 * @since 1.0, 2022-04-21 16:34:28
 */
public class AlipayCommerceOperationTimescardRefundQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1339529481739188576L;

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
