package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InterTradeBillConsultOpenApiResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.related.bill.consult response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-16 15:37:03
 */
public class AlipayBossRelatedBillConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 8665966529762112433L;

	/** 
	 * 关联交易账单甄别结果
	 */
	@ApiField("result_set")
	private InterTradeBillConsultOpenApiResult resultSet;

	public void setResultSet(InterTradeBillConsultOpenApiResult resultSet) {
		this.resultSet = resultSet;
	}
	public InterTradeBillConsultOpenApiResult getResultSet( ) {
		return this.resultSet;
	}

}
