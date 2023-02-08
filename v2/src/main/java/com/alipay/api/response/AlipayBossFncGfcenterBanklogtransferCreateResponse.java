package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.JsonOpenApiVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.gfcenter.banklogtransfer.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-04 19:14:46
 */
public class AlipayBossFncGfcenterBanklogtransferCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7296268619394366467L;

	/** 
	 * 银行流水认领返回结果
	 */
	@ApiField("result_set")
	private JsonOpenApiVO resultSet;

	public void setResultSet(JsonOpenApiVO resultSet) {
		this.resultSet = resultSet;
	}
	public JsonOpenApiVO getResultSet( ) {
		return this.resultSet;
	}

}
