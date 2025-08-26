package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 错误原因
 *
 * @author auto create
 * @since 1.0, 2025-06-17 20:27:29
 */
public class MerchantSceneRoleFailInfo extends AlipayObject {

	private static final long serialVersionUID = 5395424814898366975L;

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
