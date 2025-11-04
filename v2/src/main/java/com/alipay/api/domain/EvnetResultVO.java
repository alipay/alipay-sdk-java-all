package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-03-27 21:47:26
 */
public class EvnetResultVO extends AlipayObject {

	private static final long serialVersionUID = 7734488583421493958L;

	/**
	 * 事件回溯,按照回溯内容事件升序排序
	 */
	@ApiField("backtrackings")
	private EventBacktrackingVO backtrackings;

	/**
	 * 事件发生时间，格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 事件类型
1. 消控室离岗识别: FMC_ABSENCE_DETECTION
2. 消控室睡岗识别: FMC_SLEEP_DETECTION
3. 消防通道占用识别: FIRE_LANE_OCCUPANCY_DETECTION
	 */
	@ApiField("event_code")
	private String eventCode;

	/**
	 * 事件id
	 */
	@ApiField("event_id")
	private String eventId;

	/**
	 * 事件备注
	 */
	@ApiField("remarks")
	private String remarks;

	public EventBacktrackingVO getBacktrackings() {
		return this.backtrackings;
	}
	public void setBacktrackings(EventBacktrackingVO backtrackings) {
		this.backtrackings = backtrackings;
	}

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getEventCode() {
		return this.eventCode;
	}
	public void setEventCode(String eventCode) {
		this.eventCode = eventCode;
	}

	public String getEventId() {
		return this.eventId;
	}
	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	public String getRemarks() {
		return this.remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
