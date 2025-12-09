package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 闪蝶分页查询分页信息
 *
 * @author auto create
 * @since 1.0, 2019-12-10 16:02:33
 */
public class MorphoPaginator extends AlipayObject {

	private static final long serialVersionUID = 2886324843492276878L;

	/**
	 * 总页数
	 */
	@ApiField("page_count")
	private Long pageCount;

	/**
	 * 分页查询页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 分页查询分页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 总数
	 */
	@ApiField("total")
	private Long total;

	public Long getPageCount() {
		return this.pageCount;
	}
	public void setPageCount(Long pageCount) {
		this.pageCount = pageCount;
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

	public Long getTotal() {
		return this.total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}

}
