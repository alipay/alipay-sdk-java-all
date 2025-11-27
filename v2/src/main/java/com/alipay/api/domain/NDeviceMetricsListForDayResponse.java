package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * N设备日维度明细信息
 *
 * @author auto create
 * @since 1.0, 2025-11-22 11:07:46
 */
public class NDeviceMetricsListForDayResponse extends AlipayObject {

	private static final long serialVersionUID = 5124751762596126563L;

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
	 * 绑定状态
	 */
	@ApiField("cur_bind_status")
	private String curBindStatus;

	/**
	 * 设备连接电脑系统类型
	 */
	@ApiField("device_system")
	private String deviceSystem;

	/**
	 * 设备类型
	 */
	@ApiField("device_type")
	private String deviceType;

	/**
	 * 数字化门店ID
	 */
	@ApiField("digital_poi_id")
	private String digitalPoiId;

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
	 * 设备碰一下或扫码交易大于等于2元的支付笔数且一个用户同一天交易笔数最多为2笔
	 */
	@ApiField("effective_alipay_transaction_count")
	private String effectiveAlipayTransactionCount;

	/**
	 * 设备碰一下交易大于等于2元的支付笔数且一个用户同一天交易笔数最多为2笔
	 */
	@ApiField("effective_nfc_transaction_count")
	private String effectiveNfcTransactionCount;

	/**
	 * 有效开机标识,当日开机大于6h即为有效开机
	 */
	@ApiField("effective_turnon_device")
	private Boolean effectiveTurnonDevice;

	/**
	 * nfc是否动销
	 */
	@ApiField("has_nfc_trade")
	private Boolean hasNfcTrade;

	/**
	 * 设备当日至少有一笔碰一下且交易金额大于等于2元，则为是
	 */
	@ApiField("has_nfc_trade_greater_2")
	private Boolean hasNfcTradeGreater2;

	/**
	 * 点亮30天内打卡天数
	 */
	@ApiField("last_30_checkin_days")
	private String last30CheckinDays;

	/**
	 * 点亮30天内动销≥2元天数
	 */
	@ApiField("last_30_sales_over_2_days")
	private String last30SalesOver2Days;

	/**
	 * 点亮30天内有效开机天数
	 */
	@ApiField("last_30_valid_boot_days")
	private String last30ValidBootDays;

	/**
	 * 点亮7天内打卡天数
	 */
	@ApiField("last_7_checkin_days")
	private String last7CheckinDays;

	/**
	 * leads门店名称
	 */
	@ApiField("leads_location")
	private String leadsLocation;

	/**
	 * leads门店地址
	 */
	@ApiField("leads_location_address")
	private String leadsLocationAddress;

	/**
	 * leads门店ID
	 */
	@ApiField("leads_poi_id")
	private String leadsPoiId;

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
	 * 近7天小指令有活跃，不区分saas、免研小指令
	 */
	@ApiField("micro_command_active_7_day")
	private Boolean microCommandActive7Day;

	/**
	 * nfc金额，单位元
	 */
	@ApiField("nfc_amount")
	private String nfcAmount;

	/**
	 * 设备当日至少有一笔碰一下或扫码交易且交易金额大于等于2元，则为是
	 */
	@ApiField("nfc_trade_greater_2")
	private Boolean nfcTradeGreater2;

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
	 * 设备在统计当天所产生的用户碰一下实付金额总额（限定交易时间在统计当日） 单位元，精确到分
	 */
	@ApiField("real_consume_fee")
	private String realConsumeFee;

	/**
	 * 设备在统计当天所发生的nfc交易实付退款金额（仅限定退款时间在当日）单位元，精确到分
	 */
	@ApiField("real_refund_fee")
	private String realRefundFee;

	/**
	 * 退款金额（追溯近60天）  单位元，精确到分
	 */
	@ApiField("refund_order_amt")
	private String refundOrderAmt;

	/**
	 * 退款笔数（追溯近60天）
	 */
	@ApiField("refund_order_cnt")
	private String refundOrderCnt;

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
	 * 最新门店首次大于等于1元动销时间
	 */
	@ApiField("store_first_sale_1_yuan_date")
	private Date storeFirstSale1YuanDate;

	/**
	 * 外部门店号
	 */
	@ApiField("store_id")
	private String storeId;

	/**
	 * 累计已点亮自然月
	 */
	@ApiField("total_lighted_months")
	private String totalLightedMonths;

	/**
	 * 首次点亮30天内碰交易大于等于2元用户数
	 */
	@ApiField("trd_amt_2_n_user_cnt_fromlight_30_d")
	private String trdAmt2NUserCntFromlight30D;

	/**
	 * 大于等于2元碰一下交易的用户数，单位为人，日维度去重
	 */
	@ApiField("trd_greater_2_nfc_device_usercnt")
	private String trdGreater2NfcDeviceUsercnt;

	/**
	 * 碰一下用户数，单位为人，日维度已去重
	 */
	@ApiField("trd_nfc_device_usercnt")
	private String trdNfcDeviceUsercnt;

	/**
	 * 设备最近绑定门店的时间
	 */
	@ApiField("update_register_time")
	private Date updateRegisterTime;

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

	public String getCurBindStatus() {
		return this.curBindStatus;
	}
	public void setCurBindStatus(String curBindStatus) {
		this.curBindStatus = curBindStatus;
	}

	public String getDeviceSystem() {
		return this.deviceSystem;
	}
	public void setDeviceSystem(String deviceSystem) {
		this.deviceSystem = deviceSystem;
	}

	public String getDeviceType() {
		return this.deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getDigitalPoiId() {
		return this.digitalPoiId;
	}
	public void setDigitalPoiId(String digitalPoiId) {
		this.digitalPoiId = digitalPoiId;
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

	public String getEffectiveAlipayTransactionCount() {
		return this.effectiveAlipayTransactionCount;
	}
	public void setEffectiveAlipayTransactionCount(String effectiveAlipayTransactionCount) {
		this.effectiveAlipayTransactionCount = effectiveAlipayTransactionCount;
	}

	public String getEffectiveNfcTransactionCount() {
		return this.effectiveNfcTransactionCount;
	}
	public void setEffectiveNfcTransactionCount(String effectiveNfcTransactionCount) {
		this.effectiveNfcTransactionCount = effectiveNfcTransactionCount;
	}

	public Boolean getEffectiveTurnonDevice() {
		return this.effectiveTurnonDevice;
	}
	public void setEffectiveTurnonDevice(Boolean effectiveTurnonDevice) {
		this.effectiveTurnonDevice = effectiveTurnonDevice;
	}

	public Boolean getHasNfcTrade() {
		return this.hasNfcTrade;
	}
	public void setHasNfcTrade(Boolean hasNfcTrade) {
		this.hasNfcTrade = hasNfcTrade;
	}

	public Boolean getHasNfcTradeGreater2() {
		return this.hasNfcTradeGreater2;
	}
	public void setHasNfcTradeGreater2(Boolean hasNfcTradeGreater2) {
		this.hasNfcTradeGreater2 = hasNfcTradeGreater2;
	}

	public String getLast30CheckinDays() {
		return this.last30CheckinDays;
	}
	public void setLast30CheckinDays(String last30CheckinDays) {
		this.last30CheckinDays = last30CheckinDays;
	}

	public String getLast30SalesOver2Days() {
		return this.last30SalesOver2Days;
	}
	public void setLast30SalesOver2Days(String last30SalesOver2Days) {
		this.last30SalesOver2Days = last30SalesOver2Days;
	}

	public String getLast30ValidBootDays() {
		return this.last30ValidBootDays;
	}
	public void setLast30ValidBootDays(String last30ValidBootDays) {
		this.last30ValidBootDays = last30ValidBootDays;
	}

	public String getLast7CheckinDays() {
		return this.last7CheckinDays;
	}
	public void setLast7CheckinDays(String last7CheckinDays) {
		this.last7CheckinDays = last7CheckinDays;
	}

	public String getLeadsLocation() {
		return this.leadsLocation;
	}
	public void setLeadsLocation(String leadsLocation) {
		this.leadsLocation = leadsLocation;
	}

	public String getLeadsLocationAddress() {
		return this.leadsLocationAddress;
	}
	public void setLeadsLocationAddress(String leadsLocationAddress) {
		this.leadsLocationAddress = leadsLocationAddress;
	}

	public String getLeadsPoiId() {
		return this.leadsPoiId;
	}
	public void setLeadsPoiId(String leadsPoiId) {
		this.leadsPoiId = leadsPoiId;
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

	public Boolean getMicroCommandActive7Day() {
		return this.microCommandActive7Day;
	}
	public void setMicroCommandActive7Day(Boolean microCommandActive7Day) {
		this.microCommandActive7Day = microCommandActive7Day;
	}

	public String getNfcAmount() {
		return this.nfcAmount;
	}
	public void setNfcAmount(String nfcAmount) {
		this.nfcAmount = nfcAmount;
	}

	public Boolean getNfcTradeGreater2() {
		return this.nfcTradeGreater2;
	}
	public void setNfcTradeGreater2(Boolean nfcTradeGreater2) {
		this.nfcTradeGreater2 = nfcTradeGreater2;
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

	public String getRealConsumeFee() {
		return this.realConsumeFee;
	}
	public void setRealConsumeFee(String realConsumeFee) {
		this.realConsumeFee = realConsumeFee;
	}

	public String getRealRefundFee() {
		return this.realRefundFee;
	}
	public void setRealRefundFee(String realRefundFee) {
		this.realRefundFee = realRefundFee;
	}

	public String getRefundOrderAmt() {
		return this.refundOrderAmt;
	}
	public void setRefundOrderAmt(String refundOrderAmt) {
		this.refundOrderAmt = refundOrderAmt;
	}

	public String getRefundOrderCnt() {
		return this.refundOrderCnt;
	}
	public void setRefundOrderCnt(String refundOrderCnt) {
		this.refundOrderCnt = refundOrderCnt;
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

	public Date getStoreFirstSale1YuanDate() {
		return this.storeFirstSale1YuanDate;
	}
	public void setStoreFirstSale1YuanDate(Date storeFirstSale1YuanDate) {
		this.storeFirstSale1YuanDate = storeFirstSale1YuanDate;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public String getTotalLightedMonths() {
		return this.totalLightedMonths;
	}
	public void setTotalLightedMonths(String totalLightedMonths) {
		this.totalLightedMonths = totalLightedMonths;
	}

	public String getTrdAmt2NUserCntFromlight30D() {
		return this.trdAmt2NUserCntFromlight30D;
	}
	public void setTrdAmt2NUserCntFromlight30D(String trdAmt2NUserCntFromlight30D) {
		this.trdAmt2NUserCntFromlight30D = trdAmt2NUserCntFromlight30D;
	}

	public String getTrdGreater2NfcDeviceUsercnt() {
		return this.trdGreater2NfcDeviceUsercnt;
	}
	public void setTrdGreater2NfcDeviceUsercnt(String trdGreater2NfcDeviceUsercnt) {
		this.trdGreater2NfcDeviceUsercnt = trdGreater2NfcDeviceUsercnt;
	}

	public String getTrdNfcDeviceUsercnt() {
		return this.trdNfcDeviceUsercnt;
	}
	public void setTrdNfcDeviceUsercnt(String trdNfcDeviceUsercnt) {
		this.trdNfcDeviceUsercnt = trdNfcDeviceUsercnt;
	}

	public Date getUpdateRegisterTime() {
		return this.updateRegisterTime;
	}
	public void setUpdateRegisterTime(Date updateRegisterTime) {
		this.updateRegisterTime = updateRegisterTime;
	}

}
