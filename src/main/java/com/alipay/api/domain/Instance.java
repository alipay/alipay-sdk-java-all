package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租户实例（数据权限）。一个租户下可以有多个租户实例，每个租户实例之间的业务数据是相互隔离的，通过open api只能获取单一租户实例的数据。
 *
 * @author auto create
 * @since 1.0, 2020-11-26 15:25:36
 */
public class Instance extends AlipayObject {

	private static final long serialVersionUID = 1438952326771428698L;

	/**
	 * ?创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 创建人id
	 */
	@ApiField("creator_id")
	private String creatorId;

	/**
	 * 部门描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 外部id
	 */
	@ApiField("external_id")
	private String externalId;

	/**
	 * 部门id（即租户实例ID、数据权限ID）
	 */
	@ApiField("id")
	private String id;

	/**
	 * 租户实例（数据权限）名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 租户实例（数据权限）状态，所有可能的状态如下：INIT（初始化）、STARTED（准备完成）、START_FAILED（准备失败）、STOPPING（停用中）、STOPPED（已停用）、RELEASING（释放中）、RELEASED（已释放）、RESUMING（重新启动）、MODIFING（修改规格中）、DELETED（已删除）。
	 */
	@ApiField("status")
	private String status;

	/**
	 * 最后修改时间
	 */
	@ApiField("update_time")
	private Date updateTime;

	/**
	 * 最后修改人id
	 */
	@ApiField("updater_id")
	private String updaterId;

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

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

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public Date getUpdateTime() {
		return this.updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getUpdaterId() {
		return this.updaterId;
	}
	public void setUpdaterId(String updaterId) {
		this.updaterId = updaterId;
	}

}
