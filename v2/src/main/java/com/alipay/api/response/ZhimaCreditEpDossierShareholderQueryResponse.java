package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EpShareHolderDataInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.dossier.shareholder.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-04 19:04:59
 */
public class ZhimaCreditEpDossierShareholderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3247645649276514727L;

	/** 
	 * 企业股东信息查询
	 */
	@ApiField("data")
	private EpShareHolderDataInfo data;

	public void setData(EpShareHolderDataInfo data) {
		this.data = data;
	}
	public EpShareHolderDataInfo getData( ) {
		return this.data;
	}

}
