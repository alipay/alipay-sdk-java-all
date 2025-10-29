package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.rent.enterprise.seal.querystatus response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-28 17:32:10
 */
public class AlipayCommerceRentEnterpriseSealQuerystatusResponse extends AlipayResponse {

	private static final long serialVersionUID = 7191391231631188251L;

	/** 
	 * 业务流水号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 文件http链接，状态为已签署时，返回链接信息
	 */
	@ApiField("http_file_url")
	private String httpFileUrl;

	/** 
	 * 签署合同id
	 */
	@ApiField("sign_flow_id")
	private String signFlowId;

	/** 
	 * 签署状态
	 */
	@ApiField("status")
	private String status;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setHttpFileUrl(String httpFileUrl) {
		this.httpFileUrl = httpFileUrl;
	}
	public String getHttpFileUrl( ) {
		return this.httpFileUrl;
	}

	public void setSignFlowId(String signFlowId) {
		this.signFlowId = signFlowId;
	}
	public String getSignFlowId( ) {
		return this.signFlowId;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
