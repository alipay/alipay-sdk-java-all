package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序商品SKU ID对
 *
 * @author auto create
 * @since 1.0, 2023-03-14 10:14:12
 */
public class AppItemSkuIdPair extends AlipayObject {

	private static final long serialVersionUID = 8219682976297899917L;

	/**
	 * 支付宝平台侧sku ID，是支付宝平台侧商品的唯一标识，后续与平台交互，需要使用该 ID，建议持久化。
	 */
	@ApiField("platform_sku_id")
	private String platformSkuId;

	/**
	 * 商家侧商品sku ID，商户APPID 下全局唯一。
	 */
	@ApiField("sku_id")
	private String skuId;

	public String getPlatformSkuId() {
		return this.platformSkuId;
	}
	public void setPlatformSkuId(String platformSkuId) {
		this.platformSkuId = platformSkuId;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

}
