package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BkdfmacBizActionLogDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.financialplatform.budget.return response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 23:46:56
 */
public class MybankFinancialplatformBudgetReturnResponse extends AlipayResponse {

	private static final long serialVersionUID = 2398211216614813854L;

	/** 
	 * 退回成功后的记录id
	 */
	@ApiField("result_data")
	private BkdfmacBizActionLogDTO resultData;

	/** 
	 * 错误的详细信息，用于具体描述错误信息
	 */
	@ApiField("result_msg")
	private String resultMsg;

	public void setResultData(BkdfmacBizActionLogDTO resultData) {
		this.resultData = resultData;
	}
	public BkdfmacBizActionLogDTO getResultData( ) {
		return this.resultData;
	}

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	public String getResultMsg( ) {
		return this.resultMsg;
	}

}
