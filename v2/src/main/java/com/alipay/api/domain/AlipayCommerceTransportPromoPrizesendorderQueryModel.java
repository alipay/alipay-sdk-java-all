package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询用户发奖记录
 *
 * @author auto create
 * @since 1.0, 2024-09-04 20:45:19
 */
public class AlipayCommerceTransportPromoPrizesendorderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3679929639998263131L;

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
	 * 任务来源
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
