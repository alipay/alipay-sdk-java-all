package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 新能源充电-大数据智能选址计算参数
 *
 * @author auto create
 * @since 1.0, 2025-07-02 19:13:17
 */
public class SiteSelectionParam extends AlipayObject {

	private static final long serialVersionUID = 2511118657762283848L;

	/**
	 * 全国统一城市编码（地级市级别），eg：北京市110100，杭州市330100
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
	 * 1. H3坐标网格编码。
2. 若为预测场站价格时，请传入互联互通场站编码。
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
	 * 最短停留时长，单位为分钟
	 */
	@ApiField("min_parking_period")
	private Long minParkingPeriod;

	/**
	 * 其他参数
	 */
	@ApiField("params")
	private String params;

	/**
	 * 车辆停留天数（单位：天）
	 */
	@ApiField("parking_days")
	private Long parkingDays;

	/**
	 * 服务费
	 */
	@ApiField("service_fee")
	private String serviceFee;

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

	public String getParams() {
		return this.params;
	}
	public void setParams(String params) {
		this.params = params;
	}

	public Long getParkingDays() {
		return this.parkingDays;
	}
	public void setParkingDays(Long parkingDays) {
		this.parkingDays = parkingDays;
	}

	public String getServiceFee() {
		return this.serviceFee;
	}
	public void setServiceFee(String serviceFee) {
		this.serviceFee = serviceFee;
	}

}
