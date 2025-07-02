package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝出租车司机认证查询
 *
 * @author auto create
 * @since 1.0, 2025-05-27 16:29:55
 */
public class AlipayCommerceTransportTaxiDriverauthenQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1883715558352521927L;

	/**
	 * 司机支付宝open_id
	 */
	@ApiField("driver_open_id")
	private String driverOpenId;

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

	public String getDriverOpenId() {
		return this.driverOpenId;
	}
	public void setDriverOpenId(String driverOpenId) {
		this.driverOpenId = driverOpenId;
	}

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
