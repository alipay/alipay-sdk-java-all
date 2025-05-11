package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.enterpriseexctrl.employertitle.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-01 17:17:29
 */
public class AlipayEbppInvoiceEnterpriseexctrlEmployertitleCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5185121837317326381L;

	/** 
	 * 返回码
10000-成功
其他都是失败
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 返回消息
	 */
	@ApiField("msg")
	private String msg;

	/** 
	 * 是否成功
	 */
	@ApiField("success")
	private Boolean success;

	/** 
	 * 抬头ID
	 */
	@ApiField("title_id")
	private String titleId;

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

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

	public void setTitleId(String titleId) {
		this.titleId = titleId;
	}
	public String getTitleId( ) {
		return this.titleId;
	}

}
