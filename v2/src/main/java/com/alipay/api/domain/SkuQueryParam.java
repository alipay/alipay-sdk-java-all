package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * sku销售信息请求
 *
 * @author auto create
 * @since 1.0, 2024-06-05 15:17:37
 */
public class SkuQueryParam extends AlipayObject {

	private static final long serialVersionUID = 2522336336181351668L;

	/**
	 * 商品id
	 */
	@ApiField("product_id")
	private String productId;

	/**
	 * skuid
	 */
	@ApiField("sku_id")
	private String skuId;

	public String getProductId() {
		return this.productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

}
