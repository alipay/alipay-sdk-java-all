package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ZmepTaxViolationDataInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.dossier.taxviolation.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-16 13:52:41
 */
public class ZhimaCreditEpDossierTaxviolationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4412164657987462319L;

	/** 
	 * 数据结果
	 */
	@ApiField("data")
	private ZmepTaxViolationDataInfo data;

	/** 
	 * 查得标记
	 */
	@ApiField("data_found")
	private Boolean dataFound;

	public void setData(ZmepTaxViolationDataInfo data) {
		this.data = data;
	}
	public ZmepTaxViolationDataInfo getData( ) {
		return this.data;
	}

	public void setDataFound(Boolean dataFound) {
		this.dataFound = dataFound;
	}
	public Boolean getDataFound( ) {
		return this.dataFound;
	}

}
