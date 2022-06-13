package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.taxi.driver.send response.
 * 
 * @author auto create
 * @since 1.0, 2022-04-07 21:47:02
 */
public class AlipayCommerceTransportTaxiDriverSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 3278574613841411666L;

	/** 
	 * 司机身份证号
	 */
	@ApiField("driver_cert_no")
	private String driverCertNo;

	/** 
	 * 错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 错误消息
	 */
	@ApiField("error_message")
	private String errorMessage;

	/** 
	 * 扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	public void setDriverCertNo(String driverCertNo) {
		this.driverCertNo = driverCertNo;
	}
	public String getDriverCertNo( ) {
		return this.driverCertNo;
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

}
