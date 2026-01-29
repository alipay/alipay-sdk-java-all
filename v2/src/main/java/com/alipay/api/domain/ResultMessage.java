package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 响应结果信息
 *
 * @author auto create
 * @since 1.0, 2025-12-25 10:19:59
 */
public class ResultMessage extends AlipayObject {

	private static final long serialVersionUID = 5366338333637291488L;

	/**
	 * 错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/**
	 * 错误信息
	 */
	@ApiField("error_message")
	private String errorMessage;

	/**
	 * 调用结果
	 */
	@ApiField("result_flag")
	private Boolean resultFlag;

	public String getErrorCode() {
		return this.errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Boolean getResultFlag() {
		return this.resultFlag;
	}
	public void setResultFlag(Boolean resultFlag) {
		this.resultFlag = resultFlag;
	}

}
