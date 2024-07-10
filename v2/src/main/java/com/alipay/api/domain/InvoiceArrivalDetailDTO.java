package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票到票明细DTO
 *
 * @author auto create
 * @since 1.0, 2023-08-25 14:54:57
 */
public class InvoiceArrivalDetailDTO extends AlipayObject {

	private static final long serialVersionUID = 6766214156138929172L;

	/**
	 * 到票关系ID
	 */
	@ApiField("arrival_id")
	private Long arrivalId;

	/**
	 * 费用ID
	 */
	@ApiField("expense_id")
	private String expenseId;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_json")
	private String extJson;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 修改时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 到票明细主键
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 发票账单ID
	 */
	@ApiField("invoice_bill_id")
	private Long invoiceBillId;

	/**
	 * 发票ID
	 */
	@ApiField("invoice_id")
	private Long invoiceId;

	/**
	 * 发票行ID
	 */
	@ApiField("invoice_line_id")
	private Long invoiceLineId;

	/**
	 * 到票金额（单位：各币种的“元”单位，精确到小数点后2位）
	 */
	@ApiField("use_amount")
	private String useAmount;

	/**
	 * 代扣税金额（单位：各币种的“元”单位，精确到小数点后2位）
	 */
	@ApiField("wht_amount")
	private String whtAmount;

	/**
	 * 代扣税税率
	 */
	@ApiField("wht_rate")
	private String whtRate;

	public Long getArrivalId() {
		return this.arrivalId;
	}
	public void setArrivalId(Long arrivalId) {
		this.arrivalId = arrivalId;
	}

	public String getExpenseId() {
		return this.expenseId;
	}
	public void setExpenseId(String expenseId) {
		this.expenseId = expenseId;
	}

	public String getExtJson() {
		return this.extJson;
	}
	public void setExtJson(String extJson) {
		this.extJson = extJson;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public Long getInvoiceBillId() {
		return this.invoiceBillId;
	}
	public void setInvoiceBillId(Long invoiceBillId) {
		this.invoiceBillId = invoiceBillId;
	}

	public Long getInvoiceId() {
		return this.invoiceId;
	}
	public void setInvoiceId(Long invoiceId) {
		this.invoiceId = invoiceId;
	}

	public Long getInvoiceLineId() {
		return this.invoiceLineId;
	}
	public void setInvoiceLineId(Long invoiceLineId) {
		this.invoiceLineId = invoiceLineId;
	}

	public String getUseAmount() {
		return this.useAmount;
	}
	public void setUseAmount(String useAmount) {
		this.useAmount = useAmount;
	}

	public String getWhtAmount() {
		return this.whtAmount;
	}
	public void setWhtAmount(String whtAmount) {
		this.whtAmount = whtAmount;
	}

	public String getWhtRate() {
		return this.whtRate;
	}
	public void setWhtRate(String whtRate) {
		this.whtRate = whtRate;
	}

}
