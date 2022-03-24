package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ApSummaryBillPageDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.gfsettleprod.apsummarybill.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-09-28 14:26:23
 */
public class AlipayBossFncGfsettleprodApsummarybillQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2894765299569216293L;

	/** 
	 * 结果
	 */
	@ApiField("result_set")
	private ApSummaryBillPageDTO resultSet;

	public void setResultSet(ApSummaryBillPageDTO resultSet) {
		this.resultSet = resultSet;
	}
	public ApSummaryBillPageDTO getResultSet( ) {
		return this.resultSet;
	}

}
