package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OpenApiContractInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.prod.contract.detail.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 16:55:02
 */
public class AlipayBossProdContractDetailCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5278485417159385967L;

	/** 
	 * 请求code 200 成功 别的失败 ；失败ErrorCode编码请联系对接技术
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 合同基本信息
	 */
	@ApiField("result_data")
	private OpenApiContractInfoDTO resultData;

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
	 * trace id
	 */
	@ApiField("result_trace_id")
	private String resultTraceId;

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setResultData(OpenApiContractInfoDTO resultData) {
		this.resultData = resultData;
	}
	public OpenApiContractInfoDTO getResultData( ) {
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
