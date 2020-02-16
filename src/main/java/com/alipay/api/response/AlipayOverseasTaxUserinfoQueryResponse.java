package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.tax.userinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-04-19 18:38:44
 */
public class AlipayOverseasTaxUserinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1828245928686786387L;

	/** 
	 * 支付宝登录账号
	 */
	@ApiField("logon_id")
	private String logonId;

	/** 
	 * 用户Id:蚂蚁统一会员ID,唯一
	 */
	@ApiField("user_id")
	private String userId;

	/** 
	 * 用户姓名:用户真实名称
	 */
	@ApiField("user_name")
	private String userName;

	public void setLogonId(String logonId) {
		this.logonId = logonId;
	}
	public String getLogonId( ) {
		return this.logonId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserName( ) {
		return this.userName;
	}

}
