package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序云多端商城店铺列表查询
 *
 * @author auto create
 * @since 1.0, 2024-06-04 20:14:01
 */
public class AlipayCloudCloudpromoMallShopBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 8621541633847854744L;

	/**
	 * 页码
	 */
	@ApiField("page_number")
	private Long pageNumber;

	/**
	 * 单页数量
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
