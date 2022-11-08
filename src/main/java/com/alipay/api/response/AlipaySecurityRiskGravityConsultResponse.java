package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.GravityParam;
import com.alipay.api.domain.SecGravityServiceHeader;
import com.alipay.api.domain.GravityRiskResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.gravity.consult response.
 * 
 * @author auto create
 * @since 1.0, 2022-08-05 15:16:46
 */
public class AlipaySecurityRiskGravityConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 3766577288821487294L;

	/** 
	 * 多方安全风控服务错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 多方安全风控服务错误信息详情
	 */
	@ApiField("error_message")
	private String errorMessage;

	/** 
	 * 参数名：extension+是否唯一：无需唯一+应用场景：多方安全风控标准接口普通扩展参数，用于处理可能存在的小部分标准之外定制化需求+枚举：无枚举+如何获取：多方安全风控与调用方协商+特殊说明：无
	 */
	@ApiListField("extension")
	@ApiField("gravity_param")
	private List<GravityParam> extension;

	/** 
	 * 参数名：header+是否唯一：无需唯一+应用场景：多方安全风控服务标准头信息，譬如系统间调用的traceId+枚举：无枚举+如何获取：调用方系统随机生成，保证全局唯一+特殊说明：无
	 */
	@ApiField("header")
	private SecGravityServiceHeader header;

	/** 
	 * 多方安全风控服务处理结果是否成功标识：true/false
	 */
	@ApiField("process_success")
	private Boolean processSuccess;

	/** 
	 * 多方安全风控风险咨询结果
	 */
	@ApiListField("risk_result")
	@ApiField("gravity_risk_result")
	private List<GravityRiskResult> riskResult;

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCode( ) {
		return this.errorCode;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getErrorMessage( ) {
		return this.errorMessage;
	}

	public void setExtension(List<GravityParam> extension) {
		this.extension = extension;
	}
	public List<GravityParam> getExtension( ) {
		return this.extension;
	}

	public void setHeader(SecGravityServiceHeader header) {
		this.header = header;
	}
	public SecGravityServiceHeader getHeader( ) {
		return this.header;
	}

	public void setProcessSuccess(Boolean processSuccess) {
		this.processSuccess = processSuccess;
	}
	public Boolean getProcessSuccess( ) {
		return this.processSuccess;
	}

	public void setRiskResult(List<GravityRiskResult> riskResult) {
		this.riskResult = riskResult;
	}
	public List<GravityRiskResult> getRiskResult( ) {
		return this.riskResult;
	}

}
