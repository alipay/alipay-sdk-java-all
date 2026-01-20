package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 回收商品信息
 *
 * @author auto create
 * @since 1.0, 2025-07-02 14:25:12
 */
public class RecycleProductDTO extends AlipayObject {

	private static final long serialVersionUID = 2159434361817298376L;

	/**
	 * 品牌信息
	 */
	@ApiField("product_brand_info")
	private RecycleBrand productBrandInfo;

	/**
	 * 产品code
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 产品logo图链接
	 */
	@ApiField("product_logo_url")
	private String productLogoUrl;

	/**
	 * 产品名称
	 */
	@ApiField("product_name")
	private String productName;

	/**
	 * 污渍图链接
	 */
	@ApiField("stain_pic_url")
	private String stainPicUrl;

	public RecycleBrand getProductBrandInfo() {
		return this.productBrandInfo;
	}
	public void setProductBrandInfo(RecycleBrand productBrandInfo) {
		this.productBrandInfo = productBrandInfo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductLogoUrl() {
		return this.productLogoUrl;
	}
	public void setProductLogoUrl(String productLogoUrl) {
		this.productLogoUrl = productLogoUrl;
	}

	public String getProductName() {
		return this.productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getStainPicUrl() {
		return this.stainPicUrl;
	}
	public void setStainPicUrl(String stainPicUrl) {
		this.stainPicUrl = stainPicUrl;
	}

}
