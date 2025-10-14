package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.circular.zft.indirect.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-13 16:38:16
 */
public class AlipayCircularZftIndirectCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2731768697598472967L;

	/** 
	 * 进件申请单中的二级商户openid
	 */
	@ApiField("relation_openid")
	private String relationOpenid;

	/** 
	 * 进件账户id
	 */
	@ApiField("relation_uid")
	private String relationUid;

	/** 
	 * 进件状态
	 */
	@ApiField("status")
	private String status;

	public void setRelationOpenid(String relationOpenid) {
		this.relationOpenid = relationOpenid;
	}
	public String getRelationOpenid( ) {
		return this.relationOpenid;
	}

	public void setRelationUid(String relationUid) {
		this.relationUid = relationUid;
	}
	public String getRelationUid( ) {
		return this.relationUid;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
