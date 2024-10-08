package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会话扩展信息，如省市区等
 *
 * @author auto create
 * @since 1.0, 2024-07-31 11:02:40
 */
public class BotBizInfo extends AlipayObject {

	private static final long serialVersionUID = 2532326163263313243L;

	/**
	 * 在获取不到用户定位时，传递的兜底城市编码
	 */
	@ApiField("actual_city_code")
	private String actualCityCode;

	/**
	 * 在获取不到用户定位时，传递的兜底城市名称
	 */
	@ApiField("actual_city_name")
	private String actualCityName;

	/**
	 * 通过用户定位获取到的城市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 通过用户定位获取到城市名称
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 业务场景
	 */
	@ApiField("scene")
	private String scene;

	public String getActualCityCode() {
		return this.actualCityCode;
	}
	public void setActualCityCode(String actualCityCode) {
		this.actualCityCode = actualCityCode;
	}

	public String getActualCityName() {
		return this.actualCityName;
	}
	public void setActualCityName(String actualCityName) {
		this.actualCityName = actualCityName;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCityName() {
		return this.cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

}
