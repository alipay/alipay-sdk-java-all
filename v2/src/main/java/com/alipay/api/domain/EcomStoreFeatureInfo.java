package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 电商店铺特征信息
 *
 * @author auto create
 * @since 1.0, 2024-11-13 17:56:48
 */
public class EcomStoreFeatureInfo extends AlipayObject {

	private static final long serialVersionUID = 8533671518778653751L;

	/**
	 * 关联主播明细
	 */
	@ApiListField("anchor_list")
	@ApiField("string")
	private List<String> anchorList;

	/**
	 * 关联主播数（单位：人）
	 */
	@ApiField("anchor_num")
	private String anchorNum;

	/**
	 * 店铺发货市
	 */
	@ApiField("delivery_city")
	private String deliveryCity;

	/**
	 * 店铺发货区
	 */
	@ApiField("delivery_county")
	private String deliveryCounty;

	/**
	 * 店铺发货省
	 */
	@ApiField("delivery_province")
	private String deliveryProvince;

	/**
	 * 主营类目
	 */
	@ApiField("main_business")
	private String mainBusiness;

	/**
	 * 已下架商品个数（单位：个）
	 */
	@ApiField("off_shelf_num")
	private String offShelfNum;

	/**
	 * 在售的品牌明细
	 */
	@ApiListField("on_sale_brand_list")
	@ApiField("string")
	private List<String> onSaleBrandList;

	/**
	 * 在售品牌个数（单位：个）
	 */
	@ApiField("on_sale_brand_num")
	private String onSaleBrandNum;

	/**
	 * 在售商品个数（单位：个）
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
	 * 提供近6个月的销售特征数据
	 */
	@ApiListField("sale_details")
	@ApiField("sale_feature_info")
	private List<SaleFeatureInfo> saleDetails;

	/**
	 * 有动销的商品个数（单位：个）
	 */
	@ApiField("sell_out_item_num")
	private String sellOutItemNum;

	/**
	 * 店铺所在市
	 */
	@ApiField("shop_city")
	private String shopCity;

	/**
	 * 店铺关店时间（yyyy-mm-dd）
	 */
	@ApiField("shop_close_date")
	private String shopCloseDate;

	/**
	 * 店铺所在区
	 */
	@ApiField("shop_county")
	private String shopCounty;

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
	 * 店铺开店时间（yyyy-mm-dd）
	 */
	@ApiField("shop_open_date")
	private String shopOpenDate;

	/**
	 * 店铺所在省
	 */
	@ApiField("shop_province")
	private String shopProvince;

	/**
	 * 店铺评分明细
	 */
	@ApiField("shop_rating")
	private ShopRatingInfo shopRating;

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
	 * 店铺销售金额TOP10商品链接名称
	 */
	@ApiListField("standard_amt_top_10_products")
	@ApiField("product_detail_info")
	private List<ProductDetailInfo> standardAmtTop10Products;

	/**
	 * 店铺销量TOP10商品链接名称
	 */
	@ApiListField("standard_volume_top_10_products")
	@ApiField("product_detail_info")
	private List<ProductDetailInfo> standardVolumeTop10Products;

	/**
	 * 统一社会信用代码
	 */
	@ApiField("uscc")
	private String uscc;

	public List<String> getAnchorList() {
		return this.anchorList;
	}
	public void setAnchorList(List<String> anchorList) {
		this.anchorList = anchorList;
	}

	public String getAnchorNum() {
		return this.anchorNum;
	}
	public void setAnchorNum(String anchorNum) {
		this.anchorNum = anchorNum;
	}

	public String getDeliveryCity() {
		return this.deliveryCity;
	}
	public void setDeliveryCity(String deliveryCity) {
		this.deliveryCity = deliveryCity;
	}

	public String getDeliveryCounty() {
		return this.deliveryCounty;
	}
	public void setDeliveryCounty(String deliveryCounty) {
		this.deliveryCounty = deliveryCounty;
	}

	public String getDeliveryProvince() {
		return this.deliveryProvince;
	}
	public void setDeliveryProvince(String deliveryProvince) {
		this.deliveryProvince = deliveryProvince;
	}

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

	public List<String> getOnSaleBrandList() {
		return this.onSaleBrandList;
	}
	public void setOnSaleBrandList(List<String> onSaleBrandList) {
		this.onSaleBrandList = onSaleBrandList;
	}

	public String getOnSaleBrandNum() {
		return this.onSaleBrandNum;
	}
	public void setOnSaleBrandNum(String onSaleBrandNum) {
		this.onSaleBrandNum = onSaleBrandNum;
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

	public List<SaleFeatureInfo> getSaleDetails() {
		return this.saleDetails;
	}
	public void setSaleDetails(List<SaleFeatureInfo> saleDetails) {
		this.saleDetails = saleDetails;
	}

	public String getSellOutItemNum() {
		return this.sellOutItemNum;
	}
	public void setSellOutItemNum(String sellOutItemNum) {
		this.sellOutItemNum = sellOutItemNum;
	}

	public String getShopCity() {
		return this.shopCity;
	}
	public void setShopCity(String shopCity) {
		this.shopCity = shopCity;
	}

	public String getShopCloseDate() {
		return this.shopCloseDate;
	}
	public void setShopCloseDate(String shopCloseDate) {
		this.shopCloseDate = shopCloseDate;
	}

	public String getShopCounty() {
		return this.shopCounty;
	}
	public void setShopCounty(String shopCounty) {
		this.shopCounty = shopCounty;
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

	public String getShopOpenDate() {
		return this.shopOpenDate;
	}
	public void setShopOpenDate(String shopOpenDate) {
		this.shopOpenDate = shopOpenDate;
	}

	public String getShopProvince() {
		return this.shopProvince;
	}
	public void setShopProvince(String shopProvince) {
		this.shopProvince = shopProvince;
	}

	public ShopRatingInfo getShopRating() {
		return this.shopRating;
	}
	public void setShopRating(ShopRatingInfo shopRating) {
		this.shopRating = shopRating;
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

	public List<ProductDetailInfo> getStandardAmtTop10Products() {
		return this.standardAmtTop10Products;
	}
	public void setStandardAmtTop10Products(List<ProductDetailInfo> standardAmtTop10Products) {
		this.standardAmtTop10Products = standardAmtTop10Products;
	}

	public List<ProductDetailInfo> getStandardVolumeTop10Products() {
		return this.standardVolumeTop10Products;
	}
	public void setStandardVolumeTop10Products(List<ProductDetailInfo> standardVolumeTop10Products) {
		this.standardVolumeTop10Products = standardVolumeTop10Products;
	}

	public String getUscc() {
		return this.uscc;
	}
	public void setUscc(String uscc) {
		this.uscc = uscc;
	}

}
