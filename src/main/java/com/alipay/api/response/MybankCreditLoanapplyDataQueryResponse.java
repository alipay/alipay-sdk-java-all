package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loanapply.data.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class MybankCreditLoanapplyDataQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6873578532566893887L;

	/** 
	 * 查询到的对应的数据，大字段。
	 */
	@ApiField("data")
	private String data;

	/** 
	 * 数据采集到的时间
	 */
	@ApiField("data_time")
	private String dataTime;

	public void setData(String data) {
		this.data = data;
	}
	public String getData( ) {
		return this.data;
	}

	public void setDataTime(String dataTime) {
		this.dataTime = dataTime;
	}
	public String getDataTime( ) {
		return this.dataTime;
	}

}
