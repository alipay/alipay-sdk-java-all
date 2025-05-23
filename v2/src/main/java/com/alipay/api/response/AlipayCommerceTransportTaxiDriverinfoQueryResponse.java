package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.taxi.driverinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:34:27
 */
public class AlipayCommerceTransportTaxiDriverinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5756694446262299694L;

	/** 
	 * 年龄
	 */
	@ApiField("driver_age")
	private String driverAge;

	/** 
	 * 司机姓名
	 */
	@ApiField("driver_name")
	private String driverName;

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
	 * 返回结果编码
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 返回结果描述
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/** 
	 * 支付宝唯一司机id
	 */
	@ApiField("sys_driver_id")
	private String sysDriverId;

	public void setDriverAge(String driverAge) {
		this.driverAge = driverAge;
	}
	public String getDriverAge( ) {
		return this.driverAge;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public String getDriverName( ) {
		return this.driverName;
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

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCode( ) {
		return this.errorCode;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public String getErrorMsg( ) {
		return this.errorMsg;
	}

	public void setSysDriverId(String sysDriverId) {
		this.sysDriverId = sysDriverId;
	}
	public String getSysDriverId( ) {
		return this.sysDriverId;
	}

}
