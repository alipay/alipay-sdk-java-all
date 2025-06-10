package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * N项目leads修改
 *
 * @author auto create
 * @since 1.0, 2025-04-30 14:32:52
 */
public class AntMerchantExpandLeadsModifyModel extends AlipayObject {

	private static final long serialVersionUID = 6532329178482214189L;

	/**
	 * leads详细地址信息
	 */
	@ApiField("address")
	private String address;

	/**
	 * 商户品牌id
	 */
	@ApiField("brand_id")
	private String brandId;

	/**
	 * 需通过ant.merchant.expand.indirect.image.upload 接口上传图片后得到的 image_id
	 */
	@ApiField("business_license_key")
	private String businessLicenseKey;

	/**
	 * 城市编码。 请按照蚂蚁店铺地区码 表格中填写表格中内容填写。
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 联系方式
	 */
	@ApiField("contact_phone")
	private String contactPhone;

	/**
	 * 客户id
	 */
	@ApiField("customer_id")
	private String customerId;

	/**
	 * leads设备铺设个数
	 */
	@ApiField("device_num")
	private String deviceNum;

	/**
	 * 区县编码。 请按照蚂蚁店铺地区码 表格中填写。
	 */
	@ApiField("district_code")
	private String districtCode;

	/**
	 * 地理信息纬度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * leadsId,leads业务主键信息
	 */
	@ApiField("leads_id")
	private String leadsId;

	/**
	 * leads名称
	 */
	@ApiField("leads_name")
	private String leadsName;

	/**
	 * 地理信息经度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 类目标准一级类目。类目标准及与原类目映射关系参见 支付宝门店类目-最新 表格。
	 */
	@ApiField("mcc_l_1")
	private String mccL1;

	/**
	 * 类目标准二级类目。类目标准及与原类目映射关系参见 支付宝门店类目-最新 表格。
	 */
	@ApiField("mcc_l_2")
	private String mccL2;

	/**
	 * 需通过ant.merchant.expand.indirect.image.upload 接口上传图片后得到的 image_id
	 */
	@ApiField("out_door_pic_oss_key")
	private String outDoorPicOssKey;

	/**
	 * 省份编码。 请按照蚂蚁店铺地区码 表格中填写。
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 外部门店编号
	 */
	@ApiField("store_id")
	private String storeId;

	/**
	 * 提报主体
	 */
	@ApiField("submit_object")
	private String submitObject;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getBrandId() {
		return this.brandId;
	}
	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	public String getBusinessLicenseKey() {
		return this.businessLicenseKey;
	}
	public void setBusinessLicenseKey(String businessLicenseKey) {
		this.businessLicenseKey = businessLicenseKey;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getContactPhone() {
		return this.contactPhone;
	}
	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	public String getCustomerId() {
		return this.customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getDeviceNum() {
		return this.deviceNum;
	}
	public void setDeviceNum(String deviceNum) {
		this.deviceNum = deviceNum;
	}

	public String getDistrictCode() {
		return this.districtCode;
	}
	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public String getLatitude() {
		return this.latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLeadsId() {
		return this.leadsId;
	}
	public void setLeadsId(String leadsId) {
		this.leadsId = leadsId;
	}

	public String getLeadsName() {
		return this.leadsName;
	}
	public void setLeadsName(String leadsName) {
		this.leadsName = leadsName;
	}

	public String getLongitude() {
		return this.longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getMccL1() {
		return this.mccL1;
	}
	public void setMccL1(String mccL1) {
		this.mccL1 = mccL1;
	}

	public String getMccL2() {
		return this.mccL2;
	}
	public void setMccL2(String mccL2) {
		this.mccL2 = mccL2;
	}

	public String getOutDoorPicOssKey() {
		return this.outDoorPicOssKey;
	}
	public void setOutDoorPicOssKey(String outDoorPicOssKey) {
		this.outDoorPicOssKey = outDoorPicOssKey;
	}

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public String getSubmitObject() {
		return this.submitObject;
	}
	public void setSubmitObject(String submitObject) {
		this.submitObject = submitObject;
	}

}
