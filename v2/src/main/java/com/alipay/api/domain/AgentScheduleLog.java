package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 客服状态变更日志
 *
 * @author auto create
 * @since 1.0, 2020-11-16 14:54:45
 */
public class AgentScheduleLog extends AlipayObject {

	private static final long serialVersionUID = 6134974518281612293L;

	/**
	 * 客服id
	 */
	@ApiField("agent_id")
	private String agentId;

	/**
	 * 客服名称
	 */
	@ApiField("agent_name")
	private String agentName;

	/**
	 * 状态变更发生时间,采用UTC时间，按照ISO8601标准表示，格式为：yyyy-MM-dd'T'HH:mm:ss'Z'
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 状态持续时长,单位秒
	 */
	@ApiField("duration")
	private Long duration;

	/**
	 * 状态变更结束时间,采用UTC时间，按照ISO8601标准表示，格式为：yyyy-MM-dd'T'HH:mm:ss'Z'
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * isv或商户系统中对应的客服工号
	 */
	@ApiField("external_user_no")
	private String externalUserNo;

	/**
	 * 客服状态变更流水id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 变更前状态
	 */
	@ApiField("last_status")
	private String lastStatus;

	/**
	 * 状态变更开始时间,采用UTC时间，按照ISO8601标准表示，格式为：yyyy-MM-dd'T'HH:mm:ss'Z'
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 变更后状态
	 */
	@ApiField("status")
	private String status;

	public String getAgentId() {
		return this.agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public String getAgentName() {
		return this.agentName;
	}
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Long getDuration() {
		return this.duration;
	}
	public void setDuration(Long duration) {
		this.duration = duration;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getExternalUserNo() {
		return this.externalUserNo;
	}
	public void setExternalUserNo(String externalUserNo) {
		this.externalUserNo = externalUserNo;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getLastStatus() {
		return this.lastStatus;
	}
	public void setLastStatus(String lastStatus) {
		this.lastStatus = lastStatus;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
