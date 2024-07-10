package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.FundPlanDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.jointaccount.depositplan.list.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:55
 */
public class AlipayFundJointaccountDepositplanListQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5672111219393754563L;

	/** 
	 * 资金计划列表
	 */
	@ApiListField("fund_plan_list")
	@ApiField("fund_plan_d_t_o")
	private List<FundPlanDTO> fundPlanList;

	public void setFundPlanList(List<FundPlanDTO> fundPlanList) {
		this.fundPlanList = fundPlanList;
	}
	public List<FundPlanDTO> getFundPlanList( ) {
		return this.fundPlanList;
	}

}
