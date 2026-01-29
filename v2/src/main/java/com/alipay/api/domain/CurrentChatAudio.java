package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 当前对话单个音频
 *
 * @author auto create
 * @since 1.0, 2025-07-11 14:46:40
 */
public class CurrentChatAudio extends AlipayObject {

	private static final long serialVersionUID = 4223885852342326632L;

	/**
	 * 文件类型
	 */
	@ApiField("type")
	private String type;

	/**
	 * 音频文件详细信息
	 */
	@ApiField("value")
	private AudioValueRequest value;

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public AudioValueRequest getValue() {
		return this.value;
	}
	public void setValue(AudioValueRequest value) {
		this.value = value;
	}

}
