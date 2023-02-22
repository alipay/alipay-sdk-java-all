package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CfbudmacBizBudgetApplyAmountDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: myxiaojin.finance.budget.bbaremainamount.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-13 14:41:37
 */
public class MyxiaojinFinanceBudgetBbaremainamountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2239959319148199975L;

	/** 
	 * BBA可用、剩余金额
	 */
	@ApiField("result_data")
	private CfbudmacBizBudgetApplyAmountDTO resultData;

	/** 
	 * 错误的详细信息，用于具体描述错误信息
	 */
	@ApiField("result_msg")
	private String resultMsg;

	public void setResultData(CfbudmacBizBudgetApplyAmountDTO resultData) {
		this.resultData = resultData;
	}
	public CfbudmacBizBudgetApplyAmountDTO getResultData( ) {
		return this.resultData;
	}

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	public String getResultMsg( ) {
		return this.resultMsg;
	}

}
