package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 还款账单修改
 *
 * @author auto create
 * @since 1.0, 2020-09-30 16:28:43
 */
public class AlipayTradeRepaybillModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4173771377348363114L;

	/**
	 * 要修改的目标相对金额； 如果要在原先的金额上增加则使用正数，要在原来的基础上减少则使用负数。注意：只有operation_type为金额修改类操作，这个值才有效
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 支付宝还款账单编号
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * 要修改的账单状态，注意：只有operation_type为状态修改类操作，这个值才有效
	 */
	@ApiField("bill_status")
	private String billStatus;

	/**
	 * 该接口可以支持不同类型的修改操作，包括金额和账单状态。

MODIFY_BILL_AMOUNT ：修改账单金额；
MODIFY_BILL_OVERDUE_AMOUNT： 修改账单逾期罚息金额；
MODIFY_PAID_AMOUNT：修改账单金额；
MODIFY_REVOKE_AMOUNT：修改还款前撤销金额；
MODIFY_PAID_REVOKE_AMOUNT：修改支付撤销金额；
MODIFY_BILL_STATUS：修改账单状态
	 */
	@ApiField("operation_type")
	private String operationType;

	/**
	 * 本次修改请求的请求号，用于做幂等控制，针对同一笔账单做不同修改out_request_no不能相同，如果相同则代表是重复请求
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBillNo() {
		return this.billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public String getBillStatus() {
		return this.billStatus;
	}
	public void setBillStatus(String billStatus) {
		this.billStatus = billStatus;
	}

	public String getOperationType() {
		return this.operationType;
	}
	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

}
