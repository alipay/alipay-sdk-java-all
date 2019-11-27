package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 跨境游运营店铺信息
 *
 * @author auto create
 * @since 1.0, 2019-08-16 15:20:20
 */
public class OverseaShopInfo extends AlipayObject {

	private static final long serialVersionUID = 6435534533741152668L;

	/**
	 * 品牌logo链接
	 */
	@ApiField("brand_logo_url")
	private String brandLogoUrl;

	/**
	 * 店铺描述
	 */
	@ApiField("shop_desc")
	private String shopDesc;

	/**
	 * 店铺详情页链接
	 */
	@ApiField("shop_detail_url")
	private String shopDetailUrl;

	/**
	 * 店铺id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 店铺logo链接
	 */
	@ApiField("shop_logo_url")
	private String shopLogoUrl;

	/**
	 * 店铺名称
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 店铺优惠信息
	 */
	@ApiField("shop_promotion_info")
	private ShopPromotionInfo shopPromotionInfo;

	public String getBrandLogoUrl() {
		return this.brandLogoUrl;
	}
	public void setBrandLogoUrl(String brandLogoUrl) {
		this.brandLogoUrl = brandLogoUrl;
	}

	public String getShopDesc() {
		return this.shopDesc;
	}
	public void setShopDesc(String shopDesc) {
		this.shopDesc = shopDesc;
	}

	public String getShopDetailUrl() {
		return this.shopDetailUrl;
	}
	public void setShopDetailUrl(String shopDetailUrl) {
		this.shopDetailUrl = shopDetailUrl;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getShopLogoUrl() {
		return this.shopLogoUrl;
	}
	public void setShopLogoUrl(String shopLogoUrl) {
		this.shopLogoUrl = shopLogoUrl;
	}

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public ShopPromotionInfo getShopPromotionInfo() {
		return this.shopPromotionInfo;
	}
	public void setShopPromotionInfo(ShopPromotionInfo shopPromotionInfo) {
		this.shopPromotionInfo = shopPromotionInfo;
	}

}
