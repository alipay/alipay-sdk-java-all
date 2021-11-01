package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 健康服务实物商品sku属性
 *
 * @author auto create
 * @since 1.0, 2021-04-27 18:58:38
 */
public class HealthServiceItemSkuPropertyDTO extends AlipayObject {

	private static final long serialVersionUID = 1336959468325837178L;

	/**
	 * SKU属性Key展示值
	 */
	@ApiField("sku_property_key_display")
	private String skuPropertyKeyDisplay;

	/**
	 * SKU属性值展示值
	 */
	@ApiField("sku_property_value_display")
	private String skuPropertyValueDisplay;

	public String getSkuPropertyKeyDisplay() {
		return this.skuPropertyKeyDisplay;
	}
	public void setSkuPropertyKeyDisplay(String skuPropertyKeyDisplay) {
		this.skuPropertyKeyDisplay = skuPropertyKeyDisplay;
	}

	public String getSkuPropertyValueDisplay() {
		return this.skuPropertyValueDisplay;
	}
	public void setSkuPropertyValueDisplay(String skuPropertyValueDisplay) {
		this.skuPropertyValueDisplay = skuPropertyValueDisplay;
	}

}
