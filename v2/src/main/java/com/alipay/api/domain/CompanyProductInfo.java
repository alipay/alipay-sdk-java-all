package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 企业产品信息
 *
 * @author auto create
 * @since 1.0, 2025-07-07 14:29:55
 */
public class CompanyProductInfo extends AlipayObject {

	private static final long serialVersionUID = 1484423272554554548L;

	/**
	 * 企业产品配置信息
	 */
	@ApiListField("company_product_config")
	@ApiField("company_product_config_info")
	private List<CompanyProductConfigInfo> companyProductConfig;

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

	public List<CompanyProductConfigInfo> getCompanyProductConfig() {
		return this.companyProductConfig;
	}
	public void setCompanyProductConfig(List<CompanyProductConfigInfo> companyProductConfig) {
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
