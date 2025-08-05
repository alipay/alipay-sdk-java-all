package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CfbudmacBizActionLogDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: myxiaojin.finance.budget.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 08:06:40
 */
public class MyxiaojinFinanceBudgetApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5697681617627644783L;

	/** 
	 * 申请成功后的记录列表
	 */
	@ApiListField("result_data")
	@ApiField("cfbudmac_biz_action_log_d_t_o")
	private List<CfbudmacBizActionLogDTO> resultData;

	/** 
	 * 错误具体信息描述
	 */
	@ApiField("result_msg")
	private String resultMsg;

	public void setResultData(List<CfbudmacBizActionLogDTO> resultData) {
		this.resultData = resultData;
	}
	public List<CfbudmacBizActionLogDTO> getResultData( ) {
		return this.resultData;
	}

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	public String getResultMsg( ) {
		return this.resultMsg;
	}

}
