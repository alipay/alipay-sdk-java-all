package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-10-10 16:06:23
 */
public class BrandInfoItem extends AlipayObject {

	private static final long serialVersionUID = 5138588826744614548L;

	/**
	 * 品牌中文名称
	 */
	@ApiField("brand_chs_name")
	private String brandChsName;

	/**
	 * 品牌英文名称
	 */
	@ApiField("brand_eng_name")
	private String brandEngName;

	/**
	 * 品牌ID
	 */
	@ApiField("brand_id")
	private String brandId;

	/**
	 * 品牌名称
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * logo
	 */
	@ApiField("logo_url")
	private String logoUrl;

	public String getBrandChsName() {
		return this.brandChsName;
	}
	public void setBrandChsName(String brandChsName) {
		this.brandChsName = brandChsName;
	}

	public String getBrandEngName() {
		return this.brandEngName;
	}
	public void setBrandEngName(String brandEngName) {
		this.brandEngName = brandEngName;
	}

	public String getBrandId() {
		return this.brandId;
	}
	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getLogoUrl() {
		return this.logoUrl;
	}
	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

}
