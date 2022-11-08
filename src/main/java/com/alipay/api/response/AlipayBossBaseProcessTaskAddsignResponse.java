package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BPOpenApiTask;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.base.process.task.addsign response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-02 17:21:55
 */
public class AlipayBossBaseProcessTaskAddsignResponse extends AlipayResponse {

	private static final long serialVersionUID = 4889817257289134477L;

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
	private String gmtModified;

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
	 * 任务列表
	 */
	@ApiListField("tasks")
	@ApiField("b_p_open_api_task")
	private List<BPOpenApiTask> tasks;

	public void setBizContext(String bizContext) {
		this.bizContext = bizContext;
	}
	public String getBizContext( ) {
		return this.bizContext;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
	}
	public String getBizId( ) {
		return this.bizId;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public String getCreateUser( ) {
		return this.createUser;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	public String getDescription( ) {
		return this.description;
	}

	public void setDuration(Long duration) {
		this.duration = duration;
	}
	public Long getDuration( ) {
		return this.duration;
	}

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	public Date getGmtCreate( ) {
		return this.gmtCreate;
	}

	public void setGmtEnd(Date gmtEnd) {
		this.gmtEnd = gmtEnd;
	}
	public Date getGmtEnd( ) {
		return this.gmtEnd;
	}

	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}
	public String getGmtModified( ) {
		return this.gmtModified;
	}

	public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}
	public String getIpRoleId( ) {
		return this.ipRoleId;
	}

	public void setModifyUser(String modifyUser) {
		this.modifyUser = modifyUser;
	}
	public String getModifyUser( ) {
		return this.modifyUser;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName( ) {
		return this.name;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	public String getParentId( ) {
		return this.parentId;
	}

	public void setParentNode(String parentNode) {
		this.parentNode = parentNode;
	}
	public String getParentNode( ) {
		return this.parentNode;
	}

	public void setPriority(Long priority) {
		this.priority = priority;
	}
	public Long getPriority( ) {
		return this.priority;
	}

	public void setPuid(String puid) {
		this.puid = puid;
	}
	public String getPuid( ) {
		return this.puid;
	}

	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}
	public String getSourceId( ) {
		return this.sourceId;
	}

	public void setSourceNodeName(String sourceNodeName) {
		this.sourceNodeName = sourceNodeName;
	}
	public String getSourceNodeName( ) {
		return this.sourceNodeName;
	}

	public void setState(String state) {
		this.state = state;
	}
	public String getState( ) {
		return this.state;
	}

	public void setTasks(List<BPOpenApiTask> tasks) {
		this.tasks = tasks;
	}
	public List<BPOpenApiTask> getTasks( ) {
		return this.tasks;
	}

}
