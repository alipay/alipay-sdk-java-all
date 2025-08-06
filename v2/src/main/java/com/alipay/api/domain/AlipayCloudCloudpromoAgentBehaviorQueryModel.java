package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户偏好信息查询
 *
 * @author auto create
 * @since 1.0, 2024-08-19 10:59:48
 */
public class AlipayCloudCloudpromoAgentBehaviorQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8371559324733782794L;

	/**
	 * 商户自定义的用户Id。
	 */
	@ApiField("custom_id")
	private String customId;

	/**
	 * 智能体实例id
	 */
	@ApiField("instance_id")
	private String instanceId;

	public String getCustomId() {
		return this.customId;
	}
	public void setCustomId(String customId) {
		this.customId = customId;
	}

	public String getInstanceId() {
		return this.instanceId;
	}
	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

}
