package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景支付参与者模型
 *
 * @author auto create
 * @since 1.0, 2023-09-20 13:55:06
 */
public class ScenePayParticipantInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 7529896998741916173L;

	/**
	 * 参与者业务参数
	 */
	@ApiField("participant_biz_param")
	private ScenePayParticipantBizParamDTO participantBizParam;

	/**
	 * 根据participant_id_type填写对应值
● participant_id_type=ALIPAY_USER_ID时，填写支付宝UID
● participant_id_type=ALIPAY_LOGON_ID时，填写登录号，且name填写真实姓名
● participant_id_type=ALIPAY_OPEN_ID时，填写支付宝openid
	 */
	@ApiField("participant_id")
	private String participantId;

	/**
	 * ● ALIPAY_USER_ID -- 支付宝UID
● ALIPAY_LOGON_ID -- 支付宝登录号
● ALIPAY_OPNE_ID -- 支付宝openId
	 */
	@ApiField("participant_id_type")
	private String participantIdType;

	public ScenePayParticipantBizParamDTO getParticipantBizParam() {
		return this.participantBizParam;
	}
	public void setParticipantBizParam(ScenePayParticipantBizParamDTO participantBizParam) {
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
