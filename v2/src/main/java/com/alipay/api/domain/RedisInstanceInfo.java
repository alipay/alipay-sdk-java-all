package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 实例列表
 *
 * @author auto create
 * @since 1.0, 2023-10-16 13:41:11
 */
public class RedisInstanceInfo extends AlipayObject {

	private static final long serialVersionUID = 3414382731933419811L;

	/**
	 * Redis实例ID
	 */
	@ApiField("instance_id")
	private String instanceId;

	/**
	 * Redis实例名称
	 */
	@ApiField("instance_name")
	private String instanceName;

	public String getInstanceId() {
		return this.instanceId;
	}
	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public String getInstanceName() {
		return this.instanceName;
	}
	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
	}

}
