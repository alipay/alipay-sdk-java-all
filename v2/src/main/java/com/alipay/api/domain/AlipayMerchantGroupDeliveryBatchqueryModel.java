package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 批量查询推广计划
 *
 * @author auto create
 * @since 1.0, 2024-10-31 16:15:19
 */
public class AlipayMerchantGroupDeliveryBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 2371877939986461558L;

	/**
	 * 当前页,表示查询的第几页。取值单位是"页"。
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 分页查询每页最大条数，支持每页最大50条。取值单位是"条"。
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
