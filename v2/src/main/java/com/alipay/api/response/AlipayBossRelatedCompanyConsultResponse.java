package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InterTradeCompanyConsultOpenApiResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.related.company.consult response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 01:18:21
 */
public class AlipayBossRelatedCompanyConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 5478459366253729994L;

	/** 
	 * 关联交易公司甄别结果
	 */
	@ApiField("result_set")
	private InterTradeCompanyConsultOpenApiResult resultSet;

	public void setResultSet(InterTradeCompanyConsultOpenApiResult resultSet) {
		this.resultSet = resultSet;
	}
	public InterTradeCompanyConsultOpenApiResult getResultSet( ) {
		return this.resultSet;
	}

}
