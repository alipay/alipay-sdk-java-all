package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数值范围数据模型
 *
 * @author auto create
 * @since 1.0, 2024-06-04 15:07:55
 */
public class OpenNumberRangeValue extends AlipayObject {

	private static final long serialVersionUID = 6426797818453425754L;

	/**
	 * 数值操作符是大于、大于等于、小于、小于等于时，传入单个数值，数值操作符是介于，传入2个数值，逗号分割。
不需要传入具体数值单位，如果是金额数值范围，传入金额范围单位是「元」。
	 */
	@ApiField("number_value")
	private String numberValue;

	/**
	 * 数值范围操作符
	 */
	@ApiField("operator")
	private String operator;

	public String getNumberValue() {
		return this.numberValue;
	}
	public void setNumberValue(String numberValue) {
		this.numberValue = numberValue;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

}
