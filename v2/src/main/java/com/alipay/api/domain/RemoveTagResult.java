package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 去标返回结果
 *
 * @author auto create
 * @since 1.0, 2020-06-15 10:51:40
 */
public class RemoveTagResult extends AlipayObject {

	private static final long serialVersionUID = 7724329113338136713L;

	/**
	 * biz_id，唯一，业务id，用于业务请求的幂等标志
	 */
	@ApiField("biz_id")
	private String bizId;

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
	private String success;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
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

	public String getSuccess() {
		return this.success;
	}
	public void setSuccess(String success) {
		this.success = success;
	}

}
