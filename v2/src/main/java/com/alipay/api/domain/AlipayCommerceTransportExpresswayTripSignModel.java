package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车牌付代扣签约申请
 *
 * @author auto create
 * @since 1.0, 2026-05-28 20:51:26
 */
public class AlipayCommerceTransportExpresswayTripSignModel extends AlipayObject {

	private static final long serialVersionUID = 5619257282919523295L;

	/**
	 * 车辆类型
	 */
	@ApiField("car_type")
	private String carType;

	/**
	 * 办理人所在地城市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 调用方行业标识ID
	 */
	@ApiField("isv_id")
	private String isvId;

	/**
	 * 用户手机号
	 */
	@ApiField("mobile_no")
	private String mobileNo;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部协议单号，调用方标识ID维度下需保证唯一
	 */
	@ApiField("out_agreement_no")
	private String outAgreementNo;

	/**
	 * 办理车牌颜色
	 */
	@ApiField("plate_color")
	private String plateColor;

	/**
	 * 办理车牌号
	 */
	@ApiField("plate_no")
	private String plateNo;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 车高，单位mm
	 */
	@ApiField("vi_height")
	private Long viHeight;

	/**
	 * 车长，单位mm
	 */
	@ApiField("vi_length")
	private Long viLength;

	/**
	 * 行驶证信息核定载人数
	 */
	@ApiField("vi_license_apc")
	private Long viLicenseApc;

	/**
	 * 行驶证上的品牌型号
	 */
	@ApiField("vi_license_brand_model")
	private String viLicenseBrandModel;

	/**
	 * 行驶证信息车辆类型
	 */
	@ApiField("vi_license_car_type")
	private String viLicenseCarType;

	/**
	 * 行驶证信息-发动机号
	 */
	@ApiField("vi_license_engine")
	private String viLicenseEngine;

	/**
	 * 行驶证正面支付宝文件id，通过alipay.open.file.upload(支付宝文件上传接口)接口上传文件后返回的file_id
	 */
	@ApiField("vi_license_front_file_id")
	private String viLicenseFrontFileId;

	/**
	 * 行驶证信息发证时间
	 */
	@ApiField("vi_license_issue_date")
	private String viLicenseIssueDate;

	/**
	 * 行驶证信息车辆所有人
	 */
	@ApiField("vi_license_owner")
	private String viLicenseOwner;

	/**
	 * 行驶证上车辆注册日期
	 */
	@ApiField("vi_license_register_date")
	private String viLicenseRegisterDate;

	/**
	 * 行驶证信息整备质量
	 */
	@ApiField("vi_license_unladen_mass")
	private String viLicenseUnladenMass;

	/**
	 * 行驶证信息使用性质
	 */
	@ApiField("vi_license_use_type")
	private String viLicenseUseType;

	/**
	 * 行驶证副页支付宝文件id，，通过alipay.open.file.upload(支付宝文件上传接口)接口上传文件后返回的file_id
	 */
	@ApiField("vi_license_vice_file_id")
	private String viLicenseViceFileId;

	/**
	 * 车辆识别号VIN码
	 */
	@ApiField("vi_license_vin")
	private String viLicenseVin;

	/**
	 * 车宽，单位mm
	 */
	@ApiField("vi_width")
	private Long viWidth;

	public String getCarType() {
		return this.carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getIsvId() {
		return this.isvId;
	}
	public void setIsvId(String isvId) {
		this.isvId = isvId;
	}

	public String getMobileNo() {
		return this.mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutAgreementNo() {
		return this.outAgreementNo;
	}
	public void setOutAgreementNo(String outAgreementNo) {
		this.outAgreementNo = outAgreementNo;
	}

	public String getPlateColor() {
		return this.plateColor;
	}
	public void setPlateColor(String plateColor) {
		this.plateColor = plateColor;
	}

	public String getPlateNo() {
		return this.plateNo;
	}
	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Long getViHeight() {
		return this.viHeight;
	}
	public void setViHeight(Long viHeight) {
		this.viHeight = viHeight;
	}

	public Long getViLength() {
		return this.viLength;
	}
	public void setViLength(Long viLength) {
		this.viLength = viLength;
	}

	public Long getViLicenseApc() {
		return this.viLicenseApc;
	}
	public void setViLicenseApc(Long viLicenseApc) {
		this.viLicenseApc = viLicenseApc;
	}

	public String getViLicenseBrandModel() {
		return this.viLicenseBrandModel;
	}
	public void setViLicenseBrandModel(String viLicenseBrandModel) {
		this.viLicenseBrandModel = viLicenseBrandModel;
	}

	public String getViLicenseCarType() {
		return this.viLicenseCarType;
	}
	public void setViLicenseCarType(String viLicenseCarType) {
		this.viLicenseCarType = viLicenseCarType;
	}

	public String getViLicenseEngine() {
		return this.viLicenseEngine;
	}
	public void setViLicenseEngine(String viLicenseEngine) {
		this.viLicenseEngine = viLicenseEngine;
	}

	public String getViLicenseFrontFileId() {
		return this.viLicenseFrontFileId;
	}
	public void setViLicenseFrontFileId(String viLicenseFrontFileId) {
		this.viLicenseFrontFileId = viLicenseFrontFileId;
	}

	public String getViLicenseIssueDate() {
		return this.viLicenseIssueDate;
	}
	public void setViLicenseIssueDate(String viLicenseIssueDate) {
		this.viLicenseIssueDate = viLicenseIssueDate;
	}

	public String getViLicenseOwner() {
		return this.viLicenseOwner;
	}
	public void setViLicenseOwner(String viLicenseOwner) {
		this.viLicenseOwner = viLicenseOwner;
	}

	public String getViLicenseRegisterDate() {
		return this.viLicenseRegisterDate;
	}
	public void setViLicenseRegisterDate(String viLicenseRegisterDate) {
		this.viLicenseRegisterDate = viLicenseRegisterDate;
	}

	public String getViLicenseUnladenMass() {
		return this.viLicenseUnladenMass;
	}
	public void setViLicenseUnladenMass(String viLicenseUnladenMass) {
		this.viLicenseUnladenMass = viLicenseUnladenMass;
	}

	public String getViLicenseUseType() {
		return this.viLicenseUseType;
	}
	public void setViLicenseUseType(String viLicenseUseType) {
		this.viLicenseUseType = viLicenseUseType;
	}

	public String getViLicenseViceFileId() {
		return this.viLicenseViceFileId;
	}
	public void setViLicenseViceFileId(String viLicenseViceFileId) {
		this.viLicenseViceFileId = viLicenseViceFileId;
	}

	public String getViLicenseVin() {
		return this.viLicenseVin;
	}
	public void setViLicenseVin(String viLicenseVin) {
		this.viLicenseVin = viLicenseVin;
	}

	public Long getViWidth() {
		return this.viWidth;
	}
	public void setViWidth(Long viWidth) {
		this.viWidth = viWidth;
	}

}
