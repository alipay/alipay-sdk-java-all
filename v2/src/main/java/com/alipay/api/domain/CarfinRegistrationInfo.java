package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车辆登记证信息
 *
 * @author auto create
 * @since 1.0, 2026-01-08 11:03:08
 */
public class CarfinRegistrationInfo extends AlipayObject {

	private static final long serialVersionUID = 2891682296916385629L;

	/**
	 * 获得方式
	 */
	@ApiField("acquisition_method")
	private String acquisitionMethod;

	/**
	 * 条形编码
	 */
	@ApiField("barcode")
	private String barcode;

	/**
	 * 发动机编号
	 */
	@ApiField("engine_no")
	private String engineNo;

	/**
	 * 燃料种类
	 */
	@ApiField("fuel_type")
	private String fuelType;

	/**
	 * 发证日期 (yyyy-MM-dd)
	 */
	@ApiField("issue_date")
	private String issueDate;

	/**
	 * 最近换证日期
	 */
	@ApiField("last_renewal_date")
	private String lastRenewalDate;

	/**
	 * 最近一次补领日期
	 */
	@ApiField("last_replacement_date")
	private String lastReplacementDate;

	/**
	 * 最近转移登记日期 (yyyy-MM-dd)
	 */
	@ApiField("last_transfer_date")
	private String lastTransferDate;

	/**
	 * 车辆出厂日期 (yyyy-MM-dd)
	 */
	@ApiField("manufacture_date")
	private String manufactureDate;

	/**
	 * 解除抵押时间
	 */
	@ApiField("mortgage_release_date")
	private String mortgageReleaseDate;

	/**
	 * 车辆抵押状态
	 */
	@ApiField("mortgage_status")
	private String mortgageStatus;

	/**
	 * 机动车所有人
	 */
	@ApiField("owner")
	private String owner;

	/**
	 * 机动车身份证号码或者统一社会信用代码
	 */
	@ApiField("owner_identification_number")
	private String ownerIdentificationNumber;

	/**
	 * 登记机关
	 */
	@ApiField("registration_authority")
	private String registrationAuthority;

	/**
	 * yyyy-MM-dd
	 */
	@ApiField("registration_date")
	private String registrationDate;

	/**
	 * 过户次数
	 */
	@ApiField("transfer_count")
	private String transferCount;

	/**
	 * 使用性质
	 */
	@ApiField("use_type")
	private String useType;

	/**
	 * 车辆品牌
	 */
	@ApiField("vehicle_brand")
	private String vehicleBrand;

	/**
	 * 车牌号
	 */
	@ApiField("vehicle_license")
	private String vehicleLicense;

	/**
	 * 2019款 奥迪Q3 35 TFSI 进取致雅型
	 */
	@ApiField("vehicle_model")
	private String vehicleModel;

	/**
	 * 车辆车系
	 */
	@ApiField("vehicle_series")
	private String vehicleSeries;

	/**
	 * 车辆类型
	 */
	@ApiField("vehicle_type")
	private String vehicleType;

	/**
	 * 车辆识别号
	 */
	@ApiField("vehicle_vin")
	private String vehicleVin;

	public String getAcquisitionMethod() {
		return this.acquisitionMethod;
	}
	public void setAcquisitionMethod(String acquisitionMethod) {
		this.acquisitionMethod = acquisitionMethod;
	}

	public String getBarcode() {
		return this.barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getEngineNo() {
		return this.engineNo;
	}
	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}

	public String getFuelType() {
		return this.fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public String getIssueDate() {
		return this.issueDate;
	}
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}

	public String getLastRenewalDate() {
		return this.lastRenewalDate;
	}
	public void setLastRenewalDate(String lastRenewalDate) {
		this.lastRenewalDate = lastRenewalDate;
	}

	public String getLastReplacementDate() {
		return this.lastReplacementDate;
	}
	public void setLastReplacementDate(String lastReplacementDate) {
		this.lastReplacementDate = lastReplacementDate;
	}

	public String getLastTransferDate() {
		return this.lastTransferDate;
	}
	public void setLastTransferDate(String lastTransferDate) {
		this.lastTransferDate = lastTransferDate;
	}

	public String getManufactureDate() {
		return this.manufactureDate;
	}
	public void setManufactureDate(String manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	public String getMortgageReleaseDate() {
		return this.mortgageReleaseDate;
	}
	public void setMortgageReleaseDate(String mortgageReleaseDate) {
		this.mortgageReleaseDate = mortgageReleaseDate;
	}

	public String getMortgageStatus() {
		return this.mortgageStatus;
	}
	public void setMortgageStatus(String mortgageStatus) {
		this.mortgageStatus = mortgageStatus;
	}

	public String getOwner() {
		return this.owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getOwnerIdentificationNumber() {
		return this.ownerIdentificationNumber;
	}
	public void setOwnerIdentificationNumber(String ownerIdentificationNumber) {
		this.ownerIdentificationNumber = ownerIdentificationNumber;
	}

	public String getRegistrationAuthority() {
		return this.registrationAuthority;
	}
	public void setRegistrationAuthority(String registrationAuthority) {
		this.registrationAuthority = registrationAuthority;
	}

	public String getRegistrationDate() {
		return this.registrationDate;
	}
	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}

	public String getTransferCount() {
		return this.transferCount;
	}
	public void setTransferCount(String transferCount) {
		this.transferCount = transferCount;
	}

	public String getUseType() {
		return this.useType;
	}
	public void setUseType(String useType) {
		this.useType = useType;
	}

	public String getVehicleBrand() {
		return this.vehicleBrand;
	}
	public void setVehicleBrand(String vehicleBrand) {
		this.vehicleBrand = vehicleBrand;
	}

	public String getVehicleLicense() {
		return this.vehicleLicense;
	}
	public void setVehicleLicense(String vehicleLicense) {
		this.vehicleLicense = vehicleLicense;
	}

	public String getVehicleModel() {
		return this.vehicleModel;
	}
	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}

	public String getVehicleSeries() {
		return this.vehicleSeries;
	}
	public void setVehicleSeries(String vehicleSeries) {
		this.vehicleSeries = vehicleSeries;
	}

	public String getVehicleType() {
		return this.vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getVehicleVin() {
		return this.vehicleVin;
	}
	public void setVehicleVin(String vehicleVin) {
		this.vehicleVin = vehicleVin;
	}

}
