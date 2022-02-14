package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 开即时配送订单发票
 *
 * @author auto create
 * @since 1.0, 2021-03-31 10:26:01
 */
public class AlipayCommerceLogisticsInvoiceIstdwaybillCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2246926511213731453L;

	/**
	 * 发票信息
	 */
	@ApiField("invoice")
	private Invoice invoice;

	/**
	 * 即时配送公司编码
	 */
	@ApiField("logistics_code")
	private String logisticsCode;

	/**
	 * 开票请求流水号
	 */
	@ApiField("out_invoice_request_no")
	private String outInvoiceRequestNo;

	/**
	 * 即时配送运单列表
	 */
	@ApiListField("waybill_invoices")
	@ApiField("waybill_invoice")
	private List<WaybillInvoice> waybillInvoices;

	public Invoice getInvoice() {
		return this.invoice;
	}
	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}

	public String getLogisticsCode() {
		return this.logisticsCode;
	}
	public void setLogisticsCode(String logisticsCode) {
		this.logisticsCode = logisticsCode;
	}

	public String getOutInvoiceRequestNo() {
		return this.outInvoiceRequestNo;
	}
	public void setOutInvoiceRequestNo(String outInvoiceRequestNo) {
		this.outInvoiceRequestNo = outInvoiceRequestNo;
	}

	public List<WaybillInvoice> getWaybillInvoices() {
		return this.waybillInvoices;
	}
	public void setWaybillInvoices(List<WaybillInvoice> waybillInvoices) {
		this.waybillInvoices = waybillInvoices;
	}

}
