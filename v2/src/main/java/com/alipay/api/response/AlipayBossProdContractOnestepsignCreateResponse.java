package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OneStepSignDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.prod.contract.onestepsign.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 20:23:23
 */
public class AlipayBossProdContractOnestepsignCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1382152415119593337L;

	/** 
	 * 业务端唯一编号
	 */
	@ApiField("business_id")
	private String businessId;

	/** 
	 * 请求code 200 成功 别的失败 ；失败ErrorCode编码请联系对接技术
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 签约处理结果
	 */
	@ApiField("result_data")
	private OneStepSignDTO resultData;

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

	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}
	public String getBusinessId( ) {
		return this.businessId;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setResultData(OneStepSignDTO resultData) {
		this.resultData = resultData;
	}
	public OneStepSignDTO getResultData( ) {
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
