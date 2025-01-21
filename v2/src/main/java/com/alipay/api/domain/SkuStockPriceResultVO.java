package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 批量修改库存价格结果
 *
 * @author auto create
 * @since 1.0, 2024-08-29 14:17:14
 */
public class SkuStockPriceResultVO extends AlipayObject {

	private static final long serialVersionUID = 3552316288875595676L;

	/**
	 * 商家的商品sku编码，该编码是商家侧内部自用的商品id，一般连锁商家模式下，该编码都是连锁维度全国唯一。购药内部系统，该编码与内部系统的商品skuID唯一对应。
	 */
	@ApiField("sku_code")
	private String skuCode;

	public String getSkuCode() {
		return this.skuCode;
	}
	public void setSkuCode(String skuCode) {
		this.skuCode = skuCode;
	}

}
