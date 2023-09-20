package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 出租车司机及车辆信息查询
 *
 * @author auto create
 * @since 1.0, 2023-07-24 16:53:56
 */
public class AlipayCommerceTransportTaxiMachinedrivercarinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3258164365445467277L;

	/**
	 * 司机支付宝openid
	 */
	@ApiField("driver_open_id")
	private String driverOpenId;

	/**
	 * 司机支付宝uid
	 */
	@ApiField("driver_user_id")
	private String driverUserId;

	/**
	 * 请求id
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 请求时间
	 */
	@ApiField("request_time")
	private Date requestTime;

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

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Date getRequestTime() {
		return this.requestTime;
	}
	public void setRequestTime(Date requestTime) {
		this.requestTime = requestTime;
	}

}
