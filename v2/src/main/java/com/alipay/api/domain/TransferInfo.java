package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 中转信息
 *
 * @author auto create
 * @since 1.0, 2023-09-07 13:44:14
 */
public class TransferInfo extends AlipayObject {

	private static final long serialVersionUID = 6578267782529748274L;

	/**
	 * 中转机场三字码
	 */
	@ApiField("transfer_airport")
	private String transferAirport;

	/**
	 * 中转机场名称
	 */
	@ApiField("transfer_airport_name")
	private String transferAirportName;

	/**
	 * 中转城市三字码
	 */
	@ApiField("transfer_city")
	private String transferCity;

	/**
	 * 中转城市名称
	 */
	@ApiField("transfer_city_name")
	private String transferCityName;

	/**
	 * 中转时长，单位：秒
	 */
	@ApiField("transfer_time")
	private Long transferTime;

	public String getTransferAirport() {
		return this.transferAirport;
	}
	public void setTransferAirport(String transferAirport) {
		this.transferAirport = transferAirport;
	}

	public String getTransferAirportName() {
		return this.transferAirportName;
	}
	public void setTransferAirportName(String transferAirportName) {
		this.transferAirportName = transferAirportName;
	}

	public String getTransferCity() {
		return this.transferCity;
	}
	public void setTransferCity(String transferCity) {
		this.transferCity = transferCity;
	}

	public String getTransferCityName() {
		return this.transferCityName;
	}
	public void setTransferCityName(String transferCityName) {
		this.transferCityName = transferCityName;
	}

	public Long getTransferTime() {
		return this.transferTime;
	}
	public void setTransferTime(Long transferTime) {
		this.transferTime = transferTime;
	}

}
