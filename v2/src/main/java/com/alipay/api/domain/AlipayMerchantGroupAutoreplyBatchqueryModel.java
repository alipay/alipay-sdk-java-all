package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分页查询自动回复列表
 *
 * @author auto create
 * @since 1.0, 2025-08-07 10:32:37
 */
public class AlipayMerchantGroupAutoreplyBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 8461831599776982116L;

	/**
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页条数
	 */
	@ApiField("page_size")
	private Long pageSize;

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
