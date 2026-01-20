package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-12-16 14:27:42
 */
public class BrandQueryOpenApiResult extends AlipayObject {

	private static final long serialVersionUID = 4865926725847574734L;

	/**
	 * 品牌名称
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 品牌id
	 */
	@ApiField("brand_no")
	private String brandNo;

	/**
	 * 品牌logo
	 */
	@ApiField("logo_url")
	private String logoUrl;

	/**
	 * 品牌方
	 */
	@ApiField("owner_name")
	private String ownerName;

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getBrandNo() {
		return this.brandNo;
	}
	public void setBrandNo(String brandNo) {
		this.brandNo = brandNo;
	}

	public String getLogoUrl() {
		return this.logoUrl;
	}
	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

	public String getOwnerName() {
		return this.ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

}
