package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户已有的品牌
 *
 * @author auto create
 * @since 1.0, 2020-12-15 19:43:28
 */
public class BrandResult extends AlipayObject {

	private static final long serialVersionUID = 6861171432631993748L;

	/**
	 * 已有的品牌的id
	 */
	@ApiField("brand_id")
	private String brandId;

	/**
	 * 已有品牌的名称
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
