package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BizActionLogDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: myxiaojin.finance.atsbudget.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-24 21:11:44
 */
public class MyxiaojinFinanceAtsbudgetApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2153399198154971458L;

	/** 
	 * 申请成功后的记录列表
	 */
	@ApiListField("result_data")
	@ApiField("biz_action_log_d_t_o")
	private List<BizActionLogDTO> resultData;

	/** 
	 * 错误具体信息描述
	 */
	@ApiField("result_msg")
	private String resultMsg;

	public void setResultData(List<BizActionLogDTO> resultData) {
		this.resultData = resultData;
	}
	public List<BizActionLogDTO> getResultData( ) {
		return this.resultData;
	}

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	public String getResultMsg( ) {
		return this.resultMsg;
	}

}
