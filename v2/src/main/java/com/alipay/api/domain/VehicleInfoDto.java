package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车辆信息 + 用户证件类型、hash值
 *
 * @author auto create
 * @since 1.0, 2022-09-30 10:05:23
 */
public class VehicleInfoDto extends AlipayObject {

	private static final long serialVersionUID = 7862155789437143179L;

	/**
	 * 品牌名称
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 用户证件号码哈希值（非车主）
	 */
	@ApiField("cert_hash")
	private String certHash;

	/**
	 * 认证结果：true、false
	 */
	@ApiField("cert_result")
	private String certResult;

	/**
	 * 用户证件类型（非车主）
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 认证级别： V0-未认证、V1-已认证、V2-本
	 */
	@ApiField("certification")
	private String certification;

	/**
	 * 车辆所在城市code
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 车辆所在城市名称
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 发动机号码
	 */
	@ApiField("engine_no")
	private String engineNo;

	/**
	 * 用户证件号码哈希类型
	 */
	@ApiField("hash_type")
	private String hashType;

	/**
	 * 里程(万公里)
	 */
	@ApiField("miles")
	private String miles;

	/**
	 * 车型id
	 */
	@ApiField("model_id")
	private String modelId;

	/**
	 * 车型名称
	 */
	@ApiField("model_name")
	private String modelName;

	/**
	 * 用户支付宝id
	 */
	@ApiField("open_id")
	private String openId;

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
	 * 用户支付宝id
	 */
	@ApiField("uid")
	private String uid;

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

	public String getCertHash() {
		return this.certHash;
	}
	public void setCertHash(String certHash) {
		this.certHash = certHash;
	}

	public String getCertResult() {
		return this.certResult;
	}
	public void setCertResult(String certResult) {
		this.certResult = certResult;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getCertification() {
		return this.certification;
	}
	public void setCertification(String certification) {
		this.certification = certification;
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

	public String getEngineNo() {
		return this.engineNo;
	}
	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}

	public String getHashType() {
		return this.hashType;
	}
	public void setHashType(String hashType) {
		this.hashType = hashType;
	}

	public String getMiles() {
		return this.miles;
	}
	public void setMiles(String miles) {
		this.miles = miles;
	}

	public String getModelId() {
		return this.modelId;
	}
	public void setModelId(String modelId) {
		this.modelId = modelId;
	}

	public String getModelName() {
		return this.modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
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

	public String getUid() {
		return this.uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
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
