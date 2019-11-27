package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分页数据结构
 *
 * @author auto create
 * @since 1.0, 2017-11-08 18:03:34
 */
public class YafeiTestPageDTO extends AlipayObject {

	private static final long serialVersionUID = 1582338847466326115L;

	/**
	 * 每页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 目标页码
	 */
	@ApiField("to_page")
	private Long toPage;

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getToPage() {
		return this.toPage;
	}
	public void setToPage(Long toPage) {
		this.toPage = toPage;
	}

}
