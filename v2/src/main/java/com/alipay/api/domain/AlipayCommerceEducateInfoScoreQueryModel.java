package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 成绩查询接口
 *
 * @author auto create
 * @since 1.0, 2021-04-20 16:12:58
 */
public class AlipayCommerceEducateInfoScoreQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6178771421278882575L;

	/**
	 * 扩展信息，json格式字符串
	 */
	@ApiField("extend_info")
	private String extendInfo;

	/**
	 * 参赛者ID
	 */
	@ApiField("participant_id")
	private String participantId;

	/**
	 * 外部赛事ID
	 */
	@ApiField("source_id")
	private String sourceId;

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
