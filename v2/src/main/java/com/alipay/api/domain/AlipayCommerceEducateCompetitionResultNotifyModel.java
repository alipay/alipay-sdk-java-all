package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 赛事录入结果通知接口
 *
 * @author auto create
 * @since 1.0, 2021-05-11 09:22:17
 */
public class AlipayCommerceEducateCompetitionResultNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 2871822215724846523L;

	/**
	 * 录入结果编码
	 */
	@ApiField("result_code")
	private String resultCode;

	/**
	 * 结果描述
	 */
	@ApiField("result_msg")
	private String resultMsg;

	/**
	 * 外部赛事id
	 */
	@ApiField("source_id")
	private String sourceId;

	public String getResultCode() {
		return this.resultCode;
	}
	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMsg() {
		return this.resultMsg;
	}
	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}

	public String getSourceId() {
		return this.sourceId;
	}
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

}
