package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 荣耀unifygw通用结果
 *
 * @author auto create
 * @since 1.0, 2025-09-01 16:43:15
 */
public class HonorUnifygwCommonResult extends AlipayObject {

	private static final long serialVersionUID = 4358892543319311585L;

	/**
	 * 失败原因码
	 */
	@ApiField("error_code")
	private String errorCode;

	/**
	 * 失败原因
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/**
	 * 处理是否成功
	 */
	@ApiField("success")
	private Boolean success;

	public String getErrorCode() {
		return this.errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return this.errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public Boolean getSuccess() {
		return this.success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}

}
