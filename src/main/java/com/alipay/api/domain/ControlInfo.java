package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单控制条款信息
 *
 * @author auto create
 * @since 1.0, 2019-08-17 17:40:30
 */
public class ControlInfo extends AlipayObject {

	private static final long serialVersionUID = 6411157271264357818L;

	/**
	 * 订单超时时间，逾期将关闭交易。取值范围：1m～15d。m-分钟，h-小时，d-天，1c-当天（1c-当天的情况下，无论交易何时创建，都在0点关闭）。 该参数数值不接受小数点， 如 1.5h，可转换为 90m
	 */
	@ApiField("timeout_express")
	private String timeoutExpress;

	public String getTimeoutExpress() {
		return this.timeoutExpress;
	}
	public void setTimeoutExpress(String timeoutExpress) {
		this.timeoutExpress = timeoutExpress;
	}

}
