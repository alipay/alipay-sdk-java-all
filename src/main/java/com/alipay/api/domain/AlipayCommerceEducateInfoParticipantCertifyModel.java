package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 参赛者信息校验接口
 *
 * @author auto create
 * @since 1.0, 2021-04-15 18:32:22
 */
public class AlipayCommerceEducateInfoParticipantCertifyModel extends AlipayObject {

	private static final long serialVersionUID = 4896348542128144144L;

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
