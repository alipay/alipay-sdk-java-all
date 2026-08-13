package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 苹果专享分期额度券信息
 *
 * @author auto create
 * @since 1.0, 2026-08-13 16:29:29
 */
public class AppleVoucherQueryItem extends AlipayObject {

	private static final long serialVersionUID = 1767671642977888681L;

	/**
	 * 券额度，单位分
	 */
	@ApiField("credit_amount")
	private String creditAmount;

	/**
	 * 活动结束时间
	 */
	@ApiField("end_date")
	private Date endDate;

	/**
	 * 额度券实例号
	 */
	@ApiField("instance_no")
	private String instanceNo;

	/**
	 * 活动开始时间
	 */
	@ApiField("start_date")
	private Date startDate;

	/**
	 * valid表示生效
	 */
	@ApiField("status")
	private String status;

	public String getCreditAmount() {
		return this.creditAmount;
	}
	public void setCreditAmount(String creditAmount) {
		this.creditAmount = creditAmount;
	}

	public Date getEndDate() {
		return this.endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getInstanceNo() {
		return this.instanceNo;
	}
	public void setInstanceNo(String instanceNo) {
		this.instanceNo = instanceNo;
	}

	public Date getStartDate() {
		return this.startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
