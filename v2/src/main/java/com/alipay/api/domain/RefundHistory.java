package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 提现记录
 *
 * @author auto create
 * @since 1.0, 2023-10-11 09:46:17
 */
public class RefundHistory extends AlipayObject {

	private static final long serialVersionUID = 4354869172678662355L;

	/**
	 * 提现金额(分)
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 提现申请时间
	 */
	@ApiField("create_time")
	private String createTime;

	/**
	 * 提现完成时间
	 */
	@ApiField("finish_time")
	private String finishTime;

	/**
	 * 提现错误信息
	 */
	@ApiField("message")
	private String message;

	/**
	 * 提现单号
	 */
	@ApiField("refund_order_no")
	private String refundOrderNo;

	/**
	 * 提现状态
	 */
	@ApiField("status")
	private String status;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getFinishTime() {
		return this.finishTime;
	}
	public void setFinishTime(String finishTime) {
		this.finishTime = finishTime;
	}

	public String getMessage() {
		return this.message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	public String getRefundOrderNo() {
		return this.refundOrderNo;
	}
	public void setRefundOrderNo(String refundOrderNo) {
		this.refundOrderNo = refundOrderNo;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
