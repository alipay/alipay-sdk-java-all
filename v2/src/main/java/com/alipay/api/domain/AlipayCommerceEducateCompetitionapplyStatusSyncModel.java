package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 赛事报名状态同步接口
 *
 * @author auto create
 * @since 1.0, 2023-06-12 14:35:41
 */
public class AlipayCommerceEducateCompetitionapplyStatusSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4576722386478797982L;

	/**
	 * 用户报名备注信息key为field_name值，value为用户选取的值



当key为user_defined时，表示用户自定义备注
	 */
	@ApiField("apply_note_info")
	private String applyNoteInfo;

	/**
	 * 参赛状态:
	 */
	@ApiField("apply_status")
	private String applyStatus;

	/**
	 * 扩展信息JSON格式字符串
	 */
	@ApiField("extend_info")
	private String extendInfo;

	/**
	 * 推广方编码
	 */
	@ApiField("from_code")
	private String fromCode;

	/**
	 * 参赛者id，由支付宝系统生成，如果需要更改报名状态，需要传此字段
	 */
	@ApiField("participant_id")
	private String participantId;

	/**
	 * 参赛人信息
	 */
	@ApiField("participant_info")
	private ParticipantInfo participantInfo;

	/**
	 * 外部赛事ID
	 */
	@ApiField("source_id")
	private String sourceId;

	public String getApplyNoteInfo() {
		return this.applyNoteInfo;
	}
	public void setApplyNoteInfo(String applyNoteInfo) {
		this.applyNoteInfo = applyNoteInfo;
	}

	public String getApplyStatus() {
		return this.applyStatus;
	}
	public void setApplyStatus(String applyStatus) {
		this.applyStatus = applyStatus;
	}

	public String getExtendInfo() {
		return this.extendInfo;
	}
	public void setExtendInfo(String extendInfo) {
		this.extendInfo = extendInfo;
	}

	public String getFromCode() {
		return this.fromCode;
	}
	public void setFromCode(String fromCode) {
		this.fromCode = fromCode;
	}

	public String getParticipantId() {
		return this.participantId;
	}
	public void setParticipantId(String participantId) {
		this.participantId = participantId;
	}

	public ParticipantInfo getParticipantInfo() {
		return this.participantInfo;
	}
	public void setParticipantInfo(ParticipantInfo participantInfo) {
		this.participantInfo = participantInfo;
	}

	public String getSourceId() {
		return this.sourceId;
	}
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

}
