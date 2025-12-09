package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EpCopyrightDataInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.dossier.copyright.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-04 19:06:50
 */
public class ZhimaCreditEpDossierCopyrightQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6425661958424341736L;

	/** 
	 * 查询著作权内容
	 */
	@ApiField("data")
	private EpCopyrightDataInfo data;

	public void setData(EpCopyrightDataInfo data) {
		this.data = data;
	}
	public EpCopyrightDataInfo getData( ) {
		return this.data;
	}

}
