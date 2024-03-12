package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.serviceutil.buildtext.send response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:27:00
 */
public class AlipayCommerceIotServiceutilBuildtextSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 3424836898218585842L;

	/** 
	 * 语音文件id
	 */
	@ApiField("audio_id")
	private String audioId;

	/** 
	 * 文件md5
	 */
	@ApiField("md_5")
	private String md5;

	/** 
	 * 语音文件url
	 */
	@ApiField("url")
	private String url;

	public void setAudioId(String audioId) {
		this.audioId = audioId;
	}
	public String getAudioId( ) {
		return this.audioId;
	}

	public void setMd5(String md5) {
		this.md5 = md5;
	}
	public String getMd5( ) {
		return this.md5;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	public String getUrl( ) {
		return this.url;
	}

}
