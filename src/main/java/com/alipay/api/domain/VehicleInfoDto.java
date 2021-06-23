package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车辆信息
 *
 * @author auto create
 * @since 1.0, 2020-11-23 20:22:04
 */
public class VehicleInfoDto extends AlipayObject {

	private static final long serialVersionUID = 2396976551776132127L;

	/**
	 * 品牌名称
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 认证结果：true、false
	 */
	@ApiField("cert_result")
	private String certResult;

	/**
	 * 认证级别： V0-未认证、V1-已认证、V2-本
	 */
	@ApiField("certification")
	private String certification;

	/**
	 * 发动机号码
	 */
	@ApiField("engine_no")
	private String engineNo;

	/**
	 * 车型名称
	 */
	@ApiField("model_name")
	private String modelName;

	/**
	 * 所有人
	 */
	@ApiField("owner")
	private String owner;

	/**
	 * 车牌号码
	 */
	@ApiField("plate_no")
	private String plateNo;

	/**
	 * 注册日期，格式 yyyy-MM-dd
	 */
	@ApiField("register_date")
	private String registerDate;

	/**
	 * 车系名称
	 */
	@ApiField("series_name")
	private String seriesName;

	/**
	 * 使用性质：F-非营运、H-货运、K-客运、Z-租赁、J-教练、O-其他
	 */
	@ApiField("use_type")
	private String useType;

	/**
	 * 车辆类型：Car-小型汽车、E-Car-新能源小型汽车、Veh-大型汽车、E-Veh-新能源大型汽车、Motor-两三轮摩托车、Van-货车、Other-其他
	 */
	@ApiField("vehicle_type")
	private String vehicleType;

	/**
	 * 车辆识别代码
	 */
	@ApiField("vin")
	private String vin;

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getCertResult() {
		return this.certResult;
	}
	public void setCertResult(String certResult) {
		this.certResult = certResult;
	}

	public String getCertification() {
		return this.certification;
	}
	public void setCertification(String certification) {
		this.certification = certification;
	}

	public String getEngineNo() {
		return this.engineNo;
	}
	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}

	public String getModelName() {
		return this.modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getOwner() {
		return this.owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getPlateNo() {
		return this.plateNo;
	}
	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}

	public String getRegisterDate() {
		return this.registerDate;
	}
	public void setRegisterDate(String registerDate) {
		this.registerDate = registerDate;
	}

	public String getSeriesName() {
		return this.seriesName;
	}
	public void setSeriesName(String seriesName) {
		this.seriesName = seriesName;
	}

	public String getUseType() {
		return this.useType;
	}
	public void setUseType(String useType) {
		this.useType = useType;
	}

	public String getVehicleType() {
		return this.vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getVin() {
		return this.vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}

}
