package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 次卡实例详情查询
 *
 * @author auto create
 * @since 1.0, 2022-09-27 17:26:38
 */
public class AlipayCommerceOperationTimescardInstanceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6426874734854831586L;

	/**
	 * 卡实例ID
	 */
	@ApiField("card_id")
	private String cardId;

	/**
	 * 字段已废弃，无需传参
	 */
	@ApiField("isv_partner_id")
	private String isvPartnerId;

	/**
	 * 字段已废弃，无需传参
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 场景码
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

	public String getIsvPartnerId() {
		return this.isvPartnerId;
	}
	public void setIsvPartnerId(String isvPartnerId) {
		this.isvPartnerId = isvPartnerId;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
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
