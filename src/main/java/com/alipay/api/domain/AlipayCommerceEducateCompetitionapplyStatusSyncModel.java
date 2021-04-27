package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 赛事报名状态同步接口
 *
 * @author auto create
 * @since 1.0, 2021-04-15 18:33:04
 */
public class AlipayCommerceEducateCompetitionapplyStatusSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2266712832395761617L;

	/**
	 * 参赛状态:
	 */
	@ApiField("apply_status")
	private String applyStatus;

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

	public String getApplyStatus() {
		return this.applyStatus;
	}
	public void setApplyStatus(String applyStatus) {
		this.applyStatus = applyStatus;
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
