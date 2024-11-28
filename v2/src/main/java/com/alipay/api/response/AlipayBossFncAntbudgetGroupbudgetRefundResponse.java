package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.antbudget.groupbudget.refund response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 16:54:58
 */
public class AlipayBossFncAntbudgetGroupbudgetRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 5642444288121762321L;

	/** 
	 * 释放结果，如果成功，返回集团预算编码集合
	 */
	@ApiListField("result_data")
	@ApiField("string")
	private List<String> resultData;

	/** 
	 * pass/报错信息
	 */
	@ApiField("result_msg")
	private String resultMsg;

	public void setResultData(List<String> resultData) {
		this.resultData = resultData;
	}
	public List<String> getResultData( ) {
		return this.resultData;
	}

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	public String getResultMsg( ) {
		return this.resultMsg;
	}

}
