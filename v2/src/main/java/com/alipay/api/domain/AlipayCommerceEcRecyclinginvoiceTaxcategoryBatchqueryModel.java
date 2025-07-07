package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 税收分类编码分页查询
 *
 * @author auto create
 * @since 1.0, 2025-05-27 10:18:23
 */
public class AlipayCommerceEcRecyclinginvoiceTaxcategoryBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 1621618421312722819L;

	/**
	 * 根据企业所开通的产品查询该产品ID
	 */
	@ApiField("product_id")
	private String productId;

	/**
	 * 企业（商户）税号
	 */
	@ApiField("tax_no")
	private String taxNo;

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
