package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.network.relation.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-09 13:37:31
 */
public class AlipayMerchantNetworkRelationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3234918997963335171L;

	/** 
	 * 父子关系
	 */
	@ApiField("relation_type")
	private String relationType;

	public void setRelationType(String relationType) {
		this.relationType = relationType;
	}
	public String getRelationType( ) {
		return this.relationType;
	}

}
