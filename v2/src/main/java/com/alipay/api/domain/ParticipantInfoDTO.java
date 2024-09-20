package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 主体信息
 *
 * @author auto create
 * @since 1.0, 2023-09-04 16:21:56
 */
public class ParticipantInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 3886916652218883852L;

	/**
	 * 授权主体名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 主体Id，根据类型确定
	 */
	@ApiField("participant_id")
	private String participantId;

	/**
	 * 主体类型
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
