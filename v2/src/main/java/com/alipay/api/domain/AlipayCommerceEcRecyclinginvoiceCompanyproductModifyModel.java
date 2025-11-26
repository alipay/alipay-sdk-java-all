package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 反向企业产品配置变更
 *
 * @author auto create
 * @since 1.0, 2025-09-10 00:28:15
 */
public class AlipayCommerceEcRecyclinginvoiceCompanyproductModifyModel extends AlipayObject {

	private static final long serialVersionUID = 6317676337914771983L;

	/**
	 * 企业（商户）产品配置
	 */
	@ApiField("product_config")
	private CompanyProductConfig productConfig;

	/**
	 * 发票产品编号，必须为已开通产品，可调用反向企业信息查询接口查询
	 */
	@ApiField("product_id")
	private String productId;

	/**
	 * 企业（商户）税号
	 */
	@ApiField("tax_no")
	private String taxNo;

	public CompanyProductConfig getProductConfig() {
		return this.productConfig;
	}
	public void setProductConfig(CompanyProductConfig productConfig) {
		this.productConfig = productConfig;
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
