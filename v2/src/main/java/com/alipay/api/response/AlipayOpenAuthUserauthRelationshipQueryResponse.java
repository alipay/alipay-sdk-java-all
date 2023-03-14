package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.auth.userauth.relationship.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 04:51:40
 */
public class AlipayOpenAuthUserauthRelationshipQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1147268843278683838L;

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
