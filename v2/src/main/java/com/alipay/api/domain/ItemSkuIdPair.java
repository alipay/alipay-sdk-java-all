package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品skuId返回信息
 *
 * @author auto create
 * @since 1.0, 2024-04-19 11:32:52
 */
public class ItemSkuIdPair extends AlipayObject {

	private static final long serialVersionUID = 3295822187546851353L;

	/**
	 * 商家侧sku ID，APPID 下全局唯一。
	 */
	@ApiField("out_sku_id")
	private String outSkuId;

	/**
	 * 支付宝平台侧商品sku的唯一标识，后续与平台交互，需要使用该 ID，建议持久化。
	 */
	@ApiField("sku_id")
	private String skuId;

	public String getOutSkuId() {
		return this.outSkuId;
	}
	public void setOutSkuId(String outSkuId) {
		this.outSkuId = outSkuId;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

}
