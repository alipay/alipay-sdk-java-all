package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 网吧门店动销数据查询
 *
 * @author auto create
 * @since 1.0, 2025-06-30 13:32:28
 */
public class AlipayEbppIndustryInternetbarShopdataQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6696255859762772923L;

	/**
	 * 日期格式为yyyy-MM-dd，返回结果中包含该日期的数据。结束日期可以等于开始日期，但不能早于开始日期。最大日期跨度180天。
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 本次查询的页码，从1开始。默认为1
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 单页条数，默认100条/页，最大1000条/页
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 日期格式为yyyy-MM-dd，返回结果中包含该日期的数据
	 */
	@ApiField("start_date")
	private String startDate;

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

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

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

}
