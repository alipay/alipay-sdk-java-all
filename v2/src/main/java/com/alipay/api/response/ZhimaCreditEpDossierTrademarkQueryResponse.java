package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EpTrademarkDataInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.dossier.trademark.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-21 10:37:29
 */
public class ZhimaCreditEpDossierTrademarkQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5363333474993962343L;

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
