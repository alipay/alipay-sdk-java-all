package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 出租车司机状态查询接口
 *
 * @author auto create
 * @since 1.0, 2025-05-27 16:30:55
 */
public class AlipayCommerceTransportTaxiDriverstatusQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5537389922744165341L;

	/**
	 * 请求时间，Unix Timestamp单位毫秒
	 */
	@ApiField("request_time")
	private String requestTime;

	/**
	 * 支付宝域内唯一司机id
	 */
	@ApiField("sys_driver_id")
	private String sysDriverId;

	public String getRequestTime() {
		return this.requestTime;
	}
	public void setRequestTime(String requestTime) {
		this.requestTime = requestTime;
	}

	public String getSysDriverId() {
		return this.sysDriverId;
	}
	public void setSysDriverId(String sysDriverId) {
		this.sysDriverId = sysDriverId;
	}

}
