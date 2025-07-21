package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务工单类创建模型
 *
 * @author auto create
 * @since 1.0, 2024-09-20 17:12:18
 */
public class ServiceTicketCreateDTO extends AlipayObject {

	private static final long serialVersionUID = 2629379188197522715L;

	/**
	 * 事件的动作
	 */
	@ApiField("event_action")
	private String eventAction;

	/**
	 * 事件内容所有字段
	 */
	@ApiField("event_content")
	private String eventContent;

	/**
	 * 事件触发时间
	 */
	@ApiField("event_time")
	private String eventTime;

	/**
	 * 坐席id
	 */
	@ApiField("seat_id")
	private String seatId;

	/**
	 * 坐席类型
	 */
	@ApiField("seat_type")
	private String seatType;

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
