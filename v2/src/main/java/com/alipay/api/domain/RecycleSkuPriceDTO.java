package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 回收商品款式的价格
 *
 * @author auto create
 * @since 1.0, 2025-04-13 17:00:17
 */
public class RecycleSkuPriceDTO extends AlipayObject {

	private static final long serialVersionUID = 4583157528778396716L;

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
	 * 商户同步商品价格的扩展 当前字段已废弃(需要升级同步商品价格的扩展)
	 */
	@ApiListField("price_ext")
	@ApiField("recycle_price_ext_d_t_o")
	@Deprecated
	private List<RecyclePriceExtDTO> priceExt;

	/**
	 * 价格的扩展对象
	 */
	@ApiField("price_extend")
	private RecycleSkuPriceExtDTO priceExtend;

	/**
	 * 销售价（单位为元，金额超过1000就不允许小数点）
	 */
	@ApiField("sale_price")
	private String salePrice;

	/**
	 * 区间价时，回收商品会透出一个范围价格，包含最小值与最大值；
一口价时，回收商品只会透出一个准确的价格；
四品相价时，回收商品会针对4个品相透出4个区间价
	 */
	@ApiField("sku_price_type")
	private String skuPriceType;

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

	public RecycleSkuPriceExtDTO getPriceExtend() {
		return this.priceExtend;
	}
	public void setPriceExtend(RecycleSkuPriceExtDTO priceExtend) {
		this.priceExtend = priceExtend;
	}

	public String getSalePrice() {
		return this.salePrice;
	}
	public void setSalePrice(String salePrice) {
		this.salePrice = salePrice;
	}

	public String getSkuPriceType() {
		return this.skuPriceType;
	}
	public void setSkuPriceType(String skuPriceType) {
		this.skuPriceType = skuPriceType;
	}

}
