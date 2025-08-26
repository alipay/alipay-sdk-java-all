package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开票账单
 *
 * @author auto create
 * @since 1.0, 2023-09-22 14:36:29
 */
public class InvoiceBillItem extends AlipayObject {

	private static final long serialVersionUID = 8828271415557265299L;

	/**
	 * 01 实收开票，02 应收开票
	 */
	@ApiField("invoice_mode")
	private String invoiceMode;

	/**
	 * 外部单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 外部单据类型
	 */
	@ApiField("out_biz_type")
	private String outBizType;

	public String getInvoiceMode() {
		return this.invoiceMode;
	}
	public void setInvoiceMode(String invoiceMode) {
		this.invoiceMode = invoiceMode;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getOutBizType() {
		return this.outBizType;
	}
	public void setOutBizType(String outBizType) {
		this.outBizType = outBizType;
	}

}
