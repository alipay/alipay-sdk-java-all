package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.hufu.auth.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 15:32:42
 */
public class AlipaySecurityRiskHufuAuthQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1652874891721713975L;

	/** 
	 * 业务系统创建时传入的序列号
	 */
	@ApiField("serial")
	private String serial;

	/** 
	 * 接入业务系统生成虎符时传入的uid
	 */
	@ApiField("uid")
	private String uid;

	/** 
	 * 接入业务系统传入的通过验证的用户信息
	 */
	@ApiField("user")
	private String user;

	public void setSerial(String serial) {
		this.serial = serial;
	}
	public String getSerial( ) {
		return this.serial;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUid( ) {
		return this.uid;
	}

	public void setUser(String user) {
		this.user = user;
	}
	public String getUser( ) {
		return this.user;
	}

}
