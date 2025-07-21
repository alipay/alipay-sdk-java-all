package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 乘车记录
 *
 * @author auto create
 * @since 1.0, 2024-04-18 11:53:29
 */
public class TravelRecord extends AlipayObject {

	private static final long serialVersionUID = 3436435741793584341L;

	/**
	 * 当天公交乘车记录是否存在
	 */
	@ApiField("bus_exist")
	private Boolean busExist;

	/**
	 * 日期
	 */
	@ApiField("date")
	private String date;

	/**
	 * 当天地铁记录是否存在
	 */
	@ApiField("metro_exist")
	private Boolean metroExist;

	public Boolean getBusExist() {
		return this.busExist;
	}
	public void setBusExist(Boolean busExist) {
		this.busExist = busExist;
	}

	public String getDate() {
		return this.date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	public Boolean getMetroExist() {
		return this.metroExist;
	}
	public void setMetroExist(Boolean metroExist) {
		this.metroExist = metroExist;
	}

}
