package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家群群组分页查询
 *
 * @author auto create
 * @since 1.0, 2025-04-15 16:34:20
 */
public class AlipayMerchantGroupGroupinfoBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 2822433133447643949L;

	/**
	 * 分页页号
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 分页大小
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
