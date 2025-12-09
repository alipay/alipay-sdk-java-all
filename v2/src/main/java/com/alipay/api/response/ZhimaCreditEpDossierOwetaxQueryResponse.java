package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EpOweTaxDataInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.dossier.owetax.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-04 19:07:57
 */
public class ZhimaCreditEpDossierOwetaxQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1191193189725656675L;

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
