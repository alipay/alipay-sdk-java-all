package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * Nimitz 专用分页条件
 *
 * @author auto create
 * @since 1.0, 2022-06-10 15:34:29
 */
public class NimitzPageCond extends AlipayObject {

	private static final long serialVersionUID = 1496382565562885158L;

	/**
	 * 分页查询数量，可以理解成 SQL 里的 limit
	 */
	@ApiField("limit")
	private Long limit;

	/**
	 * 分页查询偏移量，可以理解成 SQL 里的 offset
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
