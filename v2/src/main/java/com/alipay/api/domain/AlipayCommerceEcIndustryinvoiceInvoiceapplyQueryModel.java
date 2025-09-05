package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付可开票开票申请查询
 *
 * @author auto create
 * @since 1.0, 2025-08-11 23:07:24
 */
public class AlipayCommerceEcIndustryinvoiceInvoiceapplyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4523245364864282845L;

	/**
	 * 开票申请ID
	 */
	@ApiField("invoice_apply_id")
	private String invoiceApplyId;

	/**
	 * 外部开票申请ID
	 */
	@ApiField("outer_apply_id")
	private String outerApplyId;

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

	public String getOuterApplyId() {
		return this.outerApplyId;
	}
	public void setOuterApplyId(String outerApplyId) {
		this.outerApplyId = outerApplyId;
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
