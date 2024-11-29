package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.GrmProjectInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.prodpaas.grmcore.program.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:29:03
 */
public class AntProdpaasGrmcoreProgramQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8358119912738399713L;

	/** 
	 * 业管平台立项信息
	 */
	@ApiField("result_data")
	private GrmProjectInfoDTO resultData;

	public void setResultData(GrmProjectInfoDTO resultData) {
		this.resultData = resultData;
	}
	public GrmProjectInfoDTO getResultData( ) {
		return this.resultData;
	}

}
