package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 数字员工详情，variables 为该数字人话术中引用的模板变量Code列表
 *
 * @author auto create
 * @since 1.0, 2026-09-10 15:45:06
 */
public class WorkerGetDetailData extends AlipayObject {

	private static final long serialVersionUID = 4228894915994277641L;

	/**
	 * 头像URL
	 */
	@ApiField("avatar_url")
	private String avatarUrl;

	/**
	 * 创建者
	 */
	@ApiField("creator")
	private String creator;

	/**
	 * 描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 是否展示：0-不展示 1-展示，默认1
	 */
	@ApiField("display")
	private Long display;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 修改时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 主键ID
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 更新者
	 */
	@ApiField("modifier")
	private String modifier;

	/**
	 * 名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 是否有效：0-无效 1-有效
	 */
	@ApiField("status")
	private Long status;

	/**
	 * 租户
	 */
	@ApiField("tenant_id")
	private String tenantId;

	/**
	 * 类型，默认aiworker
	 */
	@ApiField("type")
	private String type;

	/**
	 * null
	 */
	@ApiListField("variables")
	@ApiField("string")
	private List<String> variables;

	/**
	 * 版本类型：simple=极致版，空=旧版数据
	 */
	@ApiField("version_type")
	private String versionType;

	/**
	 * 数字人标识
	 */
	@ApiField("worker_code")
	private String workerCode;

	public String getAvatarUrl() {
		return this.avatarUrl;
	}
	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}

	public String getCreator() {
		return this.creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public Long getDisplay() {
		return this.display;
	}
	public void setDisplay(Long display) {
		this.display = display;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getModifier() {
		return this.modifier;
	}
	public void setModifier(String modifier) {
		this.modifier = modifier;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}

	public String getTenantId() {
		return this.tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public List<String> getVariables() {
		return this.variables;
	}
	public void setVariables(List<String> variables) {
		this.variables = variables;
	}

	public String getVersionType() {
		return this.versionType;
	}
	public void setVersionType(String versionType) {
		this.versionType = versionType;
	}

	public String getWorkerCode() {
		return this.workerCode;
	}
	public void setWorkerCode(String workerCode) {
		this.workerCode = workerCode;
	}

}
