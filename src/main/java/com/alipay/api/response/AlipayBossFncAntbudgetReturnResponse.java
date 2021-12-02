package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BizActionLogDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.antbudget.return response.
 * 
 * @author auto create
 * @since 1.0, 2020-09-25 15:34:20
 */
public class AlipayBossFncAntbudgetReturnResponse extends AlipayResponse {

	private static final long serialVersionUID = 2344132569939134195L;

	/** 
	 * 退回成功后的记录id
	 */
	@ApiField("result_data")
	private BizActionLogDTO resultData;

	/** 
	 * 错误的详细信息，用于具体描述错误信息
	 */
	@ApiField("result_msg")
	private String resultMsg;

	public void setResultData(BizActionLogDTO resultData) {
		this.resultData = resultData;
	}
	public BizActionLogDTO getResultData( ) {
		return this.resultData;
	}

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	public String getResultMsg( ) {
		return this.resultMsg;
	}

}
