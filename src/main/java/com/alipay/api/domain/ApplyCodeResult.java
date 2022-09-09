package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * S码申请的结果
 *
 * @author auto create
 * @since 1.0, 2019-09-18 16:22:42
 */
public class ApplyCodeResult extends AlipayObject {

	private static final long serialVersionUID = 8196863913885777531L;

	/**
	 * biz_id，唯一，业务id，用于业务请求的幂等标志
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * code_result，S码申请成功的结果
	 */
	@ApiField("code_result")
	private CodeResult codeResult;

	/**
	 * error_code，错误的code，用于区分错误的类型
	 */
	@ApiField("error_code")
	private String errorCode;

	/**
	 * error_message，错误描述，用来描述错误的具体原因
	 */
	@ApiField("error_message")
	private String errorMessage;

	/**
	 * success，表达该请求实例是否成功，true：成功，false：失败
	 */
	@ApiField("success")
	private Boolean success;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public CodeResult getCodeResult() {
		return this.codeResult;
	}
	public void setCodeResult(CodeResult codeResult) {
		this.codeResult = codeResult;
	}

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

	public Boolean getSuccess() {
		return this.success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}

}
