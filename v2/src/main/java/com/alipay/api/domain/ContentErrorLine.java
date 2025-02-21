package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * N线圈物料品检错误项
 *
 * @author auto create
 * @since 1.0, 2024-09-23 10:33:33
 */
public class ContentErrorLine extends AlipayObject {

	private static final long serialVersionUID = 4125265724652332266L;

	/**
	 * N品检后原本正确的值
	 */
	@ApiField("correct_value")
	private String correctValue;

	/**
	 * 品检的错误项字段
	 */
	@ApiField("error_field")
	private String errorField;

	/**
	 * 品检后错误值
	 */
	@ApiField("error_value")
	private String errorValue;

	public String getCorrectValue() {
		return this.correctValue;
	}
	public void setCorrectValue(String correctValue) {
		this.correctValue = correctValue;
	}

	public String getErrorField() {
		return this.errorField;
	}
	public void setErrorField(String errorField) {
		this.errorField = errorField;
	}

	public String getErrorValue() {
		return this.errorValue;
	}
	public void setErrorValue(String errorValue) {
		this.errorValue = errorValue;
	}

}
