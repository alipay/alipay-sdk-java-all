package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 供应商删除
 *
 * @author auto create
 * @since 1.0, 2025-04-22 15:38:15
 */
public class AlipayCommerceEcRecyclinginvoiceCompanysupplierDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 3233277611696819715L;

	/**
	 * 新增成功的供应商ID
	 */
	@ApiField("supplier_id")
	private String supplierId;

	/**
	 * 企业（商户）税号
	 */
	@ApiField("tax_no")
	private String taxNo;

	public String getSupplierId() {
		return this.supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

	public String getTaxNo() {
		return this.taxNo;
	}
	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}

}
