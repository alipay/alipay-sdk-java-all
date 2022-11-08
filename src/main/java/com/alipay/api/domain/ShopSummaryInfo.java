package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 门店摘要信息
 *
 * @author auto create
 * @since 1.0, 2017-07-26 09:48:54
 */
public class ShopSummaryInfo extends AlipayObject {

	private static final long serialVersionUID = 3716642738959723976L;

	/**
	 * 门店地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 分店名
	 */
	@ApiField("branch_shop_name")
	private String branchShopName;

	/**
	 * 品牌名，不填写则默认为其它品牌
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 经营时间
	 */
	@ApiField("business_time")
	private String businessTime;

	/**
	 * 门店类目列表
	 */
	@ApiListField("category_infos")
	@ApiField("shop_category_info")
	private List<ShopCategoryInfo> categoryInfos;

	/**
	 * 城市编码，国标码，详见国家统计局数据 <a href="http://aopsdkdownload.cn-hangzhou.alipay-pub.aliyun-inc.com/doc/AreaCodeList.zip">点此下载</a>
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 城市名称
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * "0", "不展示"
"1", "展示"
"2", "后台强制不展示"
"3", "灰度展示状态"
	 */
	@ApiField("display_status")
	private String displayStatus;

	/**
	 * 区县编码，国标码，详见国家统计局数据 <a href="http://aopsdkdownload.cn-hangzhou.alipay-pub.aliyun-inc.com/doc/AreaCodeList.zip">点此下载</a>
	 */
	@ApiField("district_code")
	private String districtCode;

	/**
	 * 区县名称
	 */
	@ApiField("district_name")
	private String districtName;

	/**
	 * 门店座机电话
	 */
	@ApiField("landline_no")
	private String landlineNo;

	/**
	 * 纬度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 门店logo图片
	 */
	@ApiField("logo")
	private String logo;

	/**
	 * logo图片地址
	 */
	@ApiField("logo_url")
	private String logoUrl;

	/**
	 * 经度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 门店首图
	 */
	@ApiField("main_image")
	private String mainImage;

	/**
	 * 门店首图url地址
	 */
	@ApiField("main_image_url")
	private String mainImageUrl;

	/**
	 * 主门店名
	 */
	@ApiField("main_shop_name")
	private String mainShopName;

	/**
	 * 门店电话
	 */
	@ApiField("mobile_no")
	private String mobileNo;

	/**
	 * 人均消费
	 */
	@ApiField("per_pay")
	private String perPay;

	/**
	 * 门店所属商户pid
	 */
	@ApiField("principal_id")
	private String principalId;

	/**
	 * 省份编码，国标码，详见国家统计局数据 <a href="http://aopsdkdownload.cn-hangzhou.alipay-pub.aliyun-inc.com/doc/AreaCodeList.zip">点此下载</a>
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 身份名称
	 */
	@ApiField("province_name")
	private String provinceName;

	/**
	 * 门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 门店状态，OPEN：营业中、PAUSE：暂停营业、FREEZE：已冻结、CLOSE:门店已关闭
	 */
	@ApiField("status")
	private String status;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getBranchShopName() {
		return this.branchShopName;
	}
	public void setBranchShopName(String branchShopName) {
		this.branchShopName = branchShopName;
	}

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getBusinessTime() {
		return this.businessTime;
	}
	public void setBusinessTime(String businessTime) {
		this.businessTime = businessTime;
	}

	public List<ShopCategoryInfo> getCategoryInfos() {
		return this.categoryInfos;
	}
	public void setCategoryInfos(List<ShopCategoryInfo> categoryInfos) {
		this.categoryInfos = categoryInfos;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCityName() {
		return this.cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getDisplayStatus() {
		return this.displayStatus;
	}
	public void setDisplayStatus(String displayStatus) {
		this.displayStatus = displayStatus;
	}

	public String getDistrictCode() {
		return this.districtCode;
	}
	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public String getDistrictName() {
		return this.districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public String getLandlineNo() {
		return this.landlineNo;
	}
	public void setLandlineNo(String landlineNo) {
		this.landlineNo = landlineNo;
	}

	public String getLatitude() {
		return this.latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLogo() {
		return this.logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getLogoUrl() {
		return this.logoUrl;
	}
	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

	public String getLongitude() {
		return this.longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getMainImage() {
		return this.mainImage;
	}
	public void setMainImage(String mainImage) {
		this.mainImage = mainImage;
	}

	public String getMainImageUrl() {
		return this.mainImageUrl;
	}
	public void setMainImageUrl(String mainImageUrl) {
		this.mainImageUrl = mainImageUrl;
	}

	public String getMainShopName() {
		return this.mainShopName;
	}
	public void setMainShopName(String mainShopName) {
		this.mainShopName = mainShopName;
	}

	public String getMobileNo() {
		return this.mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getPerPay() {
		return this.perPay;
	}
	public void setPerPay(String perPay) {
		this.perPay = perPay;
	}

	public String getPrincipalId() {
		return this.principalId;
	}
	public void setPrincipalId(String principalId) {
		this.principalId = principalId;
	}

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getProvinceName() {
		return this.provinceName;
	}
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
