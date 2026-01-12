package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询音转文结构体
 *
 * @author auto create
 * @since 1.0, 2025-04-14 10:58:55
 */
public class AsrTtsSlsMessage extends AlipayObject {

	private static final long serialVersionUID = 8792688315974337141L;

	/**
	 * 会话id
	 */
	@ApiField("acid")
	private String acid;

	/**
	 * 会话开始时间
	 */
	@ApiField("call_session_start_time")
	private Long callSessionStartTime;

	/**
	 * 当前设备id
	 */
	@ApiField("contact_id")
	private String contactId;

	/**
	 * 音转文内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 设备通话开始时间（接听时间）
	 */
	@ApiField("device_session_start_time")
	private Long deviceSessionStartTime;

	/**
	 * 当前设备类型：0:机器人 1:坐席,2:客户
	 */
	@ApiField("device_type")
	private Long deviceType;

	/**
	 * 结束时间，同start_time对应
	 */
	@ApiField("end_time")
	private Long endTime;

	/**
	 * 是否被打断
	 */
	@ApiField("interrupted")
	private Boolean interrupted;

	/**
	 * 序列号，展示顺序
	 */
	@ApiField("seq")
	private Long seq;

	/**
	 * 当前时间戳
	 */
	@ApiField("start_time")
	private Long startTime;

	public String getAcid() {
		return this.acid;
	}
	public void setAcid(String acid) {
		this.acid = acid;
	}

	public Long getCallSessionStartTime() {
		return this.callSessionStartTime;
	}
	public void setCallSessionStartTime(Long callSessionStartTime) {
		this.callSessionStartTime = callSessionStartTime;
	}

	public String getContactId() {
		return this.contactId;
	}
	public void setContactId(String contactId) {
		this.contactId = contactId;
	}

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public Long getDeviceSessionStartTime() {
		return this.deviceSessionStartTime;
	}
	public void setDeviceSessionStartTime(Long deviceSessionStartTime) {
		this.deviceSessionStartTime = deviceSessionStartTime;
	}

	public Long getDeviceType() {
		return this.deviceType;
	}
	public void setDeviceType(Long deviceType) {
		this.deviceType = deviceType;
	}

	public Long getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Long endTime) {
		this.endTime = endTime;
	}

	public Boolean getInterrupted() {
		return this.interrupted;
	}
	public void setInterrupted(Boolean interrupted) {
		this.interrupted = interrupted;
	}

	public Long getSeq() {
		return this.seq;
	}
	public void setSeq(Long seq) {
		this.seq = seq;
	}

	public Long getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Long startTime) {
		this.startTime = startTime;
	}

}
