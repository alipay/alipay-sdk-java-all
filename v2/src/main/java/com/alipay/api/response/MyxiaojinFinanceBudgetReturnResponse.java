package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CfbudmacBizActionLogDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: myxiaojin.finance.budget.return response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 08:06:39
 */
public class MyxiaojinFinanceBudgetReturnResponse extends AlipayResponse {

	private static final long serialVersionUID = 4554735229835179653L;

	/** 
	 * 退回成功后的记录id
	 */
	@ApiField("result_data")
	private CfbudmacBizActionLogDTO resultData;

	/** 
	 * 错误的详细信息，用于具体描述错误信息
	 */
	@ApiField("result_msg")
	private String resultMsg;

	public void setResultData(CfbudmacBizActionLogDTO resultData) {
		this.resultData = resultData;
	}
	public CfbudmacBizActionLogDTO getResultData( ) {
		return this.resultData;
	}

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	public String getResultMsg( ) {
		return this.resultMsg;
	}

}
