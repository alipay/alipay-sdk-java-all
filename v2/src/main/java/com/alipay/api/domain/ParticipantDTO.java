package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 核身主体信息
 *
 * @author auto create
 * @since 1.0, 2023-07-17 16:05:07
 */
public class ParticipantDTO extends AlipayObject {

	private static final long serialVersionUID = 8858468223119879913L;

	/**
	 * 核身主体名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 核身主体ID
	 */
	@ApiField("participant_id")
	private String participantId;

	/**
	 * 核身主体Id类型
	 */
	@ApiField("participant_id_type")
	private String participantIdType;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getParticipantId() {
		return this.participantId;
	}
	public void setParticipantId(String participantId) {
		this.participantId = participantId;
	}

	public String getParticipantIdType() {
		return this.participantIdType;
	}
	public void setParticipantIdType(String participantIdType) {
		this.participantIdType = participantIdType;
	}

}
