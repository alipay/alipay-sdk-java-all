package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.taxi.driverstatus.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-27 16:30:55
 */
public class AlipayCommerceTransportTaxiDriverstatusQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2377129468272853581L;

	/** 
	 * 客户端时间
	 */
	@ApiField("app_time_stamp")
	private String appTimeStamp;

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
	 * 服务段时间
	 */
	@ApiField("server_time_stamp")
	private String serverTimeStamp;

	/** 
	 * 状态码
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 子状态
	 */
	@ApiField("sub_status")
	private String subStatus;

	public void setAppTimeStamp(String appTimeStamp) {
		this.appTimeStamp = appTimeStamp;
	}
	public String getAppTimeStamp( ) {
		return this.appTimeStamp;
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

	public void setServerTimeStamp(String serverTimeStamp) {
		this.serverTimeStamp = serverTimeStamp;
	}
	public String getServerTimeStamp( ) {
		return this.serverTimeStamp;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setSubStatus(String subStatus) {
		this.subStatus = subStatus;
	}
	public String getSubStatus( ) {
		return this.subStatus;
	}

}
