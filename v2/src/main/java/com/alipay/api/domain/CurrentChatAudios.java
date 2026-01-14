package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 当前对话多个音频
 *
 * @author auto create
 * @since 1.0, 2025-07-11 14:46:40
 */
public class CurrentChatAudios extends AlipayObject {

	private static final long serialVersionUID = 7448141542767799411L;

	/**
	 * 文件类型
	 */
	@ApiField("type")
	private String type;

	/**
	 * 音频文件信息
	 */
	@ApiListField("value")
	@ApiField("audio_value_request")
	private List<AudioValueRequest> value;

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public List<AudioValueRequest> getValue() {
		return this.value;
	}
	public void setValue(List<AudioValueRequest> value) {
		this.value = value;
	}

}
