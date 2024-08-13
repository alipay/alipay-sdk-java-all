package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 合约参与者
 *
 * @author auto create
 * @since 1.0, 2020-09-11 17:10:02
 */
public class ApiContractParticipant extends AlipayObject {

	private static final long serialVersionUID = 4592647778983899788L;

	/**
	 * 业务主体id，比如淘宝id
	 */
	@ApiField("biz_principal_id")
	private String bizPrincipalId;

	/**
	 * 业务主体类型
	 */
	@ApiField("biz_principal_type")
	private String bizPrincipalType;

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

	public String getBizPrincipalId() {
		return this.bizPrincipalId;
	}
	public void setBizPrincipalId(String bizPrincipalId) {
		this.bizPrincipalId = bizPrincipalId;
	}

	public String getBizPrincipalType() {
		return this.bizPrincipalType;
	}
	public void setBizPrincipalType(String bizPrincipalType) {
		this.bizPrincipalType = bizPrincipalType;
	}

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
