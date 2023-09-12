package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.isvtoken.reim.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-11 17:42:33
 */
public class AlipayEbppInvoiceIsvtokenReimApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7225685638277366462L;

	/** 
	 * 支付宝分配给报销软件的授权token，当前设置有效时间为20分钟
	 */
	@ApiField("isv_token")
	private String isvToken;

	/** 
	 * 该次请求的唯一标志，当前设置有效时间为20分钟
	 */
	@ApiField("serial_no")
	private String serialNo;

	public void setIsvToken(String isvToken) {
		this.isvToken = isvToken;
	}
	public String getIsvToken( ) {
		return this.isvToken;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}
	public String getSerialNo( ) {
		return this.serialNo;
	}

}
