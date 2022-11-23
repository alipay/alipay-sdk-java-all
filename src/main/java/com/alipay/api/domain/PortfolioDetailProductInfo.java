package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 组合明细信息item
 *
 * @author auto create
 * @since 1.0, 2019-10-22 10:30:37
 */
public class PortfolioDetailProductInfo extends AlipayObject {

	private static final long serialVersionUID = 8681457134669598122L;

	/**
	 * 产品资产类型
	 */
	@ApiField("asset_category")
	private String assetCategory;

	/**
	 * 产品名称（简称）目前是基金简称
	 */
	@ApiField("product_abbr_name")
	private String productAbbrName;

	/**
	 * 产品代码，目前是基金代码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 产品ID
	 */
	@ApiField("product_id")
	private String productId;

	/**
	 * 产品占比，四舍五入后保留小数点后4位
	 */
	@ApiField("product_proportion")
	private String productProportion;

	/**
	 * 产品类型
	 */
	@ApiField("product_type")
	private String productType;

	public String getAssetCategory() {
		return this.assetCategory;
	}
	public void setAssetCategory(String assetCategory) {
		this.assetCategory = assetCategory;
	}

	public String getProductAbbrName() {
		return this.productAbbrName;
	}
	public void setProductAbbrName(String productAbbrName) {
		this.productAbbrName = productAbbrName;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductId() {
		return this.productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductProportion() {
		return this.productProportion;
	}
	public void setProductProportion(String productProportion) {
		this.productProportion = productProportion;
	}

	public String getProductType() {
		return this.productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}

}
