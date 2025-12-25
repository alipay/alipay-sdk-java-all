package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询品牌下可用类目入参
 *
 * @author auto create
 * @since 1.0, 2021-09-17 18:01:01
 */
public class SearchBrandboxQueryCatalogRequest extends AlipayObject {

	private static final long serialVersionUID = 1373937463758829428L;

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
