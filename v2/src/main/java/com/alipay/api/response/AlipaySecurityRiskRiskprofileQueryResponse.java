package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RiskProfileDto;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.riskprofile.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 10:38:19
 */
public class AlipaySecurityRiskRiskprofileQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8645389131735471471L;

	/** 
	 * success 字段为false 是返回失败原因
	 */
	@ApiField("message")
	private String message;

	/** 
	 * riskprofile查询返回的键值对
	 */
	@ApiListField("risk_profile_value")
	@ApiField("risk_profile_dto")
	private List<RiskProfileDto> riskProfileValue;

	/** 
	 * 处理结果，true：处理成功，false:处理失败
	 */
	@ApiField("success")
	private Boolean success;

	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage( ) {
		return this.message;
	}

	public void setRiskProfileValue(List<RiskProfileDto> riskProfileValue) {
		this.riskProfileValue = riskProfileValue;
	}
	public List<RiskProfileDto> getRiskProfileValue( ) {
		return this.riskProfileValue;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
