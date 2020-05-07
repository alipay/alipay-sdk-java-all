package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询空间列表
 *
 * @author auto create
 * @since 1.0, 2019-05-22 14:31:13
 */
public class AlipayMarketingToolFengdieSpaceBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 1848754492239484216L;

	/**
	 * 当前页数，默认为1
	 */
	@ApiField("page_number")
	private Long pageNumber;

	/**
	 * 每页记录数，不能超过50，默认为10
	 */
	@ApiField("page_size")
	private Long pageSize;

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

}
