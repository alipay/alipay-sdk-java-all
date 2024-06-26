package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 大数据选址参数
 *
 * @author auto create
 * @since 1.0, 2024-06-24 10:27:53
 */
public class SiteSelectionParam extends AlipayObject {

	private static final long serialVersionUID = 4626318196285689381L;

	/**
	 * 全国统一城市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 查询数据起始日期
	 */
	@ApiField("date_from")
	private String dateFrom;

	/**
	 * 查询数据截止日期
	 */
	@ApiField("date_to")
	private String dateTo;

	/**
	 * H3坐标网格编码
	 */
	@ApiListField("index_list")
	@ApiField("string")
	private List<String> indexList;

	/**
	 * 最短停留时长，单位为分钟
	 */
	@ApiField("min_parking_period")
	private Long minParkingPeriod;

	/**
	 * 车辆停留天数
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
