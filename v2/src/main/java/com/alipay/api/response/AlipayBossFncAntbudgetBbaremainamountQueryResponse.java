package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BizBudgetApplyAmountDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.antbudget.bbaremainamount.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 16:54:58
 */
public class AlipayBossFncAntbudgetBbaremainamountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6211361651756323655L;

	/** 
	 * BBA可用、剩余金额
	 */
	@ApiField("result_data")
	private BizBudgetApplyAmountDTO resultData;

	/** 
	 * 错误的详细信息，用于具体描述错误信息
	 */
	@ApiField("result_msg")
	private String resultMsg;

	public void setResultData(BizBudgetApplyAmountDTO resultData) {
		this.resultData = resultData;
	}
	public BizBudgetApplyAmountDTO getResultData( ) {
		return this.resultData;
	}

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	public String getResultMsg( ) {
		return this.resultMsg;
	}

}
