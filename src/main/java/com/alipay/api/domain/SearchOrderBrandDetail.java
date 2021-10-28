package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 工单详情数据信息
 *
 * @author auto create
 * @since 1.0, 2021-10-25 16:17:04
 */
public class SearchOrderBrandDetail extends AlipayObject {

	private static final long serialVersionUID = 5123263213199426258L;

	/**
	 * 工单详情数据信息
	 */
	@ApiField("brand_detail")
	private BrandDetail brandDetail;

	/**
	 * 工单详情key值
	 */
	@ApiField("key")
	private String key;

	public BrandDetail getBrandDetail() {
		return this.brandDetail;
	}
	public void setBrandDetail(BrandDetail brandDetail) {
		this.brandDetail = brandDetail;
	}

	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
	}

}
