package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量账单号查询月账单客户视图
 *
 * @author auto create
 * @since 1.0, 2020-04-07 17:22:02
 */
public class AlipayBossFncApbillBillcustviewBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 4615363922127959871L;

	/**
	 * 月账单号列表
	 */
	@ApiListField("bill_nos")
	@ApiField("string")
	private List<String> billNos;

	/**
	 * 发票种类{"01":"增值税专用发票","02":"增值税普通发票","05":"其它发票","07":"虚拟发票"}
	 */
	@ApiField("invoice_type")
	private String invoiceType;

	public List<String> getBillNos() {
		return this.billNos;
	}
	public void setBillNos(List<String> billNos) {
		this.billNos = billNos;
	}

	public String getInvoiceType() {
		return this.invoiceType;
	}
	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}

}
