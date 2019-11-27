package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询产品平台产品信息接口
 *
 * @author auto create
 * @since 1.0, 2016-09-09 20:38:32
 */
public class AntProdpaasProductCommonQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4554766614358967912L;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 产品查询维度，主要分为基础信息，条件信息和产品关联关系信息等
	 */
	@ApiField("product_options")
	private ProductVOOptions productOptions;

	/**
	 * 产品版本
	 */
	@ApiField("product_version")
	private String productVersion;

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public ProductVOOptions getProductOptions() {
		return this.productOptions;
	}
	public void setProductOptions(ProductVOOptions productOptions) {
		this.productOptions = productOptions;
	}

	public String getProductVersion() {
		return this.productVersion;
	}
	public void setProductVersion(String productVersion) {
		this.productVersion = productVersion;
	}

}
