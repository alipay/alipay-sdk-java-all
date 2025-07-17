package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 当前对话单个文件
 *
 * @author auto create
 * @since 1.0, 2025-07-11 14:46:40
 */
public class CurrentChatFile extends AlipayObject {

	private static final long serialVersionUID = 6826587978924261497L;

	/**
	 * 文件类型
	 */
	@ApiField("type")
	private String type;

	/**
	 * 文件详细参数
	 */
	@ApiField("value")
	private FileValueRequest value;

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public FileValueRequest getValue() {
		return this.value;
	}
	public void setValue(FileValueRequest value) {
		this.value = value;
	}

}
