package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.renthouse.community.info.sync response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayEcoRenthouseCommunityInfoSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 4722976134533458483L;

	/** 
	 * 小区同步请求号
	 */
	@ApiField("comm_req_id")
	private String commReqId;

	/** 
	 * 小区同步状态
	 */
	@ApiField("status")
	private Long status;

	public void setCommReqId(String commReqId) {
		this.commReqId = commReqId;
	}
	public String getCommReqId( ) {
		return this.commReqId;
	}

	public void setStatus(Long status) {
		this.status = status;
	}
	public Long getStatus( ) {
		return this.status;
	}

}
