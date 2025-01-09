package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 品牌信息

 *
 * @author auto create
 * @since 1.0, 2019-11-07 13:42:50
 */
public class StructureBrandInfo extends AlipayObject {

	private static final long serialVersionUID = 8316352225629116779L;

	/**
	 * 品牌英文名
	 */
	@ApiField("brand_en_name")
	private String brandEnName;

	/**
	 * 品牌英文名
	 */
	@ApiField("brand_logo")
	private String brandLogo;

	/**
	 * 品牌名
	 */
	@ApiField("brand_name")
	private String brandName;

	public String getBrandEnName() {
		return this.brandEnName;
	}
	public void setBrandEnName(String brandEnName) {
		this.brandEnName = brandEnName;
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

}
