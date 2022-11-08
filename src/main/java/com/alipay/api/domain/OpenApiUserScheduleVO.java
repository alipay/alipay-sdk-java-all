package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 用户行程单
 *
 * @author auto create
 * @since 1.0, 2022-05-24 19:20:31
 */
public class OpenApiUserScheduleVO extends AlipayObject {

	private static final long serialVersionUID = 7243499685695323347L;

	/**
	 * 是否到达行程天数上限
	 */
	@ApiField("over_limit")
	private Boolean overLimit;

	/**
	 * 行程内容，多天
	 */
	@ApiListField("schedule_content")
	@ApiField("open_api_daily_schedule_v_o")
	private List<OpenApiDailyScheduleVO> scheduleContent;

	/**
	 * 行程ID
	 */
	@ApiField("schedule_id")
	private String scheduleId;

	public Boolean getOverLimit() {
		return this.overLimit;
	}
	public void setOverLimit(Boolean overLimit) {
		this.overLimit = overLimit;
	}

	public List<OpenApiDailyScheduleVO> getScheduleContent() {
		return this.scheduleContent;
	}
	public void setScheduleContent(List<OpenApiDailyScheduleVO> scheduleContent) {
		this.scheduleContent = scheduleContent;
	}

	public String getScheduleId() {
		return this.scheduleId;
	}
	public void setScheduleId(String scheduleId) {
		this.scheduleId = scheduleId;
	}

}
