package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序云云托管环境认证申请
 *
 * @author auto create
 * @since 1.0, 2025-04-14 11:17:27
 */
public class AlipayCloudCloudrunCallcontainerSessionApplyModel extends AlipayObject {

	private static final long serialVersionUID = 6336428642883338618L;

	/**
	 * 用户id
	 */
	@ApiField("custom_id")
	private String customId;

	/**
	 * 环境ID，指的是小程序云环境的ID，包含云开发、云托管环境
	 */
	@ApiField("env_id")
	private String envId;

	/**
	 * 宿主AppId，非插件业务可以传递小程序AppId
	 */
	@ApiField("parent_app_id")
	private String parentAppId;

	/**
	 * 指定env对应的AppId 可空
	 */
	@ApiField("sp_app_id")
	private String spAppId;

	public String getCustomId() {
		return this.customId;
	}
	public void setCustomId(String customId) {
		this.customId = customId;
	}

	public String getEnvId() {
		return this.envId;
	}
	public void setEnvId(String envId) {
		this.envId = envId;
	}

	public String getParentAppId() {
		return this.parentAppId;
	}
	public void setParentAppId(String parentAppId) {
		this.parentAppId = parentAppId;
	}

	public String getSpAppId() {
		return this.spAppId;
	}
	public void setSpAppId(String spAppId) {
		this.spAppId = spAppId;
	}

}
