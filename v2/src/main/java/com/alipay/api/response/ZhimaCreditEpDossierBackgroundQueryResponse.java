package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ZmepDossierBackgroundDataInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.dossier.background.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-22 09:57:22
 */
public class ZhimaCreditEpDossierBackgroundQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1445668781782321371L;

	/** 
	 * 数据结果
	 */
	@ApiField("data")
	private ZmepDossierBackgroundDataInfo data;

	public void setData(ZmepDossierBackgroundDataInfo data) {
		this.data = data;
	}
	public ZmepDossierBackgroundDataInfo getData( ) {
		return this.data;
	}

}
