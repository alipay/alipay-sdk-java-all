package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序收藏tips引导投放批量查询
 *
 * @author auto create
 * @since 1.0, 2022-05-25 20:31:49
 */
public class AlipayOpenMiniTipsDeliveryBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 7635988728916544884L;

	/**
	 * 每页记录条数，最小1，最大20
	 */
	@ApiField("page_number")
	private String pageNumber;

	/**
	 * 查询的页数，从1开始，最大1000
	 */
	@ApiField("page_size")
	private String pageSize;

	public String getPageNumber() {
		return this.pageNumber;
	}
	public void setPageNumber(String pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

}
