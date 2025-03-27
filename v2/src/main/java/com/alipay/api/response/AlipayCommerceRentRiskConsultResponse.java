package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RentRiskProVO;
import com.alipay.api.domain.RentRiskInfoVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.rent.risk.consult response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-21 16:32:25
 */
public class AlipayCommerceRentRiskConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 2599562458551953993L;

	/** 
	 * Boolean类型结果，true-命中极低风险 false-未命中极低风险
	 */
	@ApiField("extremely_low_risk_models")
	private RentRiskProVO extremelyLowRiskModels;

	/** 
	 * Boolean类型结果，true-命中高风险 false-未命中高风险
	 */
	@ApiField("high_risk_models")
	private RentRiskProVO highRiskModels;

	/** 
	 * BASIC-未签约智安盾付费合约；
PRO-已签约智安盾付费合约；
	 */
	@ApiField("product_edition")
	private String productEdition;

	/** 
	 * null
	 */
	@ApiListField("risk_infos")
	@ApiField("rent_risk_info_v_o")
	private List<RentRiskInfoVO> riskInfos;

	public void setExtremelyLowRiskModels(RentRiskProVO extremelyLowRiskModels) {
		this.extremelyLowRiskModels = extremelyLowRiskModels;
	}
	public RentRiskProVO getExtremelyLowRiskModels( ) {
		return this.extremelyLowRiskModels;
	}

	public void setHighRiskModels(RentRiskProVO highRiskModels) {
		this.highRiskModels = highRiskModels;
	}
	public RentRiskProVO getHighRiskModels( ) {
		return this.highRiskModels;
	}

	public void setProductEdition(String productEdition) {
		this.productEdition = productEdition;
	}
	public String getProductEdition( ) {
		return this.productEdition;
	}

	public void setRiskInfos(List<RentRiskInfoVO> riskInfos) {
		this.riskInfos = riskInfos;
	}
	public List<RentRiskInfoVO> getRiskInfos( ) {
		return this.riskInfos;
	}

}
