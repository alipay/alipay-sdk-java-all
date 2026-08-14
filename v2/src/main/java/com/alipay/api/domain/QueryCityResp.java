package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-07-31 21:12:33
 */
public class QueryCityResp extends AlipayObject {

	private static final long serialVersionUID = 8239969853884713726L;

	/**
	 * 城市编码（国标），用于后续站点/实时查询的 cityCode 入参。取值见本接口返回列表。
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 该城市已开通的功能特性，用于判断可调用哪些能力（站点信息始终可查；实时/首末班车/拥挤度视城市而定）。
	 */
	@ApiField("feature")
	private FeatureVO feature;

	/**
	 * 城市中文名称。
	 */
	@ApiField("name")
	private String name;

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public FeatureVO getFeature() {
		return this.feature;
	}
	public void setFeature(FeatureVO feature) {
		this.feature = feature;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
