package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ETC设备卡片检测错误信息模型
 *
 * @author auto create
 * @since 1.0, 2024-05-15 15:30:17
 */
public class EtcDeviceCardCheckInfo extends AlipayObject {

	private static final long serialVersionUID = 1231539173546679212L;

	/**
	 * 具体错误信息描述
	 */
	@ApiField("error_desc")
	private String errorDesc;

	/**
	 * 错误处理方法
	 */
	@ApiField("error_handler")
	private String errorHandler;

	/**
	 * 设备异常类型
	 */
	@ApiField("error_type")
	private String errorType;

	public String getErrorDesc() {
		return this.errorDesc;
	}
	public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
	}

	public String getErrorHandler() {
		return this.errorHandler;
	}
	public void setErrorHandler(String errorHandler) {
		this.errorHandler = errorHandler;
	}

	public String getErrorType() {
		return this.errorType;
	}
	public void setErrorType(String errorType) {
		this.errorType = errorType;
	}

}
