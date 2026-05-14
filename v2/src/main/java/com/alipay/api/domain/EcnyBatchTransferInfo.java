package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-05-14 10:17:45
 */
public class EcnyBatchTransferInfo extends AlipayObject {

	private static final long serialVersionUID = 5312153585929741557L;

	/**
	 * 金额，单位：元，精确到小数点后两位
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 失败原因，转账失败时必填
	 */
	@ApiField("fail_reason")
	private String failReason;

	/**
	 * 支付时间，转账成功时必填
	 */
	@ApiField("gmt_pay")
	private Date gmtPay;

	/**
	 * 转账备注，不可使用特殊字符，如 /，=，& ，<，>等
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 网商银行订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 请求方订单号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 状态，枚举值：INIT-处理中，SUCCESS-交易成功，FAIL-交易失败
	 */
	@ApiField("status")
	private String status;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getFailReason() {
		return this.failReason;
	}
	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}

	public Date getGmtPay() {
		return this.gmtPay;
	}
	public void setGmtPay(Date gmtPay) {
		this.gmtPay = gmtPay;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
