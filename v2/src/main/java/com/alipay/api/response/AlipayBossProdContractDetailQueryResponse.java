package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ContractDetailQueryDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.prod.contract.detail.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-05 13:33:21
 */
public class AlipayBossProdContractDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3195777196829614959L;

	/** 
	 * 请求code 200 成功 别的失败 ；失败ErrorCode编码请联系对接技术
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 合同详细信息
	 */
	@ApiField("result_data")
	private ContractDetailQueryDTO resultData;

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

	public void setResultData(ContractDetailQueryDTO resultData) {
		this.resultData = resultData;
	}
	public ContractDetailQueryDTO getResultData( ) {
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
