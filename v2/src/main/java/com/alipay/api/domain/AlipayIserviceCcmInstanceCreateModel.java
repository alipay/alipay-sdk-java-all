package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建租户实例
 *
 * @author auto create
 * @since 1.0, 2023-08-21 14:52:25
 */
public class AlipayIserviceCcmInstanceCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8333526919815744845L;

	/**
	 * 创建人id
	 */
	@ApiField("creator_id")
	private String creatorId;

	/**
	 * 租户实例（数据权限）描述信息
	 */
	@ApiField("description")
	private String description;

	/**
	 * 外部id
	 */
	@ApiField("external_id")
	private String externalId;

	/**
	 * 租户实例（数据权限）名称，如果名称已经存在，将创建失败
	 */
	@ApiField("name")
	private String name;

	public String getCreatorId() {
		return this.creatorId;
	}
	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getExternalId() {
		return this.externalId;
	}
	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
