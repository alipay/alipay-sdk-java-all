package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 跨境游私域店铺数据同步
 *
 * @author auto create
 * @since 1.0, 2021-02-25 19:13:06
 */
public class AlipayOverseasTravelShopSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3283585429287121953L;

	/**
	 * 地图可以搜索的到的店铺详细地址。对于线下店铺，地址为必填，线上店铺为非必填。
	 */
	@ApiField("address")
	private String address;

	/**
	 * 店铺品牌logo图片url
	 */
	@ApiField("brand_logo")
	private String brandLogo;

	/**
	 * 品牌名称
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 店铺营业时间,线下店铺该字段必填。线上店铺非必填。
	 */
	@ApiListField("business_hours")
	@ApiField("business_hour")
	private List<BusinessHour> businessHours;

	/**
	 * 国家简码,参考标准 ISO 3166-1 alpha-2 code
	 */
	@ApiField("country_code")
	private String countryCode;

	/**
	 * 店铺配送费,币种遵循 ISO 4217 标准，金额数值为正整数且精确到货币最小单位
	 */
	@ApiField("delivery_fee")
	private Amount deliveryFee;

	/**
	 * 店铺扩展参数
	 */
	@ApiField("extend_params")
	private ShopExtendParams extendParams;

	/**
	 * 外链地址,可以是许可范围内的支付宝小程序地址，H5链接等。
	 */
	@ApiField("external_link_url")
	private String externalLinkUrl;

	/**
	 * 店铺起送费用,币种遵循 ISO 4217 标准，金额数值为正整数且精确到货币最小单位
	 */
	@ApiField("fee")
	private Amount fee;

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
	 * 收单报备的二级商户id
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 外部店铺ID，与appId一起构成店铺的唯一性。
	 */
	@ApiField("out_shop_id")
	private String outShopId;

	/**
	 * 收单报备的pid
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 优惠促销文案列表,可传入一个或多个
	 */
	@ApiField("promotion_text")
	private String promotionText;

	/**
	 * 店铺评分
	 */
	@ApiField("rating")
	private ShopRating rating;

	/**
	 * 推荐标识。Y:代表推荐,N代表不置顶推荐。当同一个外铺平台中的店铺以列表形式露出时，推荐标识为Y的店铺排序会有权重提升
	 */
	@ApiField("recommend")
	private String recommend;

	/**
	 * 业务场景，可传入一个或多个,该字段用来标识商品的适用业务场景。
	 */
	@ApiListField("scenarios")
	@ApiField("string")
	private List<String> scenarios;

	/**
	 * 店铺头图链接地址
	 */
	@ApiField("shop_logo_photo")
	private String shopLogoPhoto;

	/**
	 * 店铺名称
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 店铺标签
	 */
	@ApiListField("shop_tags")
	@ApiField("string")
	private List<String> shopTags;

	/**
	 * 店铺状态。NORMAL:正常运营; CLOSED: 店铺关闭
	 */
	@ApiField("status")
	private String status;

	/**
	 * 收单报备的店铺id
	 */
	@ApiField("store_id")
	private String storeId;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
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

	public List<BusinessHour> getBusinessHours() {
		return this.businessHours;
	}
	public void setBusinessHours(List<BusinessHour> businessHours) {
		this.businessHours = businessHours;
	}

	public String getCountryCode() {
		return this.countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public Amount getDeliveryFee() {
		return this.deliveryFee;
	}
	public void setDeliveryFee(Amount deliveryFee) {
		this.deliveryFee = deliveryFee;
	}

	public ShopExtendParams getExtendParams() {
		return this.extendParams;
	}
	public void setExtendParams(ShopExtendParams extendParams) {
		this.extendParams = extendParams;
	}

	public String getExternalLinkUrl() {
		return this.externalLinkUrl;
	}
	public void setExternalLinkUrl(String externalLinkUrl) {
		this.externalLinkUrl = externalLinkUrl;
	}

	public Amount getFee() {
		return this.fee;
	}
	public void setFee(Amount fee) {
		this.fee = fee;
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

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getOutShopId() {
		return this.outShopId;
	}
	public void setOutShopId(String outShopId) {
		this.outShopId = outShopId;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getPromotionText() {
		return this.promotionText;
	}
	public void setPromotionText(String promotionText) {
		this.promotionText = promotionText;
	}

	public ShopRating getRating() {
		return this.rating;
	}
	public void setRating(ShopRating rating) {
		this.rating = rating;
	}

	public String getRecommend() {
		return this.recommend;
	}
	public void setRecommend(String recommend) {
		this.recommend = recommend;
	}

	public List<String> getScenarios() {
		return this.scenarios;
	}
	public void setScenarios(List<String> scenarios) {
		this.scenarios = scenarios;
	}

	public String getShopLogoPhoto() {
		return this.shopLogoPhoto;
	}
	public void setShopLogoPhoto(String shopLogoPhoto) {
		this.shopLogoPhoto = shopLogoPhoto;
	}

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public List<String> getShopTags() {
		return this.shopTags;
	}
	public void setShopTags(List<String> shopTags) {
		this.shopTags = shopTags;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

}
