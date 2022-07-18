package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 凤蝶分页数据模型
 *
 * @author auto create
 * @since 1.0, 2018-10-22 16:58:45
 */
public class FengdieListPaginator extends AlipayObject {

	private static final long serialVersionUID = 2783194361398748135L;

	/**
	 * 总页数
	 */
	@ApiField("page_count")
	private Long pageCount;

	/**
	 * 当前页码
	 */
	@ApiField("page_number")
	private Long pageNumber;

	/**
	 * 每页显示记录数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 符合条件的记录总数
	 */
	@ApiField("total")
	private Long total;

	public Long getPageCount() {
		return this.pageCount;
	}
	public void setPageCount(Long pageCount) {
		this.pageCount = pageCount;
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}
	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getTotal() {
		return this.total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}

}
