package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品价格
 *
 * @author auto create
 * @since 1.0, 2026-04-20 16:57:59
 */
public class SkuPriceDeatail extends AlipayObject {

	private static final long serialVersionUID = 1212513323442528668L;

	/**
	 * 耗材费用，单位元。币种 ：人民币。
	 */
	@ApiField("consumables_price")
	private String consumablesPrice;

	/**
	 * 药品费用，单位元。币种 ：人民币。
	 */
	@ApiField("drug_price")
	private String drugPrice;

	/**
	 * 价格，单位元。币种 ：人民币。
	 */
	@ApiField("price")
	private String price;

	/**
	 * OMS厂商sku编码, 厂商自行维护
	 */
	@ApiField("sku_code")
	private String skuCode;

	public String getConsumablesPrice() {
		return this.consumablesPrice;
	}
	public void setConsumablesPrice(String consumablesPrice) {
		this.consumablesPrice = consumablesPrice;
	}

	public String getDrugPrice() {
		return this.drugPrice;
	}
	public void setDrugPrice(String drugPrice) {
		this.drugPrice = drugPrice;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getSkuCode() {
		return this.skuCode;
	}
	public void setSkuCode(String skuCode) {
		this.skuCode = skuCode;
	}

}
