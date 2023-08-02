package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.order.refund response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 22:26:36
 */
public class AlipayEcoMycarOrderRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 1735853769184858477L;

	/** 
	 * 失败原因
	 */
	@ApiField("err_msg")
	private String errMsg;

	/** 
	 * 是否成功(T: 成功，F:失败)
	 */
	@ApiField("success")
	private String success;

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
	public String getErrMsg( ) {
		return this.errMsg;
	}

	public void setSuccess(String success) {
		this.success = success;
	}
	public String getSuccess( ) {
		return this.success;
	}

}
