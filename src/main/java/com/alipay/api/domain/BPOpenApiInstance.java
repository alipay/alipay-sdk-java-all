package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 流程实例
 *
 * @author auto create
 * @since 1.0, 2017-09-19 20:54:27
 */
public class BPOpenApiInstance extends AlipayObject {

	private static final long serialVersionUID = 6444235642188229837L;

	/**
	 * 业务上下文，JSON格式
	 */
	@ApiField("biz_context")
	private String bizContext;

	/**
	 * 业务ID
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 创建人域账号
	 */
	@ApiField("create_user")
	private String createUser;

	/**
	 * 流程实例描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 创建到完成的毫秒数，未完结为0
	 */
	@ApiField("duration")
	private Long duration;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 完结时间,未完结时为空
	 */
	@ApiField("gmt_end")
	private Date gmtEnd;

	/**
	 * 最后更新时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 2088账号
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 最后更新人域账号
	 */
	@ApiField("modify_user")
	private String modifyUser;

	/**
	 * 流程配置名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 父流程实例ID。用于描述父子流程
	 */
	@ApiField("parent_id")
	private String parentId;

	/**
	 * 父流程实例所处的节点
	 */
	@ApiField("parent_node")
	private String parentNode;

	/**
	 * 优先级
	 */
	@ApiField("priority")
	private Long priority;

	/**
	 * 全局唯一ID
	 */
	@ApiField("puid")
	private String puid;

	/**
	 * 前置流程ID。用于描述流程串联
	 */
	@ApiField("source_id")
	private String sourceId;

	/**
	 * 前置流程从哪个节点发起的本流程
	 */
	@ApiField("source_node_name")
	private String sourceNodeName;

	/**
	 * 流程实例状态:CREATED,PROCESSING,COMPLETED,CANCELED
	 */
	@ApiField("state")
	private String state;

	/**
	 * 包含的任务列表
	 */
	@ApiListField("tasks")
	@ApiField("b_p_open_api_task")
	private List<BPOpenApiTask> tasks;

	public String getBizContext() {
		return this.bizContext;
	}
	public void setBizContext(String bizContext) {
		this.bizContext = bizContext;
	}

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getCreateUser() {
		return this.createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public Long getDuration() {
		return this.duration;
	}
	public void setDuration(Long duration) {
		this.duration = duration;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtEnd() {
		return this.gmtEnd;
	}
	public void setGmtEnd(Date gmtEnd) {
		this.gmtEnd = gmtEnd;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getIpRoleId() {
		return this.ipRoleId;
	}
	public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}

	public String getModifyUser() {
		return this.modifyUser;
	}
	public void setModifyUser(String modifyUser) {
		this.modifyUser = modifyUser;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getParentId() {
		return this.parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getParentNode() {
		return this.parentNode;
	}
	public void setParentNode(String parentNode) {
		this.parentNode = parentNode;
	}

	public Long getPriority() {
		return this.priority;
	}
	public void setPriority(Long priority) {
		this.priority = priority;
	}

	public String getPuid() {
		return this.puid;
	}
	public void setPuid(String puid) {
		this.puid = puid;
	}

	public String getSourceId() {
		return this.sourceId;
	}
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public String getSourceNodeName() {
		return this.sourceNodeName;
	}
	public void setSourceNodeName(String sourceNodeName) {
		this.sourceNodeName = sourceNodeName;
	}

	public String getState() {
		return this.state;
	}
	public void setState(String state) {
		this.state = state;
	}

	public List<BPOpenApiTask> getTasks() {
		return this.tasks;
	}
	public void setTasks(List<BPOpenApiTask> tasks) {
		this.tasks = tasks;
	}

}
