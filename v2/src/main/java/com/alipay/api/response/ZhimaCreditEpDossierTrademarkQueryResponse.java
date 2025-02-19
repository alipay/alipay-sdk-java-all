package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EpTrademarkDataInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.dossier.trademark.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-24 14:32:21
 */
public class ZhimaCreditEpDossierTrademarkQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5171844326859637349L;

	/** 
	 * 企业商标查询内容
	 */
	@ApiField("data")
	private EpTrademarkDataInfo data;

	public void setData(EpTrademarkDataInfo data) {
		this.data = data;
	}
	public EpTrademarkDataInfo getData( ) {
		return this.data;
	}

}
