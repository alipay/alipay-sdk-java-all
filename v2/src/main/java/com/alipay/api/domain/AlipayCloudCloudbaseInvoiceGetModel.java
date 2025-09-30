package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 预览发票
 *
 * @author auto create
 * @since 1.0, 2025-08-11 15:05:31
 */
public class AlipayCloudCloudbaseInvoiceGetModel extends AlipayObject {

	private static final long serialVersionUID = 3452666423456962886L;

	/**
	 * 发票信息
	 */
	@ApiField("invoice_title")
	private InvoiceTitle invoiceTitle;

	/**
	 * 订单号列表
	 */
	@ApiListField("order_no_list")
	@ApiField("string")
	private List<String> orderNoList;

	public InvoiceTitle getInvoiceTitle() {
		return this.invoiceTitle;
	}
	public void setInvoiceTitle(InvoiceTitle invoiceTitle) {
		this.invoiceTitle = invoiceTitle;
	}

	public List<String> getOrderNoList() {
		return this.orderNoList;
	}
	public void setOrderNoList(List<String> orderNoList) {
		this.orderNoList = orderNoList;
	}

}
