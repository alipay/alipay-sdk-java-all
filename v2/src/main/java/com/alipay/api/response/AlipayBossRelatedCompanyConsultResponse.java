package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InterTradeCompanyConsultOpenApiResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.related.company.consult response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 08:01:52
 */
public class AlipayBossRelatedCompanyConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 6859256351939964631L;

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
