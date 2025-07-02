package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 停车场价格信息同步
 *
 * @author auto create
 * @since 1.0, 2020-08-26 15:52:57
 */
public class AlipayEcoMycarParkingChargeinfoSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7636353931773145126L;

	/**
	 * 营业时间
	 */
	@ApiField("business_hours")
	private String businessHours;

	/**
	 * 小车-白天 非首个计费单元价格
	 */
	@ApiField("car_daylight_advanced_price")
	private String carDaylightAdvancedPrice;

	/**
	 * 小车-白天 首个计费单元价格
	 */
	@ApiField("car_daylight_base_price")
	private String carDaylightBasePrice;

	/**
	 * 小车-夜间 非首个计费单元价格
	 */
	@ApiField("car_night_advanced_price")
	private String carNightAdvancedPrice;

	/**
	 * 小车-夜间 首个计费单元价格
	 */
	@ApiField("car_night_base_price")
	private String carNightBasePrice;

	/**
	 * 小车 计次收费价格
xx元 / 次，按次收费的车场填写
	 */
	@ApiField("car_onetime_price")
	private String carOnetimePrice;

	/**
	 * 单日停车封顶价格：具体值或“不封顶”
	 */
	@ApiField("daily_price_upperbound")
	private String dailyPriceUpperbound;

	/**
	 * 车场白天（收费）营业时间段
	 */
	@ApiField("daylight_business_hours")
	private String daylightBusinessHours;

	/**
	 * 单次停车免费时长
	 */
	@ApiField("free_period")
	private String freePeriod;

	/**
	 * 是否有充电桩: -1 未知,0 否,1 是
	 */
	@ApiField("has_charging_pile")
	private String hasChargingPile;

	/**
	 * 是否收费：-1 未知,0 否,1 是
	 */
	@ApiField("is_charge")
	private String isCharge;

	/**
	 * 车场夜间（收费）营业时间段
	 */
	@ApiField("night_business_hours")
	private String nightBusinessHours;

	/**
	 * 停车场ID
	 */
	@ApiField("parking_id")
	private String parkingId;

	/**
	 * 总车位数
	 */
	@ApiField("parking_space_count")
	private Long parkingSpaceCount;

	/**
	 * 复杂计费补充描述
收费复杂无法格式化的车场填写，以文本形式表述
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 大车-白天 非首个计费单元价格
	 */
	@ApiField("truck_daylight_advanced_price")
	private String truckDaylightAdvancedPrice;

	/**
	 * 大车-白天 首个计费单元价格
	 */
	@ApiField("truck_daylight_base_price")
	private String truckDaylightBasePrice;

	/**
	 * 大车-夜间 非首个计费单元价格
	 */
	@ApiField("truck_night_advanced_price")
	private String truckNightAdvancedPrice;

	/**
	 * 大车-夜间 首个计费单元价格
	 */
	@ApiField("truck_night_base_price")
	private String truckNightBasePrice;

	/**
	 * 大车 计次收费价格
xx元 / 次，按次收费的车场填写
	 */
	@ApiField("truck_onetime_price")
	private String truckOnetimePrice;

	public String getBusinessHours() {
		return this.businessHours;
	}
	public void setBusinessHours(String businessHours) {
		this.businessHours = businessHours;
	}

	public String getCarDaylightAdvancedPrice() {
		return this.carDaylightAdvancedPrice;
	}
	public void setCarDaylightAdvancedPrice(String carDaylightAdvancedPrice) {
		this.carDaylightAdvancedPrice = carDaylightAdvancedPrice;
	}

	public String getCarDaylightBasePrice() {
		return this.carDaylightBasePrice;
	}
	public void setCarDaylightBasePrice(String carDaylightBasePrice) {
		this.carDaylightBasePrice = carDaylightBasePrice;
	}

	public String getCarNightAdvancedPrice() {
		return this.carNightAdvancedPrice;
	}
	public void setCarNightAdvancedPrice(String carNightAdvancedPrice) {
		this.carNightAdvancedPrice = carNightAdvancedPrice;
	}

	public String getCarNightBasePrice() {
		return this.carNightBasePrice;
	}
	public void setCarNightBasePrice(String carNightBasePrice) {
		this.carNightBasePrice = carNightBasePrice;
	}

	public String getCarOnetimePrice() {
		return this.carOnetimePrice;
	}
	public void setCarOnetimePrice(String carOnetimePrice) {
		this.carOnetimePrice = carOnetimePrice;
	}

	public String getDailyPriceUpperbound() {
		return this.dailyPriceUpperbound;
	}
	public void setDailyPriceUpperbound(String dailyPriceUpperbound) {
		this.dailyPriceUpperbound = dailyPriceUpperbound;
	}

	public String getDaylightBusinessHours() {
		return this.daylightBusinessHours;
	}
	public void setDaylightBusinessHours(String daylightBusinessHours) {
		this.daylightBusinessHours = daylightBusinessHours;
	}

	public String getFreePeriod() {
		return this.freePeriod;
	}
	public void setFreePeriod(String freePeriod) {
		this.freePeriod = freePeriod;
	}

	public String getHasChargingPile() {
		return this.hasChargingPile;
	}
	public void setHasChargingPile(String hasChargingPile) {
		this.hasChargingPile = hasChargingPile;
	}

	public String getIsCharge() {
		return this.isCharge;
	}
	public void setIsCharge(String isCharge) {
		this.isCharge = isCharge;
	}

	public String getNightBusinessHours() {
		return this.nightBusinessHours;
	}
	public void setNightBusinessHours(String nightBusinessHours) {
		this.nightBusinessHours = nightBusinessHours;
	}

	public String getParkingId() {
		return this.parkingId;
	}
	public void setParkingId(String parkingId) {
		this.parkingId = parkingId;
	}

	public Long getParkingSpaceCount() {
		return this.parkingSpaceCount;
	}
	public void setParkingSpaceCount(Long parkingSpaceCount) {
		this.parkingSpaceCount = parkingSpaceCount;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getTruckDaylightAdvancedPrice() {
		return this.truckDaylightAdvancedPrice;
	}
	public void setTruckDaylightAdvancedPrice(String truckDaylightAdvancedPrice) {
		this.truckDaylightAdvancedPrice = truckDaylightAdvancedPrice;
	}

	public String getTruckDaylightBasePrice() {
		return this.truckDaylightBasePrice;
	}
	public void setTruckDaylightBasePrice(String truckDaylightBasePrice) {
		this.truckDaylightBasePrice = truckDaylightBasePrice;
	}

	public String getTruckNightAdvancedPrice() {
		return this.truckNightAdvancedPrice;
	}
	public void setTruckNightAdvancedPrice(String truckNightAdvancedPrice) {
		this.truckNightAdvancedPrice = truckNightAdvancedPrice;
	}

	public String getTruckNightBasePrice() {
		return this.truckNightBasePrice;
	}
	public void setTruckNightBasePrice(String truckNightBasePrice) {
		this.truckNightBasePrice = truckNightBasePrice;
	}

	public String getTruckOnetimePrice() {
		return this.truckOnetimePrice;
	}
	public void setTruckOnetimePrice(String truckOnetimePrice) {
		this.truckOnetimePrice = truckOnetimePrice;
	}

}
