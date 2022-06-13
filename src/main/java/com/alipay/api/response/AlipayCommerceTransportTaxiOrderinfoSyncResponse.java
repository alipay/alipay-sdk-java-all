package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.taxi.orderinfo.sync response.
 * 
 * @author auto create
 * @since 1.0, 2022-05-13 20:06:54
 */
public class AlipayCommerceTransportTaxiOrderinfoSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 2755672354778683268L;

	/** 
	 * 支付宝唯一司机id
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
	 * 费用信息同步处理结果
	 */
	@ApiField("result")
	private String result;

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

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

}
