package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 本地商品免审更新skku
 *
 * @author auto create
 * @since 1.0, 2023-05-05 15:08:44
 */
public class LocalItemDirectModifySku extends AlipayObject {

	private static final long serialVersionUID = 6728553537639973517L;

	/**
	 * sku原价，分为单位。（代金券对应代金券面额）
	 */
	@ApiField("original_price")
	private Long originalPrice;

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

	public Long getStockNum() {
		return this.stockNum;
	}
	public void setStockNum(Long stockNum) {
		this.stockNum = stockNum;
	}

}
