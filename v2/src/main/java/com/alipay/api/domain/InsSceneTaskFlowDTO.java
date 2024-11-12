package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景任务流水
 *
 * @author auto create
 * @since 1.0, 2022-12-19 17:37:15
 */
public class InsSceneTaskFlowDTO extends AlipayObject {

	private static final long serialVersionUID = 7415643739896751149L;

	/**
	 * 过期时间
	 */
	@ApiField("expired_time")
	private Date expiredTime;

	/**
	 * 扩展字段
	 */
	@ApiField("extra_map")
	private String extraMap;

	/**
	 * 任务流水完成时间
	 */
	@ApiField("finish_time")
	private Date finishTime;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 营销任务流水的更新时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 活动参与id
	 */
	@ApiField("join_id")
	private String joinId;

	/**
	 * 营销场景码
	 */
	@ApiField("marketing_scene")
	private String marketingScene;

	/**
	 * 外部业务单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 被参与活动的用户id
	 */
	@ApiField("participant_user_id")
	private String participantUserId;

	/**
	 * 参与活动的用户id
	 */
	@ApiField("participator_user_id")
	private String participatorUserId;

	/**
	 * 领取时间
	 */
	@ApiField("receive_time")
	private Date receiveTime;

	/**
	 * 任务流水状态
	 */
	@ApiField("status")
	private Long status;

	/**
	 * 任务流水号
	 */
	@ApiField("task_flowid")
	private String taskFlowid;

	/**
	 * 添加状态查询
	 */
	@ApiField("type")
	private String type;

	public Date getExpiredTime() {
		return this.expiredTime;
	}
	public void setExpiredTime(Date expiredTime) {
		this.expiredTime = expiredTime;
	}

	public String getExtraMap() {
		return this.extraMap;
	}
	public void setExtraMap(String extraMap) {
		this.extraMap = extraMap;
	}

	public Date getFinishTime() {
		return this.finishTime;
	}
	public void setFinishTime(Date finishTime) {
		this.finishTime = finishTime;
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

	public String getJoinId() {
		return this.joinId;
	}
	public void setJoinId(String joinId) {
		this.joinId = joinId;
	}

	public String getMarketingScene() {
		return this.marketingScene;
	}
	public void setMarketingScene(String marketingScene) {
		this.marketingScene = marketingScene;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getParticipantUserId() {
		return this.participantUserId;
	}
	public void setParticipantUserId(String participantUserId) {
		this.participantUserId = participantUserId;
	}

	public String getParticipatorUserId() {
		return this.participatorUserId;
	}
	public void setParticipatorUserId(String participatorUserId) {
		this.participatorUserId = participatorUserId;
	}

	public Date getReceiveTime() {
		return this.receiveTime;
	}
	public void setReceiveTime(Date receiveTime) {
		this.receiveTime = receiveTime;
	}

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}

	public String getTaskFlowid() {
		return this.taskFlowid;
	}
	public void setTaskFlowid(String taskFlowid) {
		this.taskFlowid = taskFlowid;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
