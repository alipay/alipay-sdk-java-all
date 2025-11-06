package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 当前对话多个文件
 *
 * @author auto create
 * @since 1.0, 2025-07-11 14:46:40
 */
public class CurrentChatFiles extends AlipayObject {

	private static final long serialVersionUID = 2229187927931794126L;

	/**
	 * 对应类型
	 */
	@ApiField("type")
	private String type;

	/**
	 * 当前文件信息
	 */
	@ApiListField("value")
	@ApiField("file_value_request")
	private List<FileValueRequest> value;

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public List<FileValueRequest> getValue() {
		return this.value;
	}
	public void setValue(List<FileValueRequest> value) {
		this.value = value;
	}

}
