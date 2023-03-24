package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 文本转语音外呼接口对外
 *
 * @author auto create
 * @since 1.0, 2019-09-06 17:57:39
 */
public class AlipayEcoTextVoiceTransferModel extends AlipayObject {

	private static final long serialVersionUID = 3382336689475778157L;

	/**
	 * 被叫号码
	 */
	@ApiField("called_number")
	private String calledNumber;

	/**
	 * 内部系统编码，回调消息将回传
	 */
	@ApiField("out_id")
	private String outId;

	/**
	 * Tts模板ID
	 */
	@ApiField("tts_code")
	private String ttsCode;

	/**
	 * 替换TTS模板中变量的Map
	 */
	@ApiField("tts_param")
	private String ttsParam;

	public String getCalledNumber() {
		return this.calledNumber;
	}
	public void setCalledNumber(String calledNumber) {
		this.calledNumber = calledNumber;
	}

	public String getOutId() {
		return this.outId;
	}
	public void setOutId(String outId) {
		this.outId = outId;
	}

	public String getTtsCode() {
		return this.ttsCode;
	}
	public void setTtsCode(String ttsCode) {
		this.ttsCode = ttsCode;
	}

	public String getTtsParam() {
		return this.ttsParam;
	}
	public void setTtsParam(String ttsParam) {
		this.ttsParam = ttsParam;
	}

}
