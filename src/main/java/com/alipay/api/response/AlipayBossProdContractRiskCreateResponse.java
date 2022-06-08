package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OpenAPIContractRiskResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.prod.contract.risk.create response.
 * 
 * @author auto create
 * @since 1.0, 2021-10-09 10:06:58
 */
public class AlipayBossProdContractRiskCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6683126348621817332L;

	/** 
	 * 请求单据号
	 */
	@ApiField("business_id")
	private String businessId;

	/** 
	 * 返回值
	 */
	@ApiListField("open_api_contract_risk_result_list")
	@ApiField("open_a_p_i_contract_risk_result")
	private List<OpenAPIContractRiskResult> openApiContractRiskResultList;

	/** 
	 * 请求处理结果code ，1001 正常
	 */
	@ApiField("result_code")
	private String resultCode;

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
	 * 日志traceId
	 */
	@ApiField("result_trace_id")
	private String resultTraceId;

	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}
	public String getBusinessId( ) {
		return this.businessId;
	}

	public void setOpenApiContractRiskResultList(List<OpenAPIContractRiskResult> openApiContractRiskResultList) {
		this.openApiContractRiskResultList = openApiContractRiskResultList;
	}
	public List<OpenAPIContractRiskResult> getOpenApiContractRiskResultList( ) {
		return this.openApiContractRiskResultList;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
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
