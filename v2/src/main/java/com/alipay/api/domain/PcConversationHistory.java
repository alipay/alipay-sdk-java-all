package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-10-22 15:37:58
 */
public class PcConversationHistory extends AlipayObject {

	private static final long serialVersionUID = 7556619743286699816L;

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
