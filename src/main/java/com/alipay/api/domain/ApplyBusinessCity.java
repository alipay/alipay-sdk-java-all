package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机构投保业务归属地信息
 *
 * @author auto create
 * @since 1.0, 2019-07-15 20:26:02
 */
public class ApplyBusinessCity extends AlipayObject {

	private static final long serialVersionUID = 3727484562369558921L;

	/**
	 * 业务归属地区编码,精确到区县
	 */
	@ApiField("area_code")
	private String areaCode;

	/**
	 * 投保地区用户选择的层级
	 */
	@ApiField("city_level")
	private String cityLevel;

	public String getAreaCode() {
		return this.areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getCityLevel() {
		return this.cityLevel;
	}
	public void setCityLevel(String cityLevel) {
		this.cityLevel = cityLevel;
	}

}
