package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 冲鸭用户行为上报
 *
 * @author auto create
 * @since 1.0, 2025-07-15 10:32:32
 */
public class AlipayCommerceAcommunicationChongyaUserNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 3625571356992957119L;

	/**
	 * action用户行为：POINTS_AVAILABLE；POINTS_ CLAIMED
	 */
	@ApiField("action")
	private String action;

	/**
	 * openId，支付宝用户openID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 用户动作对应的参数
	 */
	@ApiField("params")
	private String params;

	/**
	 * userId，支付宝用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getParams() {
		return this.params;
	}
	public void setParams(String params) {
		this.params = params;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
