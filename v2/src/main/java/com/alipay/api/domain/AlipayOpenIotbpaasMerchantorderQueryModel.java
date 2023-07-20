package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * IoT商家历史订单查询
 *
 * @author auto create
 * @since 1.0, 2022-10-17 11:10:14
 */
public class AlipayOpenIotbpaasMerchantorderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7723961148947675348L;

	/**
	 * 截止时间
	 */
	@ApiField("end_date")
	private Date endDate;

	/**
	 * 页码
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 每页size
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 开始时间
	 */
	@ApiField("start_date")
	private Date startDate;

	public Date getEndDate() {
		return this.endDate;
	}
	public void setEndDate(Date endDate) {
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

	public Date getStartDate() {
		return this.startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

}
