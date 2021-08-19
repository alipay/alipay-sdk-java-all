package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询品牌下可用类目入参
 *
 * @author auto create
 * @since 1.0, 2021-07-14 16:36:39
 */
public class SearchBrandboxQueryCatalogRequest extends AlipayObject {

	private static final long serialVersionUID = 7785473776716938577L;

	/**
	 * 品牌id
	 */
	@ApiField("brand_id")
	private String brandId;

	public String getBrandId() {
		return this.brandId;
	}
	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

}
