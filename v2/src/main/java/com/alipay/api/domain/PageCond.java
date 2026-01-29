package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分页查询条件
 *
 * @author auto create
 * @since 1.0, 2026-01-06 19:21:39
 */
public class PageCond extends AlipayObject {

	private static final long serialVersionUID = 3123595125259776198L;

	/**
	 * 分页查询数量
	 */
	@ApiField("limit")
	private Long limit;

	/**
	 * 分页查询偏移量
	 */
	@ApiField("offset")
	private Long offset;

	public Long getLimit() {
		return this.limit;
	}
	public void setLimit(Long limit) {
		this.limit = limit;
	}

	public Long getOffset() {
		return this.offset;
	}
	public void setOffset(Long offset) {
		this.offset = offset;
	}

}
