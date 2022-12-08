package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.antbudget.groupbudget.apply response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 14:22:24
 */
public class AlipayBossFncAntbudgetGroupbudgetApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7453773596874258497L;

	/** 
	 * 申请结果，如果成功，返回集团预算编码集合
	 */
	@ApiListField("result_data")
	@ApiField("string")
	private List<String> resultData;

	/** 
	 * 报错信息
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
