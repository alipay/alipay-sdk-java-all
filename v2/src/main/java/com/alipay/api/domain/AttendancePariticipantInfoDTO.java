package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 申请开通的主体信息
 *
 * @author auto create
 * @since 1.0, 2023-11-17 15:43:19
 */
public class AttendancePariticipantInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 2783686799872741968L;

	/**
	 * 主体补充参数
	 */
	@ApiField("extend_params")
	private ParticipantExtendParams extendParams;

	/**
	 * 授权主体名称(支付宝会员登录号类型必选)
	 */
	@ApiField("name")
	private String name;

	/**
	 * 主体Id
	 */
	@ApiField("participant_id")
	private String participantId;

	/**
	 * 主体类型
	 */
	@ApiField("participant_id_type")
	private String participantIdType;

	public ParticipantExtendParams getExtendParams() {
		return this.extendParams;
	}
	public void setExtendParams(ParticipantExtendParams extendParams) {
		this.extendParams = extendParams;
	}

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
