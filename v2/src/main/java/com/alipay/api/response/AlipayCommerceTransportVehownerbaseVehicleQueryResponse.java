package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.vehownerbase.vehicle.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-26 10:22:51
 */
public class AlipayCommerceTransportVehownerbaseVehicleQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2379191369829597215L;

	/** 
	 * 认证日期（yyyy-mm-dd）
	 */
	@ApiField("auth_date")
	private String authDate;

	/** 
	 * 品牌 ID
	 */
	@ApiField("brand_id")
	private String brandId;

	/** 
	 * 品牌名称
	 */
	@ApiField("brand_name")
	private String brandName;

	/** 
	 * 发动机号
	 */
	@ApiField("engine_no")
	private String engineNo;

	/** 
	 * 发证日期（yyyy-mm-dd）
	 */
	@ApiField("issue_date")
	private String issueDate;

	/** 
	 * 行驶证反面照片 URL
	 */
	@ApiField("license_back_url")
	private String licenseBackUrl;

	/** 
	 * 行驶证正面照片 URL
	 */
	@ApiField("license_url")
	private String licenseUrl;

	/** 
	 * 车型 ID
	 */
	@ApiField("model_id")
	private String modelId;

	/** 
	 * 车型名称
	 */
	@ApiField("model_name")
	private String modelName;

	/** 
	 * 车辆所有人姓名
	 */
	@ApiField("owner")
	private String owner;

	/** 
	 * 车牌颜色
	 */
	@ApiField("plate_color")
	private String plateColor;

	/** 
	 * 注册日期（yyyy-mm-dd）
	 */
	@ApiField("register_date")
	private String registerDate;

	/** 
	 * 高级认证
	 */
	@ApiField("senior_certificated")
	private String seniorCertificated;

	/** 
	 * 车系 ID
	 */
	@ApiField("series_id")
	private String seriesId;

	/** 
	 * 车系名称
	 */
	@ApiField("series_name")
	private String seriesName;

	/** 
	 * 认证方式
	 */
	@ApiField("trusted_from")
	private String trustedFrom;

	/** 
	 * 使用性质
	 */
	@ApiField("use_type")
	private String useType;

	/** 
	 * 车辆类型
	 */
	@ApiField("vehicle_type")
	private String vehicleType;

	/** 
	 * 车辆 ID
	 */
	@ApiField("vi_id")
	private String viId;

	/** 
	 * 车牌号
	 */
	@ApiField("vi_number")
	private String viNumber;

	/** 
	 * 车架号（VIN 码）
	 */
	@ApiField("vin")
	private String vin;

	/** 
	 * 认证级别
	 */
	@ApiField("vur_grade")
	private String vurGrade;

	public void setAuthDate(String authDate) {
		this.authDate = authDate;
	}
	public String getAuthDate( ) {
		return this.authDate;
	}

	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}
	public String getBrandId( ) {
		return this.brandId;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getBrandName( ) {
		return this.brandName;
	}

	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}
	public String getEngineNo( ) {
		return this.engineNo;
	}

	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}
	public String getIssueDate( ) {
		return this.issueDate;
	}

	public void setLicenseBackUrl(String licenseBackUrl) {
		this.licenseBackUrl = licenseBackUrl;
	}
	public String getLicenseBackUrl( ) {
		return this.licenseBackUrl;
	}

	public void setLicenseUrl(String licenseUrl) {
		this.licenseUrl = licenseUrl;
	}
	public String getLicenseUrl( ) {
		return this.licenseUrl;
	}

	public void setModelId(String modelId) {
		this.modelId = modelId;
	}
	public String getModelId( ) {
		return this.modelId;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getModelName( ) {
		return this.modelName;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getOwner( ) {
		return this.owner;
	}

	public void setPlateColor(String plateColor) {
		this.plateColor = plateColor;
	}
	public String getPlateColor( ) {
		return this.plateColor;
	}

	public void setRegisterDate(String registerDate) {
		this.registerDate = registerDate;
	}
	public String getRegisterDate( ) {
		return this.registerDate;
	}

	public void setSeniorCertificated(String seniorCertificated) {
		this.seniorCertificated = seniorCertificated;
	}
	public String getSeniorCertificated( ) {
		return this.seniorCertificated;
	}

	public void setSeriesId(String seriesId) {
		this.seriesId = seriesId;
	}
	public String getSeriesId( ) {
		return this.seriesId;
	}

	public void setSeriesName(String seriesName) {
		this.seriesName = seriesName;
	}
	public String getSeriesName( ) {
		return this.seriesName;
	}

	public void setTrustedFrom(String trustedFrom) {
		this.trustedFrom = trustedFrom;
	}
	public String getTrustedFrom( ) {
		return this.trustedFrom;
	}

	public void setUseType(String useType) {
		this.useType = useType;
	}
	public String getUseType( ) {
		return this.useType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public String getVehicleType( ) {
		return this.vehicleType;
	}

	public void setViId(String viId) {
		this.viId = viId;
	}
	public String getViId( ) {
		return this.viId;
	}

	public void setViNumber(String viNumber) {
		this.viNumber = viNumber;
	}
	public String getViNumber( ) {
		return this.viNumber;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}
	public String getVin( ) {
		return this.vin;
	}

	public void setVurGrade(String vurGrade) {
		this.vurGrade = vurGrade;
	}
	public String getVurGrade( ) {
		return this.vurGrade;
	}

}
