package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * sku基本信息
 *
 * @author auto create
 * @since 1.0, 2022-04-21 17:52:56
 */
public class GoodsSkuInfo extends AlipayObject {

	private static final long serialVersionUID = 1185538113971289677L;

	/**
	 * 商品金额,
单位为元,小数点后保留两位数
	 */
	@ApiField("price_money")
	private String priceMoney;

	/**
	 * 金额展示信息,单位:元
	 */
	@ApiField("price_text")
	private String priceText;

	/**
	 * sku属性路径
	 */
	@ApiField("prop_path")
	private String propPath;

	/**
	 * 该sku库存信息
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * sku描述信息
	 */
	@ApiField("sku_desc")
	private String skuDesc;

	/**
	 * skuId
	 */
	@ApiField("sku_id")
	private String skuId;

	public String getPriceMoney() {
		return this.priceMoney;
	}
	public void setPriceMoney(String priceMoney) {
		this.priceMoney = priceMoney;
	}

	public String getPriceText() {
		return this.priceText;
	}
	public void setPriceText(String priceText) {
		this.priceText = priceText;
	}

	public String getPropPath() {
		return this.propPath;
	}
	public void setPropPath(String propPath) {
		this.propPath = propPath;
	}

	public Long getQuantity() {
		return this.quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public String getSkuDesc() {
		return this.skuDesc;
	}
	public void setSkuDesc(String skuDesc) {
		this.skuDesc = skuDesc;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

}
