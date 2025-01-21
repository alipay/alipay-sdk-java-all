package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ZmepDossierBackgroundDataInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.dossier.background.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-20 16:17:24
 */
public class ZhimaCreditEpDossierBackgroundQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1616883482758687965L;

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
