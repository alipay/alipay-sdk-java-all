package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.leads.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-21 10:44:17
 */
public class AntMerchantExpandLeadsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8475331417544955996L;

	/** 
	 * 详细地址信息
	 */
	@ApiField("address")
	private String address;

	/** 
	 * 商户品牌id
	 */
	@ApiField("brand_id")
	private String brandId;

	/** 
	 * 营业执照ossKey
	 */
	@ApiField("business_license_key")
	private String businessLicenseKey;

	/** 
	 * 城市编码。 请按照蚂蚁店铺地区码 表格中填写表格中内容填写
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
	 * 设备SN
	 */
	@ApiListField("device_sn_list")
	@ApiField("string")
	private List<String> deviceSnList;

	/** 
	 * 设备类型
	 */
	@ApiField("device_type")
	private String deviceType;

	/** 
	 * 区县编码。 请按照蚂蚁店铺地区码 表格中填写
	 */
	@ApiField("district_code")
	private String districtCode;

	/** 
	 * 提货主体PID
	 */
	@ApiField("isv_pid")
	private String isvPid;

	/** 
	 * 地理信息纬度
	 */
	@ApiField("latitude")
	private String latitude;

	/** 
	 * leads一级来源
	 */
	@ApiField("leads_from_l_1")
	private String leadsFromL1;

	/** 
	 * leads二级来源
	 */
	@ApiField("leads_from_l_2")
	private String leadsFromL2;

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
	 * leads状态
	 */
	@ApiField("leads_status")
	private String leadsStatus;

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
	 * 门店照ossKey
	 */
	@ApiField("out_door_pic_oss_key")
	private String outDoorPicOssKey;

	/** 
	 * 省份编码。 蚂蚁店铺地区码 表格中填写。
	 */
	@ApiField("province_code")
	private String provinceCode;

	/** 
	 * leads类型
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/** 
	 * 外部门店编号
	 */
	@ApiField("store_id")
	private String storeId;

	/** 
	 * 铺设模式
	 */
	@ApiField("work_channel")
	private String workChannel;

	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress( ) {
		return this.address;
	}

	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}
	public String getBrandId( ) {
		return this.brandId;
	}

	public void setBusinessLicenseKey(String businessLicenseKey) {
		this.businessLicenseKey = businessLicenseKey;
	}
	public String getBusinessLicenseKey( ) {
		return this.businessLicenseKey;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	public String getCityCode( ) {
		return this.cityCode;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}
	public String getContactPhone( ) {
		return this.contactPhone;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerId( ) {
		return this.customerId;
	}

	public void setDeviceNum(String deviceNum) {
		this.deviceNum = deviceNum;
	}
	public String getDeviceNum( ) {
		return this.deviceNum;
	}

	public void setDeviceSnList(List<String> deviceSnList) {
		this.deviceSnList = deviceSnList;
	}
	public List<String> getDeviceSnList( ) {
		return this.deviceSnList;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}
	public String getDeviceType( ) {
		return this.deviceType;
	}

	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}
	public String getDistrictCode( ) {
		return this.districtCode;
	}

	public void setIsvPid(String isvPid) {
		this.isvPid = isvPid;
	}
	public String getIsvPid( ) {
		return this.isvPid;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLatitude( ) {
		return this.latitude;
	}

	public void setLeadsFromL1(String leadsFromL1) {
		this.leadsFromL1 = leadsFromL1;
	}
	public String getLeadsFromL1( ) {
		return this.leadsFromL1;
	}

	public void setLeadsFromL2(String leadsFromL2) {
		this.leadsFromL2 = leadsFromL2;
	}
	public String getLeadsFromL2( ) {
		return this.leadsFromL2;
	}

	public void setLeadsId(String leadsId) {
		this.leadsId = leadsId;
	}
	public String getLeadsId( ) {
		return this.leadsId;
	}

	public void setLeadsName(String leadsName) {
		this.leadsName = leadsName;
	}
	public String getLeadsName( ) {
		return this.leadsName;
	}

	public void setLeadsStatus(String leadsStatus) {
		this.leadsStatus = leadsStatus;
	}
	public String getLeadsStatus( ) {
		return this.leadsStatus;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLongitude( ) {
		return this.longitude;
	}

	public void setMccL1(String mccL1) {
		this.mccL1 = mccL1;
	}
	public String getMccL1( ) {
		return this.mccL1;
	}

	public void setMccL2(String mccL2) {
		this.mccL2 = mccL2;
	}
	public String getMccL2( ) {
		return this.mccL2;
	}

	public void setOutDoorPicOssKey(String outDoorPicOssKey) {
		this.outDoorPicOssKey = outDoorPicOssKey;
	}
	public String getOutDoorPicOssKey( ) {
		return this.outDoorPicOssKey;
	}

	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}
	public String getProvinceCode( ) {
		return this.provinceCode;
	}

	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}
	public String getSceneCode( ) {
		return this.sceneCode;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}
	public String getStoreId( ) {
		return this.storeId;
	}

	public void setWorkChannel(String workChannel) {
		this.workChannel = workChannel;
	}
	public String getWorkChannel( ) {
		return this.workChannel;
	}

}
