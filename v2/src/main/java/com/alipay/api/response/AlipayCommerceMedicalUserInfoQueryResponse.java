package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.UserQueryInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.user.info.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-08 16:24:31
 */
public class AlipayCommerceMedicalUserInfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2231653895935792773L;

	/** 
	 * 结果数据
	 */
	@ApiField("user_query_info")
	private UserQueryInfo userQueryInfo;

	public void setUserQueryInfo(UserQueryInfo userQueryInfo) {
		this.userQueryInfo = userQueryInfo;
	}
	public UserQueryInfo getUserQueryInfo( ) {
		return this.userQueryInfo;
	}

}
