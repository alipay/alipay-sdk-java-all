package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.taxi.driverauthen.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-11-05 10:30:31
 */
public class AlipayCommerceTransportTaxiDriverauthenQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2717599866356195283L;

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

	public void setDriverUserId(String driverUserId) {
		this.driverUserId = driverUserId;
	}
	public String getDriverUserId( ) {
		return this.driverUserId;
	}

}
