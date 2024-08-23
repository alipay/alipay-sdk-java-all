package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 销项发票预览接口
 *
 * @author auto create
 * @since 1.0, 2023-11-01 11:33:43
 */
public class AlipayBossFncOutputinvoicePreviewModel extends AlipayObject {

	private static final long serialVersionUID = 2121415883833681641L;

	/**
	 * 调用方身份识别标记(应用名称) 与业务单据号联合唯一
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 一般时传你系统的业务单据号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 这张发票要开多少钱
	 */
	@ApiField("invoice_amt")
	private MultiCurrencyMoneyOpenApi invoiceAmt;

	/**
	 * 有账单开票的情况下此参数必填
	 */
	@ApiListField("invoice_bill_items")
	@ApiField("invoice_bill_item")
	private List<InvoiceBillItem> invoiceBillItems;

	/**
	 * 发票票面备注，会打印打发票备注栏
	 */
	@ApiField("invoice_note")
	private String invoiceNote;

	/**
	 * 多邮寄地址的情况下可以指定邮寄地址
	 */
	@ApiField("mail_id")
	private String mailId;

	/**
	 * 申请原因，描述申请此次发票的原因，方便以后追溯
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 申请人，商户则填写2088账号内部小儿请写工号
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 集团模式可以在次参数内部指定开给那个ipRoleId各开多少钱
	 */
	@ApiListField("output_apply_invoice_detail_orders")
	@ApiField("output_apply_invoice_detail_order")
	private List<OutputApplyInvoiceDetailOrder> outputApplyInvoiceDetailOrders;

	/**
	 * 开票申请外部单,外部单据开票时指定
	 */
	@ApiListField("output_invoice_apply_orders")
	@ApiField("invoice_apply_open_api")
	private List<InvoiceApplyOpenApi> outputInvoiceApplyOrders;

	/**
	 * 默认:false（需要按照规则渲染）,为true时代表外部控制发票样式 不通过规则渲染
	 */
	@ApiField("render_without_rule")
	private Boolean renderWithoutRule;

	/**
	 * 来源系统的名称
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

	public String getMailId() {
		return this.mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
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

	public List<OutputApplyInvoiceDetailOrder> getOutputApplyInvoiceDetailOrders() {
		return this.outputApplyInvoiceDetailOrders;
	}
	public void setOutputApplyInvoiceDetailOrders(List<OutputApplyInvoiceDetailOrder> outputApplyInvoiceDetailOrders) {
		this.outputApplyInvoiceDetailOrders = outputApplyInvoiceDetailOrders;
	}

	public List<InvoiceApplyOpenApi> getOutputInvoiceApplyOrders() {
		return this.outputInvoiceApplyOrders;
	}
	public void setOutputInvoiceApplyOrders(List<InvoiceApplyOpenApi> outputInvoiceApplyOrders) {
		this.outputInvoiceApplyOrders = outputInvoiceApplyOrders;
	}

	public Boolean getRenderWithoutRule() {
		return this.renderWithoutRule;
	}
	public void setRenderWithoutRule(Boolean renderWithoutRule) {
		this.renderWithoutRule = renderWithoutRule;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

}
