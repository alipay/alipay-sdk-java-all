package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 推送淘宝营销人群
 *
 * @author auto create
 * @since 1.0, 2025-04-10 15:22:59
 */
public class AlipayTradeCrowdConsultModel extends AlipayObject {

	private static final long serialVersionUID = 4327933755799945535L;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 表明这笔请求的场景，目前只支持aacProspectMarketing一个值，表示该场景为AAC潜客营销场景
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
