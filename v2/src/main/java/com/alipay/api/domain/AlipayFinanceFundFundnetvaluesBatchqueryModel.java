package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询基金在给定时间间隔内的净值数据
 *
 * @author auto create
 * @since 1.0, 2018-03-02 18:06:11
 */
public class AlipayFinanceFundFundnetvaluesBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 6475376448276985814L;

	/**
	 * 结束日期，YYYYMMDD
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 基金代码
	 */
	@ApiField("fund_code")
	private String fundCode;

	/**
	 * 分页数，从 1 开始
	 */
	@ApiField("page_num")
	private String pageNum;

	/**
	 * 每页条数
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 开始日期，YYYYMMDD
	 */
	@ApiField("start_date")
	private String startDate;

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getFundCode() {
		return this.fundCode;
	}
	public void setFundCode(String fundCode) {
		this.fundCode = fundCode;
	}

	public String getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

}
