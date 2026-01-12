package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EpShareHolderDataInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.dossier.shareholder.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-18 10:17:42
 */
public class ZhimaCreditEpDossierShareholderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1328261745134731922L;

	/** 
	 * 企业股东信息查询
	 */
	@ApiField("data")
	private EpShareHolderDataInfo data;

	/** 
	 * 查得标记
	 */
	@ApiField("data_found")
	private Boolean dataFound;

	public void setData(EpShareHolderDataInfo data) {
		this.data = data;
	}
	public EpShareHolderDataInfo getData( ) {
		return this.data;
	}

	public void setDataFound(Boolean dataFound) {
		this.dataFound = dataFound;
	}
	public Boolean getDataFound( ) {
		return this.dataFound;
	}

}
