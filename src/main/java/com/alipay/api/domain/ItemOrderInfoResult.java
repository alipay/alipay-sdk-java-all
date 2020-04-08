package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单商品信息用于返回
 *
 * @author auto create
 * @since 1.0, 2020-02-25 21:31:43
 */
public class ItemOrderInfoResult extends AlipayObject {

	private static final long serialVersionUID = 8282642384625344195L;

	/**
	 * 商品图片链接
	 */
	@ApiField("image_url")
	private String imageUrl;

	/**
	 * 商品名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 商户商品链接
	 */
	@ApiField("merchant_item_link_page")
	private String merchantItemLinkPage;

	/**
	 * 商品数量
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * 商品单价（单位：元）
	 */
	@ApiField("unit_price")
	private String unitPrice;

	public String getImageUrl() {
		return this.imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getMerchantItemLinkPage() {
		return this.merchantItemLinkPage;
	}
	public void setMerchantItemLinkPage(String merchantItemLinkPage) {
		this.merchantItemLinkPage = merchantItemLinkPage;
	}

	public Long getQuantity() {
		return this.quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public String getUnitPrice() {
		return this.unitPrice;
	}
	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}

}
