package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 极速审核任务信息
 *
 * @author auto create
 * @since 1.0, 2025-01-08 19:56:18
 */
public class FastAuditTaskInfoVO extends AlipayObject {

	private static final long serialVersionUID = 6685188384548139359L;

	/**
	 * 审核任务内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 审核任务类型
	 */
	@ApiField("type")
	private String type;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
