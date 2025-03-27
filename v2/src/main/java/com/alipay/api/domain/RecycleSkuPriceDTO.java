package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 具体款式商品的价格，包含最低价与最高价
 *
 * @author auto create
 * @since 1.0, 2025-03-20 19:52:27
 */
public class RecycleSkuPriceDTO extends AlipayObject {

	private static final long serialVersionUID = 5179185476199671752L;

	/**
	 * 最高价（单位为元，金额超过1000就不允许小数点）
	 */
	@ApiField("max_price")
	private String maxPrice;

	/**
	 * 最低价（单位为元，金额超过1000就不允许小数点）
	 */
	@ApiField("min_price")
	private String minPrice;

	/**
	 * null
	 */
	@ApiListField("price_ext")
	@ApiField("recycle_price_ext_d_t_o")
	private List<RecyclePriceExtDTO> priceExt;

	public String getMaxPrice() {
		return this.maxPrice;
	}
	public void setMaxPrice(String maxPrice) {
		this.maxPrice = maxPrice;
	}

	public String getMinPrice() {
		return this.minPrice;
	}
	public void setMinPrice(String minPrice) {
		this.minPrice = minPrice;
	}

	public List<RecyclePriceExtDTO> getPriceExt() {
		return this.priceExt;
	}
	public void setPriceExt(List<RecyclePriceExtDTO> priceExt) {
		this.priceExt = priceExt;
	}

}
