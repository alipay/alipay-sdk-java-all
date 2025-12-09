package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 消息疲劳度VO模型
 *
 * @author auto create
 * @since 1.0, 2023-02-16 10:42:09
 */
public class MsgFatigueVO extends AlipayObject {

	private static final long serialVersionUID = 6881123866792349839L;

	/**
	 * 表示疲劳度控制总量，如控制疲劳度为2天10次，则value=2，total=10，unit=day
	 */
	@ApiField("total")
	private String total;

	/**
	 * 以天或周为疲劳度计量单位，如控制疲劳度为2天10次，则value=2，total=10，unit=day
	 */
	@ApiField("unit")
	private String unit;

	/**
	 * 疲劳度单位前的数值，如控制疲劳度为2天10次，则value=2，total=10，unit=day
	 */
	@ApiField("value")
	private String value;

	public String getTotal() {
		return this.total;
	}
	public void setTotal(String total) {
		this.total = total;
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
