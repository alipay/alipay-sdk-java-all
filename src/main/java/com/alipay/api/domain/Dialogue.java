package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 具体对话内容
 *
 * @author auto create
 * @since 1.0, 2022-05-20 11:34:53
 */
public class Dialogue extends AlipayObject {

	private static final long serialVersionUID = 8483352967961167595L;

	/**
	 * 开始时间，相对（毫秒）
	 */
	@ApiField("begin")
	private Long begin;

	/**
	 * 结束时间，相对（毫秒）
	 */
	@ApiField("end")
	private Long end;

	/**
	 * 对话下标位置，对话标识
	 */
	@ApiField("pid")
	private Long pid;

	/**
	 * 客服/客户 对话角色
	 */
	@ApiField("role")
	private String role;

	/**
	 * 对话内容
	 */
	@ApiField("text")
	private String text;

	public Long getBegin() {
		return this.begin;
	}
	public void setBegin(Long begin) {
		this.begin = begin;
	}

	public Long getEnd() {
		return this.end;
	}
	public void setEnd(Long end) {
		this.end = end;
	}

	public Long getPid() {
		return this.pid;
	}
	public void setPid(Long pid) {
		this.pid = pid;
	}

	public String getRole() {
		return this.role;
	}
	public void setRole(String role) {
		this.role = role;
	}

	public String getText() {
		return this.text;
	}
	public void setText(String text) {
		this.text = text;
	}

}
