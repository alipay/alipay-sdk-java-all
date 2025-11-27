package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.taxi.driverlevel.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-14 11:12:04
 */
public class AlipayCommerceTransportTaxiDriverlevelQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7274562257349687987L;

	/** 
	 * 数据版本 YYYYMMDD格式
	 */
	@ApiField("date_version")
	private String dateVersion;

	/** 
	 * 司机等级
	 */
	@ApiField("driver_level")
	private String driverLevel;

	/** 
	 * 司机手机号
	 */
	@ApiField("driver_phone")
	private String driverPhone;

	/** 
	 * 错误吗
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 错误信息
	 */
	@ApiField("error_message")
	private String errorMessage;

	/** 
	 * 扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/** 
	 * 两个状态，我们的库里有该司机：FOUND；我们的库里没有该司机或司机未授权：NOTFOUND。
	 */
	@ApiField("status")
	private String status;

	public void setDateVersion(String dateVersion) {
		this.dateVersion = dateVersion;
	}
	public String getDateVersion( ) {
		return this.dateVersion;
	}

	public void setDriverLevel(String driverLevel) {
		this.driverLevel = driverLevel;
	}
	public String getDriverLevel( ) {
		return this.driverLevel;
	}

	public void setDriverPhone(String driverPhone) {
		this.driverPhone = driverPhone;
	}
	public String getDriverPhone( ) {
		return this.driverPhone;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCode( ) {
		return this.errorCode;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getErrorMessage( ) {
		return this.errorMessage;
	}

	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}
	public String getExtInfo( ) {
		return this.extInfo;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
