package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 品牌信息
 *
 * @author auto create
 * @since 1.0, 2025-02-11 14:58:57
 */
public class BrandCertInfo extends AlipayObject {

	private static final long serialVersionUID = 3272116553642377973L;

	/**
	 * 是否完成品牌认证
	 */
	@ApiField("brand_cert")
	private Boolean brandCert;

	/**
	 * 品牌ID
	 */
	@ApiField("brand_id")
	private String brandId;

	/**
	 * 品牌中文名
	 */
	@ApiField("brand_name_cn")
	private String brandNameCn;

	/**
	 * 品牌英文名
	 */
	@ApiField("brand_name_en")
	private String brandNameEn;

	public Boolean getBrandCert() {
		return this.brandCert;
	}
	public void setBrandCert(Boolean brandCert) {
		this.brandCert = brandCert;
	}

	public String getBrandId() {
		return this.brandId;
	}
	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	public String getBrandNameCn() {
		return this.brandNameCn;
	}
	public void setBrandNameCn(String brandNameCn) {
		this.brandNameCn = brandNameCn;
	}

	public String getBrandNameEn() {
		return this.brandNameEn;
	}
	public void setBrandNameEn(String brandNameEn) {
		this.brandNameEn = brandNameEn;
	}

}
