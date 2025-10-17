package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景支付参与者模型
 *
 * @author auto create
 * @since 1.0, 2024-11-01 13:48:15
 */
public class ScenePayParticipantInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 2513248724771593977L;

	/**
	 * 参与方mcc
	 */
	@ApiField("mcc")
	private String mcc;

	/**
	 * 参与方名称
	 */
	@ApiField("name")
	private String name;

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

	public String getMcc() {
		return this.mcc;
	}
	public void setMcc(String mcc) {
		this.mcc = mcc;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

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
