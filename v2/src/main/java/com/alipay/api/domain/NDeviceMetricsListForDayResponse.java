package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * N设备日维度明细信息
 *
 * @author auto create
 * @since 1.0, 2024-12-27 19:49:16
 */
public class NDeviceMetricsListForDayResponse extends AlipayObject {

	private static final long serialVersionUID = 8877486491679881569L;

	/**
	 * 支付宝金额，单位元
	 */
	@ApiField("alipay_amount")
	private String alipayAmount;

	/**
	 * 支付宝笔数
	 */
	@ApiField("alipay_transaction_count")
	private Long alipayTransactionCount;

	/**
	 * 点亮标识
	 */
	@ApiField("be_lighted_up")
	private Boolean beLightedUp;

	/**
	 * 注册标识
	 */
	@ApiField("be_register")
	private Boolean beRegister;

	/**
	 * 开机标识
	 */
	@ApiField("be_turnon_device")
	private Boolean beTurnonDevice;

	/**
	 * 门店名称
	 */
	@ApiField("binding_location")
	private String bindingLocation;

	/**
	 * 市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 市名称
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 区编码
	 */
	@ApiField("district_code")
	private String districtCode;

	/**
	 * 区名称
	 */
	@ApiField("district_name")
	private String districtName;

	/**
	 * 收银员是否打卡
	 */
	@ApiField("do_check_in")
	private Boolean doCheckIn;

	/**
	 * nfc是否动销
	 */
	@ApiField("has_nfc_trade")
	private Boolean hasNfcTrade;

	/**
	 * 作业人员uid
	 */
	@ApiField("leads_worker_id")
	private String leadsWorkerId;

	/**
	 * 作业人员名称
	 */
	@ApiField("leads_worker_name")
	private String leadsWorkerName;

	/**
	 * 点亮时间,单位为秒
	 */
	@ApiField("light_up_time")
	private Date lightUpTime;

	/**
	 * 门店地址
	 */
	@ApiField("location_address")
	private String locationAddress;

	/**
	 * 统计日期
	 */
	@ApiField("metrics_date")
	private String metricsDate;

	/**
	 * nfc金额，单位元
	 */
	@ApiField("nfc_amount")
	private String nfcAmount;

	/**
	 * nfc笔数
	 */
	@ApiField("nfc_transaction_count")
	private Long nfcTransactionCount;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 省编码
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 省名称
	 */
	@ApiField("province_name")
	private String provinceName;

	/**
	 * 注册时间
	 */
	@ApiField("register_time")
	private Date registerTime;

	/**
	 * 收货时间
	 */
	@ApiField("shipping_time")
	private Date shippingTime;

	/**
	 * 设备sn
	 */
	@ApiField("sn")
	private String sn;

	/**
	 * 外部门店号
	 */
	@ApiField("store_id")
	private String storeId;

	public String getAlipayAmount() {
		return this.alipayAmount;
	}
	public void setAlipayAmount(String alipayAmount) {
		this.alipayAmount = alipayAmount;
	}

	public Long getAlipayTransactionCount() {
		return this.alipayTransactionCount;
	}
	public void setAlipayTransactionCount(Long alipayTransactionCount) {
		this.alipayTransactionCount = alipayTransactionCount;
	}

	public Boolean getBeLightedUp() {
		return this.beLightedUp;
	}
	public void setBeLightedUp(Boolean beLightedUp) {
		this.beLightedUp = beLightedUp;
	}

	public Boolean getBeRegister() {
		return this.beRegister;
	}
	public void setBeRegister(Boolean beRegister) {
		this.beRegister = beRegister;
	}

	public Boolean getBeTurnonDevice() {
		return this.beTurnonDevice;
	}
	public void setBeTurnonDevice(Boolean beTurnonDevice) {
		this.beTurnonDevice = beTurnonDevice;
	}

	public String getBindingLocation() {
		return this.bindingLocation;
	}
	public void setBindingLocation(String bindingLocation) {
		this.bindingLocation = bindingLocation;
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

	public Boolean getDoCheckIn() {
		return this.doCheckIn;
	}
	public void setDoCheckIn(Boolean doCheckIn) {
		this.doCheckIn = doCheckIn;
	}

	public Boolean getHasNfcTrade() {
		return this.hasNfcTrade;
	}
	public void setHasNfcTrade(Boolean hasNfcTrade) {
		this.hasNfcTrade = hasNfcTrade;
	}

	public String getLeadsWorkerId() {
		return this.leadsWorkerId;
	}
	public void setLeadsWorkerId(String leadsWorkerId) {
		this.leadsWorkerId = leadsWorkerId;
	}

	public String getLeadsWorkerName() {
		return this.leadsWorkerName;
	}
	public void setLeadsWorkerName(String leadsWorkerName) {
		this.leadsWorkerName = leadsWorkerName;
	}

	public Date getLightUpTime() {
		return this.lightUpTime;
	}
	public void setLightUpTime(Date lightUpTime) {
		this.lightUpTime = lightUpTime;
	}

	public String getLocationAddress() {
		return this.locationAddress;
	}
	public void setLocationAddress(String locationAddress) {
		this.locationAddress = locationAddress;
	}

	public String getMetricsDate() {
		return this.metricsDate;
	}
	public void setMetricsDate(String metricsDate) {
		this.metricsDate = metricsDate;
	}

	public String getNfcAmount() {
		return this.nfcAmount;
	}
	public void setNfcAmount(String nfcAmount) {
		this.nfcAmount = nfcAmount;
	}

	public Long getNfcTransactionCount() {
		return this.nfcTransactionCount;
	}
	public void setNfcTransactionCount(Long nfcTransactionCount) {
		this.nfcTransactionCount = nfcTransactionCount;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
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

	public Date getRegisterTime() {
		return this.registerTime;
	}
	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}

	public Date getShippingTime() {
		return this.shippingTime;
	}
	public void setShippingTime(Date shippingTime) {
		this.shippingTime = shippingTime;
	}

	public String getSn() {
		return this.sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

}
