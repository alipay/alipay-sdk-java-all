package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 语音回调列表
 *
 * @author auto create
 * @since 1.0, 2019-09-03 21:26:02
 */
public class SpiVoiceCallback extends AlipayObject {

	private static final long serialVersionUID = 6518678512536618768L;

	/**
	 * 阿里云语音编号
	 */
	@ApiField("call_id")
	private String callId;

	/**
	 * 被叫电话
	 */
	@ApiField("callee")
	private String callee;

	/**
	 * 通话时间
	 */
	@ApiField("duration")
	private Long duration;

	/**
	 * 通话结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 数立内部业务编号
	 */
	@ApiField("out_id")
	private String outId;

	/**
	 * 通话开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 语音状态：200000-用户听完语音;200001-用户提前挂机未完整收听;200002-用户占线
	 */
	@ApiField("status_code")
	private String statusCode;

	public String getCallId() {
		return this.callId;
	}
	public void setCallId(String callId) {
		this.callId = callId;
	}

	public String getCallee() {
		return this.callee;
	}
	public void setCallee(String callee) {
		this.callee = callee;
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

	public String getOutId() {
		return this.outId;
	}
	public void setOutId(String outId) {
		this.outId = outId;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getStatusCode() {
		return this.statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

}
