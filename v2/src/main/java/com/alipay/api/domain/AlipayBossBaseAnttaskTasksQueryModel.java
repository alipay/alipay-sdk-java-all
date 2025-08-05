package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询任务
 *
 * @author auto create
 * @since 1.0, 2023-09-18 22:06:14
 */
public class AlipayBossBaseAnttaskTasksQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7669478674147576215L;

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
	 * 查询参数
	 */
	@ApiField("query")
	private TaskQuery query;

	/**
	 * 签名信息，不在此展示
	 */
	@ApiField("signature")
	private String signature;

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

	public TaskQuery getQuery() {
		return this.query;
	}
	public void setQuery(TaskQuery query) {
		this.query = query;
	}

	public String getSignature() {
		return this.signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}

}
