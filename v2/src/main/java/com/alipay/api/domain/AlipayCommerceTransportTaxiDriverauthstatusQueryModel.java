package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝出租车司机交易信息查询
 *
 * @author auto create
 * @since 1.0, 2025-04-14 11:04:14
 */
public class AlipayCommerceTransportTaxiDriverauthstatusQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4799694465486931381L;

	/**
	 * 司机支付宝uid
	 */
	@ApiField("driver_user_id")
	private String driverUserId;

	/**
	 * 请求时间
	 */
	@ApiField("request_time")
	private String requestTime;

	public String getDriverUserId() {
		return this.driverUserId;
	}
	public void setDriverUserId(String driverUserId) {
		this.driverUserId = driverUserId;
	}

	public String getRequestTime() {
		return this.requestTime;
	}
	public void setRequestTime(String requestTime) {
		this.requestTime = requestTime;
	}

}
