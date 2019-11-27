package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.login.unifyalipay.login response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayMobileLoginUnifyalipayLoginResponse extends AlipayResponse {

	private static final long serialVersionUID = 2574419131222693951L;

	/** 
	 * 支付宝登录id
	 */
	@ApiField("alipay_login_id")
	private String alipayLoginId;

	/** 
	 * 返回状态码
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 扩展参数(json格式)
	 */
	@ApiField("extern_params")
	private String externParams;

	/** 
	 * Havanaid
	 */
	@ApiField("hid")
	private String hid;

	/** 
	 * 状态描述
	 */
	@ApiField("msg")
	private String msg;

	/** 
	 * 是否通过了支付宝安全校验
	 */
	@ApiField("pass_alipay_security")
	private String passAlipaySecurity;

	/** 
	 * 是否成功标识
	 */
	@ApiField("success")
	private Boolean success;

	/** 
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	/** 
	 * 是否手机域账户
	 */
	@ApiField("wireless")
	private Boolean wireless;

	public void setAlipayLoginId(String alipayLoginId) {
		this.alipayLoginId = alipayLoginId;
	}
	public String getAlipayLoginId( ) {
		return this.alipayLoginId;
	}

	public void setCode(String code) {
		this.code = code;
	}
	public String getCode( ) {
		return this.code;
	}

	public void setExternParams(String externParams) {
		this.externParams = externParams;
	}
	public String getExternParams( ) {
		return this.externParams;
	}

	public void setHid(String hid) {
		this.hid = hid;
	}
	public String getHid( ) {
		return this.hid;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getMsg( ) {
		return this.msg;
	}

	public void setPassAlipaySecurity(String passAlipaySecurity) {
		this.passAlipaySecurity = passAlipaySecurity;
	}
	public String getPassAlipaySecurity( ) {
		return this.passAlipaySecurity;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

	public void setWireless(Boolean wireless) {
		this.wireless = wireless;
	}
	public Boolean getWireless( ) {
		return this.wireless;
	}

}
