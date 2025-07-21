package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.aml.analyze.submit response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-16 16:52:01
 */
public class AlipaySecurityRiskAmlAnalyzeSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 6523754852183419867L;

	/** 
	 * 反洗钱分析结果，ACCEPT：无风险；REJECT：有风险，拒绝；REVIEW：有疑似风险，由业务端决定是否放行
	 */
	@ApiField("aml_decision")
	private String amlDecision;

	/** 
	 * 反洗钱系统执行结果
	 */
	@ApiField("aml_result_code")
	private String amlResultCode;

	/** 
	 * 业务的唯一编码
	 */
	@ApiField("biz_code")
	private String bizCode;

	/** 
	 * 请求的唯一编号，方便定位问题
	 */
	@ApiField("request_id")
	private String requestId;

	public void setAmlDecision(String amlDecision) {
		this.amlDecision = amlDecision;
	}
	public String getAmlDecision( ) {
		return this.amlDecision;
	}

	public void setAmlResultCode(String amlResultCode) {
		this.amlResultCode = amlResultCode;
	}
	public String getAmlResultCode( ) {
		return this.amlResultCode;
	}

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}
	public String getBizCode( ) {
		return this.bizCode;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getRequestId( ) {
		return this.requestId;
	}

}
