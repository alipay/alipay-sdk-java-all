package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.device.audio.create response.
 * 
 * @author auto create
 * @since 1.0, 2020-06-03 10:15:56
 */
public class AlipayCommerceIotDeviceAudioCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8822288486384696218L;

	/** 
	 * 语音id
	 */
	@ApiField("audio_id")
	private String audioId;

	/** 
	 * 语音文件的地址.用户可以通过此地址试听合成的语音
	 */
	@ApiField("audio_url")
	private String audioUrl;

	public void setAudioId(String audioId) {
		this.audioId = audioId;
	}
	public String getAudioId( ) {
		return this.audioId;
	}

	public void setAudioUrl(String audioUrl) {
		this.audioUrl = audioUrl;
	}
	public String getAudioUrl( ) {
		return this.audioUrl;
	}

}
