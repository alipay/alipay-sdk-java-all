package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用例错误原因
 *
 * @author auto create
 * @since 1.0, 2022-09-15 20:44:25
 */
public class SlmCaseErrorInfo extends AlipayObject {

	private static final long serialVersionUID = 6312196514781443182L;

	/**
	 * 错误描述
	 */
	@ApiField("error_desc")
	private String errorDesc;

	/**
	 * 错误格式
	 */
	@ApiField("error_format")
	private String errorFormat;

	/**
	 * 错误信息
	 */
	@ApiField("error_info")
	private String errorInfo;

	/**
	 * 错误类型
	 */
	@ApiField("error_type")
	private Long errorType;

	public String getErrorDesc() {
		return this.errorDesc;
	}
	public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
	}

	public String getErrorFormat() {
		return this.errorFormat;
	}
	public void setErrorFormat(String errorFormat) {
		this.errorFormat = errorFormat;
	}

	public String getErrorInfo() {
		return this.errorInfo;
	}
	public void setErrorInfo(String errorInfo) {
		this.errorInfo = errorInfo;
	}

	public Long getErrorType() {
		return this.errorType;
	}
	public void setErrorType(Long errorType) {
		this.errorType = errorType;
	}

}
