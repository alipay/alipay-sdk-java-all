package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.productmanage.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2019-06-28 10:50:59
 */
public class AlipaySecurityProdProductmanageInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 5647199868293637817L;

	/** 
	 * 产品管理初始化失败后返回的错误码
	 */
	@ApiField("err_code")
	private String errCode;

	/** 
	 * 产品管理初始化失败后返回的错误原因
	 */
	@ApiField("err_msg")
	private String errMsg;

	/** 
	 * 初始化token
	 */
	@ApiField("init_token")
	private String initToken;

	/** 
	 * 产品管理初始化是否成功
	 */
	@ApiField("success")
	private Boolean success;

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}
	public String getErrCode( ) {
		return this.errCode;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
	public String getErrMsg( ) {
		return this.errMsg;
	}

	public void setInitToken(String initToken) {
		this.initToken = initToken;
	}
	public String getInitToken( ) {
		return this.initToken;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
