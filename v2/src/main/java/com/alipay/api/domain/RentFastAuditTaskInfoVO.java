package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 极速审核任务明细
 *
 * @author auto create
 * @since 1.0, 2025-08-22 20:57:19
 */
public class RentFastAuditTaskInfoVO extends AlipayObject {

	private static final long serialVersionUID = 4116625477564381414L;

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
