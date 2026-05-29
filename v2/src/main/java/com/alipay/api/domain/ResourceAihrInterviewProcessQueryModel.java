package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * AI面试流程查询
 *
 * @author auto create
 * @since 1.0, 2026-05-26 13:42:49
 */
public class ResourceAihrInterviewProcessQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8251597685125158775L;

	/**
	 * 固定值，对应系统租户
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 流程名称关键字，用于模糊匹配
	 */
	@ApiField("keyword")
	private String keyword;

	/**
	 * 从1开始，默认为1
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 默认为10，最大100
	 */
	@ApiField("page_size")
	private Long pageSize;

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getKeyword() {
		return this.keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

}
