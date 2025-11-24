package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-06-30 13:32:28
 */
public class InternetbarShopActivityData extends AlipayObject {

	private static final long serialVersionUID = 5887241878737255779L;

	/**
	 * 历史活跃线圈总数
	 */
	@ApiField("active_device_count")
	private Long activeDeviceCount;

	/**
	 * 该门店申请的线圈总数
	 */
	@ApiField("apply_device_count")
	private Long applyDeviceCount;

	/**
	 * 动销数据对应的业务发生日期
	 */
	@ApiField("biz_date")
	private String bizDate;

	/**
	 * biz_date对应的当日活跃线圈数
	 */
	@ApiField("daily_active_device_count")
	private Long dailyActiveDeviceCount;

	/**
	 * 线圈1日pv
	 */
	@ApiField("device_1_day_pv")
	private Long device1DayPv;

	/**
	 * 线圈最近30日日均pv
	 */
	@ApiField("device_30_day_avg_pv")
	private Long device30DayAvgPv;

	/**
	 * 线圈30日uv
	 */
	@ApiField("device_30_day_uv")
	private Long device30DayUv;

	/**
	 * 线圈dau
	 */
	@ApiField("device_dau")
	private Long deviceDau;

	/**
	 * 最近30天活跃线圈数
	 */
	@ApiField("last_30_day_active_device_count")
	private Long last30DayActiveDeviceCount;

	/**
	 * 门店编号
	 */
	@ApiField("shop_code")
	private String shopCode;

	/**
	 * 用于区分品牌旗下不同的门店
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 门店中文名称
	 */
	@ApiField("shop_name")
	private String shopName;

	public Long getActiveDeviceCount() {
		return this.activeDeviceCount;
	}
	public void setActiveDeviceCount(Long activeDeviceCount) {
		this.activeDeviceCount = activeDeviceCount;
	}

	public Long getApplyDeviceCount() {
		return this.applyDeviceCount;
	}
	public void setApplyDeviceCount(Long applyDeviceCount) {
		this.applyDeviceCount = applyDeviceCount;
	}

	public String getBizDate() {
		return this.bizDate;
	}
	public void setBizDate(String bizDate) {
		this.bizDate = bizDate;
	}

	public Long getDailyActiveDeviceCount() {
		return this.dailyActiveDeviceCount;
	}
	public void setDailyActiveDeviceCount(Long dailyActiveDeviceCount) {
		this.dailyActiveDeviceCount = dailyActiveDeviceCount;
	}

	public Long getDevice1DayPv() {
		return this.device1DayPv;
	}
	public void setDevice1DayPv(Long device1DayPv) {
		this.device1DayPv = device1DayPv;
	}

	public Long getDevice30DayAvgPv() {
		return this.device30DayAvgPv;
	}
	public void setDevice30DayAvgPv(Long device30DayAvgPv) {
		this.device30DayAvgPv = device30DayAvgPv;
	}

	public Long getDevice30DayUv() {
		return this.device30DayUv;
	}
	public void setDevice30DayUv(Long device30DayUv) {
		this.device30DayUv = device30DayUv;
	}

	public Long getDeviceDau() {
		return this.deviceDau;
	}
	public void setDeviceDau(Long deviceDau) {
		this.deviceDau = deviceDau;
	}

	public Long getLast30DayActiveDeviceCount() {
		return this.last30DayActiveDeviceCount;
	}
	public void setLast30DayActiveDeviceCount(Long last30DayActiveDeviceCount) {
		this.last30DayActiveDeviceCount = last30DayActiveDeviceCount;
	}

	public String getShopCode() {
		return this.shopCode;
	}
	public void setShopCode(String shopCode) {
		this.shopCode = shopCode;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

}
