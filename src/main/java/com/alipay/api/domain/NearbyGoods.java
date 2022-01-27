package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品具体信息，包含商品的基本信息以及商品最近门店的信息
 *
 * @author auto create
 * @since 1.0, 2019-01-28 11:53:48
 */
public class NearbyGoods extends AlipayObject {

	private static final long serialVersionUID = 1747216483178527892L;

	/**
	 * 活动再减描述，前端直接展示即可
	 */
	@ApiField("discount_desc")
	private String discountDesc;

	/**
	 * 店铺距离当前用户的距离，单位为米
	 */
	@ApiField("distance")
	private String distance;

	/**
	 * 商品图片链接，用于前端展示商品图片
	 */
	@ApiField("image_url")
	private String imageUrl;

	/**
	 * 商品图片的id值，可用于拼接图片链接
	 */
	@ApiField("item_field_id")
	private String itemFieldId;

	/**
	 * 商品id,商品唯一标识符，可用于查询单个商品信息
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商品名称，用于表征商品基本特性
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 商品详情跳转地址
	 */
	@ApiField("jump_url")
	private String jumpUrl;

	/**
	 * 商品原价，直接返回给前端，单位为元
	 */
	@ApiField("original_price")
	private String originalPrice;

	/**
	 * 促销标，超值抢购 or 促销，此为图片连接
	 */
	@ApiField("sales_icon")
	private String salesIcon;

	/**
	 * 商品最终售卖价格，单位为元
	 */
	@ApiField("selling_price")
	private String sellingPrice;

	/**
	 * 店铺图片的id值，可用于拼接图片链接
	 */
	@ApiField("shop_field_id")
	private String shopFieldId;

	/**
	 * 店铺唯一标识
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 店铺logo
	 */
	@ApiField("shop_logo")
	private String shopLogo;

	/**
	 * 适用门店主店名
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 店铺轻店铺id
	 */
	@ApiField("tb_mini_shop_id")
	private String tbMiniShopId;

	public String getDiscountDesc() {
		return this.discountDesc;
	}
	public void setDiscountDesc(String discountDesc) {
		this.discountDesc = discountDesc;
	}

	public String getDistance() {
		return this.distance;
	}
	public void setDistance(String distance) {
		this.distance = distance;
	}

	public String getImageUrl() {
		return this.imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
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

	public String getJumpUrl() {
		return this.jumpUrl;
	}
	public void setJumpUrl(String jumpUrl) {
		this.jumpUrl = jumpUrl;
	}

	public String getOriginalPrice() {
		return this.originalPrice;
	}
	public void setOriginalPrice(String originalPrice) {
		this.originalPrice = originalPrice;
	}

	public String getSalesIcon() {
		return this.salesIcon;
	}
	public void setSalesIcon(String salesIcon) {
		this.salesIcon = salesIcon;
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

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getTbMiniShopId() {
		return this.tbMiniShopId;
	}
	public void setTbMiniShopId(String tbMiniShopId) {
		this.tbMiniShopId = tbMiniShopId;
	}

}
