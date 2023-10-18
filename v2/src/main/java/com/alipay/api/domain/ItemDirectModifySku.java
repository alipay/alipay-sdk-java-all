package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序商品免审更新SKU
 *
 * @author auto create
 * @since 1.0, 2023-03-25 13:34:19
 */
public class ItemDirectModifySku extends AlipayObject {

	private static final long serialVersionUID = 7719623658915949486L;

	/**
	 * sku原价，分为单位。
	 */
	@ApiField("original_price")
	private Long originalPrice;

	/**
	 * 商家侧自定义sku ID，要求 APPID 下全局唯一。和sku_id不能同时为空
	 */
	@ApiField("out_sku_id")
	private String outSkuId;

	/**
	 * sku售价，分为单位
	 */
	@ApiField("sale_price")
	private Long salePrice;

	/**
	 * sku售卖状态，包含以下两种状态： 已下架(DELISTING) 可售卖(AVAILABLE) 已下架: DELISTING 可售卖: AVAILABLE
	 */
	@ApiField("sale_status")
	private String saleStatus;

	/**
	 * 支付宝平台侧sku ID，是支付宝平台侧商品的唯一标识，后续与平台交互，需要使用该 ID，建议持久化。和out_sku_id不能同时为空。
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

	public String getOutSkuId() {
		return this.outSkuId;
	}
	public void setOutSkuId(String outSkuId) {
		this.outSkuId = outSkuId;
	}

	public Long getSalePrice() {
		return this.salePrice;
	}
	public void setSalePrice(Long salePrice) {
		this.salePrice = salePrice;
	}

	public String getSaleStatus() {
		return this.saleStatus;
	}
	public void setSaleStatus(String saleStatus) {
		this.saleStatus = saleStatus;
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
