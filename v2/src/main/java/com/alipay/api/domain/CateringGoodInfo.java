package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-10-12 13:45:13
 */
public class CateringGoodInfo extends AlipayObject {

	private static final long serialVersionUID = 7589992127298615549L;

	/**
	 * 价格符号
	 */
	@ApiField("amount_symbol_feeds")
	private String amountSymbolFeeds;

	/**
	 * 品牌Logo
	 */
	@ApiField("brand_logo")
	private String brandLogo;

	/**
	 * 品牌名称
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 商品主图
	 */
	@ApiField("camp_image")
	private String campImage;

	/**
	 * 商品品类名称
	 */
	@ApiField("category_name")
	private String categoryName;

	/**
	 * 全城可用门店数文案
	 */
	@ApiField("city_digital_poi_count")
	private String cityDigitalPoiCount;

	/**
	 * 距离描述
	 */
	@ApiField("distance_desc")
	private String distanceDesc;

	/**
	 * 商品ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 原价,单位查看price_unit
	 */
	@ApiField("origin_amount")
	private String originAmount;

	/**
	 * 原价分割信息
	 */
	@ApiField("origin_amount_part")
	private AmountPartInfo originAmountPart;

	/**
	 * 购买跳转链接
	 */
	@ApiField("path")
	private String path;

	/**
	 * 价格单位
	 */
	@ApiField("price_unit")
	private String priceUnit;

	/**
	 * 营销导购文案
	 */
	@ApiField("promo_tag")
	private String promoTag;

	/**
	 * 到手价/售价，单位查看price_unit
	 */
	@ApiField("sale_amount")
	private String saleAmount;

	/**
	 * 售价分割信息
	 */
	@ApiField("sale_amount_part")
	private AmountPartInfo saleAmountPart;

	/**
	 * 吱口令（仅微信端）
	 */
	@ApiField("shake_code_text")
	private String shakeCodeText;

	/**
	 * 商品店铺跳转链接
	 */
	@ApiField("shop_detail_url")
	private String shopDetailUrl;

	/**
	 * 商品名称或者商品短标题
	 */
	@ApiField("title")
	private String title;

	public String getAmountSymbolFeeds() {
		return this.amountSymbolFeeds;
	}
	public void setAmountSymbolFeeds(String amountSymbolFeeds) {
		this.amountSymbolFeeds = amountSymbolFeeds;
	}

	public String getBrandLogo() {
		return this.brandLogo;
	}
	public void setBrandLogo(String brandLogo) {
		this.brandLogo = brandLogo;
	}

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getCampImage() {
		return this.campImage;
	}
	public void setCampImage(String campImage) {
		this.campImage = campImage;
	}

	public String getCategoryName() {
		return this.categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCityDigitalPoiCount() {
		return this.cityDigitalPoiCount;
	}
	public void setCityDigitalPoiCount(String cityDigitalPoiCount) {
		this.cityDigitalPoiCount = cityDigitalPoiCount;
	}

	public String getDistanceDesc() {
		return this.distanceDesc;
	}
	public void setDistanceDesc(String distanceDesc) {
		this.distanceDesc = distanceDesc;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getOriginAmount() {
		return this.originAmount;
	}
	public void setOriginAmount(String originAmount) {
		this.originAmount = originAmount;
	}

	public AmountPartInfo getOriginAmountPart() {
		return this.originAmountPart;
	}
	public void setOriginAmountPart(AmountPartInfo originAmountPart) {
		this.originAmountPart = originAmountPart;
	}

	public String getPath() {
		return this.path;
	}
	public void setPath(String path) {
		this.path = path;
	}

	public String getPriceUnit() {
		return this.priceUnit;
	}
	public void setPriceUnit(String priceUnit) {
		this.priceUnit = priceUnit;
	}

	public String getPromoTag() {
		return this.promoTag;
	}
	public void setPromoTag(String promoTag) {
		this.promoTag = promoTag;
	}

	public String getSaleAmount() {
		return this.saleAmount;
	}
	public void setSaleAmount(String saleAmount) {
		this.saleAmount = saleAmount;
	}

	public AmountPartInfo getSaleAmountPart() {
		return this.saleAmountPart;
	}
	public void setSaleAmountPart(AmountPartInfo saleAmountPart) {
		this.saleAmountPart = saleAmountPart;
	}

	public String getShakeCodeText() {
		return this.shakeCodeText;
	}
	public void setShakeCodeText(String shakeCodeText) {
		this.shakeCodeText = shakeCodeText;
	}

	public String getShopDetailUrl() {
		return this.shopDetailUrl;
	}
	public void setShopDetailUrl(String shopDetailUrl) {
		this.shopDetailUrl = shopDetailUrl;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
