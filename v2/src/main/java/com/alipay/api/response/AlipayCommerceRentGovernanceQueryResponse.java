package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RentGovernanceInfoVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.rent.governance.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-03 18:42:51
 */
public class AlipayCommerceRentGovernanceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5476552434761411673L;

	/** 
	 * null
	 */
	@ApiListField("governance_infos")
	@ApiField("rent_governance_info_v_o")
	private List<RentGovernanceInfoVO> governanceInfos;

	public void setGovernanceInfos(List<RentGovernanceInfoVO> governanceInfos) {
		this.governanceInfos = governanceInfos;
	}
	public List<RentGovernanceInfoVO> getGovernanceInfos( ) {
		return this.governanceInfos;
	}

}
