package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 新增请假申请单
 *
 * @author auto create
 * @since 1.0, 2025-08-29 14:28:11
 */
public class AlipayCommerceEducateLeaveuserAddModel extends AlipayObject {

	private static final long serialVersionUID = 2825642562327431212L;

	/**
	 * 请假结束时间，格式yyyy-MM-dd HH:mm
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 机构内标
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 请假人花名册id
	 */
	@ApiField("roster_id")
	private String rosterId;

	/**
	 * 请假开始时间，格式yyyy-MM-dd HH:mm
	 */
	@ApiField("start_time")
	private String startTime;

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getRosterId() {
		return this.rosterId;
	}
	public void setRosterId(String rosterId) {
		this.rosterId = rosterId;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

}
