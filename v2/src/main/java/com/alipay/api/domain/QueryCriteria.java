package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智能触达查询条件
 *
 * @author auto create
 * @since 1.0, 2024-11-13 11:35:55
 */
public class QueryCriteria extends AlipayObject {

	private static final long serialVersionUID = 2344976934437649154L;

	/**
	 * 输入结束时间时，开始时间不能为空
	 */
	@ApiField("end_date")
	private Date endDate;

	/**
	 * 如果输入开始外呼时间,默认查询开始日期后30天
	 */
	@ApiField("start_date")
	private Date startDate;

	public Date getEndDate() {
		return this.endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getStartDate() {
		return this.startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

}
