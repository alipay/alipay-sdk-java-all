package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 关联发票，返回账单分配的发票关联金额
 *
 * @author auto create
 * @since 1.0, 2020-01-14 14:16:42
 */
public class ApInvoiceBillAmtOpenApiResponse extends AlipayObject {

	private static final long serialVersionUID = 7836755273464594276L;

	/**
	 * 发票关联账单金额
	 */
	@ApiListField("ap_bill_amt_list")
	@ApiField("ap_bill_amt_open_api_response")
	private List<ApBillAmtOpenApiResponse> apBillAmtList;

	/**
	 * 发票id
	 */
	@ApiField("invoice_id")
	private String invoiceId;

	public List<ApBillAmtOpenApiResponse> getApBillAmtList() {
		return this.apBillAmtList;
	}
	public void setApBillAmtList(List<ApBillAmtOpenApiResponse> apBillAmtList) {
		this.apBillAmtList = apBillAmtList;
	}

	public String getInvoiceId() {
		return this.invoiceId;
	}
	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}

}
