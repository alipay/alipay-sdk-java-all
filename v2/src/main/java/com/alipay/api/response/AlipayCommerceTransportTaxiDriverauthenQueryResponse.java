package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.taxi.driverauthen.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-27 16:29:55
 */
public class AlipayCommerceTransportTaxiDriverauthenQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3257812347829161459L;

	/** 
	 * 司机认证状态
	 */
	@ApiField("bind_status")
	private String bindStatus;

	/** 
	 * 合作方司机id
	 */
	@ApiField("driver_id")
	private String driverId;

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

	public void setBindStatus(String bindStatus) {
		this.bindStatus = bindStatus;
	}
	public String getBindStatus( ) {
		return this.bindStatus;
	}

	public void setDriverId(String driverId) {
		this.driverId = driverId;
	}
	public String getDriverId( ) {
		return this.driverId;
	}

	public void setDriverOpenId(String driverOpenId) {
		this.driverOpenId = driverOpenId;
	}
	public String getDriverOpenId( ) {
		return this.driverOpenId;
	}

	public void setDriverUserId(String driverUserId) {
		this.driverUserId = driverUserId;
	}
	public String getDriverUserId( ) {
		return this.driverUserId;
	}

}
