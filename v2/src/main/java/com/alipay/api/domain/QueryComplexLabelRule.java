package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 复杂标签规则项查询模型
 *
 * @author auto create
 * @since 1.0, 2021-05-17 15:13:50
 */
public class QueryComplexLabelRule extends AlipayObject {

	private static final long serialVersionUID = 2746827352892153159L;

	/**
	 * 标签id
	 */
	@ApiField("label_id")
	private String labelId;

	/**
	 * 标签名
	 */
	@ApiField("label_name")
	private String labelName;

	/**
	 * 当有多个取值时用英文","分隔，不允许传入下划线"_"、竖线"|"或者空格" "
	 */
	@ApiField("label_value")
	private String labelValue;

	/**
	 * 运算符
	 */
	@ApiField("operator")
	private String operator;

	public String getLabelId() {
		return this.labelId;
	}
	public void setLabelId(String labelId) {
		this.labelId = labelId;
	}

	public String getLabelName() {
		return this.labelName;
	}
	public void setLabelName(String labelName) {
		this.labelName = labelName;
	}

	public String getLabelValue() {
		return this.labelValue;
	}
	public void setLabelValue(String labelValue) {
		this.labelValue = labelValue;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

}
