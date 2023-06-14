package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 同步云环境中接口的权限列表
 *
 * @author auto create
 * @since 1.0, 2023-04-06 16:51:51
 */
public class AlipayOpenCloudAppPermissionSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3769384438183656472L;

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

	/**
	 * 接口权限列表
	 */
	@ApiListField("permission_api_list")
	@ApiField("string")
	private List<String> permissionApiList;

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

	public List<String> getPermissionApiList() {
		return this.permissionApiList;
	}
	public void setPermissionApiList(List<String> permissionApiList) {
		this.permissionApiList = permissionApiList;
	}

}
