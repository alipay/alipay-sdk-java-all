package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 当日收款汇总
 *
 * @author auto create
 * @since 1.0, 2022-09-16 10:15:41
 */
public class MerchantIndirectCollectionListDataTradeSummary extends AlipayObject {

	private static final long serialVersionUID = 7731716934732653824L;

	/**
	 * 当日日期
	 */
	@ApiField("date_time")
	private Date dateTime;

	/**
	 * 当日累计退款金额
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 当日收款累计金额
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * 当日收款累计笔数
	 */
	@ApiField("total_count")
	private Long totalCount;

	public Date getDateTime() {
		return this.dateTime;
	}
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	public String getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}
	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

}
