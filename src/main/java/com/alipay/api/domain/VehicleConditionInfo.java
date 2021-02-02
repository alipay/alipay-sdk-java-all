package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车况信息
 *
 * @author auto create
 * @since 1.0, 2020-11-03 17:03:01
 */
public class VehicleConditionInfo extends AlipayObject {

	private static final long serialVersionUID = 2431567672219772914L;

	/**
	 * 车况类型
	 */
	@ApiField("type")
	private String type;

	/**
	 * 车况信息单位
	 */
	@ApiField("unit")
	private String unit;

	/**
	 * 车况属性值
	 */
	@ApiField("value")
	private String value;

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getUnit() {
		return this.unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
