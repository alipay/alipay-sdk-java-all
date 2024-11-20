package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店范围
 *
 * @author auto create
 * @since 1.0, 2023-07-14 17:22:10
 */
public class ShopAreaInfo extends AlipayObject {

	private static final long serialVersionUID = 3343817977614847528L;

	/**
	 * 市
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 区
	 */
	@ApiField("county_name")
	private String countyName;

	/**
	 * 省
	 */
	@ApiField("province_name")
	private String provinceName;

	public String getCityName() {
		return this.cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCountyName() {
		return this.countyName;
	}
	public void setCountyName(String countyName) {
		this.countyName = countyName;
	}

	public String getProvinceName() {
		return this.provinceName;
	}
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

}
