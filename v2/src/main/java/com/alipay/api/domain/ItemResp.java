package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商圈商品券结构
 *
 * @author auto create
 * @since 1.0, 2018-10-24 09:30:17
 */
public class ItemResp extends AlipayObject {

	private static final long serialVersionUID = 1337154267735652139L;

	/**
	 * 内容分类
	 */
	@ApiField("category")
	private String category;

	/**
	 * 用户是否已购买或已领取:true-已购买/已领取,false-未购买/未领取
	 */
	@ApiField("has_recive")
	private Boolean hasRecive;

	/**
	 * 小图标地址
	 */
	@ApiField("icon")
	private String icon;

	/**
	 * 营销图片
	 */
	@ApiField("image")
	private String image;

	/**
	 * 商品、券ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 内容意义
	 */
	@ApiField("meaning")
	private String meaning;

	/**
	 * 商品原价
	 */
	@ApiField("org_price")
	private String orgPrice;

	/**
	 * 商品价格或折扣
	 */
	@ApiField("price")
	private String price;

	/**
	 * 店铺id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 简要描述
	 */
	@ApiField("summary")
	private String summary;

	/**
	 * 内容标签
	 */
	@ApiField("tags")
	private String tags;

	/**
	 * 限制及特性描述
	 */
	@ApiField("tips")
	private String tips;

	/**
	 * 标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 类型:VOUCHER(券)、ITEM(商品)
	 */
	@ApiField("type")
	private String type;

	/**
	 * 内容跳转地址
	 */
	@ApiField("url")
	private String url;

	public String getCategory() {
		return this.category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	public Boolean getHasRecive() {
		return this.hasRecive;
	}
	public void setHasRecive(Boolean hasRecive) {
		this.hasRecive = hasRecive;
	}

	public String getIcon() {
		return this.icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getImage() {
		return this.image;
	}
	public void setImage(String image) {
		this.image = image;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getMeaning() {
		return this.meaning;
	}
	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}

	public String getOrgPrice() {
		return this.orgPrice;
	}
	public void setOrgPrice(String orgPrice) {
		this.orgPrice = orgPrice;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getSummary() {
		return this.summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getTags() {
		return this.tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}

	public String getTips() {
		return this.tips;
	}
	public void setTips(String tips) {
		this.tips = tips;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
