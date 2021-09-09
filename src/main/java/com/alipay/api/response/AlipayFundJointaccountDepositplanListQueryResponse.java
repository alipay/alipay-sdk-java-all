package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SimpleFundPlanDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.jointaccount.depositplan.list.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-09-07 19:25:53
 */
public class AlipayFundJointaccountDepositplanListQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1861811367695558936L;

	/** 
	 * 资金计划列表
	 */
	@ApiListField("fund_plan_list")
	@ApiField("simple_fund_plan_d_t_o")
	private List<SimpleFundPlanDTO> fundPlanList;

	public void setFundPlanList(List<SimpleFundPlanDTO> fundPlanList) {
		this.fundPlanList = fundPlanList;
	}
	public List<SimpleFundPlanDTO> getFundPlanList( ) {
		return this.fundPlanList;
	}

}
