package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 工单详情数据信息
 *
 * @author auto create
 * @since 1.0, 2023-07-26 09:52:54
 */
public class SearchOrderBrandDetail extends AlipayObject {

	private static final long serialVersionUID = 4296885213924586524L;

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
