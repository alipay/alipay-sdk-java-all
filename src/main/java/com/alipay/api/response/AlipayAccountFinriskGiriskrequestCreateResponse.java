package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EntityPriorRiskVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.account.finrisk.giriskrequest.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayAccountFinriskGiriskrequestCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1171246865467236794L;

	/** 
	 * 二代结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 三代结果码
	 */
	@ApiField("result_code_third")
	private String resultCodeThird;

	/** 
	 * 结果描述
	 */
	@ApiField("result_desc")
	private String resultDesc;

	/** 
	 * 风险信息明细
	 */
	@ApiListField("risk_details")
	@ApiField("entity_prior_risk_v_o")
	private List<EntityPriorRiskVO> riskDetails;

	/** 
	 * 风险认证结果码
	 */
	@ApiField("risk_result_code")
	private String riskResultCode;

	/** 
	 * 是否业务处理成功。 true：处理成功；false：处理失败。 默认：false
	 */
	@ApiField("success")
	private String success;

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setResultCodeThird(String resultCodeThird) {
		this.resultCodeThird = resultCodeThird;
	}
	public String getResultCodeThird( ) {
		return this.resultCodeThird;
	}

	public void setResultDesc(String resultDesc) {
		this.resultDesc = resultDesc;
	}
	public String getResultDesc( ) {
		return this.resultDesc;
	}

	public void setRiskDetails(List<EntityPriorRiskVO> riskDetails) {
		this.riskDetails = riskDetails;
	}
	public List<EntityPriorRiskVO> getRiskDetails( ) {
		return this.riskDetails;
	}

	public void setRiskResultCode(String riskResultCode) {
		this.riskResultCode = riskResultCode;
	}
	public String getRiskResultCode( ) {
		return this.riskResultCode;
	}

	public void setSuccess(String success) {
		this.success = success;
	}
	public String getSuccess( ) {
		return this.success;
	}

}
