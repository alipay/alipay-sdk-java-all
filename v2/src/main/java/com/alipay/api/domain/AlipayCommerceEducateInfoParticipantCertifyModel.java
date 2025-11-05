package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 参赛者信息校验接口
 *
 * @author auto create
 * @since 1.0, 2023-06-19 20:50:49
 */
public class AlipayCommerceEducateInfoParticipantCertifyModel extends AlipayObject {

	private static final long serialVersionUID = 6874124839269713114L;

	/**
	 * 用户报名备注信息，key为field_name值，value为用户选择的备注信息值



当key为user_defined时，表示用户自定义备注
	 */
	@ApiField("apply_note_info")
	private String applyNoteInfo;

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
	 * 参赛者信息
	 */
	@ApiListField("participant_info")
	@ApiField("participant_info")
	private List<ParticipantInfo> participantInfo;

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

	public List<ParticipantInfo> getParticipantInfo() {
		return this.participantInfo;
	}
	public void setParticipantInfo(List<ParticipantInfo> participantInfo) {
		this.participantInfo = participantInfo;
	}

	public String getSourceId() {
		return this.sourceId;
	}
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

}
