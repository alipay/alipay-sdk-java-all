package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 扩展信息
 *
 * @author auto create
 * @since 1.0, 2023-10-10 19:35:26
 */
public class Extension extends AlipayObject {

	private static final long serialVersionUID = 1721813177774789358L;

	/**
	 * 扩展描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 扩展显示名称
	 */
	@ApiField("display_name")
	private String displayName;

	/**
	 * 扩展名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 扩展状态
	 */
	@ApiField("resource")
	private ResourceStatus resource;

	/**
	 * 扩展状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 扩展类型
	 */
	@ApiField("type")
	private String type;

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getDisplayName() {
		return this.displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public ResourceStatus getResource() {
		return this.resource;
	}
	public void setResource(ResourceStatus resource) {
		this.resource = resource;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
