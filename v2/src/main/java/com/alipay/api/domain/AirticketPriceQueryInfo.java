package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 机票价格查询信息
 *
 * @author auto create
 * @since 1.0, 2025-02-14 10:42:10
 */
public class AirticketPriceQueryInfo extends AlipayObject {

	private static final long serialVersionUID = 3454673331866873826L;

	/**
	 * 到达城市三字码
	 */
	@ApiField("arr_city_code")
	private String arrCityCode;

	/**
	 * 出发城市三字码
	 */
	@ApiField("dep_city_code")
	private String depCityCode;

	/**
	 * 出发日期
	 */
	@ApiField("dep_date")
	private String depDate;

	/**
	 * 票面航班号
	 */
	@ApiListField("flight_no")
	@ApiField("string")
	private List<String> flightNo;

	/**
	 * 是否最低价
	 */
	@ApiField("has_lowest")
	private Boolean hasLowest;

	/**
	 * 是否中转
	 */
	@ApiField("has_transfer")
	private Boolean hasTransfer;

	/**
	 * 最低价格
	 */
	@ApiField("lowest_price")
	private String lowestPrice;

	/**
	 * 中转城市三字码
	 */
	@ApiField("transit_city_code")
	private String transitCityCode;

	public String getArrCityCode() {
		return this.arrCityCode;
	}
	public void setArrCityCode(String arrCityCode) {
		this.arrCityCode = arrCityCode;
	}

	public String getDepCityCode() {
		return this.depCityCode;
	}
	public void setDepCityCode(String depCityCode) {
		this.depCityCode = depCityCode;
	}

	public String getDepDate() {
		return this.depDate;
	}
	public void setDepDate(String depDate) {
		this.depDate = depDate;
	}

	public List<String> getFlightNo() {
		return this.flightNo;
	}
	public void setFlightNo(List<String> flightNo) {
		this.flightNo = flightNo;
	}

	public Boolean getHasLowest() {
		return this.hasLowest;
	}
	public void setHasLowest(Boolean hasLowest) {
		this.hasLowest = hasLowest;
	}

	public Boolean getHasTransfer() {
		return this.hasTransfer;
	}
	public void setHasTransfer(Boolean hasTransfer) {
		this.hasTransfer = hasTransfer;
	}

	public String getLowestPrice() {
		return this.lowestPrice;
	}
	public void setLowestPrice(String lowestPrice) {
		this.lowestPrice = lowestPrice;
	}

	public String getTransitCityCode() {
		return this.transitCityCode;
	}
	public void setTransitCityCode(String transitCityCode) {
		this.transitCityCode = transitCityCode;
	}

}
