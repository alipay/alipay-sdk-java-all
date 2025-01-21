package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.GroupBudgetSummaryDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.antbudget.groupbudget.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 16:55:00
 */
public class AlipayBossFncAntbudgetGroupbudgetBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4451915431431919136L;

	/** 
	 * 返回数据，集团预算列表集合
	 */
	@ApiListField("result_data")
	@ApiField("group_budget_summary_d_t_o")
	private List<GroupBudgetSummaryDTO> resultData;

	/** 
	 * 返回错误信息
	 */
	@ApiField("result_msg")
	private String resultMsg;

	public void setResultData(List<GroupBudgetSummaryDTO> resultData) {
		this.resultData = resultData;
	}
	public List<GroupBudgetSummaryDTO> getResultData( ) {
		return this.resultData;
	}

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	public String getResultMsg( ) {
		return this.resultMsg;
	}

}
