package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 取消考试资格审核接口
 *
 * @author auto create
 * @since 1.0, 2021-04-20 16:13:13
 */
public class AlipayCommerceEducateInfoApplycancelCertifyModel extends AlipayObject {

	private static final long serialVersionUID = 8587867317578819238L;

	/**
	 * 取消原因编码
	 */
	@ApiField("cause_code")
	private String causeCode;

	/**
	 * 取消原因描述
	 */
	@ApiField("cause_msg")
	private String causeMsg;

	/**
	 * 扩展信息json格式字符串
	 */
	@ApiField("extend_info")
	private String extendInfo;

	/**
	 * 参赛者id
	 */
	@ApiField("participant_id")
	private String participantId;

	/**
	 * 外部赛事id
	 */
	@ApiField("source_id")
	private String sourceId;

	public String getCauseCode() {
		return this.causeCode;
	}
	public void setCauseCode(String causeCode) {
		this.causeCode = causeCode;
	}

	public String getCauseMsg() {
		return this.causeMsg;
	}
	public void setCauseMsg(String causeMsg) {
		this.causeMsg = causeMsg;
	}

	public String getExtendInfo() {
		return this.extendInfo;
	}
	public void setExtendInfo(String extendInfo) {
		this.extendInfo = extendInfo;
	}

	public String getParticipantId() {
		return this.participantId;
	}
	public void setParticipantId(String participantId) {
		this.participantId = participantId;
	}

	public String getSourceId() {
		return this.sourceId;
	}
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

}
