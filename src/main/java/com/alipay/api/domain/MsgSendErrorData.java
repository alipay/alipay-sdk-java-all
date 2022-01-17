package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 消息发送错误数据
 *
 * @author auto create
 * @since 1.0, 2020-07-01 16:17:15
 */
public class MsgSendErrorData extends AlipayObject {

	private static final long serialVersionUID = 3394792448888721823L;

	/**
	 * 错误吗
	 */
	@ApiField("error_code")
	private Long errorCode;

	/**
	 * 错误信息
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/**
	 * 登录id
	 */
	@ApiField("logon_id")
	private String logonId;

	public Long getErrorCode() {
		return this.errorCode;
	}
	public void setErrorCode(Long errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return this.errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getLogonId() {
		return this.logonId;
	}
	public void setLogonId(String logonId) {
		this.logonId = logonId;
	}

}
