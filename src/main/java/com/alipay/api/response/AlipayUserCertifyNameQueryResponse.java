package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.certify.name.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-10-24 11:05:21
 */
public class AlipayUserCertifyNameQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1671784986395528151L;

	/** 
	 * 个人类查询，返回姓名；企业类型返回企业名称
	 */
	@ApiField("user_name")
	private String userName;

	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserName( ) {
		return this.userName;
	}

}
