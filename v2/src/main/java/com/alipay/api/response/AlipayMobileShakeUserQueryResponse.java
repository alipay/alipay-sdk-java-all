package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.shake.user.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-30 23:56:56
 */
public class AlipayMobileShakeUserQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8476318944948256995L;

	/** 
	 * 对应的业务信息
	 */
	@ApiField("bizdata")
	private String bizdata;

	/** 
	 * 支付宝用户登录账户，可能是email或者手机号码
	 */
	@ApiField("logon_id")
	private String logonId;

	/** 
	 * openid
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 对应的核销数据
	 */
	@ApiField("pass_id")
	private String passId;

	/** 
	 * 支付宝用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public void setBizdata(String bizdata) {
		this.bizdata = bizdata;
	}
	public String getBizdata( ) {
		return this.bizdata;
	}

	public void setLogonId(String logonId) {
		this.logonId = logonId;
	}
	public String getLogonId( ) {
		return this.logonId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setPassId(String passId) {
		this.passId = passId;
	}
	public String getPassId( ) {
		return this.passId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
