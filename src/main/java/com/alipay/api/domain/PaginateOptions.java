package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分页配置
 *
 * @author auto create
 * @since 1.0, 2019-08-12 09:57:43
 */
public class PaginateOptions extends AlipayObject {

	private static final long serialVersionUID = 7246639783294481279L;

	/**
	 * 分页数，从1开始，默认为1
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 分页大小，最小为1，默认为5
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
