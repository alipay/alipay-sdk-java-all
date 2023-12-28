package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 增值服务的sku
 *
 * @author auto create
 * @since 1.0, 2022-10-26 19:34:46
 */
public class HealthServiceSku extends AlipayObject {

	private static final long serialVersionUID = 1487432192299661298L;

	/**
	 * 商家sku条形码
	 */
	@ApiField("merchant_item_sku_bar_code")
	private String merchantItemSkuBarCode;

	/**
	 * skuId
	 */
	@ApiField("sku_id")
	private String skuId;

	public String getMerchantItemSkuBarCode() {
		return this.merchantItemSkuBarCode;
	}
	public void setMerchantItemSkuBarCode(String merchantItemSkuBarCode) {
		this.merchantItemSkuBarCode = merchantItemSkuBarCode;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

}
