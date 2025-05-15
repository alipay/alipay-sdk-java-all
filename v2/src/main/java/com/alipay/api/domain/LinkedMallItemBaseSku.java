package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 阿里云商品资产SKU
 *
 * @author auto create
 * @since 1.0, 2025-04-11 18:05:54
 */
public class LinkedMallItemBaseSku extends AlipayObject {

	private static final long serialVersionUID = 3127252218774372489L;

	/**
	 * 是否可以售卖
	 */
	@ApiField("can_sell")
	private Boolean canSell;

	/**
	 * 客户端销售价（分）
	 */
	@ApiField("price_cent")
	private Long priceCent;

	/**
	 * 商品sku信息
	 */
	@ApiField("sku_id")
	private String skuId;

	/**
	 * sku图片url
	 */
	@ApiField("sku_pic_url")
	private String skuPicUrl;

	/**
	 * sku标题
	 */
	@ApiField("sku_title")
	private String skuTitle;

	public Boolean getCanSell() {
		return this.canSell;
	}
	public void setCanSell(Boolean canSell) {
		this.canSell = canSell;
	}

	public Long getPriceCent() {
		return this.priceCent;
	}
	public void setPriceCent(Long priceCent) {
		this.priceCent = priceCent;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public String getSkuPicUrl() {
		return this.skuPicUrl;
	}
	public void setSkuPicUrl(String skuPicUrl) {
		this.skuPicUrl = skuPicUrl;
	}

	public String getSkuTitle() {
		return this.skuTitle;
	}
	public void setSkuTitle(String skuTitle) {
		this.skuTitle = skuTitle;
	}

}
