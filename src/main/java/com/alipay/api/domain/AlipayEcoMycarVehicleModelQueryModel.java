package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝基础车型库查询
 *
 * @author auto create
 * @since 1.0, 2022-05-23 09:24:33
 */
public class AlipayEcoMycarVehicleModelQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6173885154864912513L;

	/**
	 * 查询结束时间，开区间，格式为「yyyy-MM-dd HH:mm:ss」，不传默认当前时间
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 页数，最小1、最大10000，不传默认为1
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 每页大小，最小1、最大200，不传默认200
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 查询起始时间，闭区间，格式为「yyyy-MM-dd HH:mm:ss」
	 */
	@ApiField("start_date")
	private String startDate;

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

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

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

}
