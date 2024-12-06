package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 两轮电动车租车门店数据同步接口
 *
 * @author auto create
 * @since 1.0, 2024-11-25 23:10:57
 */
public class AlipayCommerceTransportEbikerentalStoreSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3142242397921246292L;

	/**
	 * 营业时间
	 */
	@ApiField("business_time")
	private String businessTime;

	/**
	 * 门店所在城市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 门店所在城市名称
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 其他支持还车的门店id集合
	 */
	@ApiListField("other_return_store_ids")
	@ApiField("string")
	private List<String> otherReturnStoreIds;

	/**
	 * 门店所在省份编码
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 门店所在省份名称
	 */
	@ApiField("province_name")
	private String provinceName;

	/**
	 * 服务商
	 */
	@ApiField("service_provider")
	private String serviceProvider;

	/**
	 * 正常服务：in_service
暂停服务：stop_service
	 */
	@ApiField("status")
	private String status;

	/**
	 * 门店详细地址
	 */
	@ApiField("store_address")
	private String storeAddress;

	/**
	 * 门店联系方式
	 */
	@ApiField("store_contact")
	private String storeContact;

	/**
	 * 门店车辆配置标签集合
	 */
	@ApiField("store_ebike_config_tags")
	private String storeEbikeConfigTags;

	/**
	 * 门店id
	 */
	@ApiField("store_id")
	private String storeId;

	/**
	 * 店铺门头照
	 */
	@ApiField("store_image_url")
	private String storeImageUrl;

	/**
	 * 门店具体位置经纬度坐标
	 */
	@ApiField("store_location_coordinates")
	private String storeLocationCoordinates;

	/**
	 * 门店名称
	 */
	@ApiField("store_name")
	private String storeName;

	/**
	 * 门店服务标签集合
	 */
	@ApiField("store_service_tags")
	private String storeServiceTags;

	/**
	 * Y：支持多店还车
N：不支持多店还车
	 */
	@ApiField("support_multiple_stores_return_flag")
	private String supportMultipleStoresReturnFlag;

	/**
	 * 数据同步类型
	 */
	@ApiField("sync_type")
	private String syncType;

	public String getBusinessTime() {
		return this.businessTime;
	}
	public void setBusinessTime(String businessTime) {
		this.businessTime = businessTime;
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

	public List<String> getOtherReturnStoreIds() {
		return this.otherReturnStoreIds;
	}
	public void setOtherReturnStoreIds(List<String> otherReturnStoreIds) {
		this.otherReturnStoreIds = otherReturnStoreIds;
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

	public String getServiceProvider() {
		return this.serviceProvider;
	}
	public void setServiceProvider(String serviceProvider) {
		this.serviceProvider = serviceProvider;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getStoreAddress() {
		return this.storeAddress;
	}
	public void setStoreAddress(String storeAddress) {
		this.storeAddress = storeAddress;
	}

	public String getStoreContact() {
		return this.storeContact;
	}
	public void setStoreContact(String storeContact) {
		this.storeContact = storeContact;
	}

	public String getStoreEbikeConfigTags() {
		return this.storeEbikeConfigTags;
	}
	public void setStoreEbikeConfigTags(String storeEbikeConfigTags) {
		this.storeEbikeConfigTags = storeEbikeConfigTags;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public String getStoreImageUrl() {
		return this.storeImageUrl;
	}
	public void setStoreImageUrl(String storeImageUrl) {
		this.storeImageUrl = storeImageUrl;
	}

	public String getStoreLocationCoordinates() {
		return this.storeLocationCoordinates;
	}
	public void setStoreLocationCoordinates(String storeLocationCoordinates) {
		this.storeLocationCoordinates = storeLocationCoordinates;
	}

	public String getStoreName() {
		return this.storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getStoreServiceTags() {
		return this.storeServiceTags;
	}
	public void setStoreServiceTags(String storeServiceTags) {
		this.storeServiceTags = storeServiceTags;
	}

	public String getSupportMultipleStoresReturnFlag() {
		return this.supportMultipleStoresReturnFlag;
	}
	public void setSupportMultipleStoresReturnFlag(String supportMultipleStoresReturnFlag) {
		this.supportMultipleStoresReturnFlag = supportMultipleStoresReturnFlag;
	}

	public String getSyncType() {
		return this.syncType;
	}
	public void setSyncType(String syncType) {
		this.syncType = syncType;
	}

}
