package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建待办任务
 *
 * @author auto create
 * @since 1.0, 2023-09-18 22:07:14
 */
public class AlipayBossBaseAnttaskTaskCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3796166769211264185L;

	/**
	 * 接入时的systemType
	 */
	@ApiField("auth_key")
	private String authKey;

	/**
	 * 时间戳，到期时间
	 */
	@ApiField("date_time")
	private String dateTime;

	/**
	 * 签名信息，不在此展示
	 */
	@ApiField("signature")
	private String signature;

	/**
	 * 任务实体类
	 */
	@ApiField("task")
	private AntTask task;

	public String getAuthKey() {
		return this.authKey;
	}
	public void setAuthKey(String authKey) {
		this.authKey = authKey;
	}

	public String getDateTime() {
		return this.dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public String getSignature() {
		return this.signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}

	public AntTask getTask() {
		return this.task;
	}
	public void setTask(AntTask task) {
		this.task = task;
	}

}
