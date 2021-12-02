package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.order.info.modify response.
 * 
 * @author auto create
 * @since 1.0, 2020-07-13 14:52:40
 */
public class AlipayEbppInvoiceOrderInfoModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6641775273825287635L;

	/** 
	 * 返回码
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 返回码描述
	 */
	@ApiField("msg")
	private String msg;

	/** 
	 * 明细返回码
	 */
	@ApiField("sub_code")
	private String subCode;

	/** 
	 * 明细返回码描述
	 */
	@ApiField("sub_msg")
	private String subMsg;

	public void setCode(String code) {
		this.code = code;
	}
	public String getCode( ) {
		return this.code;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getMsg( ) {
		return this.msg;
	}

	public void setSubCode(String subCode) {
		this.subCode = subCode;
	}
	public String getSubCode( ) {
		return this.subCode;
	}

	public void setSubMsg(String subMsg) {
		this.subMsg = subMsg;
	}
	public String getSubMsg( ) {
		return this.subMsg;
	}

}
