package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 应收发票纸票红冲
 *
 * @author auto create
 * @since 1.0, 2023-06-28 18:18:25
 */
public class AlipayBossFncOutputinvoiceRedinvoiceApplyModel extends AlipayObject {

	private static final long serialVersionUID = 1795781582397891387L;

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
