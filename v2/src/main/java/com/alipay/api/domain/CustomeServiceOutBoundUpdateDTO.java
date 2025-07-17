package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建服务单和修改服务单外呼模型
 *
 * @author auto create
 * @since 1.0, 2024-09-20 17:41:41
 */
public class CustomeServiceOutBoundUpdateDTO extends AlipayObject {

	private static final long serialVersionUID = 6522437551681611469L;

	/**
	 * 被叫号码
	 */
	@ApiField("callee")
	private String callee;

	/**
	 * 被叫名称
	 */
	@ApiField("callee_name")
	private String calleeName;

	/**
	 * 渠道类型
	 */
	@ApiField("channel_type")
	private String channelType;

	/**
	 * 传递的事件
	 */
	@ApiField("event_action")
	private String eventAction;

	/**
	 * 事件内容的所有字段
	 */
	@ApiField("event_content")
	private String eventContent;

	/**
	 * 事件触发的时间
	 */
	@ApiField("event_time")
	private String eventTime;

	/**
	 * 坐席id
	 */
	@ApiField("seat_id")
	private String seatId;

	/**
	 * 坐席类型:热线坐席，在线坐席等
	 */
	@ApiField("seat_type")
	private String seatType;

	public String getCallee() {
		return this.callee;
	}
	public void setCallee(String callee) {
		this.callee = callee;
	}

	public String getCalleeName() {
		return this.calleeName;
	}
	public void setCalleeName(String calleeName) {
		this.calleeName = calleeName;
	}

	public String getChannelType() {
		return this.channelType;
	}
	public void setChannelType(String channelType) {
		this.channelType = channelType;
	}

	public String getEventAction() {
		return this.eventAction;
	}
	public void setEventAction(String eventAction) {
		this.eventAction = eventAction;
	}

	public String getEventContent() {
		return this.eventContent;
	}
	public void setEventContent(String eventContent) {
		this.eventContent = eventContent;
	}

	public String getEventTime() {
		return this.eventTime;
	}
	public void setEventTime(String eventTime) {
		this.eventTime = eventTime;
	}

	public String getSeatId() {
		return this.seatId;
	}
	public void setSeatId(String seatId) {
		this.seatId = seatId;
	}

	public String getSeatType() {
		return this.seatType;
	}
	public void setSeatType(String seatType) {
		this.seatType = seatType;
	}

}
