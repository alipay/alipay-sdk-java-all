package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 音频文件信息
 *
 * @author auto create
 * @since 1.0, 2025-07-11 14:46:40
 */
public class AudioValueRequest extends AlipayObject {

	private static final long serialVersionUID = 2422854251238353519L;

	/**
	 * aftsid，为蚂蚁中间件afts返回
	 */
	@ApiField("audio_id")
	private String audioId;

	/**
	 * 文件名
	 */
	@ApiField("audio_name")
	private String audioName;

	/**
	 * 音频大小,单位为B
	 */
	@ApiField("audio_size")
	private Long audioSize;

	/**
	 * 文件类型
	 */
	@ApiField("audio_type")
	private String audioType;

	public String getAudioId() {
		return this.audioId;
	}
	public void setAudioId(String audioId) {
		this.audioId = audioId;
	}

	public String getAudioName() {
		return this.audioName;
	}
	public void setAudioName(String audioName) {
		this.audioName = audioName;
	}

	public Long getAudioSize() {
		return this.audioSize;
	}
	public void setAudioSize(Long audioSize) {
		this.audioSize = audioSize;
	}

	public String getAudioType() {
		return this.audioType;
	}
	public void setAudioType(String audioType) {
		this.audioType = audioType;
	}

}
