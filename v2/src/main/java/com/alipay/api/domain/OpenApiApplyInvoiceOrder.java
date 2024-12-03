package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量预览发票融合信息
 *
 * @author auto create
 * @since 1.0, 2023-10-12 20:42:25
 */
public class OpenApiApplyInvoiceOrder extends AlipayObject {

	private static final long serialVersionUID = 8276788897668419812L;

	/**
	 * 调用方身份识别标记(应用名称) 与业务单据号联合唯一 必填
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
	 * 开票账单集合
	 */
	@ApiListField("invoice_bill_items")
	@ApiField("invoice_bill_item")
	private List<InvoiceBillItem> invoiceBillItems;

	/**
	 * 发票备注
	 */
	@ApiField("invoice_note")
	private String invoiceNote;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 申请人的2088账号，小二传工号
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 申请人的2088账号，小二传工号
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 操作人类型ALIPAY_UID代表2088UID，ALIPAY_OPENID代表openID，WORK_ID代表工号
	 */
	@ApiField("operator_type")
	private String operatorType;

	/**
	 * 系统来源，描述该请求来自于哪个系统
	 */
	@ApiField("source")
	private String source;

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

	public List<InvoiceBillItem> getInvoiceBillItems() {
		return this.invoiceBillItems;
	}
	public void setInvoiceBillItems(List<InvoiceBillItem> invoiceBillItems) {
		this.invoiceBillItems = invoiceBillItems;
	}

	public String getInvoiceNote() {
		return this.invoiceNote;
	}
	public void setInvoiceNote(String invoiceNote) {
		this.invoiceNote = invoiceNote;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getOperatorType() {
		return this.operatorType;
	}
	public void setOperatorType(String operatorType) {
		this.operatorType = operatorType;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

}
