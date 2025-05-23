package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 爱车的数据信息
 *
 * @author auto create
 * @since 1.0, 2017-09-26 19:15:29
 */
public class MaintainVehicleInfo extends AlipayObject {

	private static final long serialVersionUID = 7364331181252779449L;

	/**
	 * 背景图片
	 */
	@ApiField("bg_url")
	private String bgUrl;

	/**
	 * 发动机编号
	 */
	@ApiField("engine_no")
	private String engineNo;

	/**
	 * 发动机类型
	 */
	@ApiField("engine_type")
	private String engineType;

	/**
	 * 生产厂商
	 */
	@ApiField("manufacturer")
	private String manufacturer;

	/**
	 * 车主平台车型id
	 */
	@ApiField("model_id")
	private String modelId;

	/**
	 * 生产年份
	 */
	@ApiField("production_year")
	private String productionYear;

	/**
	 * 发动机排量
	 */
	@ApiListField("swept_volume")
	@ApiField("string")
	private List<String> sweptVolume;

	/**
	 * 品牌Logo
	 */
	@ApiField("vi_brand_logo")
	private String viBrandLogo;

	/**
	 * 品牌名称
	 */
	@ApiField("vi_brand_name")
	private String viBrandName;

	/**
	 * 车辆归属地id
	 */
	@ApiField("vi_city_id")
	private String viCityId;

	/**
	 * 城市名称
	 */
	@ApiField("vi_city_name")
	private String viCityName;

	/**
	 * 车辆图标URL
	 */
	@ApiField("vi_logo_url")
	private String viLogoUrl;

	/**
	 * 行驶里程
	 */
	@ApiField("vi_mileage")
	private String viMileage;

	/**
	 * 车型名称
	 */
	@ApiField("vi_model_name")
	private String viModelName;

	/**
	 * 车牌号
	 */
	@ApiField("vi_number")
	private String viNumber;

	/**
	 * 车系名称
	 */
	@ApiField("vi_series_name")
	private String viSeriesName;

	/**
	 * 上路日期
	 */
	@ApiField("vi_start_time")
	private Date viStartTime;

	/**
	 * 年款
	 */
	@ApiField("vi_style_name")
	private String viStyleName;

	/**
	 * 车架号
	 */
	@ApiListField("vi_vin")
	@ApiField("string")
	private List<String> viVin;

	/**
	 * 行驶证注册时间
	 */
	@ApiField("vl_start_time")
	private Date vlStartTime;

	public String getBgUrl() {
		return this.bgUrl;
	}
	public void setBgUrl(String bgUrl) {
		this.bgUrl = bgUrl;
	}

	public String getEngineNo() {
		return this.engineNo;
	}
	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}

	public String getEngineType() {
		return this.engineType;
	}
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	public String getManufacturer() {
		return this.manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModelId() {
		return this.modelId;
	}
	public void setModelId(String modelId) {
		this.modelId = modelId;
	}

	public String getProductionYear() {
		return this.productionYear;
	}
	public void setProductionYear(String productionYear) {
		this.productionYear = productionYear;
	}

	public List<String> getSweptVolume() {
		return this.sweptVolume;
	}
	public void setSweptVolume(List<String> sweptVolume) {
		this.sweptVolume = sweptVolume;
	}

	public String getViBrandLogo() {
		return this.viBrandLogo;
	}
	public void setViBrandLogo(String viBrandLogo) {
		this.viBrandLogo = viBrandLogo;
	}

	public String getViBrandName() {
		return this.viBrandName;
	}
	public void setViBrandName(String viBrandName) {
		this.viBrandName = viBrandName;
	}

	public String getViCityId() {
		return this.viCityId;
	}
	public void setViCityId(String viCityId) {
		this.viCityId = viCityId;
	}

	public String getViCityName() {
		return this.viCityName;
	}
	public void setViCityName(String viCityName) {
		this.viCityName = viCityName;
	}

	public String getViLogoUrl() {
		return this.viLogoUrl;
	}
	public void setViLogoUrl(String viLogoUrl) {
		this.viLogoUrl = viLogoUrl;
	}

	public String getViMileage() {
		return this.viMileage;
	}
	public void setViMileage(String viMileage) {
		this.viMileage = viMileage;
	}

	public String getViModelName() {
		return this.viModelName;
	}
	public void setViModelName(String viModelName) {
		this.viModelName = viModelName;
	}

	public String getViNumber() {
		return this.viNumber;
	}
	public void setViNumber(String viNumber) {
		this.viNumber = viNumber;
	}

	public String getViSeriesName() {
		return this.viSeriesName;
	}
	public void setViSeriesName(String viSeriesName) {
		this.viSeriesName = viSeriesName;
	}

	public Date getViStartTime() {
		return this.viStartTime;
	}
	public void setViStartTime(Date viStartTime) {
		this.viStartTime = viStartTime;
	}

	public String getViStyleName() {
		return this.viStyleName;
	}
	public void setViStyleName(String viStyleName) {
		this.viStyleName = viStyleName;
	}

	public List<String> getViVin() {
		return this.viVin;
	}
	public void setViVin(List<String> viVin) {
		this.viVin = viVin;
	}

	public Date getVlStartTime() {
		return this.vlStartTime;
	}
	public void setVlStartTime(Date vlStartTime) {
		this.vlStartTime = vlStartTime;
	}

}
