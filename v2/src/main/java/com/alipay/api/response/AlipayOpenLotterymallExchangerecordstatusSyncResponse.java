package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.lotterymall.exchangerecordstatus.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:41:19
 */
public class AlipayOpenLotterymallExchangerecordstatusSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 2318548619655792746L;

	/** 
	 * 如果success为false，errorCode表示具体的失败错误码
	 */
	@ApiField("errorcode")
	private String errorcode;

	/** 
	 * 如果success为false时，errormsg 表示具体的失败原因
	 */
	@ApiField("errormsg")
	private String errormsg;

	/** 
	 * 本次业务处理是否成功，true表示成功，false表示失败
	 */
	@ApiField("success")
	private Boolean success;

	public void setErrorcode(String errorcode) {
		this.errorcode = errorcode;
	}
	public String getErrorcode( ) {
		return this.errorcode;
	}

	public void setErrormsg(String errormsg) {
		this.errormsg = errormsg;
	}
	public String getErrormsg( ) {
		return this.errormsg;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
