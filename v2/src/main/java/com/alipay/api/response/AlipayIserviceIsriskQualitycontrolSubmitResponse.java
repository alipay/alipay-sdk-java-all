package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.isrisk.qualitycontrol.submit response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-12 11:27:36
 */
public class AlipayIserviceIsriskQualitycontrolSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 3211992828183812529L;

	/** 
	 * 唯一的结果id，用于查询结果
	 */
	@ApiField("qc_detect_result_id")
	private String qcDetectResultId;

	/** 
	 * 质检返回信息
	 */
	@ApiField("qc_message")
	private String qcMessage;

	/** 
	 * 直接结果
	 */
	@ApiField("qc_result")
	private String qcResult;

	public void setQcDetectResultId(String qcDetectResultId) {
		this.qcDetectResultId = qcDetectResultId;
	}
	public String getQcDetectResultId( ) {
		return this.qcDetectResultId;
	}

	public void setQcMessage(String qcMessage) {
		this.qcMessage = qcMessage;
	}
	public String getQcMessage( ) {
		return this.qcMessage;
	}

	public void setQcResult(String qcResult) {
		this.qcResult = qcResult;
	}
	public String getQcResult( ) {
		return this.qcResult;
	}

}
