package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 删除设备上的语音
 *
 * @author auto create
 * @since 1.0, 2019-08-22 22:51:54
 */
public class AlipayCommerceIotDeviceAudioDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 6557674238517448382L;

	/**
	 * 语音id, 也就是语音合成接口返回的audio_id
	 */
	@ApiField("audio_id")
	private String audioId;

	/**
	 * 设备的唯一标识,设备id
	 */
	@ApiField("biz_tid")
	private String bizTid;

	public String getAudioId() {
		return this.audioId;
	}
	public void setAudioId(String audioId) {
		this.audioId = audioId;
	}

	public String getBizTid() {
		return this.bizTid;
	}
	public void setBizTid(String bizTid) {
		this.bizTid = bizTid;
	}

}
