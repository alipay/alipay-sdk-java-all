package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 流量分销商品分页查询
 *
 * @author auto create
 * @since 1.0, 2024-07-11 14:16:37
 */
public class AlipayCommerceAcommunicationDistributionFlowitemBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 8512732186494581181L;

	/**
	 * 分页查询的页码，从1开始
	 */
	@ApiField("page_number")
	private Long pageNumber;

	/**
	 * 页面大小
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
