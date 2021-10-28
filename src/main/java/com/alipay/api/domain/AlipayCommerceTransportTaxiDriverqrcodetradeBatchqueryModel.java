package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 出租车司机收钱码交易数据批量查询接口
 *
 * @author auto create
 * @since 1.0, 2021-09-09 21:37:16
 */
public class AlipayCommerceTransportTaxiDriverqrcodetradeBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 2734825764254934425L;

	/**
	 * 批量开始时间
	 */
	@ApiField("begin_time")
	private String beginTime;

	/**
	 * 支付宝司机uid
	 */
	@ApiField("driver_user_id")
	private String driverUserId;

	/**
	 * 批量结束时间
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
