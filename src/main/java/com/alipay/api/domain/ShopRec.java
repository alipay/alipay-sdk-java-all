package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商铺基础数据结构
 *
 * @author auto create
 * @since 1.0, 2017-08-15 19:53:06
 */
public class ShopRec extends AlipayObject {

	private static final long serialVersionUID = 4561391636574171969L;

	/**
	 * 店铺地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 品牌名称
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 商圈
	 */
	@ApiField("busi_area")
	private String busiArea;

	/**
	 * 城市id
	 */
	@ApiField("city_id")
	private String cityId;

	/**
	 * 菜系
	 */
	@ApiField("cuisine")
	private String cuisine;

	/**
	 * 距离
	 */
	@ApiField("distance")
	private String distance;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 是否有优惠
	 */
	@ApiField("has_hui")
	private String hasHui;

	/**
	 * 店铺名称
	 */
	@ApiField("head_shop_name")
	private String headShopName;

	/**
	 * 纬度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 经度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 人气分
	 */
	@ApiField("popularity")
	private String popularity;

	/**
	 * 人气等级
	 */
	@ApiField("popularity_level")
	private String popularityLevel;

	/**
	 * 人均消费
	 */
	@ApiField("price_average")
	private String priceAverage;

	/**
	 * 前台一级类目列表
	 */
	@ApiField("root_display_category_info")
	private String rootDisplayCategoryInfo;

	/**
	 * 店铺跳转链接
	 */
	@ApiField("shop_detail_url")
	private String shopDetailUrl;

	/**
	 * 店铺id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 店铺logo图
	 */
	@ApiField("shop_logo_url")
	private String shopLogoUrl;

	/**
	 * 店铺详细名称
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 推荐语
	 */
	@ApiField("shop_recommend_one_tag_compose")
	private String shopRecommendOneTagCompose;

	/**
	 * 推荐店铺的券
	 */
	@ApiListField("voucher_list")
	@ApiField("voucher_rec")
	private List<VoucherRec> voucherList;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getBusiArea() {
		return this.busiArea;
	}
	public void setBusiArea(String busiArea) {
		this.busiArea = busiArea;
	}

	public String getCityId() {
		return this.cityId;
	}
	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	public String getCuisine() {
		return this.cuisine;
	}
	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}

	public String getDistance() {
		return this.distance;
	}
	public void setDistance(String distance) {
		this.distance = distance;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getHasHui() {
		return this.hasHui;
	}
	public void setHasHui(String hasHui) {
		this.hasHui = hasHui;
	}

	public String getHeadShopName() {
		return this.headShopName;
	}
	public void setHeadShopName(String headShopName) {
		this.headShopName = headShopName;
	}

	public String getLatitude() {
		return this.latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return this.longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getPopularity() {
		return this.popularity;
	}
	public void setPopularity(String popularity) {
		this.popularity = popularity;
	}

	public String getPopularityLevel() {
		return this.popularityLevel;
	}
	public void setPopularityLevel(String popularityLevel) {
		this.popularityLevel = popularityLevel;
	}

	public String getPriceAverage() {
		return this.priceAverage;
	}
	public void setPriceAverage(String priceAverage) {
		this.priceAverage = priceAverage;
	}

	public String getRootDisplayCategoryInfo() {
		return this.rootDisplayCategoryInfo;
	}
	public void setRootDisplayCategoryInfo(String rootDisplayCategoryInfo) {
		this.rootDisplayCategoryInfo = rootDisplayCategoryInfo;
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

	public String getShopRecommendOneTagCompose() {
		return this.shopRecommendOneTagCompose;
	}
	public void setShopRecommendOneTagCompose(String shopRecommendOneTagCompose) {
		this.shopRecommendOneTagCompose = shopRecommendOneTagCompose;
	}

	public List<VoucherRec> getVoucherList() {
		return this.voucherList;
	}
	public void setVoucherList(List<VoucherRec> voucherList) {
		this.voucherList = voucherList;
	}

}
