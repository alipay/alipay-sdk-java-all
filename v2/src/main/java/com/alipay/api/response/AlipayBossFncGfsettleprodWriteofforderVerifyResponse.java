package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.WriteOffProcessResponseOpenApiDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.gfsettleprod.writeofforder.verify response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-30 22:09:55
 */
public class AlipayBossFncGfsettleprodWriteofforderVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7288832496576168259L;

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
