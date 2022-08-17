package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 出租车司机线下收钱码交易查询
 *
 * @author auto create
 * @since 1.0, 2021-11-05 10:35:53
 */
public class AlipayCommerceTransportTaxiDriverqrcodetradeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6699763942171766297L;

	/**
	 * 交易开始时间
	 */
	@ApiField("begin_time")
	private String beginTime;

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
