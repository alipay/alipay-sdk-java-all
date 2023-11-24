package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝出租车司机认证查询
 *
 * @author auto create
 * @since 1.0, 2023-05-05 14:58:17
 */
public class AlipayCommerceTransportTaxiDriverauthenQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7447186824217867573L;

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
