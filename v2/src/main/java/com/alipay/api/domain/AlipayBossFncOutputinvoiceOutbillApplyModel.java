package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 外部单据申请开票
 *
 * @author auto create
 * @since 1.0, 2024-01-22 09:39:20
 */
public class AlipayBossFncOutputinvoiceOutbillApplyModel extends AlipayObject {

	private static final long serialVersionUID = 6622793429985565398L;

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
	 * 开票受理列表
	 */
	@ApiListField("invoice_applys")
	@ApiField("invoice_apply_open_api")
	private List<InvoiceApplyOpenApi> invoiceApplys;

	/**
	 * 发票票面备注、Remarks
	 */
	@ApiField("invoice_note")
	private String invoiceNote;

	/**
	 * 申请原因、备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 员工的工号
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 默认:false（需要按照规则渲染）,为true时代表外部控制发票样式 不通过规则渲染
	 */
	@ApiField("render_without_rule")
	private Boolean renderWithoutRule;

	/**
	 * 调用来源系统
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

	public List<InvoiceApplyOpenApi> getInvoiceApplys() {
		return this.invoiceApplys;
	}
	public void setInvoiceApplys(List<InvoiceApplyOpenApi> invoiceApplys) {
		this.invoiceApplys = invoiceApplys;
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

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
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
