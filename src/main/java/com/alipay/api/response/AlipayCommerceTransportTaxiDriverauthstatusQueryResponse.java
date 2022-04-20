package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.taxi.driverauthstatus.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-09-15 15:45:28
 */
public class AlipayCommerceTransportTaxiDriverauthstatusQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8615467486843316396L;

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

	/** 
	 * 是否开通收钱码
	 */
	@ApiField("qrcode_flag")
	private String qrcodeFlag;

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

	public void setQrcodeFlag(String qrcodeFlag) {
		this.qrcodeFlag = qrcodeFlag;
	}
	public String getQrcodeFlag( ) {
		return this.qrcodeFlag;
	}

}
