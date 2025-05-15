package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.prod.alcagmprod.agreement.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 16:55:00
 */
public class AlipayBossProdAlcagmprodAgreementQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3785521911456738693L;

	/** 
	 * S-签约  U-解约
	 */
	@ApiField("result_data")
	private String resultData;

	/** 
	 * 请求结果状态
	 */
	@ApiField("result_success")
	private Boolean resultSuccess;

	/** 
	 * traceId
	 */
	@ApiField("result_trace_id")
	private String resultTraceId;

	public void setResultData(String resultData) {
		this.resultData = resultData;
	}
	public String getResultData( ) {
		return this.resultData;
	}

	public void setResultSuccess(Boolean resultSuccess) {
		this.resultSuccess = resultSuccess;
	}
	public Boolean getResultSuccess( ) {
		return this.resultSuccess;
	}

	public void setResultTraceId(String resultTraceId) {
		this.resultTraceId = resultTraceId;
	}
	public String getResultTraceId( ) {
		return this.resultTraceId;
	}

}
