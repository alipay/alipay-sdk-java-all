package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 消息通用疲劳度信息
 *
 * @author auto create
 * @since 1.0, 2023-02-15 14:48:50
 */
public class MsgFatigueInfo extends AlipayObject {

	private static final long serialVersionUID = 8523174954176572944L;

	/**
	 * 表示疲劳度控制总量
	 */
	@ApiField("total")
	private Long total;

	/**
	 * 以天或周为疲劳度计量单位
	 */
	@ApiField("unit")
	private String unit;

	/**
	 * 如控制疲劳度为2天10次，则value=2，total=10，unit=day
	 */
	@ApiField("value")
	private Long value;

	public Long getTotal() {
		return this.total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}

	public String getUnit() {
		return this.unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Long getValue() {
		return this.value;
	}
	public void setValue(Long value) {
		this.value = value;
	}

}
