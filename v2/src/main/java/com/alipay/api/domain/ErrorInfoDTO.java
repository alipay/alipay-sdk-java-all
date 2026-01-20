package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 错误信息
 *
 * @author auto create
 * @since 1.0, 2023-08-29 21:12:51
 */
public class ErrorInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 1111319573227673499L;

	/**
	 * 联系人,一般为调用系统的owner
	 */
	@ApiField("contact_user_id")
	private String contactUserId;

	/**
	 * 错误代码
	 */
	@ApiField("error_code")
	private String errorCode;

	/**
	 * 错误息
	 */
	@ApiField("error_message")
	private String errorMessage;

	public String getContactUserId() {
		return this.contactUserId;
	}
	public void setContactUserId(String contactUserId) {
		this.contactUserId = contactUserId;
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

}
