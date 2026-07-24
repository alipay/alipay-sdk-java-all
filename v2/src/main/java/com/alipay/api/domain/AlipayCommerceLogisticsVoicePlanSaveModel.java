package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建或者修改语音投放计划
 *
 * @author auto create
 * @since 1.0, 2026-07-09 10:29:30
 */
public class AlipayCommerceLogisticsVoicePlanSaveModel extends AlipayObject {

	private static final long serialVersionUID = 6866511363461545822L;

	/**
	 * 幂等键
	 */
	@ApiField("biz_date")
	private String bizDate;

	/**
	 * 格式yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 修改时传入已有计划ID（需OFFLINE状态），不传=新建
	 */
	@ApiField("logistics_voice_plan_id")
	private String logisticsVoicePlanId;

	/**
	 * 计划名称,允许重复命名
	 */
	@ApiField("plan_name")
	private String planName;

	/**
	 * 必须与模板scene_type一致
	 */
	@ApiField("scene_type")
	private String sceneType;

	/**
	 * 通过文件上传接口获得的file_id。文件格式为Csv格式，最大40万条且<5MB
	 */
	@ApiField("sn_file_id")
	private String snFileId;

	/**
	 * 格式yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("start_time")
	private String startTime;

	/**
	 * 已审批通过的模板ID
	 */
	@ApiField("voice_template_id")
	private String voiceTemplateId;

	public String getBizDate() {
		return this.bizDate;
	}
	public void setBizDate(String bizDate) {
		this.bizDate = bizDate;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getLogisticsVoicePlanId() {
		return this.logisticsVoicePlanId;
	}
	public void setLogisticsVoicePlanId(String logisticsVoicePlanId) {
		this.logisticsVoicePlanId = logisticsVoicePlanId;
	}

	public String getPlanName() {
		return this.planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getSceneType() {
		return this.sceneType;
	}
	public void setSceneType(String sceneType) {
		this.sceneType = sceneType;
	}

	public String getSnFileId() {
		return this.snFileId;
	}
	public void setSnFileId(String snFileId) {
		this.snFileId = snFileId;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getVoiceTemplateId() {
		return this.voiceTemplateId;
	}
	public void setVoiceTemplateId(String voiceTemplateId) {
		this.voiceTemplateId = voiceTemplateId;
	}

}
