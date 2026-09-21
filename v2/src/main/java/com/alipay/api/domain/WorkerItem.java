package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-09-10 15:45:08
 */
public class WorkerItem extends AlipayObject {

	private static final long serialVersionUID = 6298565774359556433L;

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
	private String display;

	/**
	 * 修改时间
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
	private String id;

	/**
	 * 关联IVR流程code(对应任务 taskIVRCode/transferCode)。部分数字人未配置 chat 模块时该字段为 null
	 */
	@ApiField("ivr_code")
	private String ivrCode;

	/**
	 * 修改人
	 */
	@ApiField("modifier")
	private String modifier;

	/**
	 * 名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 数字员工启用标识：0-已停用 1-启用中
	 */
	@ApiField("status")
	private String status;

	/**
	 * 租户
	 */
	@ApiField("tenant_id")
	private String tenantId;

	/**
	 * 数字员工类型，默认aiworker
	 */
	@ApiField("type")
	private String type;

	/**
	 * 版本类型：simple=极致版，空值=不过滤，synthetical=旧版数据
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

	public String getDisplay() {
		return this.display;
	}
	public void setDisplay(String display) {
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

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getIvrCode() {
		return this.ivrCode;
	}
	public void setIvrCode(String ivrCode) {
		this.ivrCode = ivrCode;
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

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
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
