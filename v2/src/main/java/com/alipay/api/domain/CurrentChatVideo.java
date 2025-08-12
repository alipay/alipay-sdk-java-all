package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 当前对话单个文件
 *
 * @author auto create
 * @since 1.0, 2025-07-11 14:46:41
 */
public class CurrentChatVideo extends AlipayObject {

	private static final long serialVersionUID = 4578621659912629566L;

	/**
	 * 文件类型
	 */
	@ApiField("type")
	private String type;

	/**
	 * 视频详细信息
	 */
	@ApiField("value")
	private VideoValueRequest value;

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public VideoValueRequest getValue() {
		return this.value;
	}
	public void setValue(VideoValueRequest value) {
		this.value = value;
	}

}
