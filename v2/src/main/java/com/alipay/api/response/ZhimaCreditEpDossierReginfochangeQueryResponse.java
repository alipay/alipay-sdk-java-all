package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EpReginfoChangeDataInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.dossier.reginfochange.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-18 10:17:43
 */
public class ZhimaCreditEpDossierReginfochangeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8348594612561968221L;

	/** 
	 * 企业工商变更内容信息
	 */
	@ApiField("data")
	private EpReginfoChangeDataInfo data;

	/** 
	 * 查得标记
	 */
	@ApiField("data_found")
	private Boolean dataFound;

	public void setData(EpReginfoChangeDataInfo data) {
		this.data = data;
	}
	public EpReginfoChangeDataInfo getData( ) {
		return this.data;
	}

	public void setDataFound(Boolean dataFound) {
		this.dataFound = dataFound;
	}
	public Boolean getDataFound( ) {
		return this.dataFound;
	}

}
