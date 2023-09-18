package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业侧sku提报结果
 *
 * @author auto create
 * @since 1.0, 2023-03-31 14:59:02
 */
public class IndustryItemSkuSyncResultDTO extends AlipayObject {

	private static final long serialVersionUID = 3652953815329564129L;

	/**
	 * 支付宝侧skuId
	 */
	@ApiField("platform_sku_id")
	private String platformSkuId;

	/**
	 * 商户侧skuId
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
