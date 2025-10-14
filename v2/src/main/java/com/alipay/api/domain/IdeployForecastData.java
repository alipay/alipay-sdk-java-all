package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智能排班预测数据
 *
 * @author auto create
 * @since 1.0, 2022-12-09 11:14:08
 */
public class IdeployForecastData extends AlipayObject {

	private static final long serialVersionUID = 4225829944886929398L;

	/**
	 * 业务线类型
	 */
	@ApiField("business_type")
	private String businessType;

	/**
	 * 渠道
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 结束时间
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 时间间隔
	 */
	@ApiField("period_interval")
	private String periodInterval;

	/**
	 * 预测结果数据
	 */
	@ApiField("predict_result_value")
	private String predictResultValue;

	/**
	 * 方案guid
	 */
	@ApiField("scheme_guid")
	private String schemeGuid;

	/**
	 * 测试方案
	 */
	@ApiField("scheme_name")
	private String schemeName;

	/**
	 * 技能组
	 */
	@ApiField("skill_group")
	private String skillGroup;

	/**
	 * 开始时间
	 */
	@ApiField("start_time")
	private String startTime;

	public String getBusinessType() {
		return this.businessType;
	}
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getPeriodInterval() {
		return this.periodInterval;
	}
	public void setPeriodInterval(String periodInterval) {
		this.periodInterval = periodInterval;
	}

	public String getPredictResultValue() {
		return this.predictResultValue;
	}
	public void setPredictResultValue(String predictResultValue) {
		this.predictResultValue = predictResultValue;
	}

	public String getSchemeGuid() {
		return this.schemeGuid;
	}
	public void setSchemeGuid(String schemeGuid) {
		this.schemeGuid = schemeGuid;
	}

	public String getSchemeName() {
		return this.schemeName;
	}
	public void setSchemeName(String schemeName) {
		this.schemeName = schemeName;
	}

	public String getSkillGroup() {
		return this.skillGroup;
	}
	public void setSkillGroup(String skillGroup) {
		this.skillGroup = skillGroup;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

}
