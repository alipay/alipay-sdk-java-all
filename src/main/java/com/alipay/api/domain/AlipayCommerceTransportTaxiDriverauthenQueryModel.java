package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝出租车司机认证查询
 *
 * @author auto create
 * @since 1.0, 2021-11-05 10:30:26
 */
public class AlipayCommerceTransportTaxiDriverauthenQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6299277172263259522L;

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
