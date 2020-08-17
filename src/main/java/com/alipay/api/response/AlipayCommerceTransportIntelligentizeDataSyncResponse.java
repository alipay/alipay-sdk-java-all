package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.intelligentize.data.sync response.
 * 
 * @author auto create
 * @since 1.0, 2020-04-09 14:30:36
 */
public class AlipayCommerceTransportIntelligentizeDataSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 8174983463741452879L;

	/** 
	 * 扩展信息，json格式，由双方约定取值
	 */
	@ApiField("ext_info")
	private String extInfo;

	/** 
	 * 结果码，发生异常时非空
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 结果信息，发生异常时非空
	 */
	@ApiField("result_msg")
	private String resultMsg;

	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}
	public String getExtInfo( ) {
		return this.extInfo;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	public String getResultMsg( ) {
		return this.resultMsg;
	}

}
