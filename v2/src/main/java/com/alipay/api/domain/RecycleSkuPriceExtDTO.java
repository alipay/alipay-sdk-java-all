package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 价格的扩展对象
 *
 * @author auto create
 * @since 1.0, 2025-04-02 10:52:24
 */
public class RecycleSkuPriceExtDTO extends AlipayObject {

	private static final long serialVersionUID = 5684759663241757525L;

	/**
	 * null
	 */
	@ApiListField("custom_prices")
	@ApiField("recycle_sku_custom_price_d_t_o")
	private List<RecycleSkuCustomPriceDTO> customPrices;

	public List<RecycleSkuCustomPriceDTO> getCustomPrices() {
		return this.customPrices;
	}
	public void setCustomPrices(List<RecycleSkuCustomPriceDTO> customPrices) {
		this.customPrices = customPrices;
	}

}
