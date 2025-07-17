package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 单个回档任务查询
 *
 * @author auto create
 * @since 1.0, 2024-03-13 16:51:12
 */
public class AlipayCloudCloudbaseDatabaseRollbacktaskGetModel extends AlipayObject {

	private static final long serialVersionUID = 5485193211754254662L;

	/**
	 * 小程序id
	 */
	@ApiField("biz_app_id")
	private String bizAppId;

	/**
	 * 环境id
	 */
	@ApiField("biz_env_id")
	private String bizEnvId;

	/**
	 * 回档任务id
	 */
	@ApiField("history_id")
	private String historyId;

	public String getBizAppId() {
		return this.bizAppId;
	}
	public void setBizAppId(String bizAppId) {
		this.bizAppId = bizAppId;
	}

	public String getBizEnvId() {
		return this.bizEnvId;
	}
	public void setBizEnvId(String bizEnvId) {
		this.bizEnvId = bizEnvId;
	}

	public String getHistoryId() {
		return this.historyId;
	}
	public void setHistoryId(String historyId) {
		this.historyId = historyId;
	}

}
