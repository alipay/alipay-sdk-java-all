package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 错误日志
 *
 * @author auto create
 * @since 1.0, 2020-06-08 17:27:56
 */
public class ErrorLog extends AlipayObject {

	private static final long serialVersionUID = 5738666317215116881L;

	/**
	 * 错误发生时间
	 */
	@ApiField("datetime")
	private String datetime;

	/**
	 * 错误信息
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/**
	 * 支付宝登录ID
	 */
	@ApiField("logon_id")
	private String logonId;

	/**
	 * 手机号码
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 错误日志ID
	 */
	@ApiField("trace_id")
	private String traceId;

	public String getDatetime() {
		return this.datetime;
	}
	public void setDatetime(String datetime) {
		this.datetime = datetime;
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

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getTraceId() {
		return this.traceId;
	}
	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

}
