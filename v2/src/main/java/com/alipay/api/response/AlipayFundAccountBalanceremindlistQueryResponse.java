package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BalanceRemindPlanDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.account.balanceremindlist.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-03 15:27:08
 */
public class AlipayFundAccountBalanceremindlistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6331236365663582211L;

	/** 
	 * 计划列表数组数组类型
	 */
	@ApiListField("plan_list")
	@ApiField("balance_remind_plan_d_t_o")
	private List<BalanceRemindPlanDTO> planList;

	public void setPlanList(List<BalanceRemindPlanDTO> planList) {
		this.planList = planList;
	}
	public List<BalanceRemindPlanDTO> getPlanList( ) {
		return this.planList;
	}

}
