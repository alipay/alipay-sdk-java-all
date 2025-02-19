package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-02-12 10:17:22
 */
public class RecycleSkuDTO extends AlipayObject {

	private static final long serialVersionUID = 2878366262189215829L;

	/**
	 * null
	 */
	@ApiListField("sku_attrs")
	@ApiField("recycle_sku_attr_d_t_o")
	private List<RecycleSkuAttrDTO> skuAttrs;

	/**
	 * 具体款式商品的价格，包含最低价与最高价
	 */
	@ApiField("sku_price")
	private RecycleSkuPriceDTO skuPrice;

	/**
	 * 描述某款式商品的上下架状态
	 */
	@ApiField("status")
	private String status;

	public List<RecycleSkuAttrDTO> getSkuAttrs() {
		return this.skuAttrs;
	}
	public void setSkuAttrs(List<RecycleSkuAttrDTO> skuAttrs) {
		this.skuAttrs = skuAttrs;
	}

	public RecycleSkuPriceDTO getSkuPrice() {
		return this.skuPrice;
	}
	public void setSkuPrice(RecycleSkuPriceDTO skuPrice) {
		this.skuPrice = skuPrice;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
