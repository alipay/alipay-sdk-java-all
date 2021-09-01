package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 自定义语音播报结构体
 *
 * @author auto create
 * @since 1.0, 2021-04-07 21:34:49
 */
public class CustomVoiceVO extends AlipayObject {

	private static final long serialVersionUID = 2385873762611252228L;

	/**
	 * 语音文件id
	 */
	@ApiField("audio_id")
	private String audioId;

	public String getAudioId() {
		return this.audioId;
	}
	public void setAudioId(String audioId) {
		this.audioId = audioId;
	}

}
