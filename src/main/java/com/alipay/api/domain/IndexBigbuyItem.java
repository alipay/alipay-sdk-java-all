package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 首页的超值抢购数据类型
 *
 * @author auto create
 * @since 1.0, 2019-01-28 11:53:34
 */
public class IndexBigbuyItem extends AlipayObject {

	private static final long serialVersionUID = 7864134299146355566L;

	/**
	 * 距离
	 */
	@ApiField("distance")
	private Long distance;

	/**
	 * 图片地址，用于展示商品图片
	 */
	@ApiField("image_url")
	private String imageUrl;

	/**
	 * 商品详情页跳转链接
	 */
	@ApiField("item_detail_url")
	private String itemDetailUrl;

	/**
	 * 商品图片的id值，可用于拼接图片链接
	 */
	@ApiField("item_field_id")
	private String itemFieldId;

	/**
	 * 商品id，唯一标识
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商品名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 必抢标文案
	 */
	@ApiField("item_tag")
	private String itemTag;

	/**
	 * 一般为店名，但当商品为银行卡类型时为商品名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 原价
	 */
	@ApiField("original_price")
	private String originalPrice;

	/**
	 * 价格单位
	 */
	@ApiField("price_unit")
	private String priceUnit;

	/**
	 * 售卖价格
	 */
	@ApiField("selling_price")
	private String sellingPrice;

	/**
	 * 店铺图片的id值，可用于拼接店铺图片链接
	 */
	@ApiField("shop_field_id")
	private String shopFieldId;

	/**
	 * 店铺id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 店铺logo
	 */
	@ApiField("shop_logo")
	private String shopLogo;

	/**
	 * 淘宝轻店铺id
	 */
	@ApiField("tb_mini_shop_id")
	private String tbMiniShopId;

	public Long getDistance() {
		return this.distance;
	}
	public void setDistance(Long distance) {
		this.distance = distance;
	}

	public String getImageUrl() {
		return this.imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getItemDetailUrl() {
		return this.itemDetailUrl;
	}
	public void setItemDetailUrl(String itemDetailUrl) {
		this.itemDetailUrl = itemDetailUrl;
	}

	public String getItemFieldId() {
		return this.itemFieldId;
	}
	public void setItemFieldId(String itemFieldId) {
		this.itemFieldId = itemFieldId;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemTag() {
		return this.itemTag;
	}
	public void setItemTag(String itemTag) {
		this.itemTag = itemTag;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOriginalPrice() {
		return this.originalPrice;
	}
	public void setOriginalPrice(String originalPrice) {
		this.originalPrice = originalPrice;
	}

	public String getPriceUnit() {
		return this.priceUnit;
	}
	public void setPriceUnit(String priceUnit) {
		this.priceUnit = priceUnit;
	}

	public String getSellingPrice() {
		return this.sellingPrice;
	}
	public void setSellingPrice(String sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	public String getShopFieldId() {
		return this.shopFieldId;
	}
	public void setShopFieldId(String shopFieldId) {
		this.shopFieldId = shopFieldId;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getShopLogo() {
		return this.shopLogo;
	}
	public void setShopLogo(String shopLogo) {
		this.shopLogo = shopLogo;
	}

	public String getTbMiniShopId() {
		return this.tbMiniShopId;
	}
	public void setTbMiniShopId(String tbMiniShopId) {
		this.tbMiniShopId = tbMiniShopId;
	}

}
