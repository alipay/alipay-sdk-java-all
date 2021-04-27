package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 品牌信息
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:42
 */
public class ExtBrand extends AlipayObject {

	private static final long serialVersionUID = 7623312869272914971L;

	/**
	 * 品牌编码
	 */
	@ApiField("brand_code")
	private String brandCode;

	/**
	 * 品牌名称
	 */
	@ApiField("name")
	private String name;

	public String getBrandCode() {
		return this.brandCode;
	}
	public void setBrandCode(String brandCode) {
		this.brandCode = brandCode;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
