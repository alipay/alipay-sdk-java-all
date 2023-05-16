package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询云环境中应用权限列表
 *
 * @author auto create
 * @since 1.0, 2023-04-06 11:10:37
 */
public class AlipayOpenCloudAppPermissionQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3852753462916123459L;

	/**
	 * 云id
	 */
	@ApiField("cloud_id")
	private String cloudId;

	/**
	 * 环境id
	 */
	@ApiField("env_id")
	private String envId;

	/**
	 * 调用应用id
	 */
	@ApiField("invoke_app_id")
	private String invokeAppId;

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
