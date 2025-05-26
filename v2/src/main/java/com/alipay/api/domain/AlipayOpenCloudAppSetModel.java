package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序云应用关联信息配置
 *
 * @author auto create
 * @since 1.0, 2023-04-06 16:50:40
 */
public class AlipayOpenCloudAppSetModel extends AlipayObject {

	private static final long serialVersionUID = 7818162865899711754L;

	/**
	 * 环境调用状态
	 */
	@ApiField("cloud_call_status")
	private String cloudCallStatus;

	/**
	 * 云id
	 */
	@ApiField("cloud_id")
	private String cloudId;

	/**
	 * 云环境id
	 */
	@ApiField("env_id")
	private String envId;

	/**
	 * 云环境中调用的应用ID
	 */
	@ApiField("invoke_app_id")
	private String invokeAppId;

	public String getCloudCallStatus() {
		return this.cloudCallStatus;
	}
	public void setCloudCallStatus(String cloudCallStatus) {
		this.cloudCallStatus = cloudCallStatus;
	}

	public String getCloudId() {
		return this.cloudId;
	}
	public void setCloudId(String cloudId) {
		this.cloudId = cloudId;
	}

	public String getEnvId() {
		return this.envId;
	}
	public void setEnvId(String envId) {
		this.envId = envId;
	}

	public String getInvokeAppId() {
		return this.invokeAppId;
	}
	public void setInvokeAppId(String invokeAppId) {
		this.invokeAppId = invokeAppId;
	}

}
