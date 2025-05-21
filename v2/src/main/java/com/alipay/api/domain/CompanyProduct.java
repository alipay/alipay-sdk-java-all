package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业（商户）已开通产品
 *
 * @author auto create
 * @since 1.0, 2025-04-22 15:38:14
 */
public class CompanyProduct extends AlipayObject {

	private static final long serialVersionUID = 8287593162519259911L;

	/**
	 * 企业（商户）转账账户ID
	 */
	@ApiField("company_account_id")
	private String companyAccountId;

	/**
	 * 企业（商户）产品配置
	 */
	@ApiField("company_product_config")
	private CompanyProductConfig companyProductConfig;

	/**
	 * 发票产品编号
	 */
	@ApiField("product_id")
	private String productId;

	/**
	 * 发票产品名称
	 */
	@ApiField("product_name")
	private String productName;

	public String getCompanyAccountId() {
		return this.companyAccountId;
	}
	public void setCompanyAccountId(String companyAccountId) {
		this.companyAccountId = companyAccountId;
	}

	public CompanyProductConfig getCompanyProductConfig() {
		return this.companyProductConfig;
	}
	public void setCompanyProductConfig(CompanyProductConfig companyProductConfig) {
		this.companyProductConfig = companyProductConfig;
	}

	public String getProductId() {
		return this.productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return this.productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

}
