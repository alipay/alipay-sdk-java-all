package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用于查询所有售卖渠道
 *
 * @author auto create
 * @since 1.0, 2026-07-10 11:06:40
 */
public class ChannelListQueryRequest extends AlipayObject {

	private static final long serialVersionUID = 4546681854512855389L;

	/**
	 * 当前页，默认1
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 每页数量，默认100
	 */
	@ApiField("page_size")
	private Long pageSize;

	public Long getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

}
