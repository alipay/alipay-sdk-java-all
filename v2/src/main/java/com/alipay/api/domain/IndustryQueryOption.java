package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 是否返回指定的行业数据详情
 *
 * @author auto create
 * @since 1.0, 2026-05-18 15:47:48
 */
public class IndustryQueryOption extends AlipayObject {

	private static final long serialVersionUID = 7883862121719824463L;

	/**
	 * 是否在出参中返回门店的油品信息列表
	 */
	@ApiField("include_oil_product")
	private Boolean includeOilProduct;

	public Boolean getIncludeOilProduct() {
		return this.includeOilProduct;
	}
	public void setIncludeOilProduct(Boolean includeOilProduct) {
		this.includeOilProduct = includeOilProduct;
	}

}
