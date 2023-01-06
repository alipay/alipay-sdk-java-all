package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.prod.alcagmprod.agreement.unsign response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-23 10:11:35
 */
public class AlipayBossProdAlcagmprodAgreementUnsignResponse extends AlipayResponse {

	private static final long serialVersionUID = 4852978846892988568L;

	/** 
	 * 是否处理成功
	 */
	@ApiField("result_success")
	private Boolean resultSuccess;

	/** 
	 * traceId，方便排查问题
	 */
	@ApiField("result_trace_id")
	private String resultTraceId;

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
