package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 本地商品免审更新sku
 *
 * @author auto create
 * @since 1.0, 2024-04-19 11:32:52
 */
public class LocalItemDirectModifySku extends AlipayObject {

	private static final long serialVersionUID = 8238579586922738493L;

	/**
	 * 支持限制库存和不限库存的相互转换 当前字段已废弃(由新字段stock_limit_type代替)
	 */
	@ApiField("limit_type")
	@Deprecated
	private String limitType;

	/**
	 * sku原价，分为单位。（代金券对应代金券面额）
	 */
	@ApiField("original_price")
	private Long originalPrice;

	/**
	 * 商家侧sku ID，要求 APPID 下全局唯一。
	 */
	@ApiField("out_sku_id")
	private String outSkuId;

	/**
	 * sku售价，分为单位。（代金券对应代金券价格）
	 */
	@ApiField("sale_price")
	private Long salePrice;

	/**
	 * sku售卖状态，包含以下两种状态： 已下架(DELISTING) 可售卖(AVAILABLE) 已下架: DELISTING 可售卖: AVAILABLE
	 */
	@ApiField("sale_status")
	private String saleStatus;

	/**
	 * 支付宝平台侧sku ID
	 */
	@ApiField("sku_id")
	private String skuId;

	/**
	 * 支持限制库存和不限库存的相互转换
	 */
	@ApiField("stock_limit_type")
	private String stockLimitType;

	/**
	 * 商品sku库存
	 */
	@ApiField("stock_num")
	private Long stockNum;

	public String getLimitType() {
		return this.limitType;
	}
	public void setLimitType(String limitType) {
		this.limitType = limitType;
	}

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

	public String getStockLimitType() {
		return this.stockLimitType;
	}
	public void setStockLimitType(String stockLimitType) {
		this.stockLimitType = stockLimitType;
	}

	public Long getStockNum() {
		return this.stockNum;
	}
	public void setStockNum(Long stockNum) {
		this.stockNum = stockNum;
	}

}
