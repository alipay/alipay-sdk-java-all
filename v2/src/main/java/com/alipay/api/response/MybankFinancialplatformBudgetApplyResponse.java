package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BkdfmacBizActionLogDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.financialplatform.budget.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-02-08 12:46:38
 */
public class MybankFinancialplatformBudgetApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6127563989146879271L;

	/** 
	 * 申请成功后的记录列表
	 */
	@ApiListField("result_data")
	@ApiField("bkdfmac_biz_action_log_d_t_o")
	private List<BkdfmacBizActionLogDTO> resultData;

	/** 
	 * 错误具体信息描述
	 */
	@ApiField("result_msg")
	private String resultMsg;

	public void setResultData(List<BkdfmacBizActionLogDTO> resultData) {
		this.resultData = resultData;
	}
	public List<BkdfmacBizActionLogDTO> getResultData( ) {
		return this.resultData;
	}

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	public String getResultMsg( ) {
		return this.resultMsg;
	}

}
