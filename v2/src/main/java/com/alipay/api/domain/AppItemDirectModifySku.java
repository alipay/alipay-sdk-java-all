package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序商品免审更新sku
 *
 * @author auto create
 * @since 1.0, 2023-03-13 16:52:15
 */
public class AppItemDirectModifySku extends AlipayObject {

	private static final long serialVersionUID = 5856853596154783773L;

	/**
	 * sku原价，分为单位。
	 */
	@ApiField("original_price")
	private Long originalPrice;

	/**
	 * 支付宝平台侧sku id
	 */
	@ApiField("platform_sku_id")
	private String platformSkuId;

	/**
	 * sku价格，分为单位
	 */
	@ApiField("price")
	private Long price;

	/**
	 * sku售卖状态，包含以下两种状态： 已下架(DELISTING) 可售卖(AVAILABLE)
	 */
	@ApiField("sell_status")
	private String sellStatus;

	/**
	 * 商家侧sku商品id。与platform_sku_id二选一必填，优先取本参数。
	 */
	@ApiField("sku_id")
	private String skuId;

	/**
	 * 商品sku库存
	 */
	@ApiField("stock_num")
	private Long stockNum;

	public Long getOriginalPrice() {
		return this.originalPrice;
	}
	public void setOriginalPrice(Long originalPrice) {
		this.originalPrice = originalPrice;
	}

	public String getPlatformSkuId() {
		return this.platformSkuId;
	}
	public void setPlatformSkuId(String platformSkuId) {
		this.platformSkuId = platformSkuId;
	}

	public Long getPrice() {
		return this.price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}

	public String getSellStatus() {
		return this.sellStatus;
	}
	public void setSellStatus(String sellStatus) {
		this.sellStatus = sellStatus;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public Long getStockNum() {
		return this.stockNum;
	}
	public void setStockNum(Long stockNum) {
		this.stockNum = stockNum;
	}

}
