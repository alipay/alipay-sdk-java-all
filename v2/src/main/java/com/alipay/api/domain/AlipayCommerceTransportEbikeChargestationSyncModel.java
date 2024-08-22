package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 两轮电动车充电桩数据同步接口
 *
 * @author auto create
 * @since 1.0, 2024-06-26 23:19:28
 */
public class AlipayCommerceTransportEbikeChargestationSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4299841279269376871L;

	/**
	 * 充电桩设备详细地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 当sync_type=SAVE且对应的是可用插口数变更
	 */
	@ApiField("available_plug_count")
	private Long availablePlugCount;

	/**
	 * 用于唯一标识一个品牌
	 */
	@ApiField("brand_code")
	private String brandCode;

	/**
	 * 充电桩品牌名称
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 设备所在城市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 城市名称
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 标识数据来源ISV
	 */
	@ApiField("data_source")
	private String dataSource;

	/**
	 * 跳转支付宝小程序链接
	 */
	@ApiField("detail_link_url")
	private String detailLinkUrl;

	/**
	 * 设备所在场地类型是否对外开放
	 */
	@ApiField("device_field_type")
	private String deviceFieldType;

	/**
	 * 充电桩设备所在经纬度（高德坐标系）
	 */
	@ApiField("device_lbs")
	private String deviceLbs;

	/**
	 * 充电桩设备名称
	 */
	@ApiField("device_name")
	private String deviceName;

	/**
	 * 充电桩设备编号(唯一标识)
	 */
	@ApiField("device_no")
	private String deviceNo;

	/**
	 * 设备状态
	 */
	@ApiField("device_status")
	private String deviceStatus;

	/**
	 * 设备类型枚举
充电桩 1
充电柜 2
换电柜 3
	 */
	@ApiField("device_type_code")
	private String deviceTypeCode;

	/**
	 * 充电桩收费标准
	 */
	@ApiField("fee_desc")
	private String feeDesc;

	/**
	 * 场地图片,需要上传可以公网访问的图片链接
	 */
	@ApiListField("field_image_list")
	@ApiField("string")
	private List<String> fieldImageList;

	/**
	 * 场地服务描述
	 */
	@ApiListField("field_service_desc")
	@ApiField("string")
	private List<String> fieldServiceDesc;

	/**
	 * 单路最大输出功率 单位: 瓦
	 */
	@ApiField("maximum_power")
	private Long maximumPower;

	/**
	 * 支付方式
	 */
	@ApiField("pay_type")
	private String payType;

	/**
	 * 充电桩对应的插口总数
	 */
	@ApiField("plug_sum")
	private Long plugSum;

	/**
	 * 充电桩设备所在省
	 */
	@ApiField("province")
	private String province;

	/**
	 * 站点名称
	 */
	@ApiField("station_name")
	private String stationName;

	/**
	 * 站点编号
	 */
	@ApiField("station_no")
	private String stationNo;

	/**
	 * 请求时机
SAVE: 
- 当首次绑定设备，首次新增需要回传所有基础信息
- 后续信息变更，例如设备名称、状态等发生变更
DELETE: 解绑设备或者不维护该设备则需要调用DELETE删除
	 */
	@ApiField("sync_type")
	private String syncType;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public Long getAvailablePlugCount() {
		return this.availablePlugCount;
	}
	public void setAvailablePlugCount(Long availablePlugCount) {
		this.availablePlugCount = availablePlugCount;
	}

	public String getBrandCode() {
		return this.brandCode;
	}
	public void setBrandCode(String brandCode) {
		this.brandCode = brandCode;
	}

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
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

	public String getDataSource() {
		return this.dataSource;
	}
	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}

	public String getDetailLinkUrl() {
		return this.detailLinkUrl;
	}
	public void setDetailLinkUrl(String detailLinkUrl) {
		this.detailLinkUrl = detailLinkUrl;
	}

	public String getDeviceFieldType() {
		return this.deviceFieldType;
	}
	public void setDeviceFieldType(String deviceFieldType) {
		this.deviceFieldType = deviceFieldType;
	}

	public String getDeviceLbs() {
		return this.deviceLbs;
	}
	public void setDeviceLbs(String deviceLbs) {
		this.deviceLbs = deviceLbs;
	}

	public String getDeviceName() {
		return this.deviceName;
	}
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getDeviceNo() {
		return this.deviceNo;
	}
	public void setDeviceNo(String deviceNo) {
		this.deviceNo = deviceNo;
	}

	public String getDeviceStatus() {
		return this.deviceStatus;
	}
	public void setDeviceStatus(String deviceStatus) {
		this.deviceStatus = deviceStatus;
	}

	public String getDeviceTypeCode() {
		return this.deviceTypeCode;
	}
	public void setDeviceTypeCode(String deviceTypeCode) {
		this.deviceTypeCode = deviceTypeCode;
	}

	public String getFeeDesc() {
		return this.feeDesc;
	}
	public void setFeeDesc(String feeDesc) {
		this.feeDesc = feeDesc;
	}

	public List<String> getFieldImageList() {
		return this.fieldImageList;
	}
	public void setFieldImageList(List<String> fieldImageList) {
		this.fieldImageList = fieldImageList;
	}

	public List<String> getFieldServiceDesc() {
		return this.fieldServiceDesc;
	}
	public void setFieldServiceDesc(List<String> fieldServiceDesc) {
		this.fieldServiceDesc = fieldServiceDesc;
	}

	public Long getMaximumPower() {
		return this.maximumPower;
	}
	public void setMaximumPower(Long maximumPower) {
		this.maximumPower = maximumPower;
	}

	public String getPayType() {
		return this.payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}

	public Long getPlugSum() {
		return this.plugSum;
	}
	public void setPlugSum(Long plugSum) {
		this.plugSum = plugSum;
	}

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

	public String getStationName() {
		return this.stationName;
	}
	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	public String getStationNo() {
		return this.stationNo;
	}
	public void setStationNo(String stationNo) {
		this.stationNo = stationNo;
	}

	public String getSyncType() {
		return this.syncType;
	}
	public void setSyncType(String syncType) {
		this.syncType = syncType;
	}

}
