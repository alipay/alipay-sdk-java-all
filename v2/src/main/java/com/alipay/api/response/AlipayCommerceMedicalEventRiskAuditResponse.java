package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.event.risk.audit response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-24 11:27:45
 */
public class AlipayCommerceMedicalEventRiskAuditResponse extends AlipayResponse {

	private static final long serialVersionUID = 5682451376923562156L;

	/** 
	 * 请求参数
参照【蚂蚁文档
NextGuard总线接入文档
】
auditItemResultList
	 */
	@ApiField("audit_item_result_list")
	private String auditItemResultList;

	/** 
	 * 事件id
	 */
	@ApiField("event_id")
	private String eventId;

	/** 
	 * 一般放存证信息
	 */
	@ApiField("notarization")
	private String notarization;

	/** 
	 * 请求id
	 */
	@ApiField("request_id")
	private String requestId;

	/** 
	 * 审核状态
	 */
	@ApiField("result")
	private String result;

	/** 
	 * 事件code
	 */
	@ApiField("risk_event_code")
	private String riskEventCode;

	/** 
	 * 请求参数
参照【蚂蚁文档
NextGuard总线接入文档
】params
riskLabelList
	 */
	@ApiField("risk_label_list")
	private String riskLabelList;

	/** 
	 * SUCCESS表示有审核结果，不需要等待结果消息
INIT或者PROCESSING表示需要等待消息
见【
NextGuard总线接入文档
】审核返回status
	 */
	@ApiField("risk_process")
	private String riskProcess;

	public void setAuditItemResultList(String auditItemResultList) {
		this.auditItemResultList = auditItemResultList;
	}
	public String getAuditItemResultList( ) {
		return this.auditItemResultList;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}
	public String getEventId( ) {
		return this.eventId;
	}

	public void setNotarization(String notarization) {
		this.notarization = notarization;
	}
	public String getNotarization( ) {
		return this.notarization;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getRequestId( ) {
		return this.requestId;
	}

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

	public void setRiskEventCode(String riskEventCode) {
		this.riskEventCode = riskEventCode;
	}
	public String getRiskEventCode( ) {
		return this.riskEventCode;
	}

	public void setRiskLabelList(String riskLabelList) {
		this.riskLabelList = riskLabelList;
	}
	public String getRiskLabelList( ) {
		return this.riskLabelList;
	}

	public void setRiskProcess(String riskProcess) {
		this.riskProcess = riskProcess;
	}
	public String getRiskProcess( ) {
		return this.riskProcess;
	}

}
