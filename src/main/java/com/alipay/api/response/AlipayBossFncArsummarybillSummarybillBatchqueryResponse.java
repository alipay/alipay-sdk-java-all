package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.SummaryBillPageOpenApiDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.arsummarybill.summarybill.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2021-12-10 11:50:36
 */
public class AlipayBossFncArsummarybillSummarybillBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5225259998481598916L;

	/** 
	 * 汇总账单分页信息
	 */
	@ApiField("result_set")
	private SummaryBillPageOpenApiDTO resultSet;

	public void setResultSet(SummaryBillPageOpenApiDTO resultSet) {
		this.resultSet = resultSet;
	}
	public SummaryBillPageOpenApiDTO getResultSet( ) {
		return this.resultSet;
	}

}
