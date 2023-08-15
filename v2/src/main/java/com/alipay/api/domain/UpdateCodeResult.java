package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 更新S码返回结果
 *
 * @author auto create
 * @since 1.0, 2020-06-15 10:51:37
 */
public class UpdateCodeResult extends AlipayObject {

	private static final long serialVersionUID = 2512931946368365127L;

	/**
	 * biz_id，唯一，业务id，用于业务请求的幂等标志
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 码值，对应码平台的token，https://qr.alipay.com/${token} 中的token
	 */
	@ApiField("code_token")
	private String codeToken;

	/**
	 * context_data，发码的上下文信息，比如子业务code，场景code等。此值为一个Map<string, string>类型的json串字符，传入规则如下： {"key1":"val2","key2":"val2"}。必填业务字段：SUB_BIZ_TYPE，SCENE等，具体咨询对接技术人员
	 */
	@ApiField("context_data")
	private String contextData;

	/**
	 * 错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/**
	 * 错误描述
	 */
	@ApiField("error_message")
	private String errorMessage;

	/**
	 * 是否成功
	 */
	@ApiField("success")
	private Boolean success;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getCodeToken() {
		return this.codeToken;
	}
	public void setCodeToken(String codeToken) {
		this.codeToken = codeToken;
	}

	public String getContextData() {
		return this.contextData;
	}
	public void setContextData(String contextData) {
		this.contextData = contextData;
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
