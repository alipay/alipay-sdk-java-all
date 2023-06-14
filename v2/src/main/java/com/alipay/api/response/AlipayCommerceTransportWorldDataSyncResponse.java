package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.world.data.sync response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-09 11:29:01
 */
public class AlipayCommerceTransportWorldDataSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 4637654751838564268L;

	/** 
	 * 外部商户返回的原始错误码
	 */
	@ApiField("org_error_code")
	private String orgErrorCode;

	/** 
	 * 外部商户返回的原始错误信息
	 */
	@ApiField("org_error_msg")
	private String orgErrorMsg;

	/** 
	 * 外部商户返回的具体数据
	 */
	@ApiField("response_data")
	private String responseData;

	public void setOrgErrorCode(String orgErrorCode) {
		this.orgErrorCode = orgErrorCode;
	}
	public String getOrgErrorCode( ) {
		return this.orgErrorCode;
	}

	public void setOrgErrorMsg(String orgErrorMsg) {
		this.orgErrorMsg = orgErrorMsg;
	}
	public String getOrgErrorMsg( ) {
		return this.orgErrorMsg;
	}

	public void setResponseData(String responseData) {
		this.responseData = responseData;
	}
	public String getResponseData( ) {
		return this.responseData;
	}

}
