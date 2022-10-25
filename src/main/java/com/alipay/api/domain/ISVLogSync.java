package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * isv服务端日志同步格式
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class ISVLogSync extends AlipayObject {

	private static final long serialVersionUID = 6544192885583483218L;

	/**
	 * 应用名
	 */
	@ApiField("application")
	private String application;

	/**
	 * isv自定义错误码， 该值传了表示接口调用业务失败或发生异常
	 */
	@ApiField("error_code")
	private String errorCode;

	/**
	 * 错误信息
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/**
	 * 异常堆栈
	 */
	@ApiField("exception_stack_trace")
	private String exceptionStackTrace;

	/**
	 * 执行时长，毫秒数。如果能取到尽量传入，涉及到接口耗时的监控
	 */
	@ApiField("execution_millis")
	private String executionMillis;

	/**
	 * 接口全限定名 包含远程rpc和内部调用
	 */
	@ApiField("interface_name")
	private String interfaceName;

	/**
	 * T 成功
F 失败
	 */
	@ApiField("success")
	private String success;

	/**
	 * 回流数据类型
	 */
	@ApiField("sync_type")
	private String syncType;

	/**
	 * 时间戳
	 */
	@ApiField("timestamp")
	private String timestamp;

	public String getApplication() {
		return this.application;
	}
	public void setApplication(String application) {
		this.application = application;
	}

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

	public String getExceptionStackTrace() {
		return this.exceptionStackTrace;
	}
	public void setExceptionStackTrace(String exceptionStackTrace) {
		this.exceptionStackTrace = exceptionStackTrace;
	}

	public String getExecutionMillis() {
		return this.executionMillis;
	}
	public void setExecutionMillis(String executionMillis) {
		this.executionMillis = executionMillis;
	}

	public String getInterfaceName() {
		return this.interfaceName;
	}
	public void setInterfaceName(String interfaceName) {
		this.interfaceName = interfaceName;
	}

	public String getSuccess() {
		return this.success;
	}
	public void setSuccess(String success) {
		this.success = success;
	}

	public String getSyncType() {
		return this.syncType;
	}
	public void setSyncType(String syncType) {
		this.syncType = syncType;
	}

	public String getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

}
