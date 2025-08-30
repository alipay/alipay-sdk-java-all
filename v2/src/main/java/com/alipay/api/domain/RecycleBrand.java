package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 回收品牌信息
 *
 * @author auto create
 * @since 1.0, 2025-07-02 14:25:12
 */
public class RecycleBrand extends AlipayObject {

	private static final long serialVersionUID = 2138354485563524959L;

	/**
	 * 品牌code
	 */
	@ApiField("brand_code")
	private String brandCode;

	/**
	 * 品牌名称
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 品牌logo链接
	 */
	@ApiField("brand_url")
	private String brandUrl;

	public String getBrandCode() {
		return this.brandCode;
	}
	public void setBrandCode(String brandCode) {
		this.brandCode = brandCode;
	}

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getBrandUrl() {
		return this.brandUrl;
	}
	public void setBrandUrl(String brandUrl) {
		this.brandUrl = brandUrl;
	}

}
