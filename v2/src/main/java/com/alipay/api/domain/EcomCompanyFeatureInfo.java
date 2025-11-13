package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 电商企业特征信息
 *
 * @author auto create
 * @since 1.0, 2024-11-13 17:53:09
 */
public class EcomCompanyFeatureInfo extends AlipayObject {

	private static final long serialVersionUID = 4231274183275298511L;

	/**
	 * 近1年内活跃月数（单位：个月）
	 */
	@ApiField("active_month_past_year")
	private String activeMonthPastYear;

	/**
	 * 活跃店铺数（单位：个）
	 */
	@ApiField("active_shop_num")
	private String activeShopNum;

	/**
	 * 关联主播明细
	 */
	@ApiListField("anchor_list")
	@ApiField("anchor_info")
	private List<AnchorInfo> anchorList;

	/**
	 * 关联主播数（单位：人）
	 */
	@ApiField("anchor_num")
	private String anchorNum;

	/**
	 * 所有销售类目明细，详见主销类目枚举
	 */
	@ApiListField("business_list")
	@ApiField("string")
	private List<String> businessList;

	/**
	 * 已关店店铺数（单位：个）
	 */
	@ApiField("closed_shop_num")
	private String closedShopNum;

	/**
	 * 企业名称
	 */
	@ApiField("ent_name")
	private String entName;

	/**
	 * 企业状态
	 */
	@ApiField("ent_status")
	private String entStatus;

	/**
	 * 企业类型
	 */
	@ApiField("ent_type")
	private String entType;

	/**
	 * 最近一次开店至今时长（单位：年）
	 */
	@ApiField("last_open_date_duration")
	private String lastOpenDateDuration;

	/**
	 * 企业主销类目
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
	 * 首次开店至今时长（单位：年）
	 */
	@ApiField("open_date_duration")
	private String openDateDuration;

	/**
	 * 在营店铺数（单位：个）
	 */
	@ApiField("operation_shop_num")
	private String operationShopNum;

	/**
	 * 法定代表人
	 */
	@ApiField("person_name")
	private String personName;

	/**
	 * 入住平台明细
	 */
	@ApiListField("platform_list")
	@ApiField("string")
	private List<String> platformList;

	/**
	 * 入驻平台总数（个）
	 */
	@ApiField("platform_num")
	private String platformNum;

	/**
	 * 1年内入住平台数（个）
	 */
	@ApiField("platform_past_year")
	private String platformPastYear;

	/**
	 * 企业注册地－市
	 */
	@ApiField("reg_city")
	private String regCity;

	/**
	 * 企业注册地－区县
	 */
	@ApiField("reg_county")
	private String regCounty;

	/**
	 * 成立时长（单位：年）
	 */
	@ApiField("reg_duration")
	private String regDuration;

	/**
	 * 注册号
	 */
	@ApiField("reg_no")
	private String regNo;

	/**
	 * 企业注册地－省
	 */
	@ApiField("reg_province")
	private String regProvince;

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
	 * 近1年内开店数（单位：个）
	 */
	@ApiField("shop_num_past_year")
	private String shopNumPastYear;

	/**
	 * 旗下店铺评分明细
	 */
	@ApiListField("shop_rating_list")
	@ApiField("shop_rating_info")
	private List<ShopRatingInfo> shopRatingList;

	/**
	 * 企业销售金额TOP10商品链接名称
	 */
	@ApiListField("standard_amt_top_10_products")
	@ApiField("product_detail_info")
	private List<ProductDetailInfo> standardAmtTop10Products;

	/**
	 * 企业销量TOP10商品链接名称
	 */
	@ApiListField("standard_volume_top_10_products")
	@ApiField("product_detail_info")
	private List<ProductDetailInfo> standardVolumeTop10Products;

	/**
	 * 统一社会信用代码
	 */
	@ApiField("uscc")
	private String uscc;

	public String getActiveMonthPastYear() {
		return this.activeMonthPastYear;
	}
	public void setActiveMonthPastYear(String activeMonthPastYear) {
		this.activeMonthPastYear = activeMonthPastYear;
	}

	public String getActiveShopNum() {
		return this.activeShopNum;
	}
	public void setActiveShopNum(String activeShopNum) {
		this.activeShopNum = activeShopNum;
	}

	public List<AnchorInfo> getAnchorList() {
		return this.anchorList;
	}
	public void setAnchorList(List<AnchorInfo> anchorList) {
		this.anchorList = anchorList;
	}

	public String getAnchorNum() {
		return this.anchorNum;
	}
	public void setAnchorNum(String anchorNum) {
		this.anchorNum = anchorNum;
	}

	public List<String> getBusinessList() {
		return this.businessList;
	}
	public void setBusinessList(List<String> businessList) {
		this.businessList = businessList;
	}

	public String getClosedShopNum() {
		return this.closedShopNum;
	}
	public void setClosedShopNum(String closedShopNum) {
		this.closedShopNum = closedShopNum;
	}

	public String getEntName() {
		return this.entName;
	}
	public void setEntName(String entName) {
		this.entName = entName;
	}

	public String getEntStatus() {
		return this.entStatus;
	}
	public void setEntStatus(String entStatus) {
		this.entStatus = entStatus;
	}

	public String getEntType() {
		return this.entType;
	}
	public void setEntType(String entType) {
		this.entType = entType;
	}

	public String getLastOpenDateDuration() {
		return this.lastOpenDateDuration;
	}
	public void setLastOpenDateDuration(String lastOpenDateDuration) {
		this.lastOpenDateDuration = lastOpenDateDuration;
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

	public String getOpenDateDuration() {
		return this.openDateDuration;
	}
	public void setOpenDateDuration(String openDateDuration) {
		this.openDateDuration = openDateDuration;
	}

	public String getOperationShopNum() {
		return this.operationShopNum;
	}
	public void setOperationShopNum(String operationShopNum) {
		this.operationShopNum = operationShopNum;
	}

	public String getPersonName() {
		return this.personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public List<String> getPlatformList() {
		return this.platformList;
	}
	public void setPlatformList(List<String> platformList) {
		this.platformList = platformList;
	}

	public String getPlatformNum() {
		return this.platformNum;
	}
	public void setPlatformNum(String platformNum) {
		this.platformNum = platformNum;
	}

	public String getPlatformPastYear() {
		return this.platformPastYear;
	}
	public void setPlatformPastYear(String platformPastYear) {
		this.platformPastYear = platformPastYear;
	}

	public String getRegCity() {
		return this.regCity;
	}
	public void setRegCity(String regCity) {
		this.regCity = regCity;
	}

	public String getRegCounty() {
		return this.regCounty;
	}
	public void setRegCounty(String regCounty) {
		this.regCounty = regCounty;
	}

	public String getRegDuration() {
		return this.regDuration;
	}
	public void setRegDuration(String regDuration) {
		this.regDuration = regDuration;
	}

	public String getRegNo() {
		return this.regNo;
	}
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	public String getRegProvince() {
		return this.regProvince;
	}
	public void setRegProvince(String regProvince) {
		this.regProvince = regProvince;
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

	public String getShopNumPastYear() {
		return this.shopNumPastYear;
	}
	public void setShopNumPastYear(String shopNumPastYear) {
		this.shopNumPastYear = shopNumPastYear;
	}

	public List<ShopRatingInfo> getShopRatingList() {
		return this.shopRatingList;
	}
	public void setShopRatingList(List<ShopRatingInfo> shopRatingList) {
		this.shopRatingList = shopRatingList;
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
