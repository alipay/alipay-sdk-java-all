package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EpReginfoChangeDataInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.dossier.reginfochange.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-24 14:37:24
 */
public class ZhimaCreditEpDossierReginfochangeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5571265914614151942L;

	/** 
	 * 企业工商变更内容信息
	 */
	@ApiField("data")
	private EpReginfoChangeDataInfo data;

	public void setData(EpReginfoChangeDataInfo data) {
		this.data = data;
	}
	public EpReginfoChangeDataInfo getData( ) {
		return this.data;
	}

}
