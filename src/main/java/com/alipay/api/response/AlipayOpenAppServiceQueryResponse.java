package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.service.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-03-18 11:51:22
 */
public class AlipayOpenAppServiceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8862229131251148166L;

	/** 
	 * 驳回理由
	 */
	@ApiField("reject_reason")
	private String rejectReason;

	/** 
	 * 服务id
	 */
	@ApiField("service_id")
	private String serviceId;

	/** 
	 * 服务描述xml格式
	 */
	@ApiField("service_xml")
	private String serviceXml;

	/** 
	 * 服务状态
	 */
	@ApiField("status")
	private String status;

	public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}
	public String getRejectReason( ) {
		return this.rejectReason;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}
	public String getServiceId( ) {
		return this.serviceId;
	}

	public void setServiceXml(String serviceXml) {
		this.serviceXml = serviceXml;
	}
	public String getServiceXml( ) {
		return this.serviceXml;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
