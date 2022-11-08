package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询可关联APP的账号列表
 *
 * @author auto create
 * @since 1.0, 2022-10-10 12:09:47
 */
public class AntMerchantExpandApprecommendAvailableQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1235151169216383284L;

	/**
	 * 页码
	 */
	@ApiField("page_number")
	private Long pageNumber;

	/**
	 * 单页行数，不能超过100行
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
