package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 跨境电商企业明细
 *
 * @author auto create
 * @since 1.0, 2025-01-06 15:44:44
 */
public class CrossBorderEcomCompanyDetail extends AlipayObject {

	private static final long serialVersionUID = 5353767778599234177L;

	/**
	 * 近1年内活跃月（单位：个月）
	 */
	@ApiField("active_month_past_year")
	private String activeMonthPastYear;

	/**
	 * 活跃店铺数（单位：个）
	 */
	@ApiField("active_shop_num")
	private String activeShopNum;

	/**
	 * 所有销售类目明细
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
	 * 该企业下，所有店铺中，最长营业时长(年)的店铺的营业时长
	 */
	@ApiField("max_shop_operation_years")
	private String maxShopOperationYears;

	/**
	 * 已下架商品个数（单位：个）
	 */
	@ApiField("off_shelf_num")
	private String offShelfNum;

	/**
	 * 在售商品个数（单位：个）
	 */
	@ApiField("on_sale_item_num")
	private String onSaleItemNum;

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
	 * 企业注册地市
	 */
	@ApiField("reg_city")
	private String regCity;

	/**
	 * 企业注册地区县
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
	 * 企业注册地省
	 */
	@ApiField("reg_province")
	private String regProvince;

	/**
	 * 提供近24个月的销售明细数据
	 */
	@ApiListField("sale_details")
	@ApiField("sale_info")
	private List<SaleInfo> saleDetails;

	/**
	 * 销往的国家明细
	 */
	@ApiListField("sell_country_list")
	@ApiField("string")
	private List<String> sellCountryList;

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
	 * 旗下店铺好评率明细
	 */
	@ApiListField("shop_positive_rating_list")
	@ApiField("string")
	private List<String> shopPositiveRatingList;

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

	public String getMaxShopOperationYears() {
		return this.maxShopOperationYears;
	}
	public void setMaxShopOperationYears(String maxShopOperationYears) {
		this.maxShopOperationYears = maxShopOperationYears;
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

	public String getShopNumPastYear() {
		return this.shopNumPastYear;
	}
	public void setShopNumPastYear(String shopNumPastYear) {
		this.shopNumPastYear = shopNumPastYear;
	}

	public List<String> getShopPositiveRatingList() {
		return this.shopPositiveRatingList;
	}
	public void setShopPositiveRatingList(List<String> shopPositiveRatingList) {
		this.shopPositiveRatingList = shopPositiveRatingList;
	}

	public String getUscc() {
		return this.uscc;
	}
	public void setUscc(String uscc) {
		this.uscc = uscc;
	}

}
