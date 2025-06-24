package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付可开票开票申请重试
 *
 * @author auto create
 * @since 1.0, 2025-06-12 22:56:39
 */
public class AlipayCommerceEcIndustryinvoiceInvoiceapplyRetryModel extends AlipayObject {

	private static final long serialVersionUID = 6573246774567231651L;

	/**
	 * 开票申请ID
	 */
	@ApiField("invoice_apply_id")
	private String invoiceApplyId;

	/**
	 * 发票产品ID
	 */
	@ApiField("product_id")
	private String productId;

	/**
	 * 企业（商户）税号
	 */
	@ApiField("tax_no")
	private String taxNo;

	public String getInvoiceApplyId() {
		return this.invoiceApplyId;
	}
	public void setInvoiceApplyId(String invoiceApplyId) {
		this.invoiceApplyId = invoiceApplyId;
	}

	public String getProductId() {
		return this.productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getTaxNo() {
		return this.taxNo;
	}
	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}

}
