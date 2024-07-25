package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 应收发票纸票红冲
 *
 * @author auto create
 * @since 1.0, 2024-01-22 09:41:22
 */
public class AlipayBossFncOutputinvoiceRedinvoiceApplyModel extends AlipayObject {

	private static final long serialVersionUID = 7282147247571526719L;

	/**
	 * 国际发票红冲申请模型
	 */
	@ApiField("output_invoice_red_apply")
	private OutputInvoiceRedApplyVO outputInvoiceRedApply;

	public OutputInvoiceRedApplyVO getOutputInvoiceRedApply() {
		return this.outputInvoiceRedApply;
	}
	public void setOutputInvoiceRedApply(OutputInvoiceRedApplyVO outputInvoiceRedApply) {
		this.outputInvoiceRedApply = outputInvoiceRedApply;
	}

}
