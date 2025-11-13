package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户报名添首活动
 *
 * @author auto create
 * @since 1.0, 2024-09-04 19:39:16
 */
public class AlipayCommerceTransportPromoTasksignupTriggerModel extends AlipayObject {

	private static final long serialVersionUID = 4839373132955532654L;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 任务场景
	 */
	@ApiField("task_scene")
	private String taskScene;

	/**
	 * 定义查询任务来源
	 */
	@ApiField("task_source")
	private String taskSource;

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

	public String getTaskScene() {
		return this.taskScene;
	}
	public void setTaskScene(String taskScene) {
		this.taskScene = taskScene;
	}

	public String getTaskSource() {
		return this.taskSource;
	}
	public void setTaskSource(String taskSource) {
		this.taskSource = taskSource;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
