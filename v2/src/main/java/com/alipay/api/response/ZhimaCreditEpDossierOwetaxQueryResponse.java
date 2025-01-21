package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EpOweTaxDataInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.dossier.owetax.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-20 15:32:26
 */
public class ZhimaCreditEpDossierOwetaxQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5218868318957983276L;

	/** 
	 * 查询数据结果
	 */
	@ApiField("data")
	private EpOweTaxDataInfo data;

	public void setData(EpOweTaxDataInfo data) {
		this.data = data;
	}
	public EpOweTaxDataInfo getData( ) {
		return this.data;
	}

}
