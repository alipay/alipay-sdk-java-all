package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.prod.contract.archive.save response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-02 16:42:25
 */
public class AlipayBossProdContractArchiveSaveResponse extends AlipayResponse {

	private static final long serialVersionUID = 2551491339346616789L;

	/** 
	 * 请求code 200 成功 别的失败 ；失败ErrorCode编码请联系对接技术
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 归档结果 true 成功 false 失败
	 */
	@ApiField("result_data")
	private Boolean resultData;

	/** 
	 * 接口操作描述(失败原因等)
	 */
	@ApiField("result_message")
	private String resultMessage;

	/** 
	 * 接口执行结果 true 成功 false 失败
	 */
	@ApiField("result_success")
	private Boolean resultSuccess;

	/** 
	 * trace_id
	 */
	@ApiField("result_trace_id")
	private String resultTraceId;

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setResultData(Boolean resultData) {
		this.resultData = resultData;
	}
	public Boolean getResultData( ) {
		return this.resultData;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}
	public String getResultMessage( ) {
		return this.resultMessage;
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
