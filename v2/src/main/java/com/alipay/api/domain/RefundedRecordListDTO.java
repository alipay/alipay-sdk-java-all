package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 已退款记录
 *
 * @author auto create
 * @since 1.0, 2024-10-11 09:09:54
 */
public class RefundedRecordListDTO extends AlipayObject {

	private static final long serialVersionUID = 2462177468137819251L;

	/**
	 * 此次退款金额
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 退款触发时间
	 */
	@ApiField("refund_time")
	private Date refundTime;

	/**
	 * 商户退款请求号
	 */
	@ApiField("request_no")
	private String requestNo;

	public String getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

	public Date getRefundTime() {
		return this.refundTime;
	}
	public void setRefundTime(Date refundTime) {
		this.refundTime = refundTime;
	}

	public String getRequestNo() {
		return this.requestNo;
	}
	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

}
