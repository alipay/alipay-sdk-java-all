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

	private static final long serialVersionUID = 1311756133981383728L;

	/**
	 * 投放配置
	 */
	@ApiField("delivery_config")
	private DeliveryConfig deliveryConfig;

	/**
	 * 错误码。针对单个投放，具体的错误原因。

枚举值：
UNKNOWN_EXCEPTION: 未知异常，可重试。
ACTIVITY_STATUS_NOT_ACTIVE:  活动状态未激活，不可重试。
ACTIVITY_OVERDUE:活动已过期，不可重试。
DELIVERY_VALIDATE_ERROR:投放校验不通过，不可重试。
DELIVERY_OPERATE_ERROR: 投放操作失败，不可重试。
BOOTH_CHANNEL_NOT_EXIST:渠道不存在，不可重试。
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
