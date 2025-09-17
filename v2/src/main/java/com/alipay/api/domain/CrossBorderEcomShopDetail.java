package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 跨境电商店铺明细
 *
 * @author auto create
 * @since 1.0, 2025-01-06 15:44:28
 */
public class CrossBorderEcomShopDetail extends AlipayObject {

	private static final long serialVersionUID = 1713197161956333588L;

	/**
	 * 主营类目
	 */
	@ApiField("main_business")
	private String mainBusiness;

	/**
	 * 已下架商品个数
	 */
	@ApiField("off_shelf_num")
	private String offShelfNum;

	/**
	 * 在售商品个数
	 */
	@ApiField("on_sale_item_num")
	private String onSaleItemNum;

	/**
	 * 企业名称
	 */
	@ApiField("org_name")
	private String orgName;

	/**
	 * 平台ID
	 */
	@ApiField("platform_id")
	private String platformId;

	/**
	 * 注册号
	 */
	@ApiField("reg_no")
	private String regNo;

	/**
	 * 提供近24个月的销售明细数据
	 */
	@ApiListField("sale_details")
	@ApiField("sale_info")
	private List<SaleInfo> saleDetails;

	/**
	 * 销往的国家
	 */
	@ApiListField("sell_country_list")
	@ApiField("string")
	private List<String> sellCountryList;

	/**
	 * 有动销的商品个数
	 */
	@ApiField("sell_out_item_num")
	private String sellOutItemNum;

	/**
	 * 店铺企业所在市
	 */
	@ApiField("shop_corp_city")
	private String shopCorpCity;

	/**
	 * 店铺企业所在区
	 */
	@ApiField("shop_corp_county")
	private String shopCorpCounty;

	/**
	 * 店铺企业所在省
	 */
	@ApiField("shop_corp_province")
	private String shopCorpProvince;

	/**
	 * 店铺ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 店铺名称
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 店铺开店时长(年)(未满1年则为0)
	 */
	@ApiField("shop_open_years")
	private String shopOpenYears;

	/**
	 * 店铺好评率
	 */
	@ApiListField("shop_positive_rating_list")
	@ApiField("string")
	private List<String> shopPositiveRatingList;

	/**
	 * 店铺状态
	 */
	@ApiField("shop_status")
	private String shopStatus;

	/**
	 * 店铺类型
	 */
	@ApiField("shop_type")
	private String shopType;

	/**
	 * 统一社会信用代码
	 */
	@ApiField("uscc")
	private String uscc;

	public String getMainBusiness() {
		return this.mainBusiness;
	}
	public void setMainBusiness(String mainBusiness) {
		this.mainBusiness = mainBusiness;
	}

	public String getOffShelfNum() {
		return this.offShelfNum;
	}
	public void setOffShelfNum(String offShelfNum) {
		this.offShelfNum = offShelfNum;
	}

	public String getOnSaleItemNum() {
		return this.onSaleItemNum;
	}
	public void setOnSaleItemNum(String onSaleItemNum) {
		this.onSaleItemNum = onSaleItemNum;
	}

	public String getOrgName() {
		return this.orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getPlatformId() {
		return this.platformId;
	}
	public void setPlatformId(String platformId) {
		this.platformId = platformId;
	}

	public String getRegNo() {
		return this.regNo;
	}
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	public List<SaleInfo> getSaleDetails() {
		return this.saleDetails;
	}
	public void setSaleDetails(List<SaleInfo> saleDetails) {
		this.saleDetails = saleDetails;
	}

	public List<String> getSellCountryList() {
		return this.sellCountryList;
	}
	public void setSellCountryList(List<String> sellCountryList) {
		this.sellCountryList = sellCountryList;
	}

	public String getSellOutItemNum() {
		return this.sellOutItemNum;
	}
	public void setSellOutItemNum(String sellOutItemNum) {
		this.sellOutItemNum = sellOutItemNum;
	}

	public String getShopCorpCity() {
		return this.shopCorpCity;
	}
	public void setShopCorpCity(String shopCorpCity) {
		this.shopCorpCity = shopCorpCity;
	}

	public String getShopCorpCounty() {
		return this.shopCorpCounty;
	}
	public void setShopCorpCounty(String shopCorpCounty) {
		this.shopCorpCounty = shopCorpCounty;
	}

	public String getShopCorpProvince() {
		return this.shopCorpProvince;
	}
	public void setShopCorpProvince(String shopCorpProvince) {
		this.shopCorpProvince = shopCorpProvince;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getShopOpenYears() {
		return this.shopOpenYears;
	}
	public void setShopOpenYears(String shopOpenYears) {
		this.shopOpenYears = shopOpenYears;
	}

	public List<String> getShopPositiveRatingList() {
		return this.shopPositiveRatingList;
	}
	public void setShopPositiveRatingList(List<String> shopPositiveRatingList) {
		this.shopPositiveRatingList = shopPositiveRatingList;
	}

	public String getShopStatus() {
		return this.shopStatus;
	}
	public void setShopStatus(String shopStatus) {
		this.shopStatus = shopStatus;
	}

	public String getShopType() {
		return this.shopType;
	}
	public void setShopType(String shopType) {
		this.shopType = shopType;
	}

	public String getUscc() {
		return this.uscc;
	}
	public void setUscc(String uscc) {
		this.uscc = uscc;
	}

}
