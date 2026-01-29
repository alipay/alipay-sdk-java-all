package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 每日结算明细账单查询
 *
 * @author auto create
 * @since 1.0, 2026-01-09 10:41:08
 */
public class AlipayOpenMiniBillDailyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1294685168137718324L;

	/**
	 * 分页页码，从1开始
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 分页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 要查询的核销日期，格式：yyyyMMdd
	 */
	@ApiField("use_date")
	private String useDate;

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

	public String getUseDate() {
		return this.useDate;
	}
	public void setUseDate(String useDate) {
		this.useDate = useDate;
	}

}
