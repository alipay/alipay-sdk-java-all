package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 品牌信息模型包括名称+品牌id
 *
 * @author auto create
 * @since 1.0, 2025-10-23 19:26:52
 */
public class BrandInfoModel extends AlipayObject {

	private static final long serialVersionUID = 6117456954821498932L;

	/**
	 * 商户品牌id
	 */
	@ApiField("brand_id")
	private String brandId;

	/**
	 * 商户品牌名称
	 */
	@ApiField("brand_name")
	private String brandName;

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

}
