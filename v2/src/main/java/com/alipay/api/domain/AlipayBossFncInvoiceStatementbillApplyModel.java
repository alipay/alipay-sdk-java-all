package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 应收开票申请(根据查询到的对账单申请)
 *
 * @author auto create
 * @since 1.0, 2019-09-05 16:28:03
 */
public class AlipayBossFncInvoiceStatementbillApplyModel extends AlipayObject {

	private static final long serialVersionUID = 8618992451615448592L;

	/**
	 * 调用方身份识别标记(应用名称) 与业务单据号联合唯一
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 业务单据号，业务流水号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 开票总金额，开票金额不能为空，开票金额不能小于等于0
	 */
	@ApiField("invoice_amt")
	private MultiCurrencyMoneyOpenApi invoiceAmt;

	/**
	 * 申请开票类型，01：专票；02：普票
	 */
	@ApiField("invoice_type")
	private String invoiceType;

	/**
	 * 申请开票原因说明
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 申请开票的操作人
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 需要开票的对账单编号
	 */
	@ApiField("statement_bill_list")
	private String statementBillList;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public MultiCurrencyMoneyOpenApi getInvoiceAmt() {
		return this.invoiceAmt;
	}
	public void setInvoiceAmt(MultiCurrencyMoneyOpenApi invoiceAmt) {
		this.invoiceAmt = invoiceAmt;
	}

	public String getInvoiceType() {
		return this.invoiceType;
	}
	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getStatementBillList() {
		return this.statementBillList;
	}
	public void setStatementBillList(String statementBillList) {
		this.statementBillList = statementBillList;
	}

}
