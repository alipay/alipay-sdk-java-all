package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RentRiskInfoVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.rent.risk.consult response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-24 17:32:22
 */
public class AlipayCommerceRentRiskConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 6412728367776226211L;

	/** 
	 * null
	 */
	@ApiListField("risk_infos")
	@ApiField("rent_risk_info_v_o")
	private List<RentRiskInfoVO> riskInfos;

	public void setRiskInfos(List<RentRiskInfoVO> riskInfos) {
		this.riskInfos = riskInfos;
	}
	public List<RentRiskInfoVO> getRiskInfos( ) {
		return this.riskInfos;
	}

}
