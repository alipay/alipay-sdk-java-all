package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑开店Leads创建接口
 *
 * @author auto create
 * @since 1.0, 2021-05-10 15:52:08
 */
public class KoubeiSalesLeadsShopleadsCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4616283412758613977L;

	/**
	 * 街道详细地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 分店名
	 */
	@ApiField("branch_name")
	private String branchName;

	/**
	 * 品牌id，请联系业务获取
	 */
	@ApiField("brand_id")
	private String brandId;

	/**
	 * 叶子类目id，请联系业务获取
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 市级码
	 */
	@ApiField("city_id")
	private String cityId;

	/**
	 * 营业执照上的公司、法人名称
	 */
	@ApiField("company_name")
	private String companyName;

	/**
	 * 联系人姓名
	 */
	@ApiField("contacts_name")
	private String contactsName;

	/**
	 * 联系电话
	 */
	@ApiField("contacts_no")
	private String contactsNo;

	/**
	 * 国家码
	 */
	@ApiField("country_id")
	private String countryId;

	/**
	 * 区级码
	 */
	@ApiField("district_id")
	private String districtId;

	/**
	 * 扩展信息，JsonMap格式
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 主店名
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
	 * 备注信息
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 省、直辖市码
	 */
	@ApiField("province_id")
	private String provinceId;

	/**
	 * 工商注册时间
	 */
	@ApiField("register_date")
	private String registerDate;

	/**
	 * 调用方请求id，业务请求相同时应保持一致，用于幂等
	 */
	@ApiField("request_id")
	private String requestId;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getBranchName() {
		return this.branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getBrandId() {
		return this.brandId;
	}
	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	public String getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getCityId() {
		return this.cityId;
	}
	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	public String getCompanyName() {
		return this.companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getContactsName() {
		return this.contactsName;
	}
	public void setContactsName(String contactsName) {
		this.contactsName = contactsName;
	}

	public String getContactsNo() {
		return this.contactsNo;
	}
	public void setContactsNo(String contactsNo) {
		this.contactsNo = contactsNo;
	}

	public String getCountryId() {
		return this.countryId;
	}
	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	public String getDistrictId() {
		return this.districtId;
	}
	public void setDistrictId(String districtId) {
		this.districtId = districtId;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
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

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getProvinceId() {
		return this.provinceId;
	}
	public void setProvinceId(String provinceId) {
		this.provinceId = provinceId;
	}

	public String getRegisterDate() {
		return this.registerDate;
	}
	public void setRegisterDate(String registerDate) {
		this.registerDate = registerDate;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
