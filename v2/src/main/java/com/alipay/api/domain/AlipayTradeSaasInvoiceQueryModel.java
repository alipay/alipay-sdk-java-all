package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票单次查询服务
 *
 * @author auto create
 * @since 1.0, 2026-08-14 19:59:22
 */
public class AlipayTradeSaasInvoiceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3324819577674232587L;

	/**
	 * 开票时外部请求单号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 查询模式
	 */
	@ApiField("query_mode")
	private String queryMode;

	/**
	 * saas平台发票申请单号，可以作为发票信息查询的条件
	 */
	@ApiField("saas_invoice_order_no")
	private String saasInvoiceOrderNo;

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getQueryMode() {
		return this.queryMode;
	}
	public void setQueryMode(String queryMode) {
		this.queryMode = queryMode;
	}

	public String getSaasInvoiceOrderNo() {
		return this.saasInvoiceOrderNo;
	}
	public void setSaasInvoiceOrderNo(String saasInvoiceOrderNo) {
		this.saasInvoiceOrderNo = saasInvoiceOrderNo;
	}

}
