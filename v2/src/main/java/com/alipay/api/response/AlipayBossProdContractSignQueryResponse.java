package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ContractQueryDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.prod.contract.sign.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 00:33:48
 */
public class AlipayBossProdContractSignQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6839765478218245768L;

	/** 
	 * 合同名称
	 */
	@ApiField("contract_title")
	private String contractTitle;

	/** 
	 * 请求code 200 成功 别的失败 ；失败ErrorCode编码请联系对接技术
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 合同查询结果DTO
	 */
	@ApiField("result_data")
	private ContractQueryDTO resultData;

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

	/** 
	 * 来源系统
	 */
	@ApiField("source_system_id")
	private String sourceSystemId;

	public void setContractTitle(String contractTitle) {
		this.contractTitle = contractTitle;
	}
	public String getContractTitle( ) {
		return this.contractTitle;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setResultData(ContractQueryDTO resultData) {
		this.resultData = resultData;
	}
	public ContractQueryDTO getResultData( ) {
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

	public void setSourceSystemId(String sourceSystemId) {
		this.sourceSystemId = sourceSystemId;
	}
	public String getSourceSystemId( ) {
		return this.sourceSystemId;
	}

}
