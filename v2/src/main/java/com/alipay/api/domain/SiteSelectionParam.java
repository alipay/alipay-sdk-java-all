package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 大数据选址参数
 *
 * @author auto create
 * @since 1.0, 2024-11-28 13:18:19
 */
public class SiteSelectionParam extends AlipayObject {

	private static final long serialVersionUID = 3445292261732832239L;

	/**
	 * 全国统一城市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 数据起始日期
	 */
	@ApiField("date_from")
	private String dateFrom;

	/**
	 * 数据截止日期，请晚于起始日期
	 */
	@ApiField("date_to")
	private String dateTo;

	/**
	 * 1. H3坐标网格编码（编码为8级，六边形面积约为0.7373km2）
2. 若为预测场站价格时，请传入场站编码
	 */
	@ApiListField("index_list")
	@ApiField("string")
	private List<String> indexList;

	/**
	 * 经纬度列表
	 */
	@ApiListField("lng_lat_list")
	@ApiField("lng_and_lat_param")
	private List<LngAndLatParam> lngLatList;

	/**
	 * 最短停留时长，单位为分钟。当获取停留车辆数据「T_RESIDENT_VEHICLE」时，必传。
	 */
	@ApiField("min_parking_period")
	private Long minParkingPeriod;

	/**
	 * 车辆停留天数（单位：天）。当获取停留车辆数据「template_code = T_RESIDENT_VEHICLE」时，必传。
	 */
	@ApiField("parking_days")
	private Long parkingDays;

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getDateFrom() {
		return this.dateFrom;
	}
	public void setDateFrom(String dateFrom) {
		this.dateFrom = dateFrom;
	}

	public String getDateTo() {
		return this.dateTo;
	}
	public void setDateTo(String dateTo) {
		this.dateTo = dateTo;
	}

	public List<String> getIndexList() {
		return this.indexList;
	}
	public void setIndexList(List<String> indexList) {
		this.indexList = indexList;
	}

	public List<LngAndLatParam> getLngLatList() {
		return this.lngLatList;
	}
	public void setLngLatList(List<LngAndLatParam> lngLatList) {
		this.lngLatList = lngLatList;
	}

	public Long getMinParkingPeriod() {
		return this.minParkingPeriod;
	}
	public void setMinParkingPeriod(Long minParkingPeriod) {
		this.minParkingPeriod = minParkingPeriod;
	}

	public Long getParkingDays() {
		return this.parkingDays;
	}
	public void setParkingDays(Long parkingDays) {
		this.parkingDays = parkingDays;
	}

}
