package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 城市信息
 *
 * @author auto create
 * @since 1.0, 2022-11-09 17:57:45
 */
public class CityFunction extends AlipayObject {

	private static final long serialVersionUID = 7279891493864367146L;

	/**
	 * 城市标准编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 城市名称
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 描述功能，支持开卡(issue)，圈存(load)，充值转账(recharge)
	 */
	@ApiListField("function_type")
	@ApiField("string")
	private List<String> functionType;

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

	public List<String> getFunctionType() {
		return this.functionType;
	}
	public void setFunctionType(List<String> functionType) {
		this.functionType = functionType;
	}

}
