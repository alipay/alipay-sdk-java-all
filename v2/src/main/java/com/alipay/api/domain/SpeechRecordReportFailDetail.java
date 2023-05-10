package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 语音播报记录校验失败详情
 *
 * @author auto create
 * @since 1.0, 2022-12-05 10:22:30
 */
public class SpeechRecordReportFailDetail extends AlipayObject {

	private static final long serialVersionUID = 8782959645933889751L;

	/**
	 * 校验错误编码
	 */
	@ApiField("error_code")
	private String errorCode;

	/**
	 * 校验失败详情
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/**
	 * 服务商保证每条播报记录唯一，方便排查对数
	 */
	@ApiField("speech_id")
	private String speechId;

	public String getErrorCode() {
		return this.errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return this.errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getSpeechId() {
		return this.speechId;
	}
	public void setSpeechId(String speechId) {
		this.speechId = speechId;
	}

}
