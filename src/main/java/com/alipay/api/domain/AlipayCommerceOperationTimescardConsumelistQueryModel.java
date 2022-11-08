package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 次卡消费记录查询
 *
 * @author auto create
 * @since 1.0, 2022-09-27 17:31:18
 */
public class AlipayCommerceOperationTimescardConsumelistQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2314858435472414845L;

	/**
	 * 次卡id
	 */
	@ApiField("card_id")
	private String cardId;

	/**
	 * 场景
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 用户ID
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
