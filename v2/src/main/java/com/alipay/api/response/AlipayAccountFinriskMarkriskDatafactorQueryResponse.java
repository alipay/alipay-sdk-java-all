package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.account.finrisk.markrisk.datafactor.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-20 18:01:39
 */
public class AlipayAccountFinriskMarkriskDatafactorQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4423548885796678243L;

	/** 
	 * json格式表示的计算结果，含多字段. 包括当前损益计算的货币对，预测金额，兑换渠道，交易日期，平盘价格，平盘金额，分级报价，汇率，汇率来源，汇率来源日期，场景，试算金额，交易主体，具体损益金额，交易类型，时区，产品码，补贴金额，已实现损益，未实现损益
	 */
	@ApiField("result_map")
	private String resultMap;

	public void setResultMap(String resultMap) {
		this.resultMap = resultMap;
	}
	public String getResultMap( ) {
		return this.resultMap;
	}

}
