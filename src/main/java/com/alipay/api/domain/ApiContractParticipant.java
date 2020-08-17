package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 合约参与者
 *
 * @author auto create
 * @since 1.0, 2020-08-15 22:25:17
 */
public class ApiContractParticipant extends AlipayObject {

	private static final long serialVersionUID = 4371817499292394367L;

	/**
	 * offer、acceptor
	 */
	@ApiField("participant_type")
	private String participantType;

	/**
	 * 主体id，一般是user_id
	 */
	@ApiField("principal_id")
	private String principalId;

	/**
	 * 主体类型B/C
	 */
	@ApiField("principal_type")
	private String principalType;

	public String getParticipantType() {
		return this.participantType;
	}
	public void setParticipantType(String participantType) {
		this.participantType = participantType;
	}

	public String getPrincipalId() {
		return this.principalId;
	}
	public void setPrincipalId(String principalId) {
		this.principalId = principalId;
	}

	public String getPrincipalType() {
		return this.principalType;
	}
	public void setPrincipalType(String principalType) {
		this.principalType = principalType;
	}

}
