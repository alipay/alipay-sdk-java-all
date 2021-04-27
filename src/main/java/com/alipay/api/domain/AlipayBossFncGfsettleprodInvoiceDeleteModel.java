package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 统一结算发票作废
 *
 * @author auto create
 * @since 1.0, 2021-01-29 15:42:08
 */
public class AlipayBossFncGfsettleprodInvoiceDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 4666553483748732552L;

	/**
	 * 发票操作对象
	 */
	@ApiField("invoice_operate_param")
	private InvoiceOperateParam invoiceOperateParam;

	public InvoiceOperateParam getInvoiceOperateParam() {
		return this.invoiceOperateParam;
	}
	public void setInvoiceOperateParam(InvoiceOperateParam invoiceOperateParam) {
		this.invoiceOperateParam = invoiceOperateParam;
	}

}
