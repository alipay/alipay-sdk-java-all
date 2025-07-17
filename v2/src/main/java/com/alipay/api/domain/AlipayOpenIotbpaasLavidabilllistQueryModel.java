package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * Lavida小键盘账单交易列表查询
 *
 * @author auto create
 * @since 1.0, 2022-10-17 11:10:56
 */
public class AlipayOpenIotbpaasLavidabilllistQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1532495925325249414L;

	/**
	 * 页码，从1开始
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 分页大小，最大不超过20
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 查询日期
	 */
	@ApiField("query_date")
	private String queryDate;

	public Long getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getQueryDate() {
		return this.queryDate;
	}
	public void setQueryDate(String queryDate) {
		this.queryDate = queryDate;
	}

}
