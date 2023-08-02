package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.auth.userauth.relationship.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 08:41:57
 */
public class AlipayOpenAuthUserauthRelationshipQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8479927413874146237L;

	/** 
	 * 授权结果查询结果，可以转换为为Map<String,Boolean>格式
	 */
	@ApiField("query_detail")
	private String queryDetail;

	public void setQueryDetail(String queryDetail) {
		this.queryDetail = queryDetail;
	}
	public String getQueryDetail( ) {
		return this.queryDetail;
	}

}
