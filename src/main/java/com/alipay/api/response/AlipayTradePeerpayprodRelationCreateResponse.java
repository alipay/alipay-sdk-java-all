package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.peerpayprod.relation.create response.
 * 
 * @author auto create
 * @since 1.0, 2020-05-09 17:56:47
 */
public class AlipayTradePeerpayprodRelationCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6569618841326939345L;

	/** 
	 * 亲情号关系是否添加成功
	 */
	@ApiField("result")
	private Boolean result;

	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}

}
