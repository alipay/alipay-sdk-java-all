package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分页查询后的结果
 *
 * @author auto create
 * @since 1.0, 2017-10-12 10:54:23
 */
public class PromoPageResult extends AlipayObject {

	private static final long serialVersionUID = 1332334747387881899L;

	/**
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页多少条
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 总条数
	 */
	@ApiField("total_count")
	private Long totalCount;

	/**
	 * 总共有多少页
	 */
	@ApiField("total_pages")
	private Long totalPages;

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

	public Long getTotalCount() {
		return this.totalCount;
	}
	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public Long getTotalPages() {
		return this.totalPages;
	}
	public void setTotalPages(Long totalPages) {
		this.totalPages = totalPages;
	}

}
