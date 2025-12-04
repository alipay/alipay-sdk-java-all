package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 直播玩法内容安全审核小蓝车对象
 *
 * @author auto create
 * @since 1.0, 2025-11-13 15:58:17
 */
public class LivePlaySecurityPocketInfo extends AlipayObject {

	private static final long serialVersionUID = 1469877747859156729L;

	/**
	 * 商品描述内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 图片链接
	 */
	@ApiField("image_url")
	private String imageUrl;

	/**
	 * 当前商品的唯一标识
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商品类型 ITEM-商品，SERVICE-服务
	 */
	@ApiField("item_type")
	private String itemType;

	/**
	 * 商品标题
	 */
	@ApiField("title")
	private String title;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getImageUrl() {
		return this.imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemType() {
		return this.itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
