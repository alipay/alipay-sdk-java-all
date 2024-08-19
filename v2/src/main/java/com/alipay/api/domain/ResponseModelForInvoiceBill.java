package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * KP单返回模型
 *
 * @author auto create
 * @since 1.0, 2023-08-25 14:55:17
 */
public class ResponseModelForInvoiceBill extends AlipayObject {

	private static final long serialVersionUID = 5342666643737972551L;

	/**
	 * 错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/**
	 * 错误详细信息
	 */
	@ApiField("error_detail_info")
	private String errorDetailInfo;

	/**
	 * 错误信息
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/**
	 * 是否成功
	 */
	@ApiField("success")
	private Boolean success;

	public String getErrorCode() {
		return this.errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorDetailInfo() {
		return this.errorDetailInfo;
	}
	public void setErrorDetailInfo(String errorDetailInfo) {
		this.errorDetailInfo = errorDetailInfo;
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
