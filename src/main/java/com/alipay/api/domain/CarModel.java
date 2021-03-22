package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车辆的品牌型号
 *
 * @author auto create
 * @since 1.0, 2019-12-09 15:21:51
 */
public class CarModel extends AlipayObject {

	private static final long serialVersionUID = 4586363898927475672L;

	/**
	 * 品牌名称
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 配置类型
	 */
	@ApiField("config_name")
	private String configName;

	/**
	 * 排量
	 */
	@ApiField("engine_desc")
	private String engineDesc;

	/**
	 * 车系名称
	 */
	@ApiField("family_short_name")
	private String familyShortName;

	/**
	 * 车辆驾驶类型
	 */
	@ApiField("gear_box_type")
	private String gearBoxType;

	/**
	 * 新车购置价
	 */
	@ApiField("purchase_price")
	private String purchasePrice;

	/**
	 * 座位数
	 */
	@ApiField("seat")
	private String seat;

	/**
	 * 最大额定座位数
	 */
	@ApiField("seat_max")
	private String seatMax;

	/**
	 * 最小额定座位数
	 */
	@ApiField("seat_min")
	private String seatMin;

	/**
	 * 车辆类型编码
	 */
	@ApiField("vehicle_class_code")
	private String vehicleClassCode;

	/**
	 * 车型代码
	 */
	@ApiField("vehicle_code")
	private String vehicleCode;

	/**
	 * 车型名称
	 */
	@ApiField("vehicle_name")
	private String vehicleName;

	/**
	 * 年份
	 */
	@ApiField("year_pattern")
	private String yearPattern;

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getConfigName() {
		return this.configName;
	}
	public void setConfigName(String configName) {
		this.configName = configName;
	}

	public String getEngineDesc() {
		return this.engineDesc;
	}
	public void setEngineDesc(String engineDesc) {
		this.engineDesc = engineDesc;
	}

	public String getFamilyShortName() {
		return this.familyShortName;
	}
	public void setFamilyShortName(String familyShortName) {
		this.familyShortName = familyShortName;
	}

	public String getGearBoxType() {
		return this.gearBoxType;
	}
	public void setGearBoxType(String gearBoxType) {
		this.gearBoxType = gearBoxType;
	}

	public String getPurchasePrice() {
		return this.purchasePrice;
	}
	public void setPurchasePrice(String purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public String getSeat() {
		return this.seat;
	}
	public void setSeat(String seat) {
		this.seat = seat;
	}

	public String getSeatMax() {
		return this.seatMax;
	}
	public void setSeatMax(String seatMax) {
		this.seatMax = seatMax;
	}

	public String getSeatMin() {
		return this.seatMin;
	}
	public void setSeatMin(String seatMin) {
		this.seatMin = seatMin;
	}

	public String getVehicleClassCode() {
		return this.vehicleClassCode;
	}
	public void setVehicleClassCode(String vehicleClassCode) {
		this.vehicleClassCode = vehicleClassCode;
	}

	public String getVehicleCode() {
		return this.vehicleCode;
	}
	public void setVehicleCode(String vehicleCode) {
		this.vehicleCode = vehicleCode;
	}

	public String getVehicleName() {
		return this.vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public String getYearPattern() {
		return this.yearPattern;
	}
	public void setYearPattern(String yearPattern) {
		this.yearPattern = yearPattern;
	}

}
