package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * BOM主数据标准同步
 *
 * @author auto create
 * @since 1.0, 2026-04-21 15:32:12
 */
public class AntMerchantExpandCorematerialListQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2618535885157721678L;

	/**
	 * 页码（默认1）
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页条数（默认10，最大100）
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
