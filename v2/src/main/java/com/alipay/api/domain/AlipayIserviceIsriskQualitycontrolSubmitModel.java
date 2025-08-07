package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 质检接口提交
 *
 * @author auto create
 * @since 1.0, 2025-07-15 11:52:37
 */
public class AlipayIserviceIsriskQualitycontrolSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 6246786112869556675L;

	/**
	 * 业务唯一标识id
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 用于区分质检的类型
	 */
	@ApiField("function_type")
	private String functionType;

	/**
	 * 调用实例code，由蚂蚁侧提供
	 */
	@ApiField("instance_code")
	private String instanceCode;

	/**
	 * 需要质检的小二1088id
	 */
	@ApiField("nebula_id")
	private String nebulaId;

	/**
	 * 离线文本质检的请求参数
	 */
	@ApiField("offline_text_qc")
	private OfflineTextQc offlineTextQc;

	/**
	 * 实时文本质检的参数
	 */
	@ApiField("realtime_text_qc")
	private RealtimeTextQc realtimeTextQc;

	/**
	 * 录音url集合
	 */
	@ApiListField("recording_urls")
	@ApiField("string")
	private List<String> recordingUrls;

	/**
	 * 技能组id，可传入星云技能组或业务技能组
	 */
	@ApiField("skill_group_id")
	private String skillGroupId;

	/**
	 * 是星云的技能组还是外部的技能组
	 */
	@ApiField("skill_group_type")
	private String skillGroupType;

	/**
	 * 调用方租户id
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getFunctionType() {
		return this.functionType;
	}
	public void setFunctionType(String functionType) {
		this.functionType = functionType;
	}

	public String getInstanceCode() {
		return this.instanceCode;
	}
	public void setInstanceCode(String instanceCode) {
		this.instanceCode = instanceCode;
	}

	public String getNebulaId() {
		return this.nebulaId;
	}
	public void setNebulaId(String nebulaId) {
		this.nebulaId = nebulaId;
	}

	public OfflineTextQc getOfflineTextQc() {
		return this.offlineTextQc;
	}
	public void setOfflineTextQc(OfflineTextQc offlineTextQc) {
		this.offlineTextQc = offlineTextQc;
	}

	public RealtimeTextQc getRealtimeTextQc() {
		return this.realtimeTextQc;
	}
	public void setRealtimeTextQc(RealtimeTextQc realtimeTextQc) {
		this.realtimeTextQc = realtimeTextQc;
	}

	public List<String> getRecordingUrls() {
		return this.recordingUrls;
	}
	public void setRecordingUrls(List<String> recordingUrls) {
		this.recordingUrls = recordingUrls;
	}

	public String getSkillGroupId() {
		return this.skillGroupId;
	}
	public void setSkillGroupId(String skillGroupId) {
		this.skillGroupId = skillGroupId;
	}

	public String getSkillGroupType() {
		return this.skillGroupType;
	}
	public void setSkillGroupType(String skillGroupType) {
		this.skillGroupType = skillGroupType;
	}

	public String getTntInstId() {
		return this.tntInstId;
	}
	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}

}
