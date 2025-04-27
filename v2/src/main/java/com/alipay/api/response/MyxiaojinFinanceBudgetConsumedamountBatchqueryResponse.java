package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CfbudmacBizActionConsumedAmountsDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: myxiaojin.finance.budget.consumedamount.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 00:36:40
 */
public class MyxiaojinFinanceBudgetConsumedamountBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7828132532454418157L;

	/** 
	 * 根据BizUkIds查询出的占用情况
	 */
	@ApiListField("result_data")
	@ApiField("cfbudmac_biz_action_consumed_amounts_d_t_o")
	private List<CfbudmacBizActionConsumedAmountsDTO> resultData;

	/** 
	 * 错误具体信息描述
	 */
	@ApiField("result_msg")
	private String resultMsg;

	public void setResultData(List<CfbudmacBizActionConsumedAmountsDTO> resultData) {
		this.resultData = resultData;
	}
	public List<CfbudmacBizActionConsumedAmountsDTO> getResultData( ) {
		return this.resultData;
	}

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	public String getResultMsg( ) {
		return this.resultMsg;
	}

}
