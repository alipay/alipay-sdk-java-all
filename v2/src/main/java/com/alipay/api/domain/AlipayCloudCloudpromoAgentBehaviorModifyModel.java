package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户偏好信息修改
 *
 * @author auto create
 * @since 1.0, 2024-08-19 11:00:03
 */
public class AlipayCloudCloudpromoAgentBehaviorModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3495455346215927743L;

	/**
	 * 用户偏好信息
	 */
	@ApiField("behavior")
	private String behavior;

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

	public String getBehavior() {
		return this.behavior;
	}
	public void setBehavior(String behavior) {
		this.behavior = behavior;
	}

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
