package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询投放计划列表
 *
 * @author auto create
 * @since 1.0, 2021-06-16 16:41:48
 */
public class AlipayCommerceIotAdvertiserAdBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 7654486622636987471L;

	/**
	 * 是否只要总大小
	 */
	@ApiField("only_total")
	private Boolean onlyTotal;

	/**
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 页大小(<=50)
	 */
	@ApiField("page_size")
	private Long pageSize;

	public Boolean getOnlyTotal() {
		return this.onlyTotal;
	}
	public void setOnlyTotal(Boolean onlyTotal) {
		this.onlyTotal = onlyTotal;
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
