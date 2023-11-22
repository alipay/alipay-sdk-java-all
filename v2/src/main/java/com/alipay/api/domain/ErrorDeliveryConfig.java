package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 操作失败的投放配置
 *
 * @author auto create
 * @since 1.0, 2023-03-30 20:16:50
 */
public class ErrorDeliveryConfig extends AlipayObject {

	private static final long serialVersionUID = 7267287299515681731L;

	/**
	 * 投放配置
	 */
	@ApiField("delivery_config")
	private DeliveryConfig deliveryConfig;

	/**
	 * 错误码。针对单个投放，具体的错误原因。
	 */
	@ApiField("error_code")
	private String errorCode;

	/**
	 * 详细的投放错误信息。用于判断具体的错误信息。
	 */
	@ApiField("error_msg")
	private String errorMsg;

	public DeliveryConfig getDeliveryConfig() {
		return this.deliveryConfig;
	}
	public void setDeliveryConfig(DeliveryConfig deliveryConfig) {
		this.deliveryConfig = deliveryConfig;
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

}
