package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-03-26 17:26:07
 */
public class Conversation extends AlipayObject {

	private static final long serialVersionUID = 4559134858461564536L;

	/**
	 * 对话内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 对话时间
	 */
	@ApiField("create_time")
	private String createTime;

	/**
	 * 对话角色
	 */
	@ApiField("role")
	private String role;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getRole() {
		return this.role;
	}
	public void setRole(String role) {
		this.role = role;
	}

}
