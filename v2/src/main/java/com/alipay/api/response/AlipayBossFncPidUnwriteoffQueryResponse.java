package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.pid.unwriteoff.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 03:03:29
 */
public class AlipayBossFncPidUnwriteoffQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5751548653576767263L;

	/** 
	 * true表示正在核销，false表示当前没有核销的单据
	 */
	@ApiField("result_set")
	private String resultSet;

	public void setResultSet(String resultSet) {
		this.resultSet = resultSet;
	}
	public String getResultSet( ) {
		return this.resultSet;
	}

}
