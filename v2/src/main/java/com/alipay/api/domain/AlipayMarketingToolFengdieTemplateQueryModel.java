package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询当前用户可用的模板列表
 *
 * @author auto create
 * @since 1.0, 2021-01-06 16:28:00
 */
public class AlipayMarketingToolFengdieTemplateQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5257267927249835529L;

	/**
	 * 当前页数，不填本参数默认为 1。
	 */
	@ApiField("page_number")
	private Long pageNumber;

	/**
	 * 查询结果每页记录数，最大不超过 50，不填本参数默认为 10。
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
