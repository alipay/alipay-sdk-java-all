package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订阅支付明细查询
 *
 * @author auto create
 * @since 1.0, 2026-07-15 10:12:54
 */
public class AlipayTradeSubscriptionPaymentQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4866268159914771832L;

	/**
	 * 筛选支付成功的截止时间（筛选时不包含该时刻），按照返回结果的gmt_occur为筛选目标；不传默认为当天截止时间不传默认为当天截止时间，如2026-06-30 23:59:59。开始时间和截止时间不能超过31天。
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 分页页数，从1开始
	 */
	@ApiField("page_no")
	private String pageNo;

	/**
	 * 分页大小，不传，默认20；最大50
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 筛选支付成功的开始时间（筛选时包含该时刻），按照返回结果的gmt_occur为筛选目标；不传默认为当天的凌晨如2026-06-30 00:00:00。开始时间和截止时间不能超过31天。
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 需要查询的支付流水对应的订阅ID
	 */
	@ApiField("subscription_id")
	private String subscriptionId;

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getSubscriptionId() {
		return this.subscriptionId;
	}
	public void setSubscriptionId(String subscriptionId) {
		this.subscriptionId = subscriptionId;
	}

}
