package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝出租车司机交易订单列表查询
 *
 * @author auto create
 * @since 1.0, 2022-02-17 11:12:50
 */
public class AlipayCommerceTransportTaxiOrderlistQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4532569722677648711L;

	/**
	 * 查询结束时间，未填默认取当前时间
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 乘客userId
	 */
	@ApiField("passenger_user_id")
	private String passengerUserId;

	/**
	 * 查询起始时间
	 */
	@ApiField("start_time")
	private String startTime;

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getPassengerUserId() {
		return this.passengerUserId;
	}
	public void setPassengerUserId(String passengerUserId) {
		this.passengerUserId = passengerUserId;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

}
