package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * openbizmock sse mock event
 *
 * @author auto create
 * @since 1.0, 2024-08-27 15:50:44
 */
public class OpenbizmockSseMockEvent extends AlipayObject {

	private static final long serialVersionUID = 8126482782434798542L;

	/**
	 * sse注释
	 */
	@ApiField("comment")
	private String comment;

	/**
	 * data
	 */
	@ApiField("data")
	private String data;

	/**
	 * event
	 */
	@ApiField("event")
	private String event;

	/**
	 * event id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 当前事件重复次数
	 */
	@ApiField("repeat_count")
	private Long repeatCount;

	/**
	 * 发送事件发送等待时间，单位为毫秒
	 */
	@ApiField("wait_time")
	private Long waitTime;

	public String getComment() {
		return this.comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getData() {
		return this.data;
	}
	public void setData(String data) {
		this.data = data;
	}

	public String getEvent() {
		return this.event;
	}
	public void setEvent(String event) {
		this.event = event;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public Long getRepeatCount() {
		return this.repeatCount;
	}
	public void setRepeatCount(Long repeatCount) {
		this.repeatCount = repeatCount;
	}

	public Long getWaitTime() {
		return this.waitTime;
	}
	public void setWaitTime(Long waitTime) {
		this.waitTime = waitTime;
	}

}
