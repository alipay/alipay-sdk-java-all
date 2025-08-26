package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 星云小二班次查询
 *
 * @author auto create
 * @since 1.0, 2024-07-24 20:04:25
 */
public class AlipayIserviceIdeployShiftQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4622382479456157414L;

	/**
	 * 结束时间，单位/ms，注意开始结束时间不能超过一天
	 */
	@ApiField("end_time")
	private Long endTime;

	/**
	 * 星云租户下小二的唯一身份ID
	 */
	@ApiField("nebula_user_id")
	private String nebulaUserId;

	/**
	 * 时间戳，单位/ms,注意开始结束时间不能超过一天
	 */
	@ApiField("start_time")
	private Long startTime;

	public Long getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Long endTime) {
		this.endTime = endTime;
	}

	public String getNebulaUserId() {
		return this.nebulaUserId;
	}
	public void setNebulaUserId(String nebulaUserId) {
		this.nebulaUserId = nebulaUserId;
	}

	public Long getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Long startTime) {
		this.startTime = startTime;
	}

}
