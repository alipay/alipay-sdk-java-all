package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 执行云函数
 *
 * @author auto create
 * @since 1.0, 2023-08-22 15:41:18
 */
public class AlipayCloudCloudbaseFunctionApplyModel extends AlipayObject {

	private static final long serialVersionUID = 3617147872554117738L;

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
	 * 云函数名称
	 */
	@ApiField("function_name")
	private String functionName;

	/**
	 * 执行云函数的参数内容，根据函数实际需要填写参数
	 */
	@ApiField("params")
	private String params;

	/**
	 * 快照名称
	 */
	@ApiField("snapshot_name")
	private String snapshotName;

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

	public String getFunctionName() {
		return this.functionName;
	}
	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}

	public String getParams() {
		return this.params;
	}
	public void setParams(String params) {
		this.params = params;
	}

	public String getSnapshotName() {
		return this.snapshotName;
	}
	public void setSnapshotName(String snapshotName) {
		this.snapshotName = snapshotName;
	}

}
