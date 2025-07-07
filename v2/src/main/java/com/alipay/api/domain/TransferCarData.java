package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 二手车车辆数据
 *
 * @author auto create
 * @since 1.0, 2025-04-01 10:56:19
 */
public class TransferCarData extends AlipayObject {

	private static final long serialVersionUID = 5147528197435763937L;

	/**
	 * acid值，车生活的 acid 值，需要传递车生活 acid
	 */
	@ApiField("acid")
	private String acid;

	/**
	 * 活动结束时间
	 */
	@ApiField("activity_end_date")
	private Date activityEndDate;

	/**
	 * 活动开始时间
	 */
	@ApiField("activity_start_date")
	private Date activityStartDate;

	/**
	 * 电池状态, 1 原车买断 2 租用(BaaS) , 默认：0
	 */
	@ApiField("attr_car_source_battery_owner_type")
	private Long attrCarSourceBatteryOwnerType;

	/**
	 * 年检到期时间 YYYYMMDD
	 */
	@ApiField("audit_full_date")
	private String auditFullDate;

	/**
	 * 车型类型，轿车，MPV
	 */
	@ApiField("auto_type")
	private String autoType;

	/**
	 * 品牌名称
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 是否品牌官方门店
	 */
	@ApiField("brand_official_store")
	private Boolean brandOfficialStore;

	/**
	 * 呼叫号码
	 */
	@ApiField("call_phone")
	private String callPhone;

	/**
	 * 车颜色： 红色，白色，黑色等
	 */
	@ApiField("car_color")
	private String carColor;

	/**
	 * 车辆描述
	 */
	@ApiField("car_desc")
	private String carDesc;

	/**
	 * 钥匙数量，单位个数
	 */
	@ApiField("car_keys")
	private Long carKeys;

	/**
	 * 车辆上线日期
	 */
	@ApiField("car_online_date")
	private Date carOnlineDate;

	/**
	 * 车辆来源：1 国产/ 2 进口
	 */
	@ApiField("car_source_type")
	private Long carSourceType;

	/**
	 * tag标签数组
	 */
	@ApiListField("car_tags")
	@ApiField("string")
	private List<String> carTags;

	/**
	 * 车型年款, 单位： 年数据。比如 2023,2024,2025
	 */
	@ApiField("car_year")
	private Long carYear;

	/**
	 * 检查报告内容明细 DTO
	 */
	@ApiField("check_report_data")
	private CheckReportData checkReportData;

	/**
	 * 车源地；行政区城市编码值
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 排量,车辆的指标, 单位 L 或者 T
	 */
	@ApiField("displacement")
	private String displacement;

	/**
	 * 行驶里程（单位：公里）
	 */
	@ApiField("drive_distance")
	private Long driveDistance;

	/**
	 * 排放标准，车辆的牌放标准，国六等
	 */
	@ApiField("emission_standard")
	private String emissionStandard;

	/**
	 * 燃油类型，汽油，柴油，纯电动
	 */
	@ApiField("fuel_type")
	private String fuelType;

	/**
	 * 封面图片
	 */
	@ApiField("full_img_url")
	private String fullImgUrl;

	/**
	 * 亮点数据
	 */
	@ApiListField("highlights")
	@ApiField("string")
	private List<String> highlights;

	/**
	 * 车辆图片
	 */
	@ApiListField("images_url")
	@ApiField("string")
	private List<String> imagesUrl;

	/**
	 * 交强险到期日期 yyyymmdd
	 */
	@ApiField("insurance_full_date")
	private String insuranceFullDate;

	/**
	 * 外部数据更新时间
	 */
	@ApiField("isv_update_date")
	private Date isvUpdateDate;

	/**
	 * 首次上牌时间 YYYYMMDD
	 */
	@ApiField("license_full_date")
	private String licenseFullDate;

	/**
	 * 车辆性质  默认 1 ，1 非营业，2 营业
	 */
	@ApiField("operation_type")
	private Long operationType;

	/**
	 * 车 id
	 */
	@ApiField("out_id")
	private String outId;

	/**
	 * 价格-分
	 */
	@ApiField("price")
	private Long price;

	/**
	 * 出厂日期YYYYMM
	 */
	@ApiField("product_date")
	private String productDate;

	/**
	 * 座位数,单位： 个
	 */
	@ApiField("seats")
	private Long seats;

	/**
	 * 车系名称
	 */
	@ApiField("series_name")
	private String seriesName;

	/**
	 * title，车辆展示数据的名称。
比如：蔚来 et5t 签名款 2024 款
	 */
	@ApiField("title")
	private String title;

	/**
	 * 过户次数，车辆的过户次数，单位：次
	 */
	@ApiField("transfer_count")
	private Long transferCount;

	/**
	 * YYYYMMDD 过户时间
	 */
	@ApiField("transfer_date")
	private String transferDate;

	/**
	 * 变速器类型，手动MT和自动AT
	 */
	@ApiField("transmission_type")
	private String transmissionType;

	/**
	 * 商户车辆展示状态 
0 下线态 
1 上线态/待活动态度
2 活动中 
3 活动结束
	 */
	@ApiField("vehicle_display_status")
	private Long vehicleDisplayStatus;

	/**
	 * 车辆 video url 地址
	 */
	@ApiField("vehicle_video_url")
	private String vehicleVideoUrl;

	/**
	 * 车辆识别代码（VIN）
	 */
	@ApiField("vin")
	private String vin;

	public String getAcid() {
		return this.acid;
	}
	public void setAcid(String acid) {
		this.acid = acid;
	}

	public Date getActivityEndDate() {
		return this.activityEndDate;
	}
	public void setActivityEndDate(Date activityEndDate) {
		this.activityEndDate = activityEndDate;
	}

	public Date getActivityStartDate() {
		return this.activityStartDate;
	}
	public void setActivityStartDate(Date activityStartDate) {
		this.activityStartDate = activityStartDate;
	}

	public Long getAttrCarSourceBatteryOwnerType() {
		return this.attrCarSourceBatteryOwnerType;
	}
	public void setAttrCarSourceBatteryOwnerType(Long attrCarSourceBatteryOwnerType) {
		this.attrCarSourceBatteryOwnerType = attrCarSourceBatteryOwnerType;
	}

	public String getAuditFullDate() {
		return this.auditFullDate;
	}
	public void setAuditFullDate(String auditFullDate) {
		this.auditFullDate = auditFullDate;
	}

	public String getAutoType() {
		return this.autoType;
	}
	public void setAutoType(String autoType) {
		this.autoType = autoType;
	}

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public Boolean getBrandOfficialStore() {
		return this.brandOfficialStore;
	}
	public void setBrandOfficialStore(Boolean brandOfficialStore) {
		this.brandOfficialStore = brandOfficialStore;
	}

	public String getCallPhone() {
		return this.callPhone;
	}
	public void setCallPhone(String callPhone) {
		this.callPhone = callPhone;
	}

	public String getCarColor() {
		return this.carColor;
	}
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}

	public String getCarDesc() {
		return this.carDesc;
	}
	public void setCarDesc(String carDesc) {
		this.carDesc = carDesc;
	}

	public Long getCarKeys() {
		return this.carKeys;
	}
	public void setCarKeys(Long carKeys) {
		this.carKeys = carKeys;
	}

	public Date getCarOnlineDate() {
		return this.carOnlineDate;
	}
	public void setCarOnlineDate(Date carOnlineDate) {
		this.carOnlineDate = carOnlineDate;
	}

	public Long getCarSourceType() {
		return this.carSourceType;
	}
	public void setCarSourceType(Long carSourceType) {
		this.carSourceType = carSourceType;
	}

	public List<String> getCarTags() {
		return this.carTags;
	}
	public void setCarTags(List<String> carTags) {
		this.carTags = carTags;
	}

	public Long getCarYear() {
		return this.carYear;
	}
	public void setCarYear(Long carYear) {
		this.carYear = carYear;
	}

	public CheckReportData getCheckReportData() {
		return this.checkReportData;
	}
	public void setCheckReportData(CheckReportData checkReportData) {
		this.checkReportData = checkReportData;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getDisplacement() {
		return this.displacement;
	}
	public void setDisplacement(String displacement) {
		this.displacement = displacement;
	}

	public Long getDriveDistance() {
		return this.driveDistance;
	}
	public void setDriveDistance(Long driveDistance) {
		this.driveDistance = driveDistance;
	}

	public String getEmissionStandard() {
		return this.emissionStandard;
	}
	public void setEmissionStandard(String emissionStandard) {
		this.emissionStandard = emissionStandard;
	}

	public String getFuelType() {
		return this.fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public String getFullImgUrl() {
		return this.fullImgUrl;
	}
	public void setFullImgUrl(String fullImgUrl) {
		this.fullImgUrl = fullImgUrl;
	}

	public List<String> getHighlights() {
		return this.highlights;
	}
	public void setHighlights(List<String> highlights) {
		this.highlights = highlights;
	}

	public List<String> getImagesUrl() {
		return this.imagesUrl;
	}
	public void setImagesUrl(List<String> imagesUrl) {
		this.imagesUrl = imagesUrl;
	}

	public String getInsuranceFullDate() {
		return this.insuranceFullDate;
	}
	public void setInsuranceFullDate(String insuranceFullDate) {
		this.insuranceFullDate = insuranceFullDate;
	}

	public Date getIsvUpdateDate() {
		return this.isvUpdateDate;
	}
	public void setIsvUpdateDate(Date isvUpdateDate) {
		this.isvUpdateDate = isvUpdateDate;
	}

	public String getLicenseFullDate() {
		return this.licenseFullDate;
	}
	public void setLicenseFullDate(String licenseFullDate) {
		this.licenseFullDate = licenseFullDate;
	}

	public Long getOperationType() {
		return this.operationType;
	}
	public void setOperationType(Long operationType) {
		this.operationType = operationType;
	}

	public String getOutId() {
		return this.outId;
	}
	public void setOutId(String outId) {
		this.outId = outId;
	}

	public Long getPrice() {
		return this.price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}

	public String getProductDate() {
		return this.productDate;
	}
	public void setProductDate(String productDate) {
		this.productDate = productDate;
	}

	public Long getSeats() {
		return this.seats;
	}
	public void setSeats(Long seats) {
		this.seats = seats;
	}

	public String getSeriesName() {
		return this.seriesName;
	}
	public void setSeriesName(String seriesName) {
		this.seriesName = seriesName;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public Long getTransferCount() {
		return this.transferCount;
	}
	public void setTransferCount(Long transferCount) {
		this.transferCount = transferCount;
	}

	public String getTransferDate() {
		return this.transferDate;
	}
	public void setTransferDate(String transferDate) {
		this.transferDate = transferDate;
	}

	public String getTransmissionType() {
		return this.transmissionType;
	}
	public void setTransmissionType(String transmissionType) {
		this.transmissionType = transmissionType;
	}

	public Long getVehicleDisplayStatus() {
		return this.vehicleDisplayStatus;
	}
	public void setVehicleDisplayStatus(Long vehicleDisplayStatus) {
		this.vehicleDisplayStatus = vehicleDisplayStatus;
	}

	public String getVehicleVideoUrl() {
		return this.vehicleVideoUrl;
	}
	public void setVehicleVideoUrl(String vehicleVideoUrl) {
		this.vehicleVideoUrl = vehicleVideoUrl;
	}

	public String getVin() {
		return this.vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}

}
