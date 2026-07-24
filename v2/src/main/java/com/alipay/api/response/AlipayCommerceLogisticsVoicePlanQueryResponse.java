package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.logistics.voice.plan.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-09 10:32:56
 */
public class AlipayCommerceLogisticsVoicePlanQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8723376649182271632L;

	/** 
	 * 业务日期（幂等键）
	 */
	@ApiField("biz_date")
	private String bizDate;

	/** 
	 * 计划生效结束时间
	 */
	@ApiField("end_time")
	private String endTime;

	/** 
	 * 投放计划ID
	 */
	@ApiField("logistics_voice_plan_id")
	private String logisticsVoicePlanId;

	/** 
	 * 计划名称
	 */
	@ApiField("plan_name")
	private String planName;

	/** 
	 * 计划状态
	 */
	@ApiField("plan_status")
	private String planStatus;

	/** 
	 * 场景类型
	 */
	@ApiField("scene_type")
	private String sceneType;

	/** 
	 * 失败SN数量（SAVING状态时可能为空）
	 */
	@ApiField("sn_fail_count")
	private Long snFailCount;

	/** 
	 * 成功SN数量（SAVING状态时可能为空）
	 */
	@ApiField("sn_success_count")
	private Long snSuccessCount;

	/** 
	 * SN总数（SAVING状态时可能为空）
	 */
	@ApiField("sn_total_count")
	private Long snTotalCount;

	/** 
	 * 计划生效开始时间
	 */
	@ApiField("start_time")
	private String startTime;

	/** 
	 * 语音模板ID
	 */
	@ApiField("voice_template_id")
	private String voiceTemplateId;

	public void setBizDate(String bizDate) {
		this.bizDate = bizDate;
	}
	public String getBizDate( ) {
		return this.bizDate;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getEndTime( ) {
		return this.endTime;
	}

	public void setLogisticsVoicePlanId(String logisticsVoicePlanId) {
		this.logisticsVoicePlanId = logisticsVoicePlanId;
	}
	public String getLogisticsVoicePlanId( ) {
		return this.logisticsVoicePlanId;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public String getPlanName( ) {
		return this.planName;
	}

	public void setPlanStatus(String planStatus) {
		this.planStatus = planStatus;
	}
	public String getPlanStatus( ) {
		return this.planStatus;
	}

	public void setSceneType(String sceneType) {
		this.sceneType = sceneType;
	}
	public String getSceneType( ) {
		return this.sceneType;
	}

	public void setSnFailCount(Long snFailCount) {
		this.snFailCount = snFailCount;
	}
	public Long getSnFailCount( ) {
		return this.snFailCount;
	}

	public void setSnSuccessCount(Long snSuccessCount) {
		this.snSuccessCount = snSuccessCount;
	}
	public Long getSnSuccessCount( ) {
		return this.snSuccessCount;
	}

	public void setSnTotalCount(Long snTotalCount) {
		this.snTotalCount = snTotalCount;
	}
	public Long getSnTotalCount( ) {
		return this.snTotalCount;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getStartTime( ) {
		return this.startTime;
	}

	public void setVoiceTemplateId(String voiceTemplateId) {
		this.voiceTemplateId = voiceTemplateId;
	}
	public String getVoiceTemplateId( ) {
		return this.voiceTemplateId;
	}

}
