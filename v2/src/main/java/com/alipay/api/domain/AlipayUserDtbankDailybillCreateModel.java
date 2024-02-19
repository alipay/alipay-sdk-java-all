package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 日账单创建
 *
 * @author auto create
 * @since 1.0, 2024-01-30 11:12:18
 */
public class AlipayUserDtbankDailybillCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6446591883356116129L;

	/**
	 * 申请查询的账单类型
	 */
	@ApiField("bill_type")
	private String billType;

	/**
	 * 结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	public String getBillType() {
		return this.billType;
	}
	public void setBillType(String billType) {
		this.billType = billType;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

}
