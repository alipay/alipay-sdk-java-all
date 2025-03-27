package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 参与者表单
 *
 * @author auto create
 * @since 1.0, 2023-11-15 10:21:43
 */
public class ParticipantPartyForm extends AlipayObject {

	private static final long serialVersionUID = 3635783686795183418L;

	/**
	 * 参与者的业务身份标识
	 */
	@ApiField("identity")
	private String identity;

	/**
	 * ALIPAY_OPEN_ID代表identity为支付宝开放用户ID；ALIPAY_LOGON_ID代表identity为支付宝用户登录号；
ACCONT_BOOK_ID代表identity为记账本ID
	 */
	@ApiField("identity_type")
	private String identityType;

	/**
	 * 用户姓名，在identity_type为ALIPAY_LOGON_ID时必填
	 */
	@ApiField("name")
	private String name;

	/**
	 * 当identity_type为ACCOUNT_BOOK_ID时，partner_id为归属UID，必选
	 */
	@ApiField("participant_party_biz_params")
	private ParticipantPartyBizParams participantPartyBizParams;

	public String getIdentity() {
		return this.identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public String getIdentityType() {
		return this.identityType;
	}
	public void setIdentityType(String identityType) {
		this.identityType = identityType;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public ParticipantPartyBizParams getParticipantPartyBizParams() {
		return this.participantPartyBizParams;
	}
	public void setParticipantPartyBizParams(ParticipantPartyBizParams participantPartyBizParams) {
		this.participantPartyBizParams = participantPartyBizParams;
	}

}
