package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 *  加入行程
 *
 * @author auto create
 * @since 1.0, 2022-06-05 21:00:13
 */
public class AlipayUserAsaingameScheduleAddModel extends AlipayObject {

	private static final long serialVersionUID = 1319823298257528783L;

	/**
	 * 如果要加入到某一天，则必传。 如果新建则非必传
	 */
	@ApiField("daily_schedule_id")
	private String dailyScheduleId;

	/**
	 * 场景
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 详细门店数据，json格式
	 */
	@ApiField("step_data")
	private String stepData;

	public String getDailyScheduleId() {
		return this.dailyScheduleId;
	}
	public void setDailyScheduleId(String dailyScheduleId) {
		this.dailyScheduleId = dailyScheduleId;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getStepData() {
		return this.stepData;
	}
	public void setStepData(String stepData) {
		this.stepData = stepData;
	}

}
