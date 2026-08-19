package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 红票关联与红冲信息
 *
 * @author auto create
 * @since 1.0, 2026-08-14 19:59:20
 */
public class RedRelatedInvoiceInfo extends AlipayObject {

	private static final long serialVersionUID = 2864742932765426339L;

	/**
	 * 原蓝票发票种类；红票可由原票快照补齐
81 数电专用增值税发票，82 数电普通发票
	 */
	@ApiField("origin_invoice_kind")
	private String originInvoiceKind;

	/**
	 * 红票关联的原蓝票发票号码
	 */
	@ApiField("origin_invoice_no")
	private String originInvoiceNo;

	/**
	 * 01 开票有误，02 销货退回，03 服务中止，04 销售折让
	 */
	@ApiField("red_reason")
	private String redReason;

	public String getOriginInvoiceKind() {
		return this.originInvoiceKind;
	}
	public void setOriginInvoiceKind(String originInvoiceKind) {
		this.originInvoiceKind = originInvoiceKind;
	}

	public String getOriginInvoiceNo() {
		return this.originInvoiceNo;
	}
	public void setOriginInvoiceNo(String originInvoiceNo) {
		this.originInvoiceNo = originInvoiceNo;
	}

	public String getRedReason() {
		return this.redReason;
	}
	public void setRedReason(String redReason) {
		this.redReason = redReason;
	}

}
