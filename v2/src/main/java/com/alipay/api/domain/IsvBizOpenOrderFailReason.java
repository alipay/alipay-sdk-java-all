package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 弹射架服务商代商户业务开通错误原因
 *
 * @author auto create
 * @since 1.0, 2024-12-06 16:56:02
 */
public class IsvBizOpenOrderFailReason extends AlipayObject {

	private static final long serialVersionUID = 5325741674352757299L;

	/**
	 * 错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/**
	 * 错误原因
	 */
	@ApiField("error_msg")
	private String errorMsg;

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

}
