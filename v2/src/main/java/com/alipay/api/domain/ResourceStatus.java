package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 扩展状态信息
 *
 * @author auto create
 * @since 1.0, 2023-09-12 11:21:14
 */
public class ResourceStatus extends AlipayObject {

	private static final long serialVersionUID = 3846654389621924198L;

	/**
	 * 资源实例ID
	 */
	@ApiField("resource_id")
	private String resourceId;

	/**
	 * 资源状态
 - OPENING
 - STARTED
 - STOPPED
 - RELEASE
 - OPENING_FAIL 当前字段已废弃(使用status替代)
	 */
	@ApiField("resource_status")
	@Deprecated
	private String resourceStatus;

	/**
	 * 资源类型
	 */
	@ApiField("resource_type")
	private String resourceType;

	/**
	 * 资源实例id 当前字段已废弃(由字段resource_id替代)
	 */
	@ApiField("spec_instance_id")
	@Deprecated
	private String specInstanceId;

	/**
	 * 资源状态
 - OPENING
 - STARTED
 - STOPPED
 - RELEASE
 - OPENING_FAIL
	 */
	@ApiField("status")
	private String status;

	public String getResourceId() {
		return this.resourceId;
	}
	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

	public String getResourceStatus() {
		return this.resourceStatus;
	}
	public void setResourceStatus(String resourceStatus) {
		this.resourceStatus = resourceStatus;
	}

	public String getResourceType() {
		return this.resourceType;
	}
	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}

	public String getSpecInstanceId() {
		return this.specInstanceId;
	}
	public void setSpecInstanceId(String specInstanceId) {
		this.specInstanceId = specInstanceId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
