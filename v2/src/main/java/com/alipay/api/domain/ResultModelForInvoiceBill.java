package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁智付核心KP单通用结果模型
 *
 * @author auto create
 * @since 1.0, 2023-08-25 14:55:26
 */
public class ResultModelForInvoiceBill extends AlipayObject {

	private static final long serialVersionUID = 6266525955844182651L;

	/**
	 * 错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/**
	 * 错误详细信息，一般用于方便定位，业务不用care
	 */
	@ApiField("error_detail_info")
	private String errorDetailInfo;

	/**
	 * 错误信息
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/**
	 * 返回结果
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
