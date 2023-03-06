package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 出租车司机线下收钱码交易查询
 *
 * @author auto create
 * @since 1.0, 2022-11-24 17:38:15
 */
public class AlipayCommerceTransportTaxiDriverqrcodetradeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6883253718615591565L;

	/**
	 * 交易开始时间
	 */
	@ApiField("begin_time")
	private String beginTime;

	/**
	 * 支付宝open_id
	 */
	@ApiField("driver_open_id")
	private String driverOpenId;

	/**
	 * 支付宝uid
	 */
	@ApiField("driver_user_id")
	private String driverUserId;

	/**
	 * 交易结束时间
	 */
	@ApiField("end_time")
	private String endTime;

	public String getBeginTime() {
		return this.beginTime;
	}
	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}

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

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

}
