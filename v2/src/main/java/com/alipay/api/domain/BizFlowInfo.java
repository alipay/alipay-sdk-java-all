package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-06-23 17:07:57
 */
public class BizFlowInfo extends AlipayObject {

	private static final long serialVersionUID = 3621565167324328112L;

	/**
	 * 业务发生额，币种为人民币(元)
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 业务单时间
	 */
	@ApiField("biz_date")
	private Date bizDate;

	/**
	 * 业务单据号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 仅支持字母、数字，该条流水的唯一标识
	 */
	@ApiField("flow_no")
	private String flowNo;

	/**
	 * 成功
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 业务单收款方账号
	 */
	@ApiField("payee_account_no")
	private String payeeAccountNo;

	/**
	 * 业务单付款方账号
	 */
	@ApiField("payer_account_no")
	private String payerAccountNo;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public Date getBizDate() {
		return this.bizDate;
	}
	public void setBizDate(Date bizDate) {
		this.bizDate = bizDate;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getFlowNo() {
		return this.flowNo;
	}
	public void setFlowNo(String flowNo) {
		this.flowNo = flowNo;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getPayeeAccountNo() {
		return this.payeeAccountNo;
	}
	public void setPayeeAccountNo(String payeeAccountNo) {
		this.payeeAccountNo = payeeAccountNo;
	}

	public String getPayerAccountNo() {
		return this.payerAccountNo;
	}
	public void setPayerAccountNo(String payerAccountNo) {
		this.payerAccountNo = payerAccountNo;
	}

}
