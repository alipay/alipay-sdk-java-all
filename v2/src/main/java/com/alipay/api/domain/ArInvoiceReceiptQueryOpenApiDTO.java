package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 基于对账单开票单据查询结果返回
 *
 * @author auto create
 * @since 1.0, 2020-04-14 17:31:21
 */
public class ArInvoiceReceiptQueryOpenApiDTO extends AlipayObject {

	private static final long serialVersionUID = 5664383232371571275L;

	/**
	 * 合约号
	 */
	@ApiField("arrangement_no")
	private String arrangementNo;

	/**
	 * 开票单据id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 我方ou
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 开票时间
	 */
	@ApiField("inv_dt")
	private String invDt;

	/**
	 * 开票模式
01 实收开票
02 应收开票
03 累计实收开票
	 */
	@ApiField("inv_mode")
	private String invMode;

	/**
	 * 可开票金额
	 */
	@ApiField("invoice_amt")
	private MultiCurrencyMoneyOpenApi invoiceAmt;

	/**
	 * 已开票金额
	 */
	@ApiField("invoiced_amt")
	private MultiCurrencyMoneyOpenApi invoicedAmt;

	/**
	 * 商户号（可能为空）
	 */
	@ApiField("ip_id")
	private String ipId;

	/**
	 * 商户pid
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 已关联发票金额
	 */
	@ApiField("link_invoice_amt")
	private MultiCurrencyMoneyOpenApi linkInvoiceAmt;

	/**
	 * 外部单据号（对应月账单号或者结算单号）
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 产品码
	 */
	@ApiField("pd_code")
	private String pdCode;

	/**
	 * 结算类型 
01实时，02预收 03后收 04周期性 05按日汇总 06周期性 09 延期结算
	 */
	@ApiField("settle_type")
	private String settleType;

	/**
	 * 对账单号
	 */
	@ApiField("statement_bill_no")
	private String statementBillNo;

	/**
	 * 开票状态
01 未开票
02 部分开票
03 完全开票
	 */
	@ApiField("status")
	private String status;

	/**
	 * 税率
	 */
	@ApiField("tax_rate")
	private Long taxRate;

	/**
	 * 税种
01 增值税
02 营业税
	 */
	@ApiField("tax_type")
	private String taxType;

	public String getArrangementNo() {
		return this.arrangementNo;
	}
	public void setArrangementNo(String arrangementNo) {
		this.arrangementNo = arrangementNo;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getInvDt() {
		return this.invDt;
	}
	public void setInvDt(String invDt) {
		this.invDt = invDt;
	}

	public String getInvMode() {
		return this.invMode;
	}
	public void setInvMode(String invMode) {
		this.invMode = invMode;
	}

	public MultiCurrencyMoneyOpenApi getInvoiceAmt() {
		return this.invoiceAmt;
	}
	public void setInvoiceAmt(MultiCurrencyMoneyOpenApi invoiceAmt) {
		this.invoiceAmt = invoiceAmt;
	}

	public MultiCurrencyMoneyOpenApi getInvoicedAmt() {
		return this.invoicedAmt;
	}
	public void setInvoicedAmt(MultiCurrencyMoneyOpenApi invoicedAmt) {
		this.invoicedAmt = invoicedAmt;
	}

	public String getIpId() {
		return this.ipId;
	}
	public void setIpId(String ipId) {
		this.ipId = ipId;
	}

	public String getIpRoleId() {
		return this.ipRoleId;
	}
	public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}

	public MultiCurrencyMoneyOpenApi getLinkInvoiceAmt() {
		return this.linkInvoiceAmt;
	}
	public void setLinkInvoiceAmt(MultiCurrencyMoneyOpenApi linkInvoiceAmt) {
		this.linkInvoiceAmt = linkInvoiceAmt;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPdCode() {
		return this.pdCode;
	}
	public void setPdCode(String pdCode) {
		this.pdCode = pdCode;
	}

	public String getSettleType() {
		return this.settleType;
	}
	public void setSettleType(String settleType) {
		this.settleType = settleType;
	}

	public String getStatementBillNo() {
		return this.statementBillNo;
	}
	public void setStatementBillNo(String statementBillNo) {
		this.statementBillNo = statementBillNo;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public Long getTaxRate() {
		return this.taxRate;
	}
	public void setTaxRate(Long taxRate) {
		this.taxRate = taxRate;
	}

	public String getTaxType() {
		return this.taxType;
	}
	public void setTaxType(String taxType) {
		this.taxType = taxType;
	}

}
