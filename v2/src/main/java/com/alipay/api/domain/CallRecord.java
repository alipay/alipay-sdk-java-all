package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 通话记录信息对象
 *
 * @author auto create
 * @since 1.0, 2025-11-05 17:08:20
 */
public class CallRecord extends AlipayObject {

	private static final long serialVersionUID = 6288232176866773149L;

	/**
	 * 通话ID
	 */
	@ApiField("acid")
	private String acid;

	/**
	 * 小二信息
	 */
	@ApiField("biz_owner")
	private String bizOwner;

	/**
	 * 呼叫时间，yyyy-MM-dd HH:mm:ss格式
	 */
	@ApiField("call_time")
	private Date callTime;

	/**
	 * 呼叫类型，人机协同呼叫，人工呼叫，智能呼叫，客户呼入，呼入，手动外呼，机器人外呼，双向外呼，内呼，预测式外呼
	 */
	@ApiField("call_type")
	private String callType;

	/**
	 * 被叫号码
	 */
	@ApiField("callee")
	private String callee;

	/**
	 * 被叫号码
	 */
	@ApiField("caller")
	private String caller;

	/**
	 * 是否接通，是或否
	 */
	@ApiField("connect_status")
	private String connectStatus;

	/**
	 * 线索ID
	 */
	@ApiField("cue_id")
	private Long cueId;

	/**
	 * 客户名称
	 */
	@ApiField("customer_name")
	private String customerName;

	/**
	 * 创建时间，yyyy-MM-dd HH:mm:ss格式
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 修改时间，yyyy-MM-dd HH:mm:ss格式
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 挂机方
	 */
	@ApiField("hangup_dir")
	private String hangupDir;

	/**
	 * 挂断原因
	 */
	@ApiField("hangup_reason")
	private String hangupReason;

	/**
	 * 智能时长，单位秒
	 */
	@ApiField("ivr_time")
	private Long ivrTime;

	/**
	 * 人工时长，单位秒
	 */
	@ApiField("manual_time")
	private Long manualTime;

	/**
	 * 数字员工
	 */
	@ApiField("process")
	private String process;

	/**
	 * 等待时长，单位秒
	 */
	@ApiField("queue_time")
	private Long queueTime;

	/**
	 * 通话结束时间，yyyy-MM-dd HH:mm:ss格式
	 */
	@ApiField("release_time")
	private Date releaseTime;

	/**
	 * 响铃时长，单位秒
	 */
	@ApiField("ring_time")
	private Long ringTime;

	/**
	 * 通话开始时间，yyyy-MM-dd HH:mm:ss格式
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 本通电话的摘要信息
	 */
	@ApiField("summary")
	private String summary;

	/**
	 * 通话时长，单位秒
	 */
	@ApiField("talk_time")
	private Long talkTime;

	public String getAcid() {
		return this.acid;
	}
	public void setAcid(String acid) {
		this.acid = acid;
	}

	public String getBizOwner() {
		return this.bizOwner;
	}
	public void setBizOwner(String bizOwner) {
		this.bizOwner = bizOwner;
	}

	public Date getCallTime() {
		return this.callTime;
	}
	public void setCallTime(Date callTime) {
		this.callTime = callTime;
	}

	public String getCallType() {
		return this.callType;
	}
	public void setCallType(String callType) {
		this.callType = callType;
	}

	public String getCallee() {
		return this.callee;
	}
	public void setCallee(String callee) {
		this.callee = callee;
	}

	public String getCaller() {
		return this.caller;
	}
	public void setCaller(String caller) {
		this.caller = caller;
	}

	public String getConnectStatus() {
		return this.connectStatus;
	}
	public void setConnectStatus(String connectStatus) {
		this.connectStatus = connectStatus;
	}

	public Long getCueId() {
		return this.cueId;
	}
	public void setCueId(Long cueId) {
		this.cueId = cueId;
	}

	public String getCustomerName() {
		return this.customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
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

	public String getHangupDir() {
		return this.hangupDir;
	}
	public void setHangupDir(String hangupDir) {
		this.hangupDir = hangupDir;
	}

	public String getHangupReason() {
		return this.hangupReason;
	}
	public void setHangupReason(String hangupReason) {
		this.hangupReason = hangupReason;
	}

	public Long getIvrTime() {
		return this.ivrTime;
	}
	public void setIvrTime(Long ivrTime) {
		this.ivrTime = ivrTime;
	}

	public Long getManualTime() {
		return this.manualTime;
	}
	public void setManualTime(Long manualTime) {
		this.manualTime = manualTime;
	}

	public String getProcess() {
		return this.process;
	}
	public void setProcess(String process) {
		this.process = process;
	}

	public Long getQueueTime() {
		return this.queueTime;
	}
	public void setQueueTime(Long queueTime) {
		this.queueTime = queueTime;
	}

	public Date getReleaseTime() {
		return this.releaseTime;
	}
	public void setReleaseTime(Date releaseTime) {
		this.releaseTime = releaseTime;
	}

	public Long getRingTime() {
		return this.ringTime;
	}
	public void setRingTime(Long ringTime) {
		this.ringTime = ringTime;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getSummary() {
		return this.summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}

	public Long getTalkTime() {
		return this.talkTime;
	}
	public void setTalkTime(Long talkTime) {
		this.talkTime = talkTime;
	}

}
