package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-07-02 14:17:56
 */
public class ItemCardOpenapi extends AlipayObject {

	private static final long serialVersionUID = 7379263819743526282L;

	/**
	 * 支测商品id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商品图片
	 */
	@ApiField("item_image")
	private String itemImage;

	/**
	 * 券后价，单位：元
	 */
	@ApiField("item_original_price")
	private String itemOriginalPrice;

	/**
	 * 券后价，单位：元
	 */
	@ApiField("item_safe_price")
	private String itemSafePrice;

	/**
	 * null
	 */
	@ApiListField("item_tags")
	@ApiField("string")
	private List<String> itemTags;

	/**
	 * 商品标题
	 */
	@ApiField("item_title")
	private String itemTitle;

	/**
	 * 商品跳转链接
	 */
	@ApiField("item_url")
	private String itemUrl;

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemImage() {
		return this.itemImage;
	}
	public void setItemImage(String itemImage) {
		this.itemImage = itemImage;
	}

	public String getItemOriginalPrice() {
		return this.itemOriginalPrice;
	}
	public void setItemOriginalPrice(String itemOriginalPrice) {
		this.itemOriginalPrice = itemOriginalPrice;
	}

	public String getItemSafePrice() {
		return this.itemSafePrice;
	}
	public void setItemSafePrice(String itemSafePrice) {
		this.itemSafePrice = itemSafePrice;
	}

	public List<String> getItemTags() {
		return this.itemTags;
	}
	public void setItemTags(List<String> itemTags) {
		this.itemTags = itemTags;
	}

	public String getItemTitle() {
		return this.itemTitle;
	}
	public void setItemTitle(String itemTitle) {
		this.itemTitle = itemTitle;
	}

	public String getItemUrl() {
		return this.itemUrl;
	}
	public void setItemUrl(String itemUrl) {
		this.itemUrl = itemUrl;
	}

}
