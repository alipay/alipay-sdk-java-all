package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 车辆信息
 *
 * @author auto create
 * @since 1.0, 2019-12-09 15:22:32
 */
public class Car extends AlipayObject {

	private static final long serialVersionUID = 3117547969397638666L;

	/**
	 * 发动机号
	 */
	@ApiField("car_engine_no")
	private String carEngineNo;

	/**
	 * 车架号
	 */
	@ApiField("car_frame_no")
	private String carFrameNo;

	/**
	 * 品牌型号
	 */
	@ApiField("car_model_code")
	private String carModelCode;

	/**
	 * 车牌号
	 */
	@ApiField("car_no")
	private String carNo;

	/**
	 * 该车辆数据来源，1 来自 ISV，2来自保险师内部数据
	 */
	@ApiField("data_source")
	private String dataSource;

	/**
	 * 初次登记日期
	 */
	@ApiField("first_register_date")
	private String firstRegisterDate;

	/**
	 * 是否新车
	 */
	@ApiField("is_new")
	private String isNew;

	/**
	 * 天津地区行驶证地址
	 */
	@ApiField("license_address")
	private String licenseAddress;

	/**
	 * 贷款车标识
	 */
	@ApiField("loan_flag")
	private String loanFlag;

	/**
	 * 座位数
	 */
	@ApiField("seat_number")
	private String seatNumber;

	/**
	 * 是否过户车
	 */
	@ApiField("transfer_car")
	private String transferCar;

	/**
	 * 过户日期
	 */
	@ApiField("transfer_date")
	private String transferDate;

	/**
	 * 精友代码和精友主体编码
	 */
	@ApiField("vehicle_info")
	private VehicleInfo vehicleInfo;

	/**
	 * 所有需要报价机构对应的精友码
	 */
	@ApiListField("vehicle_info_list")
	@ApiField("vehicle_info")
	private List<VehicleInfo> vehicleInfoList;

	/**
	 * 天津地区行驶证车辆类型
	 */
	@ApiField("vehicle_type")
	private String vehicleType;

	public String getCarEngineNo() {
		return this.carEngineNo;
	}
	public void setCarEngineNo(String carEngineNo) {
		this.carEngineNo = carEngineNo;
	}

	public String getCarFrameNo() {
		return this.carFrameNo;
	}
	public void setCarFrameNo(String carFrameNo) {
		this.carFrameNo = carFrameNo;
	}

	public String getCarModelCode() {
		return this.carModelCode;
	}
	public void setCarModelCode(String carModelCode) {
		this.carModelCode = carModelCode;
	}

	public String getCarNo() {
		return this.carNo;
	}
	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}

	public String getDataSource() {
		return this.dataSource;
	}
	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}

	public String getFirstRegisterDate() {
		return this.firstRegisterDate;
	}
	public void setFirstRegisterDate(String firstRegisterDate) {
		this.firstRegisterDate = firstRegisterDate;
	}

	public String getIsNew() {
		return this.isNew;
	}
	public void setIsNew(String isNew) {
		this.isNew = isNew;
	}

	public String getLicenseAddress() {
		return this.licenseAddress;
	}
	public void setLicenseAddress(String licenseAddress) {
		this.licenseAddress = licenseAddress;
	}

	public String getLoanFlag() {
		return this.loanFlag;
	}
	public void setLoanFlag(String loanFlag) {
		this.loanFlag = loanFlag;
	}

	public String getSeatNumber() {
		return this.seatNumber;
	}
	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}

	public String getTransferCar() {
		return this.transferCar;
	}
	public void setTransferCar(String transferCar) {
		this.transferCar = transferCar;
	}

	public String getTransferDate() {
		return this.transferDate;
	}
	public void setTransferDate(String transferDate) {
		this.transferDate = transferDate;
	}

	public VehicleInfo getVehicleInfo() {
		return this.vehicleInfo;
	}
	public void setVehicleInfo(VehicleInfo vehicleInfo) {
		this.vehicleInfo = vehicleInfo;
	}

	public List<VehicleInfo> getVehicleInfoList() {
		return this.vehicleInfoList;
	}
	public void setVehicleInfoList(List<VehicleInfo> vehicleInfoList) {
		this.vehicleInfoList = vehicleInfoList;
	}

	public String getVehicleType() {
		return this.vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

}
