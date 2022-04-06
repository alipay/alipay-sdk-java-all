package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.service.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-12-14 12:17:37
 */
public class AlipayOpenAppServiceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3416571445975322471L;

	/** 
	 * 驳回理由
	 */
	@ApiField("reject_reason")
	private String rejectReason;

	/** 
	 * 服务id
	 */
	@ApiField("service_code")
	private String serviceCode;

	/** 
	 * 服务描述xml格式
	 */
	@ApiField("service_xml")
	private String serviceXml;

	/** 
	 * 服务状态，EDITING(编辑中)/AUDITING(审核中)/AUDIT_REJECT(审核驳回)/PROMOTION(可推广)/STOP_PROMOTION(停止推广)/INVALID(失效)/PUNISHED(处罚)
	 */
	@ApiField("status")
	private String status;

	public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}
	public String getRejectReason( ) {
		return this.rejectReason;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}
	public String getServiceCode( ) {
		return this.serviceCode;
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
