package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.mda.mapdistribution.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-11 15:01:04
 */
public class AlipayDataMdaMapdistributionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3488723177265496823L;

	/** 
	 * 中国34个省293个地级市用户数
	 */
	@ApiField("city_uv")
	private String cityUv;

	/** 
	 * 亚洲48个国家用户数
	 */
	@ApiField("country_uv")
	private String countryUv;

	public void setCityUv(String cityUv) {
		this.cityUv = cityUv;
	}
	public String getCityUv( ) {
		return this.cityUv;
	}

	public void setCountryUv(String countryUv) {
		this.countryUv = countryUv;
	}
	public String getCountryUv( ) {
		return this.countryUv;
	}

}
