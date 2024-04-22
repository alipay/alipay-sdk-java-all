package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 授权申请数据模型
 *
 * @author auto create
 * @since 1.0, 2023-06-27 11:22:19
 */
public class AuthParticipantInfo extends AlipayObject {

	private static final long serialVersionUID = 3798348756631645969L;

	/**
	 * 用户名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 扩展数据
	 */
	@ApiField("participant_biz_param")
	private ParticipantBizParam participantBizParam;

	/**
	 * 主体ID，更具主体类型确定
	 */
	@ApiField("participant_id")
	private String participantId;

	/**
	 * 主体类型：
ALIPAY_LOGON_ID: 登陆号
ALIPAY_OPEN_ID：支付宝openId
ALIPAY_USER_ID：支付宝账号
	 */
	@ApiField("participant_id_type")
	private String participantIdType;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public ParticipantBizParam getParticipantBizParam() {
		return this.participantBizParam;
	}
	public void setParticipantBizParam(ParticipantBizParam participantBizParam) {
		this.participantBizParam = participantBizParam;
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
