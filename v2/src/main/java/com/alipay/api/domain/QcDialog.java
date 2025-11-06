package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 离线质检对话
 *
 * @author auto create
 * @since 1.0, 2025-06-06 11:34:43
 */
public class QcDialog extends AlipayObject {

	private static final long serialVersionUID = 8476921336389322574L;

	/**
	 * 文本内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 当前句对话完结时间到服务开始时间偏移量
	 */
	@ApiField("end_offset")
	private String endOffset;

	/**
	 * 结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 句子的序列
	 */
	@ApiField("index")
	private Long index;

	/**
	 * 当前语句的角色
	 */
	@ApiField("role")
	private String role;

	/**
	 * 当前句对话开始时间到服务开始时间偏移量
	 */
	@ApiField("start_offset")
	private String startOffset;

	/**
	 * 时间
	 */
	@ApiField("start_time")
	private Date startTime;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getEndOffset() {
		return this.endOffset;
	}
	public void setEndOffset(String endOffset) {
		this.endOffset = endOffset;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Long getIndex() {
		return this.index;
	}
	public void setIndex(Long index) {
		this.index = index;
	}

	public String getRole() {
		return this.role;
	}
	public void setRole(String role) {
		this.role = role;
	}

	public String getStartOffset() {
		return this.startOffset;
	}
	public void setStartOffset(String startOffset) {
		this.startOffset = startOffset;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

}
