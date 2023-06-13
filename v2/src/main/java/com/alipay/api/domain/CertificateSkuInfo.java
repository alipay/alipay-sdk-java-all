package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品的Sku信息
 *
 * @author auto create
 * @since 1.0, 2023-05-30 13:14:19
 */
public class CertificateSkuInfo extends AlipayObject {

	private static final long serialVersionUID = 7441767258879356244L;

	/**
	 * 支付宝商品id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 外部商品id
	 */
	@ApiField("out_item_id")
	private String outItemId;

	/**
	 * 外部skuId
	 */
	@ApiField("out_sku_id")
	private String outSkuId;

	/**
	 * 支付宝skuId
	 */
	@ApiField("sku_id")
	private String skuId;

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getOutItemId() {
		return this.outItemId;
	}
	public void setOutItemId(String outItemId) {
		this.outItemId = outItemId;
	}

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
