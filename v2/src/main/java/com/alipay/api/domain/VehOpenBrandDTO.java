package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车型库开放查询-品牌列表出参DTO
 *
 * @author auto create
 * @since 1.0, 2026-07-02 16:40:06
 */
public class VehOpenBrandDTO extends AlipayObject {

	private static final long serialVersionUID = 1475865284275978669L;

	/**
	 * 品牌成立年份
	 */
	@ApiField("brand_established_year")
	private String brandEstablishedYear;

	/**
	 * 品牌ID
	 */
	@ApiField("brand_id")
	private String brandId;

	/**
	 * 品牌logo图片URL
	 */
	@ApiField("brand_logo")
	private String brandLogo;

	/**
	 * 品牌名称
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 品牌英文名称
	 */
	@ApiField("brand_name_en")
	private String brandNameEn;

	/**
	 * 品牌国别
	 */
	@ApiField("brand_origin")
	private String brandOrigin;

	/**
	 * 品牌名称首字母
	 */
	@ApiField("initial")
	private String initial;

	public String getBrandEstablishedYear() {
		return this.brandEstablishedYear;
	}
	public void setBrandEstablishedYear(String brandEstablishedYear) {
		this.brandEstablishedYear = brandEstablishedYear;
	}

	public String getBrandId() {
		return this.brandId;
	}
	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	public String getBrandLogo() {
		return this.brandLogo;
	}
	public void setBrandLogo(String brandLogo) {
		this.brandLogo = brandLogo;
	}

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getBrandNameEn() {
		return this.brandNameEn;
	}
	public void setBrandNameEn(String brandNameEn) {
		this.brandNameEn = brandNameEn;
	}

	public String getBrandOrigin() {
		return this.brandOrigin;
	}
	public void setBrandOrigin(String brandOrigin) {
		this.brandOrigin = brandOrigin;
	}

	public String getInitial() {
		return this.initial;
	}
	public void setInitial(String initial) {
		this.initial = initial;
	}

}
