package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.IitBizDetailBillQueryPageResultOpenApiDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.tax.iit.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-01-21 10:12:42
 */
public class AlipayBossFncTaxIitQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1728579697321487255L;

	/** 
	 * 结果集
	 */
	@ApiField("result_set")
	private IitBizDetailBillQueryPageResultOpenApiDTO resultSet;

	public void setResultSet(IitBizDetailBillQueryPageResultOpenApiDTO resultSet) {
		this.resultSet = resultSet;
	}
	public IitBizDetailBillQueryPageResultOpenApiDTO getResultSet( ) {
		return this.resultSet;
	}

}
