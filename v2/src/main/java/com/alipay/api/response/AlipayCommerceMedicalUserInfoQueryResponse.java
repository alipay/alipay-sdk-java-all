package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.UserQueryInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.user.info.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-09 10:47:57
 */
public class AlipayCommerceMedicalUserInfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6423169191464977843L;

	/** 
	 * 用户信息
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
