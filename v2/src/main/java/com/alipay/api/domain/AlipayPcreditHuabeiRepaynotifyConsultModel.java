package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * AIFORCE平台拨打前咨询
 *
 * @author auto create
 * @since 1.0, 2025-11-05 09:23:55
 */
public class AlipayPcreditHuabeiRepaynotifyConsultModel extends AlipayObject {

	private static final long serialVersionUID = 8661583338155342338L;

	/**
	 * Y表示重试，N表示首次进入
	 */
	@ApiField("notify_retry")
	private String notifyRetry;

	/**
	 * 场景值
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("user_open_id")
	private String userOpenId;

	public String getNotifyRetry() {
		return this.notifyRetry;
	}
	public void setNotifyRetry(String notifyRetry) {
		this.notifyRetry = notifyRetry;
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

	public String getUserOpenId() {
		return this.userOpenId;
	}
	public void setUserOpenId(String userOpenId) {
		this.userOpenId = userOpenId;
	}

}
