package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.WriteOffProcessResponseOpenApiDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.gfsettleprod.writeofforder.verify response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-04 23:00:48
 */
public class AlipayBossFncGfsettleprodWriteofforderVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7656534426649584133L;

	/** 
	 * 核销处理结果返回
	 */
	@ApiField("result_set")
	private WriteOffProcessResponseOpenApiDTO resultSet;

	public void setResultSet(WriteOffProcessResponseOpenApiDTO resultSet) {
		this.resultSet = resultSet;
	}
	public WriteOffProcessResponseOpenApiDTO getResultSet( ) {
		return this.resultSet;
	}

}
