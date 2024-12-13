package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OpenApiContractMatterDetailDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.prod.contract.matter.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 16:55:02
 */
public class AlipayBossProdContractMatterQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1168929856383825556L;

	/** 
	 * 请求处理结果code 200 正常 错误码
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 合同详情信息，包含磋商
	 */
	@ApiField("result_data")
	private OpenApiContractMatterDetailDTO resultData;

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
	 * traceId
	 */
	@ApiField("result_trace_id")
	private String resultTraceId;

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setResultData(OpenApiContractMatterDetailDTO resultData) {
		this.resultData = resultData;
	}
	public OpenApiContractMatterDetailDTO getResultData( ) {
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
