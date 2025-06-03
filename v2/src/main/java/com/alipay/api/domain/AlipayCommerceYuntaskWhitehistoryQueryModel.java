package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 历史白名单查询
 *
 * @author auto create
 * @since 1.0, 2024-08-08 16:34:44
 */
public class AlipayCommerceYuntaskWhitehistoryQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7659474782565924199L;

	/**
	 * 第几页，分页使用
	 */
	@ApiField("page")
	private Long page;

	/**
	 * 每页数量，分页使用，单位个
	 */
	@ApiField("page_size")
	private Long pageSize;

	public Long getPage() {
		return this.page;
	}
	public void setPage(Long page) {
		this.page = page;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

}
