package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 包含小区的一些基本信息
 *
 * @author auto create
 * @since 1.0, 2024-10-30 11:48:42
 */
public class CommunityBasicInfo extends AlipayObject {

	private static final long serialVersionUID = 5166523391269543541L;

	/**
	 * 小区的建筑类型
	 */
	@ApiField("building_type")
	private String buildingType;

	/**
	 * 小区的建成时间或修建时间范围
	 */
	@ApiField("complete_date")
	private String completeDate;

	/**
	 * 小区的开发企业
	 */
	@ApiField("development_enterprise")
	private String developmentEnterprise;

	/**
	 * 小区的用电类型
	 */
	@ApiField("electricity_type")
	private String electricityType;

	/**
	 * 小区的燃气费用，单元：元/立方米
	 */
	@ApiField("gas_cost")
	private String gasCost;

	/**
	 * 小区的绿化率
	 */
	@ApiField("greening_rate")
	private String greeningRate;

	/**
	 * 小区的供暖费用，单位：元/平米。
	 */
	@ApiField("heating_cost")
	private String heatingCost;

	/**
	 * 小区的供暖类型
	 */
	@ApiField("heating_type")
	private String heatingType;

	/**
	 * 小区的物业公司信息
	 */
	@ApiField("management_company")
	private String managementCompany;

	/**
	 * 小区物业的电话
	 */
	@ApiField("management_mobile")
	private String managementMobile;

	/**
	 * 小区的停车费用，单元：元/月
	 */
	@ApiField("parking_cost")
	private String parkingCost;

	/**
	 * 小区的车位数量
	 */
	@ApiField("parking_number")
	private Long parkingNumber;

	/**
	 * 小区的容积率
	 */
	@ApiField("plot_ratio")
	private String plotRatio;

	/**
	 * 小区附近派出所的电话号码
	 */
	@ApiField("police_station_mobile")
	private String policeStationMobile;

	/**
	 * 小区附近的派出所名称
	 */
	@ApiField("police_station_name")
	private String policeStationName;

	/**
	 * 小区的交易权属
	 */
	@ApiField("transaction_ownership")
	private String transactionOwnership;

	/**
	 * 小区的用水类型
	 */
	@ApiField("water_type")
	private String waterType;

	public String getBuildingType() {
		return this.buildingType;
	}
	public void setBuildingType(String buildingType) {
		this.buildingType = buildingType;
	}

	public String getCompleteDate() {
		return this.completeDate;
	}
	public void setCompleteDate(String completeDate) {
		this.completeDate = completeDate;
	}

	public String getDevelopmentEnterprise() {
		return this.developmentEnterprise;
	}
	public void setDevelopmentEnterprise(String developmentEnterprise) {
		this.developmentEnterprise = developmentEnterprise;
	}

	public String getElectricityType() {
		return this.electricityType;
	}
	public void setElectricityType(String electricityType) {
		this.electricityType = electricityType;
	}

	public String getGasCost() {
		return this.gasCost;
	}
	public void setGasCost(String gasCost) {
		this.gasCost = gasCost;
	}

	public String getGreeningRate() {
		return this.greeningRate;
	}
	public void setGreeningRate(String greeningRate) {
		this.greeningRate = greeningRate;
	}

	public String getHeatingCost() {
		return this.heatingCost;
	}
	public void setHeatingCost(String heatingCost) {
		this.heatingCost = heatingCost;
	}

	public String getHeatingType() {
		return this.heatingType;
	}
	public void setHeatingType(String heatingType) {
		this.heatingType = heatingType;
	}

	public String getManagementCompany() {
		return this.managementCompany;
	}
	public void setManagementCompany(String managementCompany) {
		this.managementCompany = managementCompany;
	}

	public String getManagementMobile() {
		return this.managementMobile;
	}
	public void setManagementMobile(String managementMobile) {
		this.managementMobile = managementMobile;
	}

	public String getParkingCost() {
		return this.parkingCost;
	}
	public void setParkingCost(String parkingCost) {
		this.parkingCost = parkingCost;
	}

	public Long getParkingNumber() {
		return this.parkingNumber;
	}
	public void setParkingNumber(Long parkingNumber) {
		this.parkingNumber = parkingNumber;
	}

	public String getPlotRatio() {
		return this.plotRatio;
	}
	public void setPlotRatio(String plotRatio) {
		this.plotRatio = plotRatio;
	}

	public String getPoliceStationMobile() {
		return this.policeStationMobile;
	}
	public void setPoliceStationMobile(String policeStationMobile) {
		this.policeStationMobile = policeStationMobile;
	}

	public String getPoliceStationName() {
		return this.policeStationName;
	}
	public void setPoliceStationName(String policeStationName) {
		this.policeStationName = policeStationName;
	}

	public String getTransactionOwnership() {
		return this.transactionOwnership;
	}
	public void setTransactionOwnership(String transactionOwnership) {
		this.transactionOwnership = transactionOwnership;
	}

	public String getWaterType() {
		return this.waterType;
	}
	public void setWaterType(String waterType) {
		this.waterType = waterType;
	}

}
