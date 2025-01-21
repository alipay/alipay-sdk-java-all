package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ZmepTaxViolationDataInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.dossier.taxviolation.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-20 11:22:25
 */
public class ZhimaCreditEpDossierTaxviolationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7642387953851188811L;

	/** 
	 * 数据结果
	 */
	@ApiField("data")
	private ZmepTaxViolationDataInfo data;

	public void setData(ZmepTaxViolationDataInfo data) {
		this.data = data;
	}
	public ZmepTaxViolationDataInfo getData( ) {
		return this.data;
	}

}
