package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票红冲申请模型
 *
 * @author auto create
 * @since 1.0, 2023-09-13 10:06:17
 */
public class OutputInvoiceRedApplyVO extends AlipayObject {

	private static final long serialVersionUID = 1451988941431237725L;

	/**
	 * 蓝字发票代码
	 */
	@ApiField("blue_invoice_code")
	private String blueInvoiceCode;

	/**
	 * 蓝字发票号， 传要红冲的那张发票的发票号
	 */
	@ApiField("blue_invoice_no")
	private String blueInvoiceNo;

	/**
	 * 发票介质
01 电子,02 纸质
	 */
	@ApiField("invoice_material")
	private String invoiceMaterial;

	/**
	 * 国际形势发票类型：41，42，43，44，04
	 */
	@ApiField("invoice_type")
	private String invoiceType;

	/**
	 * 操作人
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 红冲金额
	 */
	@ApiField("red_amt")
	private String redAmt;

	/**
	 * 红冲作废原因类型
投递失败退回：01，开票信息错误：02，其它：03，销货退回：04，服务终止：05，销售折让：06
	 */
	@ApiField("red_invalid_reason_type")
	private String redInvalidReasonType;

	/**
	 * 税务通知单号
	 */
	@ApiField("red_notice_no")
	private String redNoticeNo;

	/**
	 * 红冲原因
	 */
	@ApiField("red_reason")
	private String redReason;

	public String getBlueInvoiceCode() {
		return this.blueInvoiceCode;
	}
	public void setBlueInvoiceCode(String blueInvoiceCode) {
		this.blueInvoiceCode = blueInvoiceCode;
	}

	public String getBlueInvoiceNo() {
		return this.blueInvoiceNo;
	}
	public void setBlueInvoiceNo(String blueInvoiceNo) {
		this.blueInvoiceNo = blueInvoiceNo;
	}

	public String getInvoiceMaterial() {
		return this.invoiceMaterial;
	}
	public void setInvoiceMaterial(String invoiceMaterial) {
		this.invoiceMaterial = invoiceMaterial;
	}

	public String getInvoiceType() {
		return this.invoiceType;
	}
	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getRedAmt() {
		return this.redAmt;
	}
	public void setRedAmt(String redAmt) {
		this.redAmt = redAmt;
	}

	public String getRedInvalidReasonType() {
		return this.redInvalidReasonType;
	}
	public void setRedInvalidReasonType(String redInvalidReasonType) {
		this.redInvalidReasonType = redInvalidReasonType;
	}

	public String getRedNoticeNo() {
		return this.redNoticeNo;
	}
	public void setRedNoticeNo(String redNoticeNo) {
		this.redNoticeNo = redNoticeNo;
	}

	public String getRedReason() {
		return this.redReason;
	}
	public void setRedReason(String redReason) {
		this.redReason = redReason;
	}

}
