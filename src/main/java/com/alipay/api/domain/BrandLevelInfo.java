package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 品牌分级信息
 *
 * @author auto create
 * @since 1.0, 2017-09-25 12:16:26
 */
public class BrandLevelInfo extends AlipayObject {

	private static final long serialVersionUID = 1556257312224419131L;

	/**
	 * 品牌编码
	 */
	@ApiField("brand_code")
	private String brandCode;

	/**
	 * 当前品牌所属级别
	 */
	@ApiField("brand_level")
	private Long brandLevel;

	/**
	 * 品牌名称
	 */
	@ApiField("brand_name")
	private String brandName;

	public String getBrandCode() {
		return this.brandCode;
	}
	public void setBrandCode(String brandCode) {
		this.brandCode = brandCode;
	}

	public Long getBrandLevel() {
		return this.brandLevel;
	}
	public void setBrandLevel(Long brandLevel) {
		this.brandLevel = brandLevel;
	}

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

}
