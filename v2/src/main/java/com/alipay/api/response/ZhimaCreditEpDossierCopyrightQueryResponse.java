package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EpCopyrightDataInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.dossier.copyright.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-24 14:32:22
 */
public class ZhimaCreditEpDossierCopyrightQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2251874277945813842L;

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
