package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 全息信用2.0联系人信息
 *
 * @author auto create
 * @since 1.0, 2017-07-21 16:40:25
 */
public class HoloGraphicContactInfo extends AlipayObject {

	private static final long serialVersionUID = 2115252623357529432L;

	/**
	 * 主叫通话频次
	 */
	@ApiField("call_frequency")
	private Long callFrequency;

	/**
	 * 主叫通话时长
	 */
	@ApiField("call_time")
	private Long callTime;

	/**
	 * 被叫通话频次
	 */
	@ApiField("called_frequency")
	private Long calledFrequency;

	/**
	 * 被叫通话时长
	 */
	@ApiField("called_time")
	private Long calledTime;

	/**
	 * 手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 通话频次
	 */
	@ApiField("talk_frequency")
	private Long talkFrequency;

	/**
	 * 通话时长
	 */
	@ApiField("talk_time")
	private Long talkTime;

	public Long getCallFrequency() {
		return this.callFrequency;
	}
	public void setCallFrequency(Long callFrequency) {
		this.callFrequency = callFrequency;
	}

	public Long getCallTime() {
		return this.callTime;
	}
	public void setCallTime(Long callTime) {
		this.callTime = callTime;
	}

	public Long getCalledFrequency() {
		return this.calledFrequency;
	}
	public void setCalledFrequency(Long calledFrequency) {
		this.calledFrequency = calledFrequency;
	}

	public Long getCalledTime() {
		return this.calledTime;
	}
	public void setCalledTime(Long calledTime) {
		this.calledTime = calledTime;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Long getTalkFrequency() {
		return this.talkFrequency;
	}
	public void setTalkFrequency(Long talkFrequency) {
		this.talkFrequency = talkFrequency;
	}

	public Long getTalkTime() {
		return this.talkTime;
	}
	public void setTalkTime(Long talkTime) {
		this.talkTime = talkTime;
	}

}
