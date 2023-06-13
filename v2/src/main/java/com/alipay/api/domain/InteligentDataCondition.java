package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智能营销数据条件模型
 *
 * @author auto create
 * @since 1.0, 2018-01-22 16:20:21
 */
public class InteligentDataCondition extends AlipayObject {

	private static final long serialVersionUID = 3541988899834829988L;

	/**
	 * 数据类型，支持枚举：文本：STRING；数值：NUMBER；长整型：LONG；浮点型：DOUBLE；日期：DATE；布尔：BOOLEAN；金额：MONEY
	 */
	@ApiField("data_type")
	private String dataType;

	/**
	 * 数据限制类型，支持枚举：固定值：FIX；单选值：SELECT；区间值：RANGE;
	 */
	@ApiField("limit_type")
	private String limitType;

	/**
	 * 数据格式值；如：范围值:(1,10)，固定值:1
	 */
	@ApiField("value")
	private String value;

	public String getDataType() {
		return this.dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getLimitType() {
		return this.limitType;
	}
	public void setLimitType(String limitType) {
		this.limitType = limitType;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
